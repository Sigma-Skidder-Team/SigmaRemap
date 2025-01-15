package net.minecraft.server.integrated;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.LanServerPingThread;
import net.minecraft.command.Commands;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.profiler.DebugProfiler;
import net.minecraft.profiler.Snooper;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.util.CryptManager;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import net.minecraft.world.chunk.listener.IChunkStatusListenerFactory;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.SaveHandler;
import net.minecraft.world.storage.WorldInfo;
import net.optifine.Config;
import net.optifine.reflect.Reflector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegratedServer extends MinecraftServer
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final Minecraft mc;
    private final WorldSettings worldSettings;
    private boolean isGamePaused;
    private int serverPort = -1;
    private LanServerPingThread lanServerPing;
    private UUID playerUuid;
    private long ticksSaveLast = 0L;
    public World difficultyUpdateWorld = null;
    public BlockPos difficultyUpdatePos = null;
    public DifficultyInstance difficultyLast = null;

    public IntegratedServer(Minecraft p_i17_1_, String p_i17_2_, String p_i17_3_, WorldSettings p_i17_4_, YggdrasilAuthenticationService p_i17_5_, MinecraftSessionService p_i17_6_, GameProfileRepository p_i17_7_, PlayerProfileCache p_i17_8_, IChunkStatusListenerFactory p_i17_9_)
    {
        super(new File(p_i17_1_.gameDir, "saves"), p_i17_1_.getProxy(), p_i17_1_.getDataFixer(), new Commands(false), p_i17_5_, p_i17_6_, p_i17_7_, p_i17_8_, p_i17_9_, p_i17_2_);
        this.setServerOwner(p_i17_1_.getSession().getUsername());
        this.setWorldName(p_i17_3_);
        this.setDemo(p_i17_1_.isDemo());
        this.canCreateBonusChest(p_i17_4_.isBonusChestEnabled());
        this.setBuildLimit(256);
        this.setPlayerList(new IntegratedPlayerList(this));
        this.mc = p_i17_1_;
        this.worldSettings = this.isDemo() ? MinecraftServer.DEMO_WORLD_SETTINGS : p_i17_4_;
    }

    public void loadAllWorlds(String saveName, String worldNameIn, long seed, WorldType type, JsonElement generatorOptions)
    {
        this.convertMapIfNeeded(saveName);
        SaveHandler savehandler = this.getActiveAnvilConverter().getSaveLoader(saveName, this);
        this.setResourcePackFromWorld(this.getFolderName(), savehandler);
        IChunkStatusListener ichunkstatuslistener = this.chunkStatusListenerFactory.create(11);
        WorldInfo worldinfo = savehandler.loadWorldInfo();

        if (worldinfo == null)
        {
            worldinfo = new WorldInfo(this.worldSettings, worldNameIn);
        }
        else
        {
            worldinfo.setWorldName(worldNameIn);
        }

        worldinfo.func_230145_a_(this.getServerModName(), this.func_230045_q_().isPresent());
        this.loadDataPacks(savehandler.getWorldDirectory(), worldinfo);
        this.loadWorlds(savehandler, worldinfo, this.worldSettings, ichunkstatuslistener);

        if (this.getWorld(DimensionType.OVERWORLD).getWorldInfo().getDifficulty() == null)
        {
            this.setDifficultyForAllWorlds(this.mc.gameSettings.difficulty, true);
        }

        this.loadInitialChunks(ichunkstatuslistener);
    }

    public boolean init() throws IOException
    {
        LOGGER.info("Starting integrated minecraft server version " + SharedConstants.getVersion().getName());
        this.setOnlineMode(true);
        this.setCanSpawnAnimals(true);
        this.setCanSpawnNPCs(true);
        this.setAllowPvp(true);
        this.setAllowFlight(true);
        LOGGER.info("Generating keypair");
        this.setKeyPair(CryptManager.generateKeyPair());

        if (Reflector.ServerLifecycleHooks_handleServerAboutToStart.exists() && !Reflector.callBoolean(Reflector.ServerLifecycleHooks_handleServerAboutToStart, this))
        {
            return false;
        }
        else
        {
            this.loadAllWorlds(this.getFolderName(), this.getWorldName(), this.worldSettings.getSeed(), this.worldSettings.getTerrainType(), this.worldSettings.getGeneratorOptions());
            this.setMOTD(this.getServerOwner() + " - " + this.getWorld(DimensionType.OVERWORLD).getWorldInfo().getWorldName());
            return Reflector.ServerLifecycleHooks_handleServerStarting.exists() ? Reflector.callBoolean(Reflector.ServerLifecycleHooks_handleServerStarting, this) : true;
        }
    }

    public void tick(BooleanSupplier hasTimeLeft)
    {
        this.onTick();
        boolean flag = this.isGamePaused;
        this.isGamePaused = Minecraft.getInstance().getConnection() != null && Minecraft.getInstance().isGamePaused();
        DebugProfiler debugprofiler = this.getProfiler();

        if (!flag && this.isGamePaused)
        {
            debugprofiler.startSection("autoSave");
            LOGGER.info("Saving and pausing game...");
            this.getPlayerList().saveAllPlayerData();
            this.save(false, false, false);
            debugprofiler.endSection();
        }

        if (!this.isGamePaused)
        {
            super.tick(hasTimeLeft);
            int i = Math.max(2, this.mc.gameSettings.renderDistanceChunks + -1);

            if (i != this.getPlayerList().getViewDistance())
            {
                LOGGER.info("Changing view distance to {}, from {}", i, this.getPlayerList().getViewDistance());
                this.getPlayerList().setViewDistance(i);
            }
        }
    }

    public boolean canStructuresSpawn()
    {
        return false;
    }

    public GameType getGameType()
    {
        return this.worldSettings.getGameType();
    }

    public Difficulty getDifficulty()
    {
        return this.mc.world == null ? this.mc.gameSettings.difficulty : this.mc.world.getWorldInfo().getDifficulty();
    }

    public boolean isHardcore()
    {
        return this.worldSettings.getHardcoreEnabled();
    }

    public boolean allowLoggingRcon()
    {
        return true;
    }

    public boolean allowLogging()
    {
        return true;
    }

    public File getDataDirectory()
    {
        return this.mc.gameDir;
    }

    public boolean isDedicatedServer()
    {
        return false;
    }

    public boolean shouldUseNativeTransport()
    {
        return false;
    }

    public void finalTick(CrashReport report)
    {
        this.mc.crashed(report);
    }

    public CrashReport addServerInfoToCrashReport(CrashReport report)
    {
        report = super.addServerInfoToCrashReport(report);
        report.getCategory().addDetail("Type", "Integrated Server (map_client.txt)");
        report.getCategory().addDetail("Is Modded", () ->
        {
            return this.func_230045_q_().orElse("Probably not. Jar signature remains and both client + server brands are untouched.");
        });
        return report;
    }

    public Optional<String> func_230045_q_()
    {
        String s = ClientBrandRetriever.getClientModName();

        if (!s.equals("vanilla"))
        {
            return Optional.of("Definitely; Client brand changed to '" + s + "'");
        }
        else
        {
            s = this.getServerModName();

            if (!"vanilla".equals(s))
            {
                return Optional.of("Definitely; Server brand changed to '" + s + "'");
            }
            else
            {
                return Minecraft.class.getSigners() == null ? Optional.of("Very likely; Jar signature invalidated") : Optional.empty();
            }
        }
    }

    public void fillSnooper(Snooper snooper)
    {
        super.fillSnooper(snooper);
        snooper.addClientStat("snooper_partner", this.mc.getSnooper().getUniqueID());
    }

    public boolean shareToLAN(GameType gameMode, boolean cheats, int port)
    {
        try
        {
            this.getNetworkSystem().addEndpoint((InetAddress)null, port);
            LOGGER.info("Started serving on {}", (int)port);
            this.serverPort = port;
            this.lanServerPing = new LanServerPingThread(this.getMOTD(), port + "");
            this.lanServerPing.start();
            this.getPlayerList().setGameType(gameMode);
            this.getPlayerList().setCommandsAllowedForAll(cheats);
            int i = this.getPermissionLevel(this.mc.player.getGameProfile());
            this.mc.player.setPermissionLevel(i);

            for (ServerPlayerEntity serverplayerentity : this.getPlayerList().getPlayers())
            {
                this.getCommandManager().send(serverplayerentity);
            }

            return true;
        }
        catch (IOException var71)
        {
            return false;
        }
    }

    public void stopServer()
    {
        super.stopServer();

        if (this.lanServerPing != null)
        {
            this.lanServerPing.interrupt();
            this.lanServerPing = null;
        }
    }

    public void initiateShutdown(boolean waitForServer)
    {
        if (!Reflector.MinecraftForge.exists() || this.isServerRunning())
        {
            this.runImmediately(() ->
            {
                for (ServerPlayerEntity serverplayerentity : Lists.newArrayList(this.getPlayerList().getPlayers()))
                {
                    if (!serverplayerentity.getUniqueID().equals(this.playerUuid))
                    {
                        this.getPlayerList().playerLoggedOut(serverplayerentity);
                    }
                }
            });
        }

        super.initiateShutdown(waitForServer);

        if (this.lanServerPing != null)
        {
            this.lanServerPing.interrupt();
            this.lanServerPing = null;
        }
    }

    public boolean getPublic()
    {
        return this.serverPort > -1;
    }

    public int getServerPort()
    {
        return this.serverPort;
    }

    public void setGameType(GameType gameMode)
    {
        super.setGameType(gameMode);
        this.getPlayerList().setGameType(gameMode);
    }

    public boolean isCommandBlockEnabled()
    {
        return true;
    }

    public int getOpPermissionLevel()
    {
        return 2;
    }

    public int getFunctionLevel()
    {
        return 2;
    }

    public void setPlayerUuid(UUID uuid)
    {
        this.playerUuid = uuid;
    }

    public boolean isServerOwner(GameProfile profileIn)
    {
        return profileIn.getName().equalsIgnoreCase(this.getServerOwner());
    }

    private void onTick()
    {
        for (ServerWorld serverworld : this.getWorlds())
        {
            this.onTick(serverworld);
        }
    }

    private void onTick(ServerWorld p_onTick_1_)
    {
        if (!Config.isTimeDefault())
        {
            this.fixWorldTime(p_onTick_1_);
        }

        if (!Config.isWeatherEnabled())
        {
            this.fixWorldWeather(p_onTick_1_);
        }

        if (this.difficultyUpdateWorld == p_onTick_1_ && this.difficultyUpdatePos != null)
        {
            this.difficultyLast = p_onTick_1_.getDifficultyForLocation(this.difficultyUpdatePos);
            this.difficultyUpdateWorld = null;
            this.difficultyUpdatePos = null;
        }
    }

    public DifficultyInstance getDifficultyAsync(World p_getDifficultyAsync_1_, BlockPos p_getDifficultyAsync_2_)
    {
        this.difficultyUpdateWorld = p_getDifficultyAsync_1_;
        this.difficultyUpdatePos = p_getDifficultyAsync_2_;
        return this.difficultyLast;
    }

    private void fixWorldWeather(ServerWorld p_fixWorldWeather_1_)
    {
        WorldInfo worldinfo = p_fixWorldWeather_1_.getWorldInfo();

        if (worldinfo.isRaining() || worldinfo.isThundering())
        {
            worldinfo.setRainTime(0);
            worldinfo.setRaining(false);
            p_fixWorldWeather_1_.setRainStrength(0.0F);
            worldinfo.setThunderTime(0);
            worldinfo.setThundering(false);
            p_fixWorldWeather_1_.setThunderStrength(0.0F);
            this.getPlayerList().sendPacketToAllPlayers(new SChangeGameStatePacket(2, 0.0F));
            this.getPlayerList().sendPacketToAllPlayers(new SChangeGameStatePacket(7, 0.0F));
            this.getPlayerList().sendPacketToAllPlayers(new SChangeGameStatePacket(8, 0.0F));
        }
    }

    private void fixWorldTime(ServerWorld p_fixWorldTime_1_)
    {
        WorldInfo worldinfo = p_fixWorldTime_1_.getWorldInfo();

        if (worldinfo.getGameType().getID() == 1)
        {
            long i = p_fixWorldTime_1_.getDayTime();
            long j = i % 24000L;

            if (Config.isTimeDayOnly())
            {
                if (j <= 1000L)
                {
                    p_fixWorldTime_1_.setDayTime(i - j + 1001L);
                }

                if (j >= 11000L)
                {
                    p_fixWorldTime_1_.setDayTime(i - j + 24001L);
                }
            }

            if (Config.isTimeNightOnly())
            {
                if (j <= 14000L)
                {
                    p_fixWorldTime_1_.setDayTime(i - j + 14001L);
                }

                if (j >= 22000L)
                {
                    p_fixWorldTime_1_.setDayTime(i - j + 24000L + 14001L);
                }
            }
        }
    }

    public boolean save(boolean suppressLog, boolean flush, boolean forced)
    {
        if (suppressLog)
        {
            int i = this.getTickCounter();
            int j = this.mc.gameSettings.ofAutoSaveTicks;

            if ((long)i < this.ticksSaveLast + (long)j)
            {
                return false;
            }

            this.ticksSaveLast = (long)i;
        }

        return super.save(suppressLog, flush, forced);
    }
}
