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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;
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

public abstract class Class314 extends Class317<Class567> implements Class315, Class909, AutoCloseable {
   private static final Logger field1208 = LogManager.getLogger();
   public static final File field1209 = new File("usercache.json");
   public static final Class8898 field1210 = new Class8898(
      "Demo World", Class1894.field11102, false, Class2197.field14353, false, new Class5462(), Class7818.field33531
   );
   public final Class1814 field1211;
   public final Class8716 field1212;
   private final Class7998 field1213 = new Class7998("server", this, Util.method38487());
   private final List<Runnable> field1214 = Lists.newArrayList();
   private final Class7684 field1215 = new Class7684(Util.field45723, this::method1375);
   private Class7165 field1216 = Class7167.field30819;
   private final Class9021 field1217;
   private final Class8216 field1218;
   private final Class8783 field1219 = new Class8783();
   private final Random field1220 = new Random();
   private final DataFixer field1221;
   private String field1222;
   private int field1223 = -1;
   public final Class8905 field1224;
   private final Map<Class8705<Class1655>, Class1657> field1225 = Maps.newLinkedHashMap();
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
   public final long[] field1238 = new long[100];
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
   private final Class8805 field1250;
   private long field1251;
   private final Thread field1252;
   private long field1253 = Util.method38487();
   private long field1254;
   private boolean field1255;
   private boolean field1256;
   private final Class313 field1257;
   private final Class6887 field1258 = new Class6887(this);
   private Class8962 field1259;
   private final Class8426 field1260 = new Class8426();
   private final Class7268 field1261;
   private final Class9789 field1262 = new Class9789();
   private boolean field1263;
   private float field1264;
   private final Executor field1265;
   private String field1266;
   private Class1701 field1267;
   private final Class8761 field1268;
   public final Class6611 field1269;

   public static <S extends Class314> S method1275(Function<Thread, S> var0) {
      AtomicReference var3 = new AtomicReference();
      Thread var4 = new Thread(() -> ((Class314)var3.get()).method1297(), "Server thread");
      var4.setUncaughtExceptionHandler((var0x, var1) -> field1208.error(var1));
      Class314 var5 = (Class314)var0.apply(var4);
      var3.set(var5);
      var4.start();
      return (S)var5;
   }

   public Class314(
      Thread var1,
      Class8905 var2,
      Class1814 var3,
      Class6611 var4,
      Class313 var5,
      Proxy var6,
      DataFixer var7,
      Class1701 var8,
      MinecraftSessionService var9,
      GameProfileRepository var10,
      Class8805 var11,
      Class8216 var12
   ) {
      super("Server");
      this.field1224 = var2;
      this.field1269 = var4;
      this.field1230 = var6;
      this.field1257 = var5;
      this.field1267 = var8;
      this.field1248 = var9;
      this.field1249 = var10;
      this.field1250 = var11;
      this.field1217 = new Class9021(this);
      this.field1218 = var12;
      this.field1211 = var3;
      this.field1212 = var3.method7994();
      this.field1221 = var7;
      this.field1261 = new Class7268(this, var8.method7330());
      this.field1268 = new Class8761(var8.method7337(), var3, var7);
      this.field1252 = var1;
      this.field1265 = Util.method38492();
   }

   private void method1276(Class8250 var1) {
      Class7535 var4 = var1.<Class7535>method28767(Class7535::new, "scoreboard");
      var4.method24629(this.method1409());
      this.method1409().method21021(new Class1415(var4));
   }

   public abstract boolean method1277() throws IOException;

   public static void method1278(Class1814 var0) {
      if (var0.method7995()) {
         field1208.info("Converting map!");
         var0.method7996(new Class1340());
      }
   }

   public void method1279() {
      this.method1285();
      this.field1269.method20095(this.method1325(), this.method1327().isPresent());
      Class7243 var3 = this.field1218.method28561(11);
      this.method1281(var3);
      this.method1280();
      this.method1284(var3);
   }

   public void method1280() {
   }

   public void method1281(Class7243 var1) {
      Class6608 var4 = this.field1269.method20098();
      Class7846 var5 = this.field1269.method20087();
      boolean var6 = var5.method26267();
      long var7 = var5.method26259();
      long var9 = Class6668.method20321(var7);
      ImmutableList var11 = ImmutableList.of(new Class7020(), new Class7018(), new Class7017(), new Class7015(), new Class7019(var4));
      Class2350<Class9459> var12 = var5.method26264();
      Class9459 var13 = var12.method9183(Class9459.field43952);
      Class9535 var14;
      Object var15;
      if (var13 == null) {
         var14 = this.field1224.method32454().method9189(Class9535.field44371);
         var15 = Class7846.method26258(
            this.field1224.<Class8907>method32453(Class2348.field16106), this.field1224.<Class9309>method32453(Class2348.field16099), new Random().nextLong()
         );
      } else {
         var14 = var13.method36412();
         var15 = var13.method36413();
      }

      Class1657 var16 = new Class1657(this, this.field1265, this.field1211, var4, Class1655.field8999, var14, var1, (Class5646)var15, var6, var9, var11, true);
      this.field1225.put(Class1655.field8999, var16);
      Class8250 var17 = var16.method6945();
      this.method1276(var17);
      this.field1259 = new Class8962(var17);
      Class7522 var18 = var16.method6810();
      var18.method24557(var4.method20069());
      if (!var4.method20070()) {
         try {
            method1282(var16, var4, var5.method26261(), var6, true);
            var4.method20071(true);
            if (var6) {
               this.method1283(this.field1269);
            }
         } catch (Throwable var28) {
            Class4526 var20 = Class4526.method14413(var28, "Exception initializing level");

            try {
               var16.method6802(var20);
            } catch (Throwable var27) {
            }

            throw new Class2506(var20);
         }

         var4.method20071(true);
      }

      this.method1367().method19447(var16);
      if (this.field1269.method20093() != null) {
         this.method1414().method29606(this.field1269.method20093());
      }

      for (Entry var29 : var12.method9191()) {
         Class8705 var21 = (Class8705)var29.getKey();
         if (var21 != Class9459.field43952) {
            Class8705 var22 = Class8705.<Class1655>method31395(Class2348.field16067, var21.method31399());
            Class9535 var23 = ((Class9459)var29.getValue()).method36412();
            Class5646 var24 = ((Class9459)var29.getValue()).method36413();
            Class6609 var25 = new Class6609(this.field1269, var4);
            Class1657 var26 = new Class1657(this, this.field1265, this.field1211, var25, var22, var23, var1, var24, var6, var9, ImmutableList.of(), false);
            var18.method24543(new Class7048(var26.method6810()));
            this.field1225.put(var22, var26);
         }
      }
   }

   private static void method1282(Class1657 var0, Class6608 var1, boolean var2, boolean var3, boolean var4) {
      Class5646 var7 = var0.method6883().method7370();
      if (var4) {
         if (!var3) {
            Class1685 var8 = var7.method17824();
            Random var9 = new Random(var0.method6967());
            BlockPos var10 = var8.method7203(0, var0.method6776(), 0, 256, var0x -> var0x.method32499().method31971(), var9);
            Class7481 var11 = var10 != null ? new Class7481(var10) : new Class7481(0, 0);
            if (var10 == null) {
               field1208.warn("Unable to find spawn biome");
            }

            boolean var12 = false;

            for (Block var14 : Class7645.field32780.method24918()) {
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
                  BlockPos var19 = Class6878.method20941(var0, new Class7481(var11.field32174 + var20, var11.field32175 + var21), var12);
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
               var22.method26521(var0, var7, var0.field9016, new BlockPos(var1.method20029(), var1.method20030(), var1.method20031()));
            }
         } else {
            var1.method20041(BlockPos.field13032.method8311(), 0.0F);
         }
      } else {
         var1.method20041(BlockPos.field13032.method8339(var7.method17823()), 0.0F);
      }
   }

   private void method1283(Class6611 var1) {
      var1.method20085(Class2197.field14351);
      var1.method20086(true);
      Class6608 var4 = var1.method20098();
      var4.method20044(false);
      var4.method20055(false);
      var4.method20061(1000000000);
      var4.method20076(6000L);
      var4.method20073(Class1894.field11105);
   }

   private void method1284(Class7243 var1) {
      Class1657 var4 = this.method1317();
      field1208.info("Preparing start region for dimension {}", var4.method6813().method31399());
      BlockPos var5 = var4.method6947();
      var1.method22736(new Class7481(var5));
      Class1703 var6 = var4.method6883();
      var6.method7348().method613(500);
      this.field1253 = Util.method38487();
      var6.method7374(Class8561.field38480, new Class7481(var5), 11, Class2341.field16010);

      while (var6.method7355() != 441) {
         this.field1253 = Util.method38487() + 10L;
         this.method1299();
      }

      this.field1253 = Util.method38487() + 10L;
      this.method1299();

      for (Class1657 var8 : this.field1225.values()) {
         Class7536 var9 = var8.method6945().<Class7536>method28768(Class7536::new, "chunks");
         if (var9 != null) {
            LongIterator var10 = var9.method24638().iterator();

            while (var10.hasNext()) {
               long var11 = var10.nextLong();
               Class7481 var13 = new Class7481(var11);
               var8.method6883().method7350(var13, true);
            }
         }
      }

      this.field1253 = Util.method38487() + 10L;
      this.method1299();
      var1.method22738();
      var6.method7348().method613(5);
      this.method1338();
   }

   public void method1285() {
      File var3 = this.field1211.method7991(Class5137.field23353).toFile();
      if (var3.isFile()) {
         String var4 = this.field1211.method7990();

         try {
            this.method1346("level://" + URLEncoder.encode(var4, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
         } catch (UnsupportedEncodingException var6) {
            field1208.warn("Something went wrong url encoding {}", var4);
         }
      }
   }

   public Class1894 method1286() {
      return this.field1269.method20067();
   }

   public boolean method1287() {
      return this.field1269.method20045();
   }

   public abstract int method1288();

   public abstract int method1289();

   public abstract boolean method1290();

   public boolean method1291(boolean var1, boolean var2, boolean var3) {
      boolean var6 = false;

      for (Class1657 var8 : this.method1320()) {
         if (!var1) {
            field1208.info("Saving chunks for level '{}'/{}", var8, var8.method6813().method31399());
         }

         var8.method6910((Class1339)null, var2, var8.field9047 && !var3);
         var6 = true;
      }

      Class1657 var9 = this.method1317();
      Class6608 var10 = this.field1269.method20098();
      var10.method20068(var9.method6810().method24556());
      this.field1269.method20094(this.method1414().method29605());
      this.field1211.method8001(this.field1224, this.field1269, this.method1367().method19479());
      return var6;
   }

   @Override
   public void close() {
      this.method1292();
   }

   public void method1292() {
      field1208.info("Stopping server");
      if (this.method1371() != null) {
         this.method1371().method33400();
      }

      if (this.field1226 != null) {
         field1208.info("Saving players");
         this.field1226.method19467();
         this.field1226.method19483();
      }

      field1208.info("Saving worlds");

      for (Class1657 var4 : this.method1320()) {
         if (var4 != null) {
            var4.field9047 = false;
         }
      }

      this.method1291(false, true, false);

      for (Class1657 var9 : this.method1320()) {
         if (var9 != null) {
            try {
               var9.close();
            } catch (IOException var7) {
               field1208.error("Exception closing the level", var7);
            }
         }
      }

      if (this.field1213.method27300()) {
         this.field1213.method27301();
      }

      this.field1267.close();

      try {
         this.field1211.close();
      } catch (IOException var6) {
         field1208.error("Failed to unlock level {}", this.field1211.method7990(), var6);
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

   public void method1296(boolean var1) {
      this.field1227 = false;
      if (var1) {
         try {
            this.field1252.join();
         } catch (InterruptedException var5) {
            field1208.error("Error while shutting down", var5);
         }
      }
   }

   public void method1297() {
      try {
         if (this.method1277()) {
            this.field1253 = Util.method38487();
            this.field1219.method31701(new StringTextComponent(this.field1235));
            this.field1219.method31705(new Class9226(Class9246.method34773().getName(), Class9246.method34773().getProtocolVersion()));
            this.method1304(this.field1219);

            while (this.field1227) {
               long var3 = Util.method38487() - this.field1253;
               if (var3 > 2000L && this.field1253 - this.field1245 >= 15000L) {
                  long var5 = var3 / 50L;
                  field1208.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", var3, var5);
                  this.field1253 += var5 * 50L;
                  this.field1245 = this.field1253;
               }

               this.field1253 += 50L;
               Class9487 var51 = Class9487.method36636("Server");
               this.method1428(var51);
               this.field1216.method22501();
               this.field1216.method22503("tick");
               this.method1310(this::method1298);
               this.field1216.method22506("nextTickWait");
               this.field1255 = true;
               this.field1254 = Math.max(Util.method38487() + 50L, this.field1253);
               this.method1299();
               this.field1216.method22505();
               this.field1216.method22502();
               this.method1429(var51);
               this.field1244 = true;
            }
         } else {
            this.method1308((Class4526)null);
         }
      } catch (Throwable var49) {
         field1208.error("Encountered an unexpected exception", var49);
         Class4526 var10;
         if (var49 instanceof Class2506) {
            var10 = this.method1326(((Class2506)var49).method10487());
         } else {
            var10 = this.method1326(new Class4526("Exception in server tick loop", var49));
         }

         File var7 = new File(
            new File(this.method1307(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
         );
         if (var10.method14408(var7)) {
            field1208.error("This crash report has been saved to: {}", var7.getAbsolutePath());
         } else {
            field1208.error("We were unable to save this crash report to disk.");
         }

         this.method1308(var10);
      } finally {
         try {
            this.field1228 = true;
            this.method1292();
         } catch (Throwable var47) {
            field1208.error("Exception stopping the server", var47);
         } finally {
            this.method1309();
         }
      }
   }

   private boolean method1298() {
      return this.method1628() || Util.method38487() < (!this.field1255 ? this.field1253 : this.field1254);
   }

   public void method1299() {
      this.method1638();
      this.method1639(() -> !this.method1298());
   }

   public Class567 method1440(Runnable var1) {
      return new Class567(this.field1229, var1);
   }

   public boolean method1439(Class567 var1) {
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
            for (Class1657 var4 : this.method1320()) {
               if (var4.method6883().method7362()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void run(Class567 var1) {
      this.method1420().method22508("runTask");
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
            field1208.error("Couldn't load server icon", var11);
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

   public void method1308(Class4526 var1) {
   }

   public void method1309() {
   }

   public void method1310(BooleanSupplier var1) {
      long var4 = Util.method38488();
      this.field1229++;
      this.method1311(var1);
      if (var4 - this.field1251 >= 5000000000L) {
         this.field1251 = var4;
         this.field1219.method31703(new Class9762(this.method1323(), this.method1322()));
         GameProfile[] var10 = new GameProfile[Math.min(this.method1322(), 12)];
         int var11 = Class9679.method37782(this.field1220, 0, this.method1322() - var10.length);

         for (int var12 = 0; var12 < var10.length; var12++) {
            var10[var12] = this.field1226.method19488().get(var11 + var12).method2906();
         }

         Collections.shuffle(Arrays.<GameProfile>asList(var10));
         this.field1219.method31702().method38379(var10);
      }

      if (this.field1229 % 6000 == 0) {
         field1208.debug("Autosave started");
         this.field1216.method22503("save");
         this.field1226.method19467();
         this.method1291(true, false, false);
         this.field1216.method22505();
         field1208.debug("Autosave finished");
      }

      this.field1216.method22503("snooper");
      if (!this.field1213.method27300() && this.field1229 > 100) {
         this.field1213.method27296();
      }

      if (this.field1229 % 6000 == 0) {
         this.field1213.method27297();
      }

      this.field1216.method22505();
      this.field1216.method22503("tallying");
      long var6 = this.field1238[this.field1229 % 100] = Util.method38488() - var4;
      this.field1264 = this.field1264 * 0.8F + (float)var6 / 1000000.0F * 0.19999999F;
      long var8 = Util.method38488();
      this.field1262.method38592(var8 - var4);
      this.field1216.method22505();
   }

   public void method1311(BooleanSupplier var1) {
      this.field1216.method22503("commandFunctions");
      this.method1397().method22823();
      this.field1216.method22506("levels");

      for (Class1657 var5 : this.method1320()) {
         this.field1216.method22504(() -> var5 + " " + var5.method6813().method31399());
         if (this.field1229 % 20 == 0) {
            this.field1216.method22503("timeSync");
            this.field1226
               .method19457(new Class5577(var5.method6783(), var5.method6784(), var5.method6789().method17135(Class5462.field24232)), var5.method6813());
            this.field1216.method22505();
         }

         this.field1216.method22503("tick");

         try {
            var5.method6894(var1);
         } catch (Throwable var8) {
            Class4526 var7 = Class4526.method14413(var8, "Exception ticking world");
            var5.method6802(var7);
            throw new Class2506(var7);
         }

         this.field1216.method22505();
         this.field1216.method22505();
      }

      this.field1216.method22506("connection");
      this.method1371().method33401();
      this.field1216.method22506("players");
      this.field1226.method19455();
      if (Class9246.field42545) {
         Class7879.field33820.method26417();
      }

      this.field1216.method22506("server gui refresh");

      for (int var9 = 0; var9 < this.field1214.size(); var9++) {
         this.field1214.get(var9).run();
      }

      this.field1216.method22505();
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

   public boolean method1315() {
      return !this.field1252.isAlive();
   }

   public File method1316(String var1) {
      return new File(this.method1307(), var1);
   }

   public final Class1657 method1317() {
      return this.field1225.get(Class1655.field8999);
   }

   @Nullable
   public Class1657 method1318(Class8705<Class1655> var1) {
      return this.field1225.get(var1);
   }

   public Set<Class8705<Class1655>> method1319() {
      return this.field1225.keySet();
   }

   public Iterable<Class1657> method1320() {
      return this.field1225.values();
   }

   public String method1321() {
      return Class9246.method34773().getName();
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

   public Class4526 method1326(Class4526 var1) {
      if (this.field1226 != null) {
         var1.method14409()
            .method32806("Player Count", () -> this.field1226.method19474() + " / " + this.field1226.method19475() + "; " + this.field1226.method19488());
      }

      var1.method14409().method32806("Data Packs", () -> {
         StringBuilder var3 = new StringBuilder();

         for (Class1810 var5 : this.field1257.method1270()) {
            if (var3.length() > 0) {
               var3.append(", ");
            }

            var3.append(var5.method7951());
            if (!var5.method7949().method8720()) {
               var3.append(" (incompatible)");
            }
         }

         return var3.toString();
      });
      if (this.field1266 != null) {
         var1.method14409().method32806("Server Id", () -> this.field1266);
      }

      return var1;
   }

   public abstract Optional<String> method1327();

   @Override
   public void method1328(ITextComponent var1, UUID var2) {
      field1208.info(var1.getString());
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
      field1208.info("Generating keypair");

      try {
         this.field1239 = Class8961.method32737();
      } catch (Class2464 var4) {
         throw new IllegalStateException("Failed to generate key pair", var4);
      }
   }

   public void method1336(Class2197 var1, boolean var2) {
      if (var2 || !this.field1269.method20048()) {
         this.field1269.method20085(!this.field1269.method20045() ? var1 : Class2197.field14354);
         this.method1338();
         this.method1367().method19488().forEach(this::method1340);
      }
   }

   public int method1337(int var1) {
      return var1;
   }

   private void method1338() {
      for (Class1657 var4 : this.method1320()) {
         var4.method6767(this.method1341(), this.method1354());
      }
   }

   public void method1339(boolean var1) {
      this.field1269.method20086(var1);
      this.method1367().method19488().forEach(this::method1340);
   }

   private void method1340(Class878 var1) {
      Class6612 var4 = var1.method2798().method6788();
      var1.field4855.method15671(new Class5535(var4.method20047(), var4.method20048()));
   }

   public boolean method1341() {
      return this.field1269.method20047() != Class2197.field14351;
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
   public void method1347(Class7998 var1) {
      var1.method27298("whitelist_enabled", false);
      var1.method27298("whitelist_count", 0);
      if (this.field1226 != null) {
         var1.method27298("players_current", this.method1322());
         var1.method27298("players_max", this.method1323());
         var1.method27298("players_seen", this.field1212.method31443().length);
      }

      var1.method27298("uses_auth", this.field1231);
      var1.method27298("gui_state", !this.method1373() ? "disabled" : "enabled");
      var1.method27298("run_time", (Util.method38487() - var1.method27303()) / 60L * 1000L);
      var1.method27298("avg_tick_ms", (int)(Class9679.method37785(this.field1238) * 1.0E-6));
      int var4 = 0;

      for (Class1657 var6 : this.method1320()) {
         if (var6 != null) {
            var1.method27298("world[" + var4 + "][dimension]", var6.method6813().method31399());
            var1.method27298("world[" + var4 + "][mode]", this.field1269.method20067());
            var1.method27298("world[" + var4 + "][difficulty]", var6.method6997());
            var1.method27298("world[" + var4 + "][hardcore]", this.field1269.method20045());
            var1.method27298("world[" + var4 + "][height]", this.field1236);
            var1.method27298("world[" + var4 + "][chunks_loaded]", var6.method6883().method7371());
            var4++;
         }
      }

      var1.method27298("worlds", var4);
   }

   public abstract boolean method1348();

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

   public Class6395 method1367() {
      return this.field1226;
   }

   public void method1368(Class6395 var1) {
      this.field1226 = var1;
   }

   public abstract boolean method1369();

   public void method1370(Class1894 var1) {
      this.field1269.method20073(var1);
   }

   @Nullable
   public Class9021 method1371() {
      return this.field1217;
   }

   public boolean method1372() {
      return this.field1244;
   }

   public boolean method1373() {
      return false;
   }

   public abstract boolean method1374(Class1894 var1, boolean var2, int var3);

   public int method1375() {
      return this.field1229;
   }

   public Class7998 method1376() {
      return this.field1213;
   }

   public int method1377() {
      return 16;
   }

   public boolean method1378(Class1657 var1, BlockPos var2, PlayerEntity var3) {
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

   public Class8805 method1386() {
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
   public Thread method1391() {
      return this.field1252;
   }

   public int method1392() {
      return 256;
   }

   public long method1393() {
      return this.field1253;
   }

   public DataFixer method1394() {
      return this.field1221;
   }

   public int method1395(Class1657 var1) {
      return var1 == null ? 10 : var1.method6789().method17136(Class5462.field24239);
   }

   public Class285 method1396() {
      return this.field1267.method7336();
   }

   public Class7268 method1397() {
      return this.field1261;
   }

   public CompletableFuture<Void> method1398(Collection<String> var1) {
      CompletableFuture var4 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> var1.stream()
                  .<Class1810>map(this.field1257::method1271)
                  .filter(Objects::nonNull)
                  .<Class303>map(Class1810::method7950)
                  .collect(ImmutableList.toImmutableList()),
            this
         )
         .<Class1701>thenCompose(
            var1x -> Class1701.method7338(var1x, !this.method1348() ? Class2085.field13577 : Class2085.field13576, this.method1289(), this.field1265, this)
         )
         .thenAcceptAsync(var2 -> {
            this.field1267.close();
            this.field1267 = var2;
            this.field1257.method1264(var1);
            this.field1269.method20092(method1400(this.field1257));
            var2.method7339();
            this.method1367().method19467();
            this.method1367().method19490();
            this.field1261.method22826(this.field1267.method7330());
            this.field1268.method31605(this.field1267.method7337());
         }, this);
      if (this.method1629()) {
         this.method1639(var4::isDone);
      }

      return var4;
   }

   public static Class7818 method1399(Class313 var0, Class7818 var1, boolean var2) {
      var0.method1262();
      if (!var2) {
         LinkedHashSet var5 = Sets.newLinkedHashSet();

         for (String var7 : var1.method26104()) {
            if (!var0.method1272(var7)) {
               field1208.warn("Missing data pack {}", var7);
            } else {
               var5.add(var7);
            }
         }

         for (Class1810 var10 : var0.method1268()) {
            String var8 = var10.method7951();
            if (!var1.method26105().contains(var8) && !var5.contains(var8)) {
               field1208.info("Found new data pack {}, loading it automatically", var8);
               var5.add(var8);
            }
         }

         if (var5.isEmpty()) {
            field1208.info("No datapacks selected, forcing vanilla");
            var5.add("vanilla");
         }

         var0.method1264(var5);
         return method1400(var0);
      } else {
         var0.method1264(Collections.<String>singleton("vanilla"));
         return new Class7818(ImmutableList.of("vanilla"), ImmutableList.of());
      }
   }

   private static Class7818 method1400(Class313 var0) {
      Collection var3 = var0.method1269();
      ImmutableList var4 = ImmutableList.copyOf(var3);
      List var5 = var0.method1267().stream().filter(var1 -> !var3.contains(var1)).collect(ImmutableList.toImmutableList());
      return new Class7818(var4, var5);
   }

   public void method1401(Class6619 var1) {
      if (this.method1415()) {
         Class6395 var4 = var1.method20177().method1367();
         Class4531 var5 = var4.method19468();

         for (Class878 var7 : Lists.newArrayList(var4.method19488())) {
            if (!var5.method14448(var7.method2906())) {
               var7.field4855.method15658(new TranslationTextComponent("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public Class313 method1402() {
      return this.field1257;
   }

   public Class6099 method1403() {
      return this.field1267.method7335();
   }

   public Class6619 method1404() {
      Class1657 var3 = this.method1317();
      return new Class6619(
         this,
         var3 != null ? Vector3d.method11329(var3.method6947()) : Vector3d.field18047,
         Class8513.field37212,
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
      return this.field1267.method7334();
   }

   public Class8933 method1408() {
      return this.field1267.method7333();
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
      return this.field1267.method7332();
   }

   public Class283 method1412() {
      return this.field1267.method7331();
   }

   public Class5462 method1413() {
      return this.method1317().method6789();
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
      if (!this.method1367().method19464(var1)) {
         return 0;
      } else {
         Class6790 var4 = this.method1367().method19470().method14437(var1);
         if (var4 == null) {
            if (!this.method1421(var1)) {
               if (!this.method1334()) {
                  return this.method1288();
               } else {
                  return !this.method1367().method19491() ? 0 : 4;
               }
            } else {
               return 4;
            }
         } else {
            return var4.method20687();
         }
      }
   }

   public Class9789 method1419() {
      return this.field1262;
   }

   public Class7165 method1420() {
      return this.field1216;
   }

   public abstract boolean method1421(GameProfile var1);

   public void method1422(Path var1) throws IOException {
      Path var4 = var1.resolve("levels");

      for (Entry var6 : this.field1225.entrySet()) {
         ResourceLocation var7 = ((Class8705)var6.getKey()).method31399();
         Path var8 = var4.resolve(var7.method8293()).resolve(var7.method8292());
         Files.createDirectories(var8);
         ((Class1657)var6.getValue()).method6960(var8);
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
         var4.write(String.format("tick_times: %s\n", Arrays.toString(this.field1238)));
         var4.write(String.format("queue: %s\n", Util.method38492()));
      }
   }

   private void method1424(Path var1) throws IOException {
      Class4526 var4 = new Class4526("Server dump", new Exception("dummy"));
      this.method1326(var4);

      try (BufferedWriter var5 = Files.newBufferedWriter(var1)) {
         var5.write(var4.method14406());
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

   private void method1428(Class9487 var1) {
      if (this.field1246) {
         this.field1246 = false;
         this.field1215.method25293();
      }

      this.field1216 = Class9487.method36637(this.field1215.method25294(), var1);
   }

   private void method1429(Class9487 var1) {
      if (var1 != null) {
         var1.method36635();
      }

      this.field1216 = this.field1215.method25294();
   }

   public boolean method1430() {
      return this.field1215.method25291();
   }

   public void method1431() {
      this.field1246 = true;
   }

   public Class7740 method1432() {
      Class7740 var3 = this.field1215.method25295();
      this.field1215.method25292();
      return var3;
   }

   public Path method1433(Class5137 var1) {
      return this.field1211.method7991(var1);
   }

   public boolean method1434() {
      return true;
   }

   public Class8761 method1435() {
      return this.field1268;
   }

   public Class6611 method1436() {
      return this.field1269;
   }

   public Class8904 method1437() {
      return this.field1224;
   }

   @Nullable
   public IChatFilter method1438(Class878 var1) {
      return null;
   }

   // $VF: synthetic method
   public static Logger method1453() {
      return field1208;
   }
}
