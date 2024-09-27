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
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SServerDifficultyPacket;
import net.minecraft.network.play.server.SUpdateTimePacket;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.CryptException;
import net.minecraft.util.CryptManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.codec.DatapackCodec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;
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
      "Demo World", GameType.field11102, false, Difficulty.field14353, false, new Class5462(), DatapackCodec.VANILLA_CODEC
   );
   public final SaveFormat.LevelSave field1211;
   public final Class8716 field1212;
   private final Snooper field1213 = new Snooper("server", this, Util.milliTime());
   private final List<Runnable> field1214 = Lists.newArrayList();
   private final TimeTracker field1215 = new TimeTracker(Util.nanoTimeSupplier, this::method1375);
   private IProfiler field1216 = EmptyProfiler.INSTANCE;
   private final Class9021 field1217;
   private final Class8216 field1218;
   private final Class8783 field1219 = new Class8783();
   private final Random field1220 = new Random();
   private final DataFixer field1221;
   private String field1222;
   private int field1223 = -1;
   public final DynamicRegistriesImpl field1224;
   private final Map<RegistryKey<World>, ServerWorld> field1225 = Maps.newLinkedHashMap();
   private Class6395 field1226;
   private volatile boolean field1227 = true;
   private boolean field1228;
   private int field1229;
   public final Proxy field1230;
   private boolean field1231;
   private boolean field1232;
   private boolean field1233;
   private boolean field1234;
   private String field1235;
   private int field1236;
   private int field1237;
   public final long[] tickTimeArray = new long[100];
   private KeyPair field1239;
   private String field1240;
   private boolean field1241;
   private String field1242 = "";
   private String field1243 = "";
   private volatile boolean field1244;
   private long field1245;
   private boolean field1246;
   private boolean field1247;
   private final MinecraftSessionService field1248;
   private final GameProfileRepository field1249;
   private final PlayerProfileCache field1250;
   private long field1251;
   private final Thread field1252;
   private long field1253 = Util.milliTime();
   private long field1254;
   private boolean field1255;
   private boolean field1256;
   private final ResourcePackList resourcePacks;
   private final Class6887 field1258 = new Class6887(this);
   private Class8962 field1259;
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
      this.field1224 = var2;
      this.field_240768_i_ = var4;
      this.field1230 = var6;
      this.resourcePacks = var5;
      this.resourceManager = var8;
      this.field1248 = var9;
      this.field1249 = var10;
      this.field1250 = var11;
      this.field1217 = new Class9021(this);
      this.field1218 = var12;
      this.field1211 = var3;
      this.field1212 = var3.method7994();
      this.field1221 = var7;
      this.functionManager = new FunctionManager(this, var8.getFunctionReloader());
      this.field_240765_ak_ = new TemplateManager(var8.getResourceManager(), var3, var7);
      this.field1252 = var1;
      this.backgroundExecutor = Util.getServerExecutor();
   }

   private void method1276(Class8250 var1) {
      Class7535 var4 = var1.<Class7535>method28767(Class7535::new, "scoreboard");
      var4.method24629(this.method1409());
      this.method1409().method21021(new Class1415(var4));
   }

   public abstract boolean method1277() throws IOException;

   public static void func_240777_a_(SaveFormat.LevelSave var0) {
      if (var0.method7995()) {
         LOGGER.info("Converting map!");
         var0.method7996(new Class1340());
      }
   }

   public void method1279() {
      this.method1285();
      this.field_240768_i_.method20095(this.method1325(), this.method1327().isPresent());
      Class7243 var3 = this.field1218.method28561(11);
      this.method1281(var3);
      this.method1280();
      this.method1284(var3);
   }

   public void method1280() {
   }

   public void method1281(Class7243 var1) {
      Class6608 var4 = this.field_240768_i_.method20098();
      DimensionGeneratorSettings var5 = this.field_240768_i_.getDimensionGeneratorSettings();
      boolean var6 = var5.method26267();
      long var7 = var5.method26259();
      long var9 = BiomeManager.getHashedSeed(var7);
      ImmutableList var11 = ImmutableList.of(new Class7020(), new Class7018(), new Class7017(), new Class7015(), new Class7019(var4));
      SimpleRegistry<Dimension> var12 = var5.method26264();
      Dimension var13 = var12.method9183(Dimension.field43952);
      DimensionType var14;
      Object var15;
      if (var13 == null) {
         var14 = this.field1224.method32454().getOrThrow(DimensionType.OVERWORLD);
         var15 = DimensionGeneratorSettings.method26258(
            this.field1224.<Biome>getRegistry(Registry.BIOME_KEY), this.field1224.<DimensionSettings>getRegistry(Registry.NOISE_SETTINGS_KEY), new Random().nextLong()
         );
      } else {
         var14 = var13.method36412();
         var15 = var13.method36413();
      }

      ServerWorld var16 = new ServerWorld(this, this.backgroundExecutor, this.field1211, var4, World.OVERWORLD, var14, var1, (ChunkGenerator)var15, var6, var9, var11, true);
      this.field1225.put(World.OVERWORLD, var16);
      Class8250 var17 = var16.method6945();
      this.method1276(var17);
      this.field1259 = new Class8962(var17);
      WorldBorder var18 = var16.getWorldBorder();
      var18.method24557(var4.method20069());
      if (!var4.method20070()) {
         try {
            method1282(var16, var4, var5.method26261(), var6, true);
            var4.method20071(true);
            if (var6) {
               this.method1283(this.field_240768_i_);
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
            this.field1225.put(var22, var26);
         }
      }
   }

   private static void method1282(ServerWorld var0, Class6608 var1, boolean var2, boolean var3, boolean var4) {
      ChunkGenerator var7 = var0.getChunkProvider().method7370();
      if (var4) {
         if (!var3) {
            BiomeProvider var8 = var7.method17824();
            Random var9 = new Random(var0.method6967());
            BlockPos var10 = var8.method7203(0, var0.method6776(), 0, 256, var0x -> var0x.method32499().method31971(), var9);
            ChunkPos var11 = var10 != null ? new ChunkPos(var10) : new ChunkPos(0, 0);
            if (var10 == null) {
               LOGGER.warn("Unable to find spawn biome");
            }

            boolean var12 = false;

            for (Block var14 : BlockTags.field32780.method24918()) {
               if (var8.method7206().contains(var14.method11579())) {
                  var12 = true;
                  break;
               }
            }

            var1.method20041(var11.method24364().method8336(8, var7.method17823(), 8), 0.0F);
            int var20 = 0;
            int var21 = 0;
            int var15 = 0;
            int var16 = -1;

            for (int var18 = 0; var18 < 1024; var18++) {
               if (var20 > -16 && var20 <= 16 && var21 > -16 && var21 <= 16) {
                  BlockPos var19 = Class6878.method20941(var0, new ChunkPos(var11.x + var20, var11.z + var21), var12);
                  if (var19 != null) {
                     var1.method20041(var19, 0.0F);
                     break;
                  }
               }

               if (var20 == var21 || var20 < 0 && var20 == -var21 || var20 > 0 && var20 == 1 - var21) {
                  int var23 = var15;
                  var15 = -var16;
                  var16 = var23;
               }

               var20 += var15;
               var21 += var16;
            }

            if (var2) {
               Class7909 var22 = Class9104.field41679;
               var22.method26521(var0, var7, var0.rand, new BlockPos(var1.method20029(), var1.method20030(), var1.method20031()));
            }
         } else {
            var1.method20041(BlockPos.ZERO.up(), 0.0F);
         }
      } else {
         var1.method20041(BlockPos.ZERO.method8339(var7.method17823()), 0.0F);
      }
   }

   private void method1283(IServerConfiguration var1) {
      var1.method20085(Difficulty.field14351);
      var1.method20086(true);
      Class6608 var4 = var1.method20098();
      var4.method20044(false);
      var4.method20055(false);
      var4.method20061(1000000000);
      var4.method20076(6000L);
      var4.method20073(GameType.SPECTATOR);
   }

   private void method1284(Class7243 var1) {
      ServerWorld var4 = this.method1317();
      LOGGER.info("Preparing start region for dimension {}", var4.getDimensionKey().getLocation());
      BlockPos var5 = var4.method6947();
      var1.method22736(new ChunkPos(var5));
      ServerChunkProvider var6 = var4.getChunkProvider();
      var6.getLightManager().method613(500);
      this.field1253 = Util.milliTime();
      var6.registerTicket(Class8561.field38480, new ChunkPos(var5), 11, Class2341.field16010);

      while (var6.method7355() != 441) {
         this.field1253 = Util.milliTime() + 10L;
         this.method1299();
      }

      this.field1253 = Util.milliTime() + 10L;
      this.method1299();

      for (ServerWorld var8 : this.field1225.values()) {
         Class7536 var9 = var8.method6945().<Class7536>method28768(Class7536::new, "chunks");
         if (var9 != null) {
            LongIterator var10 = var9.method24638().iterator();

            while (var10.hasNext()) {
               long var11 = var10.nextLong();
               ChunkPos var13 = new ChunkPos(var11);
               var8.getChunkProvider().method7350(var13, true);
            }
         }
      }

      this.field1253 = Util.milliTime() + 10L;
      this.method1299();
      var1.method22738();
      var6.getLightManager().method613(5);
      this.method1338();
   }

   public void method1285() {
      File var3 = this.field1211.resolveFilePath(FolderName.field23353).toFile();
      if (var3.isFile()) {
         String var4 = this.field1211.method7990();

         try {
            this.method1346("level://" + URLEncoder.encode(var4, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
         } catch (UnsupportedEncodingException var6) {
            LOGGER.warn("Something went wrong url encoding {}", var4);
         }
      }
   }

   public GameType method1286() {
      return this.field_240768_i_.method20067();
   }

   public boolean method1287() {
      return this.field_240768_i_.method20045();
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

      ServerWorld var9 = this.method1317();
      Class6608 var10 = this.field_240768_i_.method20098();
      var10.method20068(var9.getWorldBorder().method24556());
      this.field_240768_i_.method20094(this.method1414().method29605());
      this.field1211.method8001(this.field1224, this.field_240768_i_, this.getPlayerList().method19479());
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

   public String method1293() {
      return this.field1222;
   }

   public void method1294(String var1) {
      this.field1222 = var1;
   }

   public boolean method1295() {
      return this.field1227;
   }

   public void initiateShutdown(boolean var1) {
      this.field1227 = false;
      if (var1) {
         try {
            this.field1252.join();
         } catch (InterruptedException var5) {
            LOGGER.error("Error while shutting down", var5);
         }
      }
   }

   public void func_240802_v_() {
      try {
         if (this.method1277()) {
            this.field1253 = Util.milliTime();
            this.field1219.method31701(new StringTextComponent(this.field1235));
            this.field1219.method31705(new Class9226(SharedConstants.getVersion().getName(), SharedConstants.getVersion().getProtocolVersion()));
            this.method1304(this.field1219);

            while (this.field1227) {
               long var3 = Util.milliTime() - this.field1253;
               if (var3 > 2000L && this.field1253 - this.field1245 >= 15000L) {
                  long var5 = var3 / 50L;
                  LOGGER.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", var3, var5);
                  this.field1253 += var5 * 50L;
                  this.field1245 = this.field1253;
               }

               this.field1253 += 50L;
               LongTickDetector var51 = LongTickDetector.method36636("Server");
               this.method1428(var51);
               this.field1216.startTick();
               this.field1216.startSection("tick");
               this.method1310(this::method1298);
               this.field1216.endStartSection("nextTickWait");
               this.field1255 = true;
               this.field1254 = Math.max(Util.milliTime() + 50L, this.field1253);
               this.method1299();
               this.field1216.endSection();
               this.field1216.endTick();
               this.method1429(var51);
               this.field1244 = true;
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
            this.field1228 = true;
            this.method1292();
         } catch (Throwable var47) {
            LOGGER.error("Exception stopping the server", var47);
         } finally {
            this.method1309();
         }
      }
   }

   private boolean method1298() {
      return this.method1628() || Util.milliTime() < (!this.field1255 ? this.field1253 : this.field1254);
   }

   public void method1299() {
      this.drainTasks();
      this.driveUntil(() -> !this.method1298());
   }

   public Class567 wrapTask(Runnable var1) {
      return new Class567(this.field1229, var1);
   }

   public boolean canRun(Class567 var1) {
      return var1.method1895() + 3 < this.field1229 || this.method1298();
   }

   @Override
   public boolean method1302() {
      boolean var3 = this.method1303();
      this.field1255 = var3;
      return var3;
   }

   private boolean method1303() {
      if (super.method1302()) {
         return true;
      } else {
         if (this.method1298()) {
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

   private void method1304(Class8783 var1) {
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
      this.field1256 = this.field1256 || this.method1306().isFile();
      return this.field1256;
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
      this.field1229++;
      this.method1311(var1);
      if (var4 - this.field1251 >= 5000000000L) {
         this.field1251 = var4;
         this.field1219.method31703(new Class9762(this.method1323(), this.method1322()));
         GameProfile[] var10 = new GameProfile[Math.min(this.method1322(), 12)];
         int var11 = MathHelper.method37782(this.field1220, 0, this.method1322() - var10.length);

         for (int var12 = 0; var12 < var10.length; var12++) {
            var10[var12] = this.field1226.method19488().get(var11 + var12).getGameProfile();
         }

         Collections.shuffle(Arrays.<GameProfile>asList(var10));
         this.field1219.method31702().method38379(var10);
      }

      if (this.field1229 % 6000 == 0) {
         LOGGER.debug("Autosave started");
         this.field1216.startSection("save");
         this.field1226.saveAllPlayerData();
         this.method1291(true, false, false);
         this.field1216.endSection();
         LOGGER.debug("Autosave finished");
      }

      this.field1216.startSection("snooper");
      if (!this.field1213.isSnooperRunning() && this.field1229 > 100) {
         this.field1213.start();
      }

      if (this.field1229 % 6000 == 0) {
         this.field1213.addMemoryStatsToSnooper();
      }

      this.field1216.endSection();
      this.field1216.startSection("tallying");
      long var6 = this.tickTimeArray[this.field1229 % 100] = Util.nanoTime() - var4;
      this.field1264 = this.field1264 * 0.8F + (float)var6 / 1000000.0F * 0.19999999F;
      long var8 = Util.nanoTime();
      this.field1262.addFrame(var8 - var4);
      this.field1216.endSection();
   }

   public void method1311(BooleanSupplier var1) {
      this.field1216.startSection("commandFunctions");
      this.method1397().method22823();
      this.field1216.endStartSection("levels");

      for (ServerWorld var5 : this.method1320()) {
         this.field1216.method22504(() -> var5 + " " + var5.getDimensionKey().getLocation());
         if (this.field1229 % 20 == 0) {
            this.field1216.startSection("timeSync");
            this.field1226
               .method19457(new SUpdateTimePacket(var5.getGameTime(), var5.method6784(), var5.getGameRules().getBoolean(Class5462.field24232)), var5.getDimensionKey());
            this.field1216.endSection();
         }

         this.field1216.startSection("tick");

         try {
            var5.method6894(var1);
         } catch (Throwable var8) {
            CrashReport var7 = CrashReport.makeCrashReport(var8, "Exception ticking world");
            var5.fillCrashReport(var7);
            throw new ReportedException(var7);
         }

         this.field1216.endSection();
         this.field1216.endSection();
      }

      this.field1216.endStartSection("connection");
      this.getNetworkSystem().method33401();
      this.field1216.endStartSection("players");
      this.field1226.method19455();
      if (SharedConstants.developmentMode) {
         Class7879.field33820.method26417();
      }

      this.field1216.endStartSection("server gui refresh");

      for (int var9 = 0; var9 < this.field1214.size(); var9++) {
         this.field1214.get(var9).run();
      }

      this.field1216.endSection();
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
      return !this.field1252.isAlive();
   }

   public File method1316(String var1) {
      return new File(this.method1307(), var1);
   }

   public final ServerWorld method1317() {
      return this.field1225.get(World.OVERWORLD);
   }

   @Nullable
   public ServerWorld method1318(RegistryKey<World> var1) {
      return this.field1225.get(var1);
   }

   public Set<RegistryKey<World>> method1319() {
      return this.field1225.keySet();
   }

   public Iterable<ServerWorld> method1320() {
      return this.field1225.values();
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

   public String method1325() {
      return "vanilla";
   }

   public CrashReport method1326(CrashReport var1) {
      if (this.field1226 != null) {
         var1.getCategory()
            .addDetail("Player Count", () -> this.field1226.method19474() + " / " + this.field1226.method19475() + "; " + this.field1226.method19488());
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

   public abstract Optional<String> method1327();

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      LOGGER.info(var1.getString());
   }

   public KeyPair method1329() {
      return this.field1239;
   }

   public int method1330() {
      return this.field1223;
   }

   public void method1331(int var1) {
      this.field1223 = var1;
   }

   public String method1332() {
      return this.field1240;
   }

   public void method1333(String var1) {
      this.field1240 = var1;
   }

   public boolean method1334() {
      return this.field1240 != null;
   }

   public void method1335() {
      LOGGER.info("Generating keypair");

      try {
         this.field1239 = CryptManager.method32737();
      } catch (CryptException var4) {
         throw new IllegalStateException("Failed to generate key pair", var4);
      }
   }

   public void method1336(Difficulty var1, boolean var2) {
      if (var2 || !this.field_240768_i_.method20048()) {
         this.field_240768_i_.method20085(!this.field_240768_i_.method20045() ? var1 : Difficulty.field14354);
         this.method1338();
         this.getPlayerList().method19488().forEach(this::method1340);
      }
   }

   public int method1337(int var1) {
      return var1;
   }

   private void method1338() {
      for (ServerWorld var4 : this.method1320()) {
         var4.method6767(this.method1341(), this.method1354());
      }
   }

   public void method1339(boolean var1) {
      this.field_240768_i_.method20086(var1);
      this.getPlayerList().method19488().forEach(this::method1340);
   }

   private void method1340(ServerPlayerEntity var1) {
      Class6612 var4 = var1.getServerWorld().getWorldInfo();
      var1.field4855.sendPacket(new SServerDifficultyPacket(var4.method20047(), var4.method20048()));
   }

   public boolean method1341() {
      return this.field_240768_i_.method20047() != Difficulty.field14351;
   }

   public boolean method1342() {
      return this.field1241;
   }

   public void method1343(boolean var1) {
      this.field1241 = var1;
   }

   public String method1344() {
      return this.field1242;
   }

   public String method1345() {
      return this.field1243;
   }

   public void method1346(String var1, String var2) {
      this.field1242 = var1;
      this.field1243 = var2;
   }

   @Override
   public void fillSnooper(Snooper var1) {
      var1.addClientStat("whitelist_enabled", false);
      var1.addClientStat("whitelist_count", 0);
      if (this.field1226 != null) {
         var1.addClientStat("players_current", this.method1322());
         var1.addClientStat("players_max", this.method1323());
         var1.addClientStat("players_seen", this.field1212.method31443().length);
      }

      var1.addClientStat("uses_auth", this.field1231);
      var1.addClientStat("gui_state", !this.method1373() ? "disabled" : "enabled");
      var1.addClientStat("run_time", (Util.milliTime() - var1.getMinecraftStartTimeMillis()) / 60L * 1000L);
      var1.addClientStat("avg_tick_ms", (int)(MathHelper.method37785(this.tickTimeArray) * 1.0E-6));
      int var4 = 0;

      for (ServerWorld var6 : this.method1320()) {
         if (var6 != null) {
            var1.addClientStat("world[" + var4 + "][dimension]", var6.getDimensionKey().getLocation());
            var1.addClientStat("world[" + var4 + "][mode]", this.field_240768_i_.method20067());
            var1.addClientStat("world[" + var4 + "][difficulty]", var6.method6997());
            var1.addClientStat("world[" + var4 + "][hardcore]", this.field_240768_i_.method20045());
            var1.addClientStat("world[" + var4 + "][height]", this.field1236);
            var1.addClientStat("world[" + var4 + "][chunks_loaded]", var6.getChunkProvider().method7371());
            var4++;
         }
      }

      var1.addClientStat("worlds", var4);
   }

   public abstract boolean isDedicatedServer();

   public abstract int method1349();

   public boolean method1350() {
      return this.field1231;
   }

   public void method1351(boolean var1) {
      this.field1231 = var1;
   }

   public boolean method1352() {
      return this.field1232;
   }

   public void method1353(boolean var1) {
      this.field1232 = var1;
   }

   public boolean method1354() {
      return true;
   }

   public boolean method1355() {
      return true;
   }

   public abstract boolean method1356();

   public boolean method1357() {
      return this.field1233;
   }

   public void method1358(boolean var1) {
      this.field1233 = var1;
   }

   public boolean method1359() {
      return this.field1234;
   }

   public void method1360(boolean var1) {
      this.field1234 = var1;
   }

   public abstract boolean method1361();

   public String method1362() {
      return this.field1235;
   }

   public void method1363(String var1) {
      this.field1235 = var1;
   }

   public int method1364() {
      return this.field1236;
   }

   public void method1365(int var1) {
      this.field1236 = var1;
   }

   public boolean method1366() {
      return this.field1228;
   }

   public Class6395 getPlayerList() {
      return this.field1226;
   }

   public void method1368(Class6395 var1) {
      this.field1226 = var1;
   }

   public abstract boolean getPublic();

   public void method1370(GameType var1) {
      this.field_240768_i_.method20073(var1);
   }

   @Nullable
   public Class9021 getNetworkSystem() {
      return this.field1217;
   }

   public boolean method1372() {
      return this.field1244;
   }

   public boolean method1373() {
      return false;
   }

   public abstract boolean method1374(GameType var1, boolean var2, int var3);

   public int method1375() {
      return this.field1229;
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

   public void method1379(boolean var1) {
      this.field1247 = var1;
   }

   public boolean method1380() {
      return this.field1247;
   }

   public boolean method1381() {
      return true;
   }

   public int method1382() {
      return this.field1237;
   }

   public void method1383(int var1) {
      this.field1237 = var1;
   }

   public MinecraftSessionService method1384() {
      return this.field1248;
   }

   public GameProfileRepository method1385() {
      return this.field1249;
   }

   public PlayerProfileCache method1386() {
      return this.field1250;
   }

   public Class8783 method1387() {
      return this.field1219;
   }

   public void method1388() {
      this.field1251 = 0L;
   }

   public int method1389() {
      return 29999984;
   }

   @Override
   public boolean method1390() {
      return super.method1390() && !this.method1366();
   }

   @Override
   public Thread getExecutionThread() {
      return this.field1252;
   }

   public int getNetworkCompressionThreshold() {
      return 256;
   }

   public long getServerTime() {
      return this.field1253;
   }

   public DataFixer getDataFixer() {
      return this.field1221;
   }

   public int method1395(ServerWorld var1) {
      return var1 == null ? 10 : var1.getGameRules().method17136(Class5462.field24239);
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

   public void method1401(Class6619 var1) {
      if (this.method1415()) {
         Class6395 var4 = var1.method20177().getPlayerList();
         Class4531 var5 = var4.method19468();

         for (ServerPlayerEntity var7 : Lists.newArrayList(var4.method19488())) {
            if (!var5.method14448(var7.getGameProfile())) {
               var7.field4855.disconnect(new TranslationTextComponent("multiplayer.disconnect.not_whitelisted"));
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

   public Class6619 method1404() {
      ServerWorld var3 = this.method1317();
      return new Class6619(
         this,
         var3 != null ? Vector3d.method11329(var3.method6947()) : Vector3d.ZERO,
         Vector2f.field37212,
         var3,
         4,
         "Server",
         new StringTextComponent("Server"),
         this,
         (Entity)null
      );
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

   public Class6887 method1409() {
      return this.field1258;
   }

   public Class8962 method1410() {
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

   public Class5462 method1413() {
      return this.method1317().getGameRules();
   }

   public Class8426 method1414() {
      return this.field1260;
   }

   public boolean method1415() {
      return this.field1263;
   }

   public void method1416(boolean var1) {
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
               if (!this.method1334()) {
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

   public FrameTimer method1419() {
      return this.field1262;
   }

   public IProfiler method1420() {
      return this.field1216;
   }

   public abstract boolean method1421(GameProfile var1);

   public void method1422(Path var1) throws IOException {
      Path var4 = var1.resolve("levels");

      for (Entry var6 : this.field1225.entrySet()) {
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
         Class5462 var7 = this.method1413();
         Class5462.method17131(new Class7568(this, var6, var7));

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
      if (this.field1246) {
         this.field1246 = false;
         this.field1215.func_233507_c_();
      }

      this.field1216 = LongTickDetector.func_233523_a_(this.field1215.func_233508_d_(), var1);
   }

   private void method1429(LongTickDetector var1) {
      if (var1 != null) {
         var1.func_233525_b_();
      }

      this.field1216 = this.field1215.func_233508_d_();
   }

   public boolean method1430() {
      return this.field1215.func_233505_a_();
   }

   public void method1431() {
      this.field1246 = true;
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

   public IServerConfiguration method1436() {
      return this.field_240768_i_;
   }

   public DynamicRegistries method1437() {
      return this.field1224;
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
