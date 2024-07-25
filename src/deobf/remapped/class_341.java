package remapped;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_341 extends ReentrantThreadExecutor<class_9320> implements SnooperListener, class_5801, AutoCloseable {
   private static final Logger field_1316 = LogManager.getLogger();
   public static final File field_1312 = new File("usercache.json");
   public static final class_6292 field_1290 = new class_6292(
      "Demo World", GameType.field_22764, false, class_423.field_1789, false, new class_291(), class_2805.field_13766
   );
   public final class_3676 field_1339;
   public final class_5645 field_1337;
   private final Snooper field_1307 = new Snooper("server", this, Util.getMeasuringTimeMs());
   private final List<Runnable> field_1330 = Lists.newArrayList();
   private final class_2434 field_1293 = new class_2434(Util.nanoTimeSupplier, this::method_1682);
   private class_3492 field_1295 = class_8677.field_44535;
   private final class_6712 field_1334;
   private final class_3897 field_1298;
   private final class_5880 field_1284 = new class_5880();
   private final Random field_1324 = new Random();
   private final DataFixer field_1299;
   private String field_1310;
   private int field_1309 = -1;
   public final class_7522 field_1342;
   private final Map<class_5621<World>, class_6331> field_1318 = Maps.newLinkedHashMap();
   private class_8704 field_1322;
   private volatile boolean field_1313 = true;
   private boolean field_1320;
   private int field_1314;
   public final Proxy field_1288;
   private boolean field_1328;
   private boolean field_1336;
   private boolean field_1305;
   private boolean field_1303;
   private String field_1285;
   private int field_1327;
   private int field_1317;
   public final long[] field_1286 = new long[100];
   private KeyPair field_1289;
   private String field_1287;
   private boolean field_1315;
   private String field_1333 = "";
   private String field_1302 = "";
   private volatile boolean field_1296;
   private long field_1326;
   private boolean field_1323;
   private boolean field_1325;
   private final MinecraftSessionService field_1292;
   private final GameProfileRepository field_1344;
   private final class_5969 field_1294;
   private long field_1306;
   private final Thread field_1319;
   private long field_1331 = Util.getMeasuringTimeMs();
   private long field_1332;
   private boolean field_1283;
   private boolean field_1343;
   private final class_6354 field_1329;
   private final class_2917 field_1321 = new class_2917(this);
   private class_6532 field_1297;
   private final class_4543 field_1311 = new class_4543();
   private final class_1626 field_1291;
   private final class_9703 field_1335 = new class_9703();
   private boolean field_1340;
   private float field_1304;
   private final Executor field_1308;
   private String field_1301;
   private class_6298 field_1341;
   private final class_5799 field_1338;
   public final class_5684 field_1300;

   public static <S extends class_341> S method_1648(Function<Thread, S> var0) {
      AtomicReference var3 = new AtomicReference();
      Thread var4 = new Thread(() -> ((class_341)var3.get()).method_1698(), "Server thread");
      var4.setUncaughtExceptionHandler((var0x, var1) -> field_1316.error(var1));
      class_341 var5 = (class_341)var0.apply(var4);
      var3.set(var5);
      var4.start();
      return (S)var5;
   }

   public class_341(
      Thread var1,
      class_7522 var2,
      class_3676 var3,
      class_5684 var4,
      class_6354 var5,
      Proxy var6,
      DataFixer var7,
      class_6298 var8,
      MinecraftSessionService var9,
      GameProfileRepository var10,
      class_5969 var11,
      class_3897 var12
   ) {
      super("Server");
      this.field_1342 = var2;
      this.field_1300 = var4;
      this.field_1288 = var6;
      this.field_1329 = var5;
      this.field_1341 = var8;
      this.field_1292 = var9;
      this.field_1344 = var10;
      this.field_1294 = var11;
      this.field_1334 = new class_6712(this);
      this.field_1298 = var12;
      this.field_1339 = var3;
      this.field_1337 = var3.method_17059();
      this.field_1299 = var7;
      this.field_1291 = new class_1626(this, var8.method_28751());
      this.field_1338 = new class_5799(var8.method_28743(), var3, var7);
      this.field_1319 = var1;
      this.field_1308 = Util.getMainWorkerExecutor();
   }

   private void method_1672(class_4050 var1) {
      class_7385 var4 = var1.<class_7385>method_18708(class_7385::new, "scoreboard");
      var4.method_33639(this.method_1655());
      this.method_1655().method_13352(new class_7436(var4));
   }

   public abstract boolean method_1608() throws IOException;

   public static void method_1666(class_3676 var0) {
      if (var0.method_17069()) {
         field_1316.info("Converting map!");
         var0.method_17057(new class_3994());
      }
   }

   public void method_1738() {
      this.method_1749();
      this.field_1300.method_25715(this.method_1728(), this.method_1606().isPresent());
      class_1870 var3 = this.field_1298.method_18044(11);
      this.method_1707(var3);
      this.method_1708();
      this.method_1743(var3);
   }

   public void method_1708() {
   }

   public void method_1707(class_1870 var1) {
      class_7203 var4 = this.field_1300.method_25706();
      class_2904 var5 = this.field_1300.method_25703();
      boolean var6 = var5.method_13290();
      long var7 = var5.method_13295();
      long var9 = class_859.method_3728(var7);
      ImmutableList var11 = ImmutableList.of(new class_7324(), new class_7656(), new class_8270(), new class_1275(), new class_3549(var4));
      class_5383 var12 = var5.method_13296();
      class_8472 var13 = var12.method_39799(class_8472.field_43412);
      class_8760 var14;
      Object var15;
      if (var13 == null) {
         var14 = this.field_1342.method_28811().method_39807(class_8760.field_44833);
         var15 = class_2904.method_13283(
            this.field_1342.<class_6325>method_28813(class_8669.field_44359),
            this.field_1342.<class_7902>method_28813(class_8669.field_44360),
            new Random().nextLong()
         );
      } else {
         var14 = var13.method_38995();
         var15 = var13.method_38996();
      }

      class_6331 var16 = new class_6331(
         this, this.field_1308, this.field_1339, var4, World.field_33048, var14, var1, (class_6541)var15, var6, var9, var11, true
      );
      this.field_1318.put(World.field_33048, var16);
      class_4050 var17 = var16.method_28980();
      this.method_1672(var17);
      this.field_1297 = new class_6532(var17);
      class_2098 var18 = var16.method_6673();
      var18.method_9834(var4.method_32974());
      if (!var4.method_32973()) {
         try {
            method_1662(var16, var4, var5.method_13293(), var6, true);
            var4.method_32985(true);
            if (var6) {
               this.method_1752(this.field_1300);
            }
         } catch (Throwable var28) {
            class_159 var20 = class_159.method_643(var28, "Exception initializing level");

            try {
               var16.method_29548(var20);
            } catch (Throwable var27) {
            }

            throw new class_3297(var20);
         }

         var4.method_32985(true);
      }

      this.method_1600().method_39999(var16);
      if (this.field_1300.method_25708() != null) {
         this.method_1699().method_21077(this.field_1300.method_25708());
      }

      for (Entry var29 : var12.method_39808()) {
         class_5621 var21 = (class_5621)var29.getKey();
         if (var21 != class_8472.field_43412) {
            class_5621 var22 = class_5621.<World>method_25497(class_8669.field_44372, var21.method_25499());
            class_8760 var23 = ((class_8472)var29.getValue()).method_38995();
            class_6541 var24 = ((class_8472)var29.getValue()).method_38996();
            class_1420 var25 = new class_1420(this.field_1300, var4);
            class_6331 var26 = new class_6331(this, this.field_1308, this.field_1339, var25, var22, var23, var1, var24, var6, var9, ImmutableList.of(), false);
            var18.method_9833(new class_4973(var26.method_6673()));
            this.field_1318.put(var22, var26);
         }
      }
   }

   private static void method_1662(class_6331 var0, class_7203 var1, boolean var2, boolean var3, boolean var4) {
      class_6541 var7 = var0.method_28945().method_10189();
      if (var4) {
         if (!var3) {
            class_3498 var8 = var7.method_29817();
            Random var9 = new Random(var0.method_3133());
            class_1331 var10 = var8.method_16085(0, var0.method_22552(), 0, 256, var0x -> var0x.method_28886().method_27796(), var9);
            class_2034 var11 = var10 != null ? new class_2034(var10) : new class_2034(0, 0);
            if (var10 == null) {
               field_1316.warn("Unable to find spawn biome");
            }

            boolean var12 = false;

            for (class_6414 var14 : class_2351.field_11788.method_10608()) {
               if (var8.method_16089().contains(var14.method_29260())) {
                  var12 = true;
                  break;
               }
            }

            var1.method_4988(var11.method_9546().method_6104(8, var7.method_29823(), 8), 0.0F);
            int var20 = 0;
            int var21 = 0;
            int var15 = 0;
            int var16 = -1;
            byte var17 = 32;

            for (int var18 = 0; var18 < 1024; var18++) {
               if (var20 > -16 && var20 <= 16 && var21 > -16 && var21 <= 16) {
                  class_1331 var19 = class_1077.method_4715(var0, new class_2034(var11.field_10328 + var20, var11.field_10327 + var21), var12);
                  if (var19 != null) {
                     var1.method_4988(var19, 0.0F);
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
               class_5927 var22 = class_7024.field_36070;
               var22.method_27104(var0, var7, var0.field_33033, new class_1331(var1.method_8654(), var1.method_8660(), var1.method_8655()));
            }
         } else {
            var1.method_4988(class_1331.field_7306.method_6081(), 0.0F);
         }
      } else {
         var1.method_4988(class_1331.field_7306.method_6082(var7.method_29823()), 0.0F);
      }
   }

   private void method_1752(class_5684 var1) {
      var1.method_25702(class_423.field_1790);
      var1.method_25707(true);
      class_7203 var4 = var1.method_25706();
      var4.method_8665(false);
      var4.method_32978(false);
      var4.method_32977(1000000000);
      var4.method_32983(6000L);
      var4.method_25711(GameType.SPECTATOR);
   }

   private void method_1743(class_1870 var1) {
      class_6331 var4 = this.method_1736();
      field_1316.info("Preparing start region for dimension {}", var4.method_29545().method_25499());
      class_1331 var5 = var4.method_28998();
      var1.method_8296(new class_2034(var5));
      class_2206 var6 = var4.method_28945();
      var6.method_10175().method_9764(500);
      this.field_1331 = Util.getMeasuringTimeMs();
      var6.method_10177(class_5032.field_26021, new class_2034(var5), 11, Unit.INSTANCE);

      while (var6.method_10207() != 441) {
         this.field_1331 = Util.getMeasuringTimeMs() + 10L;
         this.method_1737();
      }

      this.field_1331 = Util.getMeasuringTimeMs() + 10L;
      this.method_1737();

      for (class_6331 var8 : this.field_1318.values()) {
         class_2497 var9 = var8.method_28980().<class_2497>method_18707(class_2497::new, "chunks");
         if (var9 != null) {
            LongIterator var10 = var9.method_11410().iterator();

            while (var10.hasNext()) {
               long var11 = var10.nextLong();
               class_2034 var13 = new class_2034(var11);
               var8.method_28945().method_14817(var13, true);
            }
         }
      }

      this.field_1331 = Util.getMeasuringTimeMs() + 10L;
      this.method_1737();
      var1.method_8298();
      var6.method_10175().method_9764(5);
      this.method_1615();
   }

   public void method_1749() {
      File var3 = this.field_1339.method_17064(class_263.field_928).toFile();
      if (var3.isFile()) {
         String var4 = this.field_1339.method_17070();

         try {
            this.method_1614("level://" + URLEncoder.encode(var4, StandardCharsets.UTF_8.toString()) + "/resources.zip", "");
         } catch (UnsupportedEncodingException var6) {
            field_1316.warn("Something went wrong url encoding {}", var4);
         }
      }
   }

   public GameType method_1602() {
      return this.field_1300.method_25709();
   }

   public boolean method_1634() {
      return this.field_1300.method_8659();
   }

   public abstract int method_1675();

   public abstract int method_1620();

   public abstract boolean method_1626();

   public boolean method_1635(boolean var1, boolean var2, boolean var3) {
      boolean var6 = false;

      for (class_6331 var8 : this.method_1719()) {
         if (!var1) {
            field_1316.info("Saving chunks for level '{}'/{}", var8, var8.method_29545().method_25499());
         }

         var8.method_28971((class_1215)null, var2, var8.field_32325 && !var3);
         var6 = true;
      }

      class_6331 var9 = this.method_1736();
      class_7203 var10 = this.field_1300.method_25706();
      var10.method_32981(var9.method_6673().method_9831());
      this.field_1300.method_25698(this.method_1699().method_21082());
      this.field_1339.method_17066(this.field_1342, this.field_1300, this.method_1600().method_39949());
      return var6;
   }

   @Override
   public void close() {
      this.method_1651();
   }

   public void method_1651() {
      field_1316.info("Stopping server");
      if (this.method_1679() != null) {
         this.method_1679().method_30824();
      }

      if (this.field_1322 != null) {
         field_1316.info("Saving players");
         this.field_1322.method_39964();
         this.field_1322.method_39987();
      }

      field_1316.info("Saving worlds");

      for (class_6331 var4 : this.method_1719()) {
         if (var4 != null) {
            var4.field_32325 = false;
         }
      }

      this.method_1635(false, true, false);

      for (class_6331 var9 : this.method_1719()) {
         if (var9 != null) {
            try {
               var9.close();
            } catch (IOException var7) {
               field_1316.error("Exception closing the level", var7);
            }
         }
      }

      if (this.field_1307.method_15248()) {
         this.field_1307.method_15245();
      }

      this.field_1341.close();

      try {
         this.field_1339.close();
      } catch (IOException var6) {
         field_1316.error("Failed to unlock level {}", this.field_1339.method_17070(), var6);
      }
   }

   public String method_1644() {
      return this.field_1310;
   }

   public void method_1665(String var1) {
      this.field_1310 = var1;
   }

   public boolean method_1692() {
      return this.field_1313;
   }

   public void method_1641(boolean var1) {
      this.field_1313 = false;
      if (var1) {
         try {
            this.field_1319.join();
         } catch (InterruptedException var5) {
            field_1316.error("Error while shutting down", var5);
         }
      }
   }

   public void method_1698() {
      try {
         if (this.method_1608()) {
            this.field_1331 = Util.getMeasuringTimeMs();
            this.field_1284.method_26814(new StringTextComponent(this.field_1285));
            this.field_1284.method_26813(new class_7543(class_7665.method_34674().getName(), class_7665.method_34674().getProtocolVersion()));
            this.method_1637(this.field_1284);

            while (this.field_1313) {
               long var3 = Util.getMeasuringTimeMs() - this.field_1331;
               if (var3 > 2000L && this.field_1331 - this.field_1326 >= 15000L) {
                  long var5 = var3 / 50L;
                  field_1316.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", var3, var5);
                  this.field_1331 += var5 * 50L;
                  this.field_1326 = this.field_1331;
               }

               this.field_1331 += 50L;
               class_8576 var51 = class_8576.method_39452("Server");
               this.method_1693(var51);
               this.field_1295.method_16059();
               this.field_1295.method_16056("tick");
               this.method_1658(this::method_1609);
               this.field_1295.method_16050("nextTickWait");
               this.field_1283 = true;
               this.field_1332 = Math.max(Util.getMeasuringTimeMs() + 50L, this.field_1331);
               this.method_1737();
               this.field_1295.method_16054();
               this.field_1295.method_16052();
               this.method_1619(var51);
               this.field_1296 = true;
            }
         } else {
            this.method_1677((class_159)null);
         }
      } catch (Throwable var49) {
         field_1316.error("Encountered an unexpected exception", var49);
         class_159 var10;
         if (var49 instanceof class_3297) {
            var10 = this.method_1725(((class_3297)var49).method_15119());
         } else {
            var10 = this.method_1725(new class_159("Exception in server tick loop", var49));
         }

         File var7 = new File(
            new File(this.method_1652(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
         );
         if (var10.method_641(var7)) {
            field_1316.error("This crash report has been saved to: {}", var7.getAbsolutePath());
         } else {
            field_1316.error("We were unable to save this crash report to disk.");
         }

         this.method_1677(var10);
      } finally {
         try {
            this.field_1320 = true;
            this.method_1651();
         } catch (Throwable var47) {
            field_1316.error("Exception stopping the server", var47);
         } finally {
            this.method_1604();
         }
      }
   }

   private boolean method_1609() {
      return this.method_35205() || Util.getMeasuringTimeMs() < (!this.field_1283 ? this.field_1331 : this.field_1332);
   }

   public void method_1737() {
      this.method_34454();
      this.method_34461(() -> !this.method_1609());
   }

   public class_9320 method_1714(Runnable var1) {
      return new class_9320(this.field_1314, var1);
   }

   public boolean method_1724(class_9320 var1) {
      return var1.method_43022() + 3 < this.field_1314 || this.method_1609();
   }

   @Override
   public boolean method_34453() {
      boolean var3 = this.method_1711();
      this.field_1283 = var3;
      return var3;
   }

   private boolean method_1711() {
      if (super.method_34453()) {
         return true;
      } else {
         if (this.method_1609()) {
            for (class_6331 var4 : this.method_1719()) {
               if (var4.method_28945().method_10191()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void run(class_9320 var1) {
      this.method_1704().method_16055("runTask");
      super.run(var1);
   }

   private void method_1637(class_5880 var1) {
      File var4 = this.method_1687("server-icon.png");
      if (!var4.exists()) {
         var4 = this.field_1339.method_17060();
      }

      if (var4.isFile()) {
         ByteBuf var5 = Unpooled.buffer();

         try {
            BufferedImage var6 = ImageIO.read(var4);
            Validate.validState(var6.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var6.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            ImageIO.write(var6, "PNG", new ByteBufOutputStream(var5));
            ByteBuffer var7 = Base64.getEncoder().encode(var5.nioBuffer());
            var1.method_26821("data:image/png;base64," + StandardCharsets.UTF_8.decode(var7));
         } catch (Exception var11) {
            field_1316.error("Couldn't load server icon", var11);
         } finally {
            var5.release();
         }
      }
   }

   public boolean method_1612() {
      this.field_1343 = this.field_1343 || this.method_1661().isFile();
      return this.field_1343;
   }

   public File method_1661() {
      return this.field_1339.method_17060();
   }

   public File method_1652() {
      return new File(".");
   }

   public void method_1677(class_159 var1) {
   }

   public void method_1604() {
   }

   public void method_1658(BooleanSupplier var1) {
      long var4 = Util.getMeasuringTimeNano();
      this.field_1314++;
      this.method_1630(var1);
      if (var4 - this.field_1306 >= 5000000000L) {
         this.field_1306 = var4;
         this.field_1284.method_26819(new class_9608(this.method_1732(), this.method_1656()));
         GameProfile[] var10 = new GameProfile[Math.min(this.method_1656(), 12)];
         int var11 = class_9299.method_42824(this.field_1324, 0, this.method_1656() - var10.length);

         for (int var12 = 0; var12 < var10.length; var12++) {
            var10[var12] = this.field_1322.method_39951().get(var11 + var12).method_3247();
         }

         Collections.shuffle(Arrays.<GameProfile>asList(var10));
         this.field_1284.method_26816().method_44366(var10);
      }

      if (this.field_1314 % 6000 == 0) {
         field_1316.debug("Autosave started");
         this.field_1295.method_16056("save");
         this.field_1322.method_39964();
         this.method_1635(true, false, false);
         this.field_1295.method_16054();
         field_1316.debug("Autosave finished");
      }

      this.field_1295.method_16056("snooper");
      if (!this.field_1307.method_15248() && this.field_1314 > 100) {
         this.field_1307.method_15250();
      }

      if (this.field_1314 % 6000 == 0) {
         this.field_1307.method_15246();
      }

      this.field_1295.method_16054();
      this.field_1295.method_16056("tallying");
      long var6 = this.field_1286[this.field_1314 % 100] = Util.getMeasuringTimeNano() - var4;
      this.field_1304 = this.field_1304 * 0.8F + (float)var6 / 1000000.0F * 0.19999999F;
      long var8 = Util.getMeasuringTimeNano();
      this.field_1335.method_44836(var8 - var4);
      this.field_1295.method_16054();
   }

   public void method_1630(BooleanSupplier var1) {
      this.field_1295.method_16056("commandFunctions");
      this.method_1642().method_7255();
      this.field_1295.method_16050("levels");

      for (class_6331 var5 : this.method_1719()) {
         this.field_1295.method_16057(() -> var5 + " " + var5.method_29545().method_25499());
         if (this.field_1314 % 20 == 0) {
            this.field_1295.method_16056("timeSync");
            this.field_1322
               .method_39958(
                  new class_8508(var5.method_29546(), var5.method_29584(), var5.method_29537().method_1285(class_291.field_1037)), var5.method_29545()
               );
            this.field_1295.method_16054();
         }

         this.field_1295.method_16056("tick");

         try {
            var5.method_28982(var1);
         } catch (Throwable var8) {
            class_159 var7 = class_159.method_643(var8, "Exception ticking world");
            var5.method_29548(var7);
            throw new class_3297(var7);
         }

         this.field_1295.method_16054();
         this.field_1295.method_16054();
      }

      this.field_1295.method_16050("connection");
      this.method_1679().method_30825();
      this.field_1295.method_16050("players");
      this.field_1322.method_39977();
      if (class_7665.field_38958) {
         class_2983.field_14682.method_13659();
      }

      this.field_1295.method_16050("server gui refresh");

      for (int var9 = 0; var9 < this.field_1330.size(); var9++) {
         this.field_1330.get(var9).run();
      }

      this.field_1295.method_16054();
   }

   public boolean method_1741() {
      return true;
   }

   public void method_1686(Runnable var1) {
      this.field_1330.add(var1);
   }

   public void method_1745(String var1) {
      this.field_1301 = var1;
   }

   public boolean method_1668() {
      return !this.field_1319.isAlive();
   }

   public File method_1687(String var1) {
      return new File(this.method_1652(), var1);
   }

   public final class_6331 method_1736() {
      return this.field_1318.get(World.field_33048);
   }

   @Nullable
   public class_6331 method_1697(class_5621<World> var1) {
      return this.field_1318.get(var1);
   }

   public Set<class_5621<World>> method_1659() {
      return this.field_1318.keySet();
   }

   public Iterable<class_6331> method_1719() {
      return this.field_1318.values();
   }

   public String method_1603() {
      return class_7665.method_34674().getName();
   }

   public int method_1656() {
      return this.field_1322.method_39998();
   }

   public int method_1732() {
      return this.field_1322.method_39963();
   }

   public String[] method_1713() {
      return this.field_1322.method_39968();
   }

   public String method_1728() {
      return "vanilla";
   }

   public class_159 method_1725(class_159 var1) {
      if (this.field_1322 != null) {
         var1.method_629()
            .method_29851("Player Count", () -> this.field_1322.method_39998() + " / " + this.field_1322.method_39963() + "; " + this.field_1322.method_39951());
      }

      var1.method_629().method_29851("Data Packs", () -> {
         StringBuilder var3 = new StringBuilder();

         for (class_5522 var5 : this.field_1329.method_29125()) {
            if (var3.length() > 0) {
               var3.append(", ");
            }

            var3.append(var5.method_25023());
            if (!var5.method_25022().method_9602()) {
               var3.append(" (incompatible)");
            }
         }

         return var3.toString();
      });
      if (this.field_1301 != null) {
         var1.method_629().method_29851("Server Id", () -> this.field_1301);
      }

      return var1;
   }

   public abstract Optional<String> method_1606();

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
      field_1316.info(var1.getString());
   }

   public KeyPair method_1710() {
      return this.field_1289;
   }

   public int method_1650() {
      return this.field_1309;
   }

   public void method_1723(int var1) {
      this.field_1309 = var1;
   }

   public String method_1674() {
      return this.field_1287;
   }

   public void method_1757(String var1) {
      this.field_1287 = var1;
   }

   public boolean method_1689() {
      return this.field_1287 != null;
   }

   public void method_1653() {
      field_1316.info("Generating keypair");

      try {
         this.field_1289 = class_6531.method_29724();
      } catch (class_9647 var4) {
         throw new IllegalStateException("Failed to generate key pair", var4);
      }
   }

   public void method_1753(class_423 var1, boolean var2) {
      if (var2 || !this.field_1300.method_8662()) {
         this.field_1300.method_25702(!this.field_1300.method_8659() ? var1 : class_423.field_1782);
         this.method_1615();
         this.method_1600().method_39951().forEach(this::method_1721);
      }
   }

   public int method_1638(int var1) {
      return var1;
   }

   private void method_1615() {
      for (class_6331 var4 : this.method_1719()) {
         var4.method_29555(this.method_1706(), this.method_1702());
      }
   }

   public void method_1646(boolean var1) {
      this.field_1300.method_25707(var1);
      this.method_1600().method_39951().forEach(this::method_1721);
   }

   private void method_1721(class_9359 var1) {
      class_1906 var4 = var1.method_43235().method_43366();
      var1.field_47794.method_4156(new class_9275(var4.method_8661(), var4.method_8662()));
   }

   public boolean method_1706() {
      return this.field_1300.method_8661() != class_423.field_1790;
   }

   public boolean method_1691() {
      return this.field_1315;
   }

   public void method_1751(boolean var1) {
      this.field_1315 = var1;
   }

   public String method_1627() {
      return this.field_1333;
   }

   public String method_1613() {
      return this.field_1302;
   }

   public void method_1614(String var1, String var2) {
      this.field_1333 = var1;
      this.field_1302 = var2;
   }

   @Override
   public void addSnooperInfo(Snooper var1) {
      var1.method_15252("whitelist_enabled", false);
      var1.method_15252("whitelist_count", 0);
      if (this.field_1322 != null) {
         var1.method_15252("players_current", this.method_1656());
         var1.method_15252("players_max", this.method_1732());
         var1.method_15252("players_seen", this.field_1337.method_25557().length);
      }

      var1.method_15252("uses_auth", this.field_1328);
      var1.method_15252("gui_state", !this.method_1695() ? "disabled" : "enabled");
      var1.method_15252("run_time", (Util.getMeasuringTimeMs() - var1.method_15251()) / 60L * 1000L);
      var1.method_15252("avg_tick_ms", (int)(class_9299.method_42826(this.field_1286) * 1.0E-6));
      int var4 = 0;

      for (class_6331 var6 : this.method_1719()) {
         if (var6 != null) {
            var1.method_15252("world[" + var4 + "][dimension]", var6.method_29545().method_25499());
            var1.method_15252("world[" + var4 + "][mode]", this.field_1300.method_25709());
            var1.method_15252("world[" + var4 + "][difficulty]", var6.method_43370());
            var1.method_15252("world[" + var4 + "][hardcore]", this.field_1300.method_8659());
            var1.method_15252("world[" + var4 + "][height]", this.field_1327);
            var1.method_15252("world[" + var4 + "][chunks_loaded]", var6.method_28945().method_10188());
            var4++;
         }
      }

      var1.method_15252("worlds", var4);
   }

   public abstract boolean method_1718();

   public abstract int method_1700();

   public boolean method_1657() {
      return this.field_1328;
   }

   public void method_1605(boolean var1) {
      this.field_1328 = var1;
   }

   public boolean method_1688() {
      return this.field_1336;
   }

   public void method_1746(boolean var1) {
      this.field_1336 = var1;
   }

   public boolean method_1702() {
      return true;
   }

   public boolean method_1734() {
      return true;
   }

   public abstract boolean method_1727();

   public boolean method_1681() {
      return this.field_1305;
   }

   public void method_1667(boolean var1) {
      this.field_1305 = var1;
   }

   public boolean method_1632() {
      return this.field_1303;
   }

   public void method_1640(boolean var1) {
      this.field_1303 = var1;
   }

   public abstract boolean method_1726();

   public String method_1748() {
      return this.field_1285;
   }

   public void method_1628(String var1) {
      this.field_1285 = var1;
   }

   public int method_1671() {
      return this.field_1327;
   }

   public void method_1744(int var1) {
      this.field_1327 = var1;
   }

   public boolean method_1633() {
      return this.field_1320;
   }

   public class_8704 method_1600() {
      return this.field_1322;
   }

   public void method_1616(class_8704 var1) {
      this.field_1322 = var1;
   }

   public abstract boolean method_1624();

   public void method_1716(GameType var1) {
      this.field_1300.method_25711(var1);
   }

   @Nullable
   public class_6712 method_1679() {
      return this.field_1334;
   }

   public boolean method_1636() {
      return this.field_1296;
   }

   public boolean method_1695() {
      return false;
   }

   public abstract boolean method_1625(GameType var1, boolean var2, int var3);

   public int method_1682() {
      return this.field_1314;
   }

   public Snooper method_1756() {
      return this.field_1307;
   }

   public int method_1680() {
      return 16;
   }

   public boolean method_1618(class_6331 var1, class_1331 var2, class_704 var3) {
      return false;
   }

   public void method_1755(boolean var1) {
      this.field_1325 = var1;
   }

   public boolean method_1621() {
      return this.field_1325;
   }

   public boolean method_1654() {
      return true;
   }

   public int method_1696() {
      return this.field_1317;
   }

   public void method_1731(int var1) {
      this.field_1317 = var1;
   }

   public MinecraftSessionService method_1639() {
      return this.field_1292;
   }

   public GameProfileRepository method_1701() {
      return this.field_1344;
   }

   public class_5969 method_1647() {
      return this.field_1294;
   }

   public class_5880 method_1629() {
      return this.field_1284;
   }

   public void method_1717() {
      this.field_1306 = 0L;
   }

   public int method_1742() {
      return 29999984;
   }

   @Override
   public boolean method_34464() {
      return super.method_34464() && !this.method_1633();
   }

   @Override
   public Thread method_34460() {
      return this.field_1319;
   }

   public int method_1611() {
      return 256;
   }

   public long method_1740() {
      return this.field_1331;
   }

   public DataFixer method_1607() {
      return this.field_1299;
   }

   public int method_1720(class_6331 var1) {
      return var1 == null ? 10 : var1.method_29537().method_1295(class_291.field_1054);
   }

   public class_8873 method_1703() {
      return this.field_1341.method_28744();
   }

   public class_1626 method_1642() {
      return this.field_1291;
   }

   public CompletableFuture<Void> method_1645(Collection<String> var1) {
      CompletableFuture var4 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> var1.stream()
                  .<class_5522>map(this.field_1329::method_29120)
                  .filter(Objects::nonNull)
                  .<class_8169>map(class_5522::method_25032)
                  .collect(ImmutableList.toImmutableList()),
            this
         )
         .<class_6298>thenCompose(
            var1x -> class_6298.method_28747(
                  var1x, !this.method_1718() ? class_9019.field_46137 : class_9019.field_46139, this.method_1620(), this.field_1308, this
               )
         )
         .thenAcceptAsync(var2 -> {
            this.field_1341.close();
            this.field_1341 = var2;
            this.field_1329.method_29121(var1);
            this.field_1300.method_25695(method_1660(this.field_1329));
            var2.method_28748();
            this.method_1600().method_39964();
            this.method_1600().method_39981();
            this.field_1291.method_7246(this.field_1341.method_28751());
            this.field_1338.method_26275(this.field_1341.method_28743());
         }, this);
      if (this.method_34466()) {
         this.method_34461(var4::isDone);
      }

      return var4;
   }

   public static class_2805 method_1673(class_6354 var0, class_2805 var1, boolean var2) {
      var0.method_29122();
      if (!var2) {
         LinkedHashSet var5 = Sets.newLinkedHashSet();

         for (String var7 : var1.method_12755()) {
            if (!var0.method_29119(var7)) {
               field_1316.warn("Missing data pack {}", var7);
            } else {
               var5.add(var7);
            }
         }

         for (class_5522 var10 : var0.method_29117()) {
            String var8 = var10.method_25023();
            if (!var1.method_12753().contains(var8) && !var5.contains(var8)) {
               field_1316.info("Found new data pack {}, loading it automatically", var8);
               var5.add(var8);
            }
         }

         if (var5.isEmpty()) {
            field_1316.info("No datapacks selected, forcing vanilla");
            var5.add("vanilla");
         }

         var0.method_29121(var5);
         return method_1660(var0);
      } else {
         var0.method_29121(Collections.<String>singleton("vanilla"));
         return new class_2805(ImmutableList.of("vanilla"), ImmutableList.of());
      }
   }

   private static class_2805 method_1660(class_6354 var0) {
      Collection var3 = var0.method_29123();
      ImmutableList var4 = ImmutableList.copyOf(var3);
      List var5 = var0.method_29118().stream().filter(var1 -> !var3.contains(var1)).collect(ImmutableList.toImmutableList());
      return new class_2805(var4, var5);
   }

   public void method_1694(class_9155 var1) {
      if (this.method_1739()) {
         class_8704 var4 = var1.method_42177().method_1600();
         class_5686 var5 = var4.method_39979();

         for (class_9359 var7 : Lists.newArrayList(var4.method_39951())) {
            if (!var5.method_25718(var7.method_3247())) {
               var7.field_47794.method_4161(new TranslationTextComponent("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public class_6354 method_1747() {
      return this.field_1329;
   }

   public class_465 method_1631() {
      return this.field_1341.method_28745();
   }

   public class_9155 method_1730() {
      class_6331 var3 = this.method_1736();
      return new class_9155(
         this,
         var3 != null ? class_1343.method_6205(var3.method_28998()) : class_1343.field_7335,
         class_4895.field_24322,
         var3,
         4,
         "Server",
         new StringTextComponent("Server"),
         this,
         (Entity)null
      );
   }

   @Override
   public boolean method_26287() {
      return true;
   }

   @Override
   public boolean method_26285() {
      return true;
   }

   public class_5023 method_1705() {
      return this.field_1341.method_28746();
   }

   public class_6437 method_1754() {
      return this.field_1341.method_28753();
   }

   public class_2917 method_1655() {
      return this.field_1321;
   }

   public class_6532 method_1678() {
      if (this.field_1297 != null) {
         return this.field_1297;
      } else {
         throw new NullPointerException("Called before server init");
      }
   }

   public class_1040 method_1722() {
      return this.field_1341.method_28750();
   }

   public class_264 method_1676() {
      return this.field_1341.method_28749();
   }

   public class_291 method_1683() {
      return this.method_1736().method_29537();
   }

   public class_4543 method_1699() {
      return this.field_1311;
   }

   public boolean method_1739() {
      return this.field_1340;
   }

   public void method_1622(boolean var1) {
      this.field_1340 = var1;
   }

   public float method_1733() {
      return this.field_1304;
   }

   public int method_1685(GameProfile var1) {
      if (!this.method_1600().method_39962(var1)) {
         return 0;
      } else {
         class_3791 var4 = this.method_1600().method_39947().method_19927(var1);
         if (var4 == null) {
            if (!this.method_1610(var1)) {
               if (!this.method_1689()) {
                  return this.method_1675();
               } else {
                  return !this.method_1600().method_39978() ? 0 : 4;
               }
            } else {
               return 4;
            }
         } else {
            return var4.method_17607();
         }
      }
   }

   public class_9703 method_1643() {
      return this.field_1335;
   }

   public class_3492 method_1704() {
      return this.field_1295;
   }

   public abstract boolean method_1610(GameProfile var1);

   public void method_1623(Path var1) throws IOException {
      Path var4 = var1.resolve("levels");

      for (Entry var6 : this.field_1318.entrySet()) {
         Identifier var7 = ((class_5621)var6.getKey()).method_25499();
         Path var8 = var4.resolve(var7.method_21461()).resolve(var7.method_21456());
         Files.createDirectories(var8);
         ((class_6331)var6.getValue()).method_28992(var8);
      }

      this.method_1669(var1.resolve("gamerules.txt"));
      this.method_1712(var1.resolve("classpath.txt"));
      this.method_1690(var1.resolve("example_crash.txt"));
      this.method_1664(var1.resolve("stats.txt"));
      this.method_1715(var1.resolve("threads.txt"));
   }

   private void method_1664(Path var1) throws IOException {
      try (BufferedWriter var4 = Files.newBufferedWriter(var1)) {
         var4.write(String.format("pending_tasks: %d\n", this.method_34451()));
         var4.write(String.format("average_tick_time: %f\n", this.method_1733()));
         var4.write(String.format("tick_times: %s\n", Arrays.toString(this.field_1286)));
         var4.write(String.format("queue: %s\n", Util.getMainWorkerExecutor()));
      }
   }

   private void method_1690(Path var1) throws IOException {
      class_159 var4 = new class_159("Server dump", new Exception("dummy"));
      this.method_1725(var4);

      try (BufferedWriter var5 = Files.newBufferedWriter(var1)) {
         var5.write(var4.method_632());
      }
   }

   private void method_1669(Path var1) throws IOException {
      try (BufferedWriter var4 = Files.newBufferedWriter(var1)) {
         ArrayList var6 = Lists.newArrayList();
         class_291 var7 = this.method_1683();
         class_291.method_1289(new class_7845(this, var6, var7));

         for (String var9 : var6) {
            var4.write(var9);
         }
      }
   }

   private void method_1712(Path var1) throws IOException {
      try (BufferedWriter var4 = Files.newBufferedWriter(var1)) {
         String var6 = System.getProperty("java.class.path");
         String var7 = System.getProperty("path.separator");

         for (String var9 : Splitter.on(var7).split(var6)) {
            var4.write(var9);
            var4.write("\n");
         }
      }
   }

   private void method_1715(Path var1) throws IOException {
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

   private void method_1693(class_8576 var1) {
      if (this.field_1323) {
         this.field_1323 = false;
         this.field_1293.method_11089();
      }

      this.field_1295 = class_8576.method_39453(this.field_1293.method_11091(), var1);
   }

   private void method_1619(class_8576 var1) {
      if (var1 != null) {
         var1.method_39451();
      }

      this.field_1295 = this.field_1293.method_11091();
   }

   public boolean method_1617() {
      return this.field_1293.method_11087();
   }

   public void method_1729() {
      this.field_1323 = true;
   }

   public class_2578 method_1663() {
      class_2578 var3 = this.field_1293.method_11086();
      this.field_1293.method_11090();
      return var3;
   }

   public Path method_1649(class_263 var1) {
      return this.field_1339.method_17064(var1);
   }

   public boolean method_1709() {
      return true;
   }

   public class_5799 method_1670() {
      return this.field_1338;
   }

   public class_5684 method_1601() {
      return this.field_1300;
   }

   public class_6322 method_1735() {
      return this.field_1342;
   }

   @Nullable
   public IChatFilter method_1684(class_9359 var1) {
      return null;
   }
}
