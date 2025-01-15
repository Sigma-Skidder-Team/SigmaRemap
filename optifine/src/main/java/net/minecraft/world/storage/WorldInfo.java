package net.minecraft.world.storage;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.hash.Hashing;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.JsonOps;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import net.minecraft.command.TimerCallbackManager;
import net.minecraft.command.TimerCallbackSerializers;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTDynamicOps;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.nbt.StringNBT;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.Util;
import net.minecraft.util.datafix.DefaultTypeReferences;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.WorldType;
import net.minecraft.world.dimension.DimensionType;

public class WorldInfo
{
    private String versionName;
    private int versionId;
    private boolean versionSnapshot;
    public static final Difficulty DEFAULT_DIFFICULTY = Difficulty.NORMAL;
    private long randomSeed;
    private WorldType generator = WorldType.DEFAULT;
    private CompoundNBT generatorOptions = new CompoundNBT();
    @Nullable
    private String legacyCustomOptions;
    private int spawnX;
    private int spawnY;
    private int spawnZ;
    private long gameTime;
    private long dayTime;
    private long lastTimePlayed;
    private long sizeOnDisk;
    @Nullable
    private final DataFixer fixer;
    private final int dataVersion;
    private boolean playerDataFixed;
    private CompoundNBT playerData;
    private String levelName;
    private int saveVersion;
    private int clearWeatherTime;
    private boolean raining;
    private int rainTime;
    private boolean thundering;
    private int thunderTime;
    private GameType gameType;
    private boolean mapFeaturesEnabled;
    private boolean hardcore;
    private boolean allowCommands;
    private boolean initialized;
    private Difficulty difficulty;
    private boolean difficultyLocked;
    private double borderCenterX;
    private double borderCenterZ;
    private double borderSize = 6.0E7D;
    private long borderSizeLerpTime;
    private double borderSizeLerpTarget;
    private double borderSafeZone = 5.0D;
    private double borderDamagePerBlock = 0.2D;
    private int borderWarningBlocks = 5;
    private int borderWarningTime = 15;
    private final Set<String> disabledDataPacks = Sets.newHashSet();
    private final Set<String> enabledDataPacks = Sets.newLinkedHashSet();
    private final Map<DimensionType, CompoundNBT> dimensionData = Maps.newIdentityHashMap();
    private CompoundNBT customBossEvents;
    private int wanderingTraderSpawnDelay;
    private int wanderingTraderSpawnChance;
    private UUID wanderingTraderId;
    private Set<String> field_230141_X_ = Sets.newLinkedHashSet();
    private boolean field_230142_Y_;
    private final GameRules gameRules = new GameRules();
    private final TimerCallbackManager<MinecraftServer> scheduledEvents = new TimerCallbackManager<>(TimerCallbackSerializers.field_216342_a);

    protected WorldInfo()
    {
        this.fixer = null;
        this.dataVersion = SharedConstants.getVersion().getWorldVersion();
        this.setGeneratorOptions(new CompoundNBT());
    }

    public WorldInfo(CompoundNBT p_i2327_1_, DataFixer p_i2327_2_, int p_i2327_3_, @Nullable CompoundNBT p_i2327_4_)
    {
        this.fixer = p_i2327_2_;
        ListNBT listnbt = p_i2327_1_.getList("ServerBrands", 8);

        for (int i = 0; i < listnbt.size(); ++i)
        {
            this.field_230141_X_.add(listnbt.getString(i));
        }

        this.field_230142_Y_ = p_i2327_1_.getBoolean("WasModded");

        if (p_i2327_1_.contains("Version", 10))
        {
            CompoundNBT compoundnbt = p_i2327_1_.getCompound("Version");
            this.versionName = compoundnbt.getString("Name");
            this.versionId = compoundnbt.getInt("Id");
            this.versionSnapshot = compoundnbt.getBoolean("Snapshot");
        }

        this.randomSeed = p_i2327_1_.getLong("RandomSeed");

        if (p_i2327_1_.contains("generatorName", 8))
        {
            String s1 = p_i2327_1_.getString("generatorName");
            this.generator = WorldType.byName(s1);

            if (this.generator == null)
            {
                this.generator = WorldType.DEFAULT;
            }
            else if (this.generator == WorldType.CUSTOMIZED)
            {
                this.legacyCustomOptions = p_i2327_1_.getString("generatorOptions");
            }
            else if (this.generator.isVersioned())
            {
                int j = 0;

                if (p_i2327_1_.contains("generatorVersion", 99))
                {
                    j = p_i2327_1_.getInt("generatorVersion");
                }

                this.generator = this.generator.getWorldTypeForGeneratorVersion(j);
            }

            this.setGeneratorOptions(p_i2327_1_.getCompound("generatorOptions"));
        }

        this.gameType = GameType.getByID(p_i2327_1_.getInt("GameType"));

        if (p_i2327_1_.contains("legacy_custom_options", 8))
        {
            this.legacyCustomOptions = p_i2327_1_.getString("legacy_custom_options");
        }

        if (p_i2327_1_.contains("MapFeatures", 99))
        {
            this.mapFeaturesEnabled = p_i2327_1_.getBoolean("MapFeatures");
        }
        else
        {
            this.mapFeaturesEnabled = true;
        }

        this.spawnX = p_i2327_1_.getInt("SpawnX");
        this.spawnY = p_i2327_1_.getInt("SpawnY");
        this.spawnZ = p_i2327_1_.getInt("SpawnZ");
        this.gameTime = p_i2327_1_.getLong("Time");

        if (p_i2327_1_.contains("DayTime", 99))
        {
            this.dayTime = p_i2327_1_.getLong("DayTime");
        }
        else
        {
            this.dayTime = this.gameTime;
        }

        this.lastTimePlayed = p_i2327_1_.getLong("LastPlayed");
        this.sizeOnDisk = p_i2327_1_.getLong("SizeOnDisk");
        this.levelName = p_i2327_1_.getString("LevelName");
        this.saveVersion = p_i2327_1_.getInt("version");
        this.clearWeatherTime = p_i2327_1_.getInt("clearWeatherTime");
        this.rainTime = p_i2327_1_.getInt("rainTime");
        this.raining = p_i2327_1_.getBoolean("raining");
        this.thunderTime = p_i2327_1_.getInt("thunderTime");
        this.thundering = p_i2327_1_.getBoolean("thundering");
        this.hardcore = p_i2327_1_.getBoolean("hardcore");

        if (p_i2327_1_.contains("initialized", 99))
        {
            this.initialized = p_i2327_1_.getBoolean("initialized");
        }
        else
        {
            this.initialized = true;
        }

        if (p_i2327_1_.contains("allowCommands", 99))
        {
            this.allowCommands = p_i2327_1_.getBoolean("allowCommands");
        }
        else
        {
            this.allowCommands = this.gameType == GameType.CREATIVE;
        }

        this.dataVersion = p_i2327_3_;

        if (p_i2327_4_ != null)
        {
            this.playerData = p_i2327_4_;
        }

        if (p_i2327_1_.contains("GameRules", 10))
        {
            this.gameRules.read(p_i2327_1_.getCompound("GameRules"));
        }

        if (p_i2327_1_.contains("Difficulty", 99))
        {
            this.difficulty = Difficulty.byId(p_i2327_1_.getByte("Difficulty"));
        }

        if (p_i2327_1_.contains("DifficultyLocked", 1))
        {
            this.difficultyLocked = p_i2327_1_.getBoolean("DifficultyLocked");
        }

        if (p_i2327_1_.contains("BorderCenterX", 99))
        {
            this.borderCenterX = p_i2327_1_.getDouble("BorderCenterX");
        }

        if (p_i2327_1_.contains("BorderCenterZ", 99))
        {
            this.borderCenterZ = p_i2327_1_.getDouble("BorderCenterZ");
        }

        if (p_i2327_1_.contains("BorderSize", 99))
        {
            this.borderSize = p_i2327_1_.getDouble("BorderSize");
        }

        if (p_i2327_1_.contains("BorderSizeLerpTime", 99))
        {
            this.borderSizeLerpTime = p_i2327_1_.getLong("BorderSizeLerpTime");
        }

        if (p_i2327_1_.contains("BorderSizeLerpTarget", 99))
        {
            this.borderSizeLerpTarget = p_i2327_1_.getDouble("BorderSizeLerpTarget");
        }

        if (p_i2327_1_.contains("BorderSafeZone", 99))
        {
            this.borderSafeZone = p_i2327_1_.getDouble("BorderSafeZone");
        }

        if (p_i2327_1_.contains("BorderDamagePerBlock", 99))
        {
            this.borderDamagePerBlock = p_i2327_1_.getDouble("BorderDamagePerBlock");
        }

        if (p_i2327_1_.contains("BorderWarningBlocks", 99))
        {
            this.borderWarningBlocks = p_i2327_1_.getInt("BorderWarningBlocks");
        }

        if (p_i2327_1_.contains("BorderWarningTime", 99))
        {
            this.borderWarningTime = p_i2327_1_.getInt("BorderWarningTime");
        }

        if (p_i2327_1_.contains("DimensionData", 10))
        {
            CompoundNBT compoundnbt1 = p_i2327_1_.getCompound("DimensionData");

            for (String s : compoundnbt1.keySet())
            {
                this.dimensionData.put(DimensionType.getById(Integer.parseInt(s)), compoundnbt1.getCompound(s));
            }
        }

        if (p_i2327_1_.contains("DataPacks", 10))
        {
            CompoundNBT compoundnbt2 = p_i2327_1_.getCompound("DataPacks");
            ListNBT listnbt1 = compoundnbt2.getList("Disabled", 8);

            for (int l = 0; l < listnbt1.size(); ++l)
            {
                this.disabledDataPacks.add(listnbt1.getString(l));
            }

            ListNBT listnbt2 = compoundnbt2.getList("Enabled", 8);

            for (int k = 0; k < listnbt2.size(); ++k)
            {
                this.enabledDataPacks.add(listnbt2.getString(k));
            }
        }

        if (p_i2327_1_.contains("CustomBossEvents", 10))
        {
            this.customBossEvents = p_i2327_1_.getCompound("CustomBossEvents");
        }

        if (p_i2327_1_.contains("ScheduledEvents", 9))
        {
            this.scheduledEvents.read(p_i2327_1_.getList("ScheduledEvents", 10));
        }

        if (p_i2327_1_.contains("WanderingTraderSpawnDelay", 99))
        {
            this.wanderingTraderSpawnDelay = p_i2327_1_.getInt("WanderingTraderSpawnDelay");
        }

        if (p_i2327_1_.contains("WanderingTraderSpawnChance", 99))
        {
            this.wanderingTraderSpawnChance = p_i2327_1_.getInt("WanderingTraderSpawnChance");
        }

        if (p_i2327_1_.contains("WanderingTraderId", 8))
        {
            this.wanderingTraderId = UUID.fromString(p_i2327_1_.getString("WanderingTraderId"));
        }
    }

    public WorldInfo(WorldSettings p_i2328_1_, String p_i2328_2_)
    {
        this.fixer = null;
        this.dataVersion = SharedConstants.getVersion().getWorldVersion();
        this.populateFromWorldSettings(p_i2328_1_);
        this.levelName = p_i2328_2_;
        this.difficulty = DEFAULT_DIFFICULTY;
        this.initialized = false;
    }

    public void populateFromWorldSettings(WorldSettings settings)
    {
        this.randomSeed = settings.getSeed();
        this.gameType = settings.getGameType();
        this.mapFeaturesEnabled = settings.isMapFeaturesEnabled();
        this.hardcore = settings.getHardcoreEnabled();
        this.generator = settings.getTerrainType();
        this.setGeneratorOptions((CompoundNBT)Dynamic.convert(JsonOps.INSTANCE, NBTDynamicOps.INSTANCE, settings.getGeneratorOptions()));
        this.allowCommands = settings.areCommandsAllowed();
    }

    public CompoundNBT cloneNBTCompound(@Nullable CompoundNBT nbt)
    {
        this.fixPlayerData();

        if (nbt == null)
        {
            nbt = this.playerData;
        }

        CompoundNBT compoundnbt = new CompoundNBT();
        this.updateTagCompound(compoundnbt, nbt);
        return compoundnbt;
    }

    private void updateTagCompound(CompoundNBT nbt, CompoundNBT playerNbt)
    {
        ListNBT listnbt = new ListNBT();
        this.field_230141_X_.stream().map(StringNBT::valueOf).forEach(listnbt::add);
        nbt.put("ServerBrands", listnbt);
        nbt.putBoolean("WasModded", this.field_230142_Y_);
        CompoundNBT compoundnbt = new CompoundNBT();
        compoundnbt.putString("Name", SharedConstants.getVersion().getName());
        compoundnbt.putInt("Id", SharedConstants.getVersion().getWorldVersion());
        compoundnbt.putBoolean("Snapshot", !SharedConstants.getVersion().isStable());
        nbt.put("Version", compoundnbt);
        nbt.putInt("DataVersion", SharedConstants.getVersion().getWorldVersion());
        nbt.putLong("RandomSeed", this.randomSeed);
        nbt.putString("generatorName", this.generator.getSerialization());
        nbt.putInt("generatorVersion", this.generator.getVersion());

        if (!this.generatorOptions.isEmpty())
        {
            nbt.put("generatorOptions", this.generatorOptions);
        }

        if (this.legacyCustomOptions != null)
        {
            nbt.putString("legacy_custom_options", this.legacyCustomOptions);
        }

        nbt.putInt("GameType", this.gameType.getID());
        nbt.putBoolean("MapFeatures", this.mapFeaturesEnabled);
        nbt.putInt("SpawnX", this.spawnX);
        nbt.putInt("SpawnY", this.spawnY);
        nbt.putInt("SpawnZ", this.spawnZ);
        nbt.putLong("Time", this.gameTime);
        nbt.putLong("DayTime", this.dayTime);
        nbt.putLong("SizeOnDisk", this.sizeOnDisk);
        nbt.putLong("LastPlayed", Util.millisecondsSinceEpoch());
        nbt.putString("LevelName", this.levelName);
        nbt.putInt("version", this.saveVersion);
        nbt.putInt("clearWeatherTime", this.clearWeatherTime);
        nbt.putInt("rainTime", this.rainTime);
        nbt.putBoolean("raining", this.raining);
        nbt.putInt("thunderTime", this.thunderTime);
        nbt.putBoolean("thundering", this.thundering);
        nbt.putBoolean("hardcore", this.hardcore);
        nbt.putBoolean("allowCommands", this.allowCommands);
        nbt.putBoolean("initialized", this.initialized);
        nbt.putDouble("BorderCenterX", this.borderCenterX);
        nbt.putDouble("BorderCenterZ", this.borderCenterZ);
        nbt.putDouble("BorderSize", this.borderSize);
        nbt.putLong("BorderSizeLerpTime", this.borderSizeLerpTime);
        nbt.putDouble("BorderSafeZone", this.borderSafeZone);
        nbt.putDouble("BorderDamagePerBlock", this.borderDamagePerBlock);
        nbt.putDouble("BorderSizeLerpTarget", this.borderSizeLerpTarget);
        nbt.putDouble("BorderWarningBlocks", (double)this.borderWarningBlocks);
        nbt.putDouble("BorderWarningTime", (double)this.borderWarningTime);

        if (this.difficulty != null)
        {
            nbt.putByte("Difficulty", (byte)this.difficulty.getId());
        }

        nbt.putBoolean("DifficultyLocked", this.difficultyLocked);
        nbt.put("GameRules", this.gameRules.write());
        CompoundNBT compoundnbt1 = new CompoundNBT();

        for (Entry<DimensionType, CompoundNBT> entry : this.dimensionData.entrySet())
        {
            compoundnbt1.put(String.valueOf(entry.getKey().getId()), entry.getValue());
        }

        nbt.put("DimensionData", compoundnbt1);

        if (playerNbt != null)
        {
            nbt.put("Player", playerNbt);
        }

        CompoundNBT compoundnbt2 = new CompoundNBT();
        ListNBT listnbt1 = new ListNBT();

        for (String s : this.enabledDataPacks)
        {
            listnbt1.add(StringNBT.valueOf(s));
        }

        compoundnbt2.put("Enabled", listnbt1);
        ListNBT listnbt2 = new ListNBT();

        for (String s1 : this.disabledDataPacks)
        {
            listnbt2.add(StringNBT.valueOf(s1));
        }

        compoundnbt2.put("Disabled", listnbt2);
        nbt.put("DataPacks", compoundnbt2);

        if (this.customBossEvents != null)
        {
            nbt.put("CustomBossEvents", this.customBossEvents);
        }

        nbt.put("ScheduledEvents", this.scheduledEvents.write());
        nbt.putInt("WanderingTraderSpawnDelay", this.wanderingTraderSpawnDelay);
        nbt.putInt("WanderingTraderSpawnChance", this.wanderingTraderSpawnChance);

        if (this.wanderingTraderId != null)
        {
            nbt.putString("WanderingTraderId", this.wanderingTraderId.toString());
        }
    }

    public long getSeed()
    {
        return this.randomSeed;
    }

    public static long byHashing(long p_227498_0_)
    {
        return Hashing.sha256().hashLong(p_227498_0_).asLong();
    }

    public int getSpawnX()
    {
        return this.spawnX;
    }

    public int getSpawnY()
    {
        return this.spawnY;
    }

    public int getSpawnZ()
    {
        return this.spawnZ;
    }

    public long getGameTime()
    {
        return this.gameTime;
    }

    public long getDayTime()
    {
        return this.dayTime;
    }

    private void fixPlayerData()
    {
        if (!this.playerDataFixed && this.playerData != null)
        {
            if (this.dataVersion < SharedConstants.getVersion().getWorldVersion())
            {
                if (this.fixer == null)
                {
                    throw(NullPointerException)Util.pauseDevMode(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
                }

                this.playerData = NBTUtil.update(this.fixer, DefaultTypeReferences.PLAYER, this.playerData, this.dataVersion);
            }

            this.playerDataFixed = true;
        }
    }

    public CompoundNBT getPlayerNBTTagCompound()
    {
        this.fixPlayerData();
        return this.playerData;
    }

    public void setSpawnX(int x)
    {
        this.spawnX = x;
    }

    public void setSpawnY(int y)
    {
        this.spawnY = y;
    }

    public void setSpawnZ(int z)
    {
        this.spawnZ = z;
    }

    public void setGameTime(long time)
    {
        this.gameTime = time;
    }

    public void setDayTime(long time)
    {
        this.dayTime = time;
    }

    public void setSpawn(BlockPos spawnPoint)
    {
        this.spawnX = spawnPoint.getX();
        this.spawnY = spawnPoint.getY();
        this.spawnZ = spawnPoint.getZ();
    }

    public String getWorldName()
    {
        return this.levelName;
    }

    public void setWorldName(String worldName)
    {
        this.levelName = worldName;
    }

    public int getSaveVersion()
    {
        return this.saveVersion;
    }

    public void setSaveVersion(int version)
    {
        this.saveVersion = version;
    }

    public long getLastTimePlayed()
    {
        return this.lastTimePlayed;
    }

    public int getClearWeatherTime()
    {
        return this.clearWeatherTime;
    }

    public void setClearWeatherTime(int cleanWeatherTimeIn)
    {
        this.clearWeatherTime = cleanWeatherTimeIn;
    }

    public boolean isThundering()
    {
        return this.thundering;
    }

    public void setThundering(boolean thunderingIn)
    {
        this.thundering = thunderingIn;
    }

    public int getThunderTime()
    {
        return this.thunderTime;
    }

    public void setThunderTime(int time)
    {
        this.thunderTime = time;
    }

    public boolean isRaining()
    {
        return this.raining;
    }

    public void setRaining(boolean isRaining)
    {
        this.raining = isRaining;
    }

    public int getRainTime()
    {
        return this.rainTime;
    }

    public void setRainTime(int time)
    {
        this.rainTime = time;
    }

    public GameType getGameType()
    {
        return this.gameType;
    }

    public boolean isMapFeaturesEnabled()
    {
        return this.mapFeaturesEnabled;
    }

    public void setMapFeaturesEnabled(boolean enabled)
    {
        this.mapFeaturesEnabled = enabled;
    }

    public void setGameType(GameType type)
    {
        this.gameType = type;
    }

    public boolean isHardcore()
    {
        return this.hardcore;
    }

    public void setHardcore(boolean hardcoreIn)
    {
        this.hardcore = hardcoreIn;
    }

    public WorldType getGenerator()
    {
        return this.generator;
    }

    public void setGenerator(WorldType type)
    {
        this.generator = type;
    }

    public CompoundNBT getGeneratorOptions()
    {
        return this.generatorOptions;
    }

    public void setGeneratorOptions(CompoundNBT p_212242_1_)
    {
        this.generatorOptions = p_212242_1_;
    }

    public boolean areCommandsAllowed()
    {
        return this.allowCommands;
    }

    public void setAllowCommands(boolean allow)
    {
        this.allowCommands = allow;
    }

    public boolean isInitialized()
    {
        return this.initialized;
    }

    public void setInitialized(boolean initializedIn)
    {
        this.initialized = initializedIn;
    }

    public GameRules getGameRulesInstance()
    {
        return this.gameRules;
    }

    public double getBorderCenterX()
    {
        return this.borderCenterX;
    }

    public double getBorderCenterZ()
    {
        return this.borderCenterZ;
    }

    public double getBorderSize()
    {
        return this.borderSize;
    }

    public void setBorderSize(double size)
    {
        this.borderSize = size;
    }

    public long getBorderSizeLerpTime()
    {
        return this.borderSizeLerpTime;
    }

    public void setBorderSizeLerpTime(long time)
    {
        this.borderSizeLerpTime = time;
    }

    public double getBorderSizeLerpTarget()
    {
        return this.borderSizeLerpTarget;
    }

    public void setBorderSizeLerpTarget(double lerpSize)
    {
        this.borderSizeLerpTarget = lerpSize;
    }

    public void setBorderCenterZ(double posZ)
    {
        this.borderCenterZ = posZ;
    }

    public void setBorderCenterX(double posX)
    {
        this.borderCenterX = posX;
    }

    public double getBorderSafeZone()
    {
        return this.borderSafeZone;
    }

    public void setBorderSafeZone(double amount)
    {
        this.borderSafeZone = amount;
    }

    public double getBorderDamagePerBlock()
    {
        return this.borderDamagePerBlock;
    }

    public void setBorderDamagePerBlock(double damage)
    {
        this.borderDamagePerBlock = damage;
    }

    public int getBorderWarningBlocks()
    {
        return this.borderWarningBlocks;
    }

    public int getBorderWarningTime()
    {
        return this.borderWarningTime;
    }

    public void setBorderWarningBlocks(int amountOfBlocks)
    {
        this.borderWarningBlocks = amountOfBlocks;
    }

    public void setBorderWarningTime(int ticks)
    {
        this.borderWarningTime = ticks;
    }

    public Difficulty getDifficulty()
    {
        return this.difficulty;
    }

    public void setDifficulty(Difficulty newDifficulty)
    {
        this.difficulty = newDifficulty;
    }

    public boolean isDifficultyLocked()
    {
        return this.difficultyLocked;
    }

    public void setDifficultyLocked(boolean locked)
    {
        this.difficultyLocked = locked;
    }

    public TimerCallbackManager<MinecraftServer> getScheduledEvents()
    {
        return this.scheduledEvents;
    }

    public void addToCrashReport(CrashReportCategory category)
    {
        category.addDetail("Level name", () ->
        {
            return this.levelName;
        });
        category.addDetail("Level seed", () ->
        {
            return String.valueOf(this.randomSeed);
        });
        category.addDetail("Level generator", () ->
        {
            return String.format("ID %02d - %s, ver %d. Features enabled: %b", this.generator.getId(), this.generator.getName(), this.generator.getVersion(), this.mapFeaturesEnabled);
        });
        category.addDetail("Level generator options", () ->
        {
            return this.generatorOptions.toString();
        });
        category.addDetail("Level spawn location", () ->
        {
            return CrashReportCategory.getCoordinateInfo(this.spawnX, this.spawnY, this.spawnZ);
        });
        category.addDetail("Level time", () ->
        {
            return String.format("%d game time, %d day time", this.gameTime, this.dayTime);
        });
        category.addDetail("Known server brands", () ->
        {
            return String.join(", ", this.field_230141_X_);
        });
        category.addDetail("Level was modded", () ->
        {
            return Boolean.toString(this.field_230142_Y_);
        });
        category.addDetail("Level storage version", () ->
        {
            String s = "Unknown?";

            try {
                switch (this.saveVersion)
                {
                    case 19132:
                        s = "McRegion";
                        break;

                    case 19133:
                        s = "Anvil";
                }
            }
            catch (Throwable var3)
            {
                ;
            }

            return String.format("0x%05X - %s", this.saveVersion, s);
        });
        category.addDetail("Level weather", () ->
        {
            return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", this.rainTime, this.raining, this.thunderTime, this.thundering);
        });
        category.addDetail("Level game mode", () ->
        {
            return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.gameType.getName(), this.gameType.getID(), this.hardcore, this.allowCommands);
        });
    }

    public CompoundNBT getDimensionData(DimensionType dimensionIn)
    {
        CompoundNBT compoundnbt = this.dimensionData.get(dimensionIn);
        return compoundnbt == null ? new CompoundNBT() : compoundnbt;
    }

    public void setDimensionData(DimensionType dimensionIn, CompoundNBT compound)
    {
        this.dimensionData.put(dimensionIn, compound);
    }

    public int getVersionId()
    {
        return this.versionId;
    }

    public boolean isVersionSnapshot()
    {
        return this.versionSnapshot;
    }

    public String getVersionName()
    {
        return this.versionName;
    }

    public Set<String> getDisabledDataPacks()
    {
        return this.disabledDataPacks;
    }

    public Set<String> getEnabledDataPacks()
    {
        return this.enabledDataPacks;
    }

    @Nullable
    public CompoundNBT getCustomBossEvents()
    {
        return this.customBossEvents;
    }

    public void setCustomBossEvents(@Nullable CompoundNBT p_201356_1_)
    {
        this.customBossEvents = p_201356_1_;
    }

    public int getWanderingTraderSpawnDelay()
    {
        return this.wanderingTraderSpawnDelay;
    }

    public void setWanderingTraderSpawnDelay(int p_215764_1_)
    {
        this.wanderingTraderSpawnDelay = p_215764_1_;
    }

    public int getWanderingTraderSpawnChance()
    {
        return this.wanderingTraderSpawnChance;
    }

    public void setWanderingTraderSpawnChance(int p_215762_1_)
    {
        this.wanderingTraderSpawnChance = p_215762_1_;
    }

    public void setWanderingTraderId(UUID p_215761_1_)
    {
        this.wanderingTraderId = p_215761_1_;
    }

    public void func_230145_a_(String p_230145_1_, boolean p_230145_2_)
    {
        this.field_230141_X_.add(p_230145_1_);
        this.field_230142_Y_ |= p_230145_2_;
    }
}
