package mapped;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import it.unimi.dsi.fastutil.longs.LongIterator;
import net.minecraft.block.Block;
import net.minecraft.client.util.Util;
import net.minecraft.command.CommandSource;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.SpawnLocationHelper;
import net.minecraft.network.play.server.SServerDifficultyPacket;
import net.minecraft.network.play.server.SUpdateTimePacket;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.scoreboard.ServerScoreboard;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.CryptException;
import net.minecraft.util.CryptManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Unit;
import net.minecraft.util.datafix.codec.DatapackCodec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;
import net.minecraft.world.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.server.TicketType;
import net.minecraft.world.storage.CommandStorage;
import net.minecraft.world.storage.IServerWorldInfo;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

public abstract class MinecraftServer extends RecursiveEventLoop<Class567> implements ISnooperInfo, ICommandSource, AutoCloseable {
   private static final Logger LOGGER = LogManager.getLogger();
   public static final File USER_CACHE_FILE = new File("usercache.json");
   public static final WorldSettings field1210 = new WorldSettings(
      "Demo World", GameType.field11102, false, Difficulty.NORMAL, false, new GameRules(), DatapackCodec.VANILLA_CODEC
   );
   public final SaveFormat.LevelSave field1211;
   public final Class8716 playerDataManager;
   private final Snooper field1213 = new Snooper("server", this, Util.milliTime());
   private final List<Runnable> field1214 = Lists.newArrayList();
   private final TimeTracker field1215 = new TimeTracker(Util.nanoTimeSupplier, this::method1375);
   private IProfiler profiler = EmptyProfiler.INSTANCE;
   private final Class9021 field1217;
   private final Class8216 field1218;
   private final Class8783 statusResponse = new Class8783();
   private final Random field1220 = new Random();
   private final DataFixer field1221;
   private String field1222;
   private int field1223 = -1;
   public final DynamicRegistriesImpl field_240767_f_;
   private final Map<RegistryKey<World>, ServerWorld> worlds = Maps.newLinkedHashMap();
   private Class6395 field1226;
   private volatile boolean serverRunning = true;
   private boolean serverStopped;
   private int tickCounter;
   public final Proxy serverProxy;
   private boolean onlineMode;
   private boolean preventProxyConnections;
   private boolean pvpEnabled;
   private boolean allowFlight;
   @Nullable
   private String motd;
   private int buildLimit;
   private int maxPlayerIdleMinutes;
   public final long[] tickTimeArray = new long[100];
   private KeyPair serverKeyPair;
   private String serverOwner;
   private boolean isDemo;
   private String resourcePackUrl = "";
   private String resourcePackHash = "";
   private volatile boolean serverIsRunning;
   private long timeOfLastWarning;
   private boolean startProfiling;
   private boolean isGamemodeForced;
   private final MinecraftSessionService sessionService;
   private final GameProfileRepository profileRepo;
   private final PlayerProfileCache profileCache;
   private long nanoTimeSinceStatusRefresh;
   private final Thread serverThread;
   private long serverTime = Util.milliTime();
   private long runTasksUntil;
   private boolean isRunningScheduledTasks;
   private boolean worldIconSet;
   private final ResourcePackList resourcePacks;
   private final ServerScoreboard field1258 = new ServerScoreboard(this);
   private CommandStorage field1259;
   private final Class8426 field1260 = new Class8426();
   private final FunctionManager functionManager;
   private final FrameTimer field1262 = new FrameTimer();
   private boolean field1263;
   private float field1264;
   private final Executor backgroundExecutor;
   private String field1266;
   private DataPackRegistries resourceManager;
   private final TemplateManager field_240765_ak_;
   public final IServerConfiguration field_240768_i_;

   public static <S extends MinecraftServer> S func_240784_a_(Function<Thread, S> p_240784_0_) {
      AtomicReference<S> atomicreference = new AtomicReference<>();
      Thread thread = new Thread(() -> atomicreference.get().func_240802_v_(), "Server thread");
      thread.setUncaughtExceptionHandler((p_240779_0_, p_240779_1_) -> LOGGER.error(p_240779_1_));
      S s = p_240784_0_.apply(thread);
      atomicreference.set(s);
      thread.start();
      return s;
   }

   public MinecraftServer(
      Thread var1,
      DynamicRegistriesImpl var2,
      SaveFormat.LevelSave var3,
      IServerConfiguration var4,
      ResourcePackList var5,
      Proxy var6,
      DataFixer var7,
      DataPackRegistries var8,
      MinecraftSessionService var9,
      GameProfileRepository var10,
      PlayerProfileCache var11,
      Class8216 var12
   ) {
      super("Server");
      this.field_240767_f_ = var2;
      this.field_240768_i_ = var4;
      this.serverProxy = var6;
      this.resourcePacks = var5;
      this.resourceManager = var8;
      this.sessionService = var9;
      this.profileRepo = var10;
      this.profileCache = var11;
      this.field1217 = new Class9021(this);
      this.field1218 = var12;
      this.field1211 = var3;
      this.playerDataManager = var3.method7994();
      this.field1221 = var7;
      this.functionManager = new FunctionManager(this, var8.getFunctionReloader());
      this.field_240765_ak_ = new TemplateManager(var8.getResourceManager(), var3, var7);
      this.serverThread = var1;
      this.backgroundExecutor = Util.getServerExecutor();
   }

   private void method1276(Class8250 var1) {
      Class7535 var4 = var1.<Class7535>method28767(Class7535::new, "scoreboard");
      var4.method24629(this.method1409());
      this.method1409().method21021(new Class1415(var4));
   }

   public abstract boolean    init() throws IOException;

   public static void func_240777_a_(SaveFormat.LevelSave var0) {
      if (var0.method7995()) {
         LOGGER.info("Converting map!");
         var0.method7996(new Class1340());
      }
   }

   public void func_240800_l__() {
      this.setResourcePackFromWorld();
      this.field_240768_i_.addServerBranding(this.getServerModName(), this.func_230045_q_().isPresent());
      IChunkStatusListener var3 = this.field1218.create(11);
      this.func_240787_a_(var3);
      this.func_230543_p_();
      this.loadInitialChunks(var3);
   }

   public void func_230543_p_() {
   }

   public void func_240787_a_(IChunkStatusListener var1) {
      IServerWorldInfo var4 = this.field_240768_i_.method20098();
      DimensionGeneratorSettings var5 = this.field_240768_i_.getDimensionGeneratorSettings();
      boolean var6 = var5.method26267();
      long var7 = var5.method26259();
      long var9 = BiomeManager.getHashedSeed(var7);
      ImmutableList var11 = ImmutableList.of(new Class7020(), new Class7018(), new Class7017(), new Class7015(), new Class7019(var4));
      SimpleRegistry<Dimension> var12 = var5.method26264();
      Dimension var13 = var12.getValueForKey(Dimension.field43952);
      DimensionType var14;
      Object var15;
      if (var13 == null) {
         var14 = this.field_240767_f_.method32454().getOrThrow(DimensionType.OVERWORLD);
         var15 = DimensionGeneratorSettings.method26258(
            this.field_240767_f_.<Biome>getRegistry(Registry.BIOME_KEY), this.field_240767_f_.<DimensionSettings>getRegistry(Registry.NOISE_SETTINGS_KEY), new Random().nextLong()
         );
      } else {
         var14 = var13.method36412();
         var15 = var13.method36413();
      }

      ServerWorld var16 = new ServerWorld(this, this.backgroundExecutor, this.field1211, var4, World.OVERWORLD, var14, var1, (ChunkGenerator)var15, var6, var9, var11, true);
      this.worlds.put(World.OVERWORLD, var16);
      Class8250 var17 = var16.method6945();
      this.method1276(var17);
      this.field1259 = new CommandStorage(var17);
      WorldBorder var18 = var16.getWorldBorder();
      var18.method24557(var4.method20069());
      if (!var4.method20070()) {
         try {
            func_240786_a_(var16, var4, var5.method26261(), var6, true);
            var4.method20071(true);
            if (var6) {
               this.func_240778_a_(this.field_240768_i_);
            }
         } catch (Throwable var28) {
            CrashReport var20 = CrashReport.makeCrashReport(var28, "Exception initializing level");

            try {
               var16.fillCrashReport(var20);
            } catch (Throwable var27) {
            }

            throw new ReportedException(var20);
         }

         var4.method20071(true);
      }

      this.getPlayerList().method19447(var16);
      if (this.field_240768_i_.method20093() != null) {
         this.method1414().method29606(this.field_240768_i_.method20093());
      }

      for (Entry var29 : var12.method9191()) {
         RegistryKey var21 = (RegistryKey)var29.getKey();
         if (var21 != Dimension.field43952) {
            RegistryKey var22 = RegistryKey.<World>getOrCreateKey(Registry.WORLD_KEY, var21.getLocation());
            DimensionType var23 = ((Dimension)var29.getValue()).method36412();
            ChunkGenerator var24 = ((Dimension)var29.getValue()).method36413();
            Class6609 var25 = new Class6609(this.field_240768_i_, var4);
            ServerWorld var26 = new ServerWorld(this, this.backgroundExecutor, this.field1211, var25, var22, var23, var1, var24, var6, var9, ImmutableList.of(), false);
            var18.method24543(new Class7048(var26.getWorldBorder()));
            this.worlds.put(var22, var26);
         }
      }
   }

   private static void func_240786_a_(ServerWorld p_240786_0_, IServerWorldInfo p_240786_1_, boolean hasBonusChest, boolean p_240786_3_, boolean p_240786_4_) {
      ChunkGenerator chunkgenerator = p_240786_0_.getChunkProvider().getChunkGenerator();

      if (!p_240786_4_)
      {
         p_240786_1_.setSpawn(BlockPos.ZERO.up(chunkgenerator.getGroundHeight()), 0.0F);
      }
      else if (p_240786_3_)
      {
         p_240786_1_.setSpawn(BlockPos.ZERO.up(), 0.0F);
      }
      else
      {
         BiomeProvider biomeprovider = chunkgenerator.getBiomeProvider();
         Random random = new Random(p_240786_0_.getSeed());
         BlockPos blockpos = biomeprovider.findBiomePosition(0, p_240786_0_.getSeaLevel(), 0, 256, (p_244265_0_) ->
         {
            return p_244265_0_.getMobSpawnInfo().isValidSpawnBiomeForPlayer();
         }, random);
         ChunkPos chunkpos = blockpos == null ? new ChunkPos(0, 0) : new ChunkPos(blockpos);

         if (blockpos == null)
         {
            LOGGER.warn("Unable to find spawn biome");
         }

         boolean flag = false;

         for (Block block : BlockTags.VALID_SPAWN.getAllElements())
         {
            if (biomeprovider.getSurfaceBlocks().contains(block.getDefaultState()))
            {
               flag = true;
               break;
            }
         }

         p_240786_1_.setSpawn(chunkpos.asBlockPos().add(8, chunkgenerator.getGroundHeight(), 8), 0.0F);
         int i1 = 0;
         int j1 = 0;
         int i = 0;
         int j = -1;
         int k = 32;

         for (int l = 0; l < 1024; ++l)
         {
            if (i1 > -16 && i1 <= 16 && j1 > -16 && j1 <= 16)
            {
               BlockPos blockpos1 = SpawnLocationHelper.func_241094_a_(p_240786_0_, new ChunkPos(chunkpos.x + i1, chunkpos.z + j1), flag);

               if (blockpos1 != null)
               {
                  System.out.println("p_240786_1_.setSpawn(blockpos1, 0.0F)");
                  p_240786_1_.setSpawn(blockpos1, 0.0F);
                  break;
               }
            }

            if (i1 == j1 || i1 < 0 && i1 == -j1 || i1 > 0 && i1 == 1 - j1)
            {
               int k1 = i;
               i = -j;
               j = k1;
            }

            i1 += i;
            j1 += j;
         }

         if (hasBonusChest)
         {
            ConfiguredFeature <? , ? > configuredfeature = Features.BONUS_CHEST;
            configuredfeature.func_242765_a(p_240786_0_, chunkgenerator, p_240786_0_.rand, new BlockPos(p_240786_1_.getSpawnX(), p_240786_1_.getSpawnY(), p_240786_1_.getSpawnZ()));
         }
      }
   }

   private void func_240778_a_(IServerConfiguration var1) {
      var1.setDifficulty(Difficulty.PEACEFUL);
      var1.method20086(true);
      IServerWorldInfo var4 = var1.method20098();
      var4.method20044(false);
      var4.method20055(false);
      var4.method20061(1000000000);
      var4.method20076(6000L);
      var4.setGameType(GameType.SPECTATOR);
   }

   private void loadInitialChunks(IChunkStatusListener listener) {
      ServerWorld world = this.getServerWorld();
      LOGGER.info("Preparing start region for dimension {}", world.getDimensionKey().getLocation());
      BlockPos spawnPoint = world.getSpawnPoint();
      listener.start(new ChunkPos(spawnPoint));
      ServerChunkProvider serverChunkProvider = world.getChunkProvider();
      serverChunkProvider.getLightManager().func_215598_a(500);
      this.serverTime = Util.milliTime();
      serverChunkProvider.registerTicket(TicketType.START, new ChunkPos(spawnPoint), 11, Unit.INSTANCE);

      while (serverChunkProvider.getLoadedChunksCount() != 441) {
         this.serverTime = Util.milliTime() + 10L;
         this.runScheduledTasks();
      }

      this.serverTime = Util.milliTime() + 10L;
      this.runScheduledTasks();

      for (ServerWorld serverworld1 : this.worlds.values()) {
         ForcedChunksSaveData forcedchunkssavedata = serverworld1.method6945().method28768(ForcedChunksSaveData::new, "chunks");
         if (forcedchunkssavedata != null) {
            LongIterator longiterator = forcedchunkssavedata.getChunks().iterator();

            while (longiterator.hasNext()) {
               long i = longiterator.nextLong();
               ChunkPos var13 = new ChunkPos(i);
               serverworld1.getChunkProvider().forceChunk(var13, true);
            }
         }
      }

      this.serverTime = Util.milliTime() + 10L;
      this.runScheduledTasks();
      listener.stop();
      serverChunkProvider.getLightManager().func_215598_a(5);
      this.func_240794_aZ_();
   }

   public void setResourcePackFromWorld() {
      File var3 = this.field1211.resolveFilePath(FolderName.field23353).toFile();
      if (var3.isFile()) {
         String var4 = this.field1211.method7990();

         try {
            this.setResourcePack("level://" + URLEncoder.encode(var4, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
         } catch (UnsupportedEncodingException var6) {
            LOGGER.warn("Something went wrong url encoding {}", var4);
         }
      }
   }

   public GameType method1286() {
      return this.field_240768_i_.method20067();
   }

   public boolean method1287() {
      return this.field_240768_i_.isHardcore();
   }

   public abstract int method1288();

   public abstract int getFunctionLevel();

   public abstract boolean method1290();

   public boolean method1291(boolean var1, boolean var2, boolean var3) {
      boolean var6 = false;

      for (ServerWorld var8 : this.method1320()) {
         if (!var1) {
            LOGGER.info("Saving chunks for level '{}'/{}", var8, var8.getDimensionKey().getLocation());
         }

         var8.method6910((Class1339)null, var2, var8.field9047 && !var3);
         var6 = true;
      }

      ServerWorld var9 = this.getServerWorld();
      IServerWorldInfo var10 = this.field_240768_i_.method20098();
      var10.method20068(var9.getWorldBorder().method24556());
      this.field_240768_i_.method20094(this.method1414().method29605());
      this.field1211.method8001(this.field_240767_f_, this.field_240768_i_, this.getPlayerList().method19479());
      return var6;
   }

   @Override
   public void close() {
      this.method1292();
   }

   public void method1292() {
      LOGGER.info("Stopping server");
      if (this.getNetworkSystem() != null) {
         this.getNetworkSystem().method33400();
      }

      if (this.field1226 != null) {
         LOGGER.info("Saving players");
         this.field1226.saveAllPlayerData();
         this.field1226.method19483();
      }

      LOGGER.info("Saving worlds");

      for (ServerWorld var4 : this.method1320()) {
         if (var4 != null) {
            var4.field9047 = false;
         }
      }

      this.method1291(false, true, false);

      for (ServerWorld var9 : this.method1320()) {
         if (var9 != null) {
            try {
               var9.close();
            } catch (IOException var7) {
               LOGGER.error("Exception closing the level", var7);
            }
         }
      }

      if (this.field1213.isSnooperRunning()) {
         this.field1213.method27301();
      }

      this.resourceManager.close();

      try {
         this.field1211.close();
      } catch (IOException var6) {
         LOGGER.error("Failed to unlock level {}", this.field1211.method7990(), var6);
      }
   }

   public String getServerHostname() {
      return this.field1222;
   }

   public void setHostname(String var1) {
      this.field1222 = var1;
   }

   public boolean isServerRunning() {
      return this.serverRunning;
   }

   public void initiateShutdown(boolean var1) {
      this.serverRunning = false;
      if (var1) {
         try {
            this.serverThread.join();
         } catch (InterruptedException var5) {
            LOGGER.error("Error while shutting down", var5);
         }
      }
   }

   public void func_240802_v_() {
      try {
         if (this.init()) {
            this.serverTime = Util.milliTime();
            this.statusResponse.setServerDescription(new StringTextComponent(this.motd));
            this.statusResponse.setVersion(new Class9226(SharedConstants.getVersion().getName(), SharedConstants.getVersion().getProtocolVersion()));
            this.applyServerIconToResponse(this.statusResponse);

            while (this.serverRunning) {
               long i = Util.milliTime() - this.serverTime;
               if (i > 2000L && this.serverTime - this.timeOfLastWarning >= 15000L) {
                  long j = i / 50L;
                  LOGGER.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", i, j);
                  this.serverTime += j * 50L;
                  this.timeOfLastWarning = this.serverTime;
               }

               this.serverTime += 50L;
               LongTickDetector var51 = LongTickDetector.method36636("Server");
               this.method1428(var51);
               this.profiler.startTick();
               this.profiler.startSection("tick");
               this.method1310(this::isAheadOfTime);
               this.profiler.endStartSection("nextTickWait");
               this.isRunningScheduledTasks = true;
               this.runTasksUntil = Math.max(Util.milliTime() + 50L, this.serverTime);
               this.runScheduledTasks();
               this.profiler.endSection();
               this.profiler.endTick();
               this.method1429(var51);
               this.serverIsRunning = true;
            }
         } else {
            this.method1308((CrashReport)null);
         }
      } catch (Throwable var49) {
         LOGGER.error("Encountered an unexpected exception", var49);
         CrashReport var10;
         if (var49 instanceof ReportedException) {
            var10 = this.method1326(((ReportedException)var49).getCrashReport());
         } else {
            var10 = this.method1326(new CrashReport("Exception in server tick loop", var49));
         }

         File var7 = new File(
            new File(this.method1307(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
         );
         if (var10.saveToFile(var7)) {
            LOGGER.error("This crash report has been saved to: {}", var7.getAbsolutePath());
         } else {
            LOGGER.error("We were unable to save this crash report to disk.");
         }

         this.method1308(var10);
      } finally {
         try {
            this.serverStopped = true;
            this.method1292();
         } catch (Throwable var47) {
            LOGGER.error("Exception stopping the server", var47);
         } finally {
            this.method1309();
         }
      }
   }

   private boolean isAheadOfTime() {
      return this.isTaskRunning() || Util.milliTime() < (!this.isRunningScheduledTasks ? this.serverTime : this.runTasksUntil);
   }

   public void runScheduledTasks() {
      this.drainTasks();
      this.driveUntil(() -> !this.isAheadOfTime());
   }

   public Class567 wrapTask(Runnable var1) {
      return new Class567(this.tickCounter, var1);
   }

   public boolean canRun(Class567 var1) {
      return var1.method1895() + 3 < this.tickCounter || this.isAheadOfTime();
   }

   @Override
   public boolean method1302() {
      boolean var3 = this.method1303();
      this.isRunningScheduledTasks = var3;
      return var3;
   }

   private boolean method1303() {
      if (super.method1302()) {
         return true;
      } else {
         if (this.isAheadOfTime()) {
            for (ServerWorld var4 : this.method1320()) {
               if (var4.getChunkProvider().method7362()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void run(Class567 var1) {
      this.method1420().func_230035_c_("runTask");
      super.run(var1);
   }

   private void applyServerIconToResponse(Class8783 var1) {
      File var4 = this.method1316("server-icon.png");
      if (!var4.exists()) {
         var4 = this.field1211.method8002();
      }

      if (var4.isFile()) {
         ByteBuf var5 = Unpooled.buffer();

         try {
            BufferedImage var6 = ImageIO.read(var4);
            Validate.validState(var6.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var6.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            ImageIO.write(var6, "PNG", new ByteBufOutputStream(var5));
            ByteBuffer var7 = Base64.getEncoder().encode(var5.nioBuffer());
            var1.method31706("data:image/png;base64," + StandardCharsets.UTF_8.decode(var7));
         } catch (Exception var11) {
            LOGGER.error("Couldn't load server icon", var11);
         } finally {
            var5.release();
         }
      }
   }

   public boolean method1305() {
      this.worldIconSet = this.worldIconSet || this.method1306().isFile();
      return this.worldIconSet;
   }

   public File method1306() {
      return this.field1211.method8002();
   }

   public File method1307() {
      return new File(".");
   }

   public void method1308(CrashReport var1) {
   }

   public void method1309() {
   }

   public void method1310(BooleanSupplier var1) {
      long var4 = Util.nanoTime();
      this.tickCounter++;
      this.method1311(var1);
      if (var4 - this.nanoTimeSinceStatusRefresh >= 5000000000L) {
         this.nanoTimeSinceStatusRefresh = var4;
         this.statusResponse.method31703(new Class9762(this.method1323(), this.method1322()));
         GameProfile[] var10 = new GameProfile[Math.min(this.method1322(), 12)];
         int var11 = MathHelper.method37782(this.field1220, 0, this.method1322() - var10.length);

         for (int var12 = 0; var12 < var10.length; var12++) {
            var10[var12] = this.field1226.getPlayers().get(var11 + var12).getGameProfile();
         }

         Collections.shuffle(Arrays.<GameProfile>asList(var10));
         this.statusResponse.method31702().method38379(var10);
      }

      if (this.tickCounter % 6000 == 0) {
         LOGGER.debug("Autosave started");
         this.profiler.startSection("save");
         this.field1226.saveAllPlayerData();
         this.method1291(true, false, false);
         this.profiler.endSection();
         LOGGER.debug("Autosave finished");
      }

      this.profiler.startSection("snooper");
      if (!this.field1213.isSnooperRunning() && this.tickCounter > 100) {
         this.field1213.start();
      }

      if (this.tickCounter % 6000 == 0) {
         this.field1213.addMemoryStatsToSnooper();
      }

      this.profiler.endSection();
      this.profiler.startSection("tallying");
      long var6 = this.tickTimeArray[this.tickCounter % 100] = Util.nanoTime() - var4;
      this.field1264 = this.field1264 * 0.8F + (float)var6 / 1000000.0F * 0.19999999F;
      long var8 = Util.nanoTime();
      this.field1262.addFrame(var8 - var4);
      this.profiler.endSection();
   }

   public void method1311(BooleanSupplier var1) {
      this.profiler.startSection("commandFunctions");
      this.method1397().method22823();
      this.profiler.endStartSection("levels");

      for (ServerWorld var5 : this.method1320()) {
         this.profiler.method22504(() -> var5 + " " + var5.getDimensionKey().getLocation());
         if (this.tickCounter % 20 == 0) {
            this.profiler.startSection("timeSync");
            this.field1226
               .method19457(new SUpdateTimePacket(var5.getGameTime(), var5.method6784(), var5.getGameRules().getBoolean(GameRules.field24232)), var5.getDimensionKey());
            this.profiler.endSection();
         }

         this.profiler.startSection("tick");

         try {
            var5.method6894(var1);
         } catch (Throwable var8) {
            CrashReport var7 = CrashReport.makeCrashReport(var8, "Exception ticking world");
            var5.fillCrashReport(var7);
            throw new ReportedException(var7);
         }

         this.profiler.endSection();
         this.profiler.endSection();
      }

      this.profiler.endStartSection("connection");
      this.getNetworkSystem().method33401();
      this.profiler.endStartSection("players");
      this.field1226.method19455();
      if (SharedConstants.developmentMode) {
         Class7879.field33820.method26417();
      }

      this.profiler.endStartSection("server gui refresh");

      for (int var9 = 0; var9 < this.field1214.size(); var9++) {
         this.field1214.get(var9).run();
      }

      this.profiler.endSection();
   }

   public boolean method1312() {
      return true;
   }

   public void method1313(Runnable var1) {
      this.field1214.add(var1);
   }

   public void method1314(String var1) {
      this.field1266 = var1;
   }

   public boolean isThreadAlive() {
      return !this.serverThread.isAlive();
   }

   public File method1316(String var1) {
      return new File(this.method1307(), var1);
   }

   public final ServerWorld getServerWorld() {
      return this.worlds.get(World.OVERWORLD);
   }

   @Nullable
   public ServerWorld method1318(RegistryKey<World> var1) {
      return this.worlds.get(var1);
   }

   public Set<RegistryKey<World>> method1319() {
      return this.worlds.keySet();
   }

   public Iterable<ServerWorld> method1320() {
      return this.worlds.values();
   }

   public String method1321() {
      return SharedConstants.getVersion().getName();
   }

   public int method1322() {
      return this.field1226.method19474();
   }

   public int method1323() {
      return this.field1226.method19475();
   }

   public String[] method1324() {
      return this.field1226.method19460();
   }

   public String getServerModName() {
      return "vanilla";
   }

   public CrashReport method1326(CrashReport var1) {
      if (this.field1226 != null) {
         var1.getCategory()
            .addDetail("Player Count", () -> this.field1226.method19474() + " / " + this.field1226.method19475() + "; " + this.field1226.getPlayers());
      }

      var1.getCategory().addDetail("Data Packs", () -> {
         StringBuilder var3 = new StringBuilder();

         for (ResourcePackInfo var5 : this.resourcePacks.getEnabledPacks()) {
            if (var3.length() > 0) {
               var3.append(", ");
            }

            var3.append(var5.getName());
            if (!var5.getCompatibility().isCompatible()) {
               var3.append(" (incompatible)");
            }
         }

         return var3.toString();
      });
      if (this.field1266 != null) {
         var1.getCategory().addDetail("Server Id", () -> this.field1266);
      }

      return var1;
   }

   public abstract Optional<String> func_230045_q_();

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      LOGGER.info(var1.getString());
   }

   public KeyPair method1329() {
      return this.serverKeyPair;
   }

   public int getServerPort() {
      return this.field1223;
   }

   public void setServerPort(int var1) {
      this.field1223 = var1;
   }

   public String getServerOwner() {
      return this.serverOwner;
   }

   public void setServerOwner(String var1) {
      this.serverOwner = var1;
   }

   public boolean isSinglePlayer() {
      return this.serverOwner != null;
   }

   public void func_244801_P() {
      LOGGER.info("Generating keypair");

      try {
         this.serverKeyPair = CryptManager.generateKeyPair();
      } catch (CryptException var4) {
         throw new IllegalStateException("Failed to generate key pair", var4);
      }
   }

   public void setDifficultyForAllWorlds(Difficulty var1, boolean var2) {
      if (var2 || !this.field_240768_i_.isDifficultyLocked()) {
         this.field_240768_i_.setDifficulty(!this.field_240768_i_.isHardcore() ? var1 : Difficulty.HARD);
         this.func_240794_aZ_();
         this.getPlayerList().getPlayers().forEach(this::sendDifficultyToPlayer);
      }
   }

   public int method1337(int var1) {
      return var1;
   }

   private void func_240794_aZ_() {
      for (ServerWorld var4 : this.method1320()) {
         var4.method6767(this.method1341(), this.method1354());
      }
   }

   public void method1339(boolean var1) {
      this.field_240768_i_.method20086(var1);
      this.getPlayerList().getPlayers().forEach(this::sendDifficultyToPlayer);
   }

   private void sendDifficultyToPlayer(ServerPlayerEntity var1) {
      Class6612 var4 = var1.getServerWorld().getWorldInfo();
      var1.connection.sendPacket(new SServerDifficultyPacket(var4.method20047(), var4.method20048()));
   }

   public boolean method1341() {
      return this.field_240768_i_.method20047() != Difficulty.PEACEFUL;
   }

   public boolean method1342() {
      return this.isDemo;
   }

   public void setDemo(boolean var1) {
      this.isDemo = var1;
   }

   public String method1344() {
      return this.resourcePackUrl;
   }

   public String method1345() {
      return this.resourcePackHash;
   }

   public void setResourcePack(String var1, String var2) {
      this.resourcePackUrl = var1;
      this.resourcePackHash = var2;
   }

   @Override
   public void fillSnooper(Snooper var1) {
      var1.addClientStat("whitelist_enabled", false);
      var1.addClientStat("whitelist_count", 0);
      if (this.field1226 != null) {
         var1.addClientStat("players_current", this.method1322());
         var1.addClientStat("players_max", this.method1323());
         var1.addClientStat("players_seen", this.playerDataManager.method31443().length);
      }

      var1.addClientStat("uses_auth", this.onlineMode);
      var1.addClientStat("gui_state", !this.method1373() ? "disabled" : "enabled");
      var1.addClientStat("run_time", (Util.milliTime() - var1.getMinecraftStartTimeMillis()) / 60L * 1000L);
      var1.addClientStat("avg_tick_ms", (int)(MathHelper.method37785(this.tickTimeArray) * 1.0E-6));
      int var4 = 0;

      for (ServerWorld var6 : this.method1320()) {
         if (var6 != null) {
            var1.addClientStat("world[" + var4 + "][dimension]", var6.getDimensionKey().getLocation());
            var1.addClientStat("world[" + var4 + "][mode]", this.field_240768_i_.method20067());
            var1.addClientStat("world[" + var4 + "][difficulty]", var6.method6997());
            var1.addClientStat("world[" + var4 + "][hardcore]", this.field_240768_i_.isHardcore());
            var1.addClientStat("world[" + var4 + "][height]", this.buildLimit);
            var1.addClientStat("world[" + var4 + "][chunks_loaded]", var6.getChunkProvider().method7371());
            var4++;
         }
      }

      var1.addClientStat("worlds", var4);
   }

   public abstract boolean isDedicatedServer();

   public abstract int method1349();

   public boolean isServerInOnlineMode() {
      return this.onlineMode;
   }

   public void setOnlineMode(boolean var1) {
      this.onlineMode = var1;
   }

   public boolean method1352() {
      return this.preventProxyConnections;
   }

   public void setPreventProxyConnections(boolean var1) {
      this.preventProxyConnections = var1;
   }

   public boolean method1354() {
      return true;
   }

   public boolean method1355() {
      return true;
   }

   public abstract boolean method1356();

   public boolean method1357() {
      return this.pvpEnabled;
   }

   public void setAllowPvp(boolean var1) {
      this.pvpEnabled = var1;
   }

   public boolean method1359() {
      return this.allowFlight;
   }

   public void setAllowFlight(boolean var1) {
      this.allowFlight = var1;
   }

   public abstract boolean method1361();

   public String method1362() {
      return this.motd;
   }

   public void setMOTD(String var1) {
      this.motd = var1;
   }

   public int method1364() {
      return this.buildLimit;
   }

   public void setBuildLimit(int var1) {
      this.buildLimit = var1;
   }

   public boolean isServerStopped() {
      return this.serverStopped;
   }

   public Class6395 getPlayerList() {
      return this.field1226;
   }

   public void setPlayerList(Class6395 var1) {
      this.field1226 = var1;
   }

   public abstract boolean getPublic();

   public void method1370(GameType var1) {
      this.field_240768_i_.setGameType(var1);
   }

   @Nullable
   public Class9021 getNetworkSystem() {
      return this.field1217;
   }

   public boolean serverIsInRunLoop() {
      return this.serverIsRunning;
   }

   public boolean method1373() {
      return false;
   }

   public abstract boolean method1374(GameType var1, boolean var2, int var3);

   public int method1375() {
      return this.tickCounter;
   }

   public Snooper getSnooper() {
      return this.field1213;
   }

   public int method1377() {
      return 16;
   }

   public boolean method1378(ServerWorld var1, BlockPos var2, PlayerEntity var3) {
      return false;
   }

   public void setForceGamemode(boolean var1) {
      this.isGamemodeForced = var1;
   }

   public boolean method1380() {
      return this.isGamemodeForced;
   }

   public boolean method1381() {
      return true;
   }

   public int method1382() {
      return this.maxPlayerIdleMinutes;
   }

   public void setPlayerIdleTimeout(int var1) {
      this.maxPlayerIdleMinutes = var1;
   }

   public MinecraftSessionService getMinecraftSessionService() {
      return this.sessionService;
   }

   public GameProfileRepository method1385() {
      return this.profileRepo;
   }

   public PlayerProfileCache getPlayerProfileCache() {
      return this.profileCache;
   }

   public Class8783 method1387() {
      return this.statusResponse;
   }

   public void method1388() {
      this.nanoTimeSinceStatusRefresh = 0L;
   }

   public int method1389() {
      return 29999984;
   }

   @Override
   public boolean method1390() {
      return super.method1390() && !this.isServerStopped();
   }

   @Override
   public Thread getExecutionThread() {
      return this.serverThread;
   }

   public int getNetworkCompressionThreshold() {
      return 256;
   }

   public long getServerTime() {
      return this.serverTime;
   }

   public DataFixer getDataFixer() {
      return this.field1221;
   }

   public int method1395(ServerWorld var1) {
      return var1 == null ? 10 : var1.getGameRules().method17136(GameRules.field24239);
   }

   public AdvancementManager method1396() {
      return this.resourceManager.method7336();
   }

   public FunctionManager method1397() {
      return this.functionManager;
   }

   public CompletableFuture<Void> func_240780_a_(Collection<String> p_240780_1_)
   {
      CompletableFuture<Void> completablefuture = CompletableFuture.supplyAsync(() ->
      {
         return p_240780_1_.stream().map(this.resourcePacks::getPackInfo).filter(Objects::nonNull).map(ResourcePackInfo::getResourcePack).collect(ImmutableList.toImmutableList());
      }, this).thenCompose((p_240775_1_) ->
      {
         return DataPackRegistries.func_240961_a_(p_240775_1_, this.isDedicatedServer() ? Commands.DEDICATED : Commands.INTEGRATED, this.getFunctionLevel(), this.backgroundExecutor, this);
      }).thenAcceptAsync((p_240782_2_) ->
      {
         this.resourceManager.close();
         this.resourceManager = p_240782_2_;
         this.resourcePacks.setEnabledPacks(p_240780_1_);
         this.field_240768_i_.setDatapackCodec(func_240771_a_(this.resourcePacks));
         p_240782_2_.updateTags();
         this.getPlayerList().saveAllPlayerData();
         this.getPlayerList().reloadResources();
         this.functionManager.setFunctionReloader(this.resourceManager.getFunctionReloader());
         this.field_240765_ak_.onResourceManagerReload(this.resourceManager.getResourceManager());
      }, this);

      if (this.isOnExecutionThread())
      {
         this.driveUntil(completablefuture::isDone);
      }

      return completablefuture;
   }

   public static DatapackCodec func_240772_a_(ResourcePackList var0, DatapackCodec var1, boolean var2) {
      var0.reloadPacksFromFinders();
      if (!var2) {
         LinkedHashSet var5 = Sets.newLinkedHashSet();

         for (String var7 : var1.method26104()) {
            if (!var0.method1272(var7)) {
               LOGGER.warn("Missing data pack {}", var7);
            } else {
               var5.add(var7);
            }
         }

         for (ResourcePackInfo var10 : var0.method1268()) {
            String var8 = var10.getName();
            if (!var1.method26105().contains(var8) && !var5.contains(var8)) {
               LOGGER.info("Found new data pack {}, loading it automatically", var8);
               var5.add(var8);
            }
         }

         if (var5.isEmpty()) {
            LOGGER.info("No datapacks selected, forcing vanilla");
            var5.add("vanilla");
         }

         var0.setEnabledPacks(var5);
         return func_240771_a_(var0);
      } else {
         var0.setEnabledPacks(Collections.<String>singleton("vanilla"));
         return new DatapackCodec(ImmutableList.of("vanilla"), ImmutableList.of());
      }
   }

   private static DatapackCodec func_240771_a_(ResourcePackList var0) {
      Collection var3 = var0.func_232621_d_();
      ImmutableList var4 = ImmutableList.copyOf(var3);
      List var5 = var0.method1267().stream().filter(var1 -> !var3.contains(var1)).collect(ImmutableList.toImmutableList());
      return new DatapackCodec(var4, var5);
   }

   public void method1401(CommandSource var1) {
      if (this.method1415()) {
         Class6395 var4 = var1.method20177().getPlayerList();
         Class4531 var5 = var4.method19468();

         for (ServerPlayerEntity var7 : Lists.newArrayList(var4.getPlayers())) {
            if (!var5.method14448(var7.getGameProfile())) {
               var7.connection.disconnect(new TranslationTextComponent("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public ResourcePackList method1402() {
      return this.resourcePacks;
   }

   public Class6099 getCommandManager() {
      return this.resourceManager.method7335();
   }

   public CommandSource getCommandSource()
   {
      ServerWorld serverworld = this.getServerWorld();
      return new CommandSource(this, serverworld == null ? Vector3d.ZERO : Vector3d.copy(serverworld.getSpawnPoint()), Vector2f.ZERO, serverworld, 4, "Server", new StringTextComponent("Server"), this, (Entity)null);
   }

   @Override
   public boolean method1405() {
      return true;
   }

   @Override
   public boolean method1406() {
      return true;
   }

   public Class282 method1407() {
      return this.resourceManager.method7334();
   }

   public Class8933 method1408() {
      return this.resourceManager.method7333();
   }

   public ServerScoreboard method1409() {
      return this.field1258;
   }

   public CommandStorage method1410() {
      if (this.field1259 != null) {
         return this.field1259;
      } else {
         throw new NullPointerException("Called before server init");
      }
   }

   public Class284 method1411() {
      return this.resourceManager.method7332();
   }

   public Class283 method1412() {
      return this.resourceManager.method7331();
   }

   public GameRules getGameRules() {
      return this.getServerWorld().getGameRules();
   }

   public Class8426 method1414() {
      return this.field1260;
   }

   public boolean method1415() {
      return this.field1263;
   }

   public void setWhitelistEnabled(boolean var1) {
      this.field1263 = var1;
   }

   public float method1417() {
      return this.field1264;
   }

   public int method1418(GameProfile var1) {
      if (!this.getPlayerList().canSendCommands(var1)) {
         return 0;
      } else {
         Class6790 var4 = this.getPlayerList().method19470().method14437(var1);
         if (var4 == null) {
            if (!this.method1421(var1)) {
               if (!this.isSinglePlayer()) {
                  return this.method1288();
               } else {
                  return !this.getPlayerList().method19491() ? 0 : 4;
               }
            } else {
               return 4;
            }
         } else {
            return var4.method20687();
         }
      }
   }

   public FrameTimer getFrameTimer() {
      return this.field1262;
   }

   public IProfiler method1420() {
      return this.profiler;
   }

   public abstract boolean method1421(GameProfile var1);

   public void method1422(Path var1) throws IOException {
      Path var4 = var1.resolve("levels");

      for (Entry var6 : this.worlds.entrySet()) {
         ResourceLocation var7 = ((RegistryKey)var6.getKey()).getLocation();
         Path var8 = var4.resolve(var7.getNamespace()).resolve(var7.getPath());
         Files.createDirectories(var8);
         ((ServerWorld)var6.getValue()).method6960(var8);
      }

      this.method1425(var1.resolve("gamerules.txt"));
      this.method1426(var1.resolve("classpath.txt"));
      this.method1424(var1.resolve("example_crash.txt"));
      this.method1423(var1.resolve("stats.txt"));
      this.method1427(var1.resolve("threads.txt"));
   }

   private void method1423(Path var1) throws IOException {
      try (BufferedWriter var4 = Files.newBufferedWriter(var1)) {
         var4.write(String.format("pending_tasks: %d\n", this.method1630()));
         var4.write(String.format("average_tick_time: %f\n", this.method1417()));
         var4.write(String.format("tick_times: %s\n", Arrays.toString(this.tickTimeArray)));
         var4.write(String.format("queue: %s\n", Util.getServerExecutor()));
      }
   }

   private void method1424(Path var1) throws IOException {
      CrashReport var4 = new CrashReport("Server dump", new Exception("dummy"));
      this.method1326(var4);

      try (BufferedWriter var5 = Files.newBufferedWriter(var1)) {
         var5.write(var4.getCompleteReport());
      }
   }

   private void method1425(Path var1) throws IOException {
      try (BufferedWriter var4 = Files.newBufferedWriter(var1)) {
         List<String> var6 = Lists.newArrayList();
         GameRules var7 = this.getGameRules();
         GameRules.method17131(new Class7568(this, var6, var7));

         for (String var9 : var6) {
            var4.write(var9);
         }
      }
   }

   private void method1426(Path var1) throws IOException {
      try (BufferedWriter var4 = Files.newBufferedWriter(var1)) {
         String var6 = System.getProperty("java.class.path");
         String var7 = System.getProperty("path.separator");

         for (String var9 : Splitter.on(var7).split(var6)) {
            var4.write(var9);
            var4.write("\n");
         }
      }
   }

   private void method1427(Path var1) throws IOException {
      ThreadMXBean var4 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] var5 = var4.dumpAllThreads(true, true);
      Arrays.sort(var5, Comparator.comparing(ThreadInfo::getThreadName));

      try (BufferedWriter var6 = Files.newBufferedWriter(var1)) {
         for (ThreadInfo var11 : var5) {
            var6.write(var11.toString());
            var6.write(10);
         }
      }
   }

   private void method1428(LongTickDetector var1) {
      if (this.startProfiling) {
         this.startProfiling = false;
         this.field1215.func_233507_c_();
      }

      this.profiler = LongTickDetector.func_233523_a_(this.field1215.func_233508_d_(), var1);
   }

   private void method1429(LongTickDetector var1) {
      if (var1 != null) {
         var1.func_233525_b_();
      }

      this.profiler = this.field1215.func_233508_d_();
   }

   public boolean method1430() {
      return this.field1215.func_233505_a_();
   }

   public void method1431() {
      this.startProfiling = true;
   }

   public IProfileResult method1432() {
      IProfileResult var3 = this.field1215.func_233509_e_();
      this.field1215.func_233506_b_();
      return var3;
   }

   public Path method1433(FolderName var1) {
      return this.field1211.resolveFilePath(var1);
   }

   public boolean method1434() {
      return true;
   }

   public TemplateManager method1435() {
      return this.field_240765_ak_;
   }

   public IServerConfiguration func_240793_aU_() {
      return this.field_240768_i_;
   }

   public DynamicRegistries method1437() {
      return this.field_240767_f_;
   }

   @Nullable
   public IChatFilter method1438(ServerPlayerEntity var1) {
      return null;
   }

   // $VF: synthetic method
   public static Logger method1453() {
      return LOGGER;
   }
}
