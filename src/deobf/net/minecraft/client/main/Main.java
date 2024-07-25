package net.minecraft.client.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import remapped.class_1210;
import remapped.class_1274;
import remapped.class_1505;
import remapped.class_159;
import remapped.class_1893;
import remapped.class_2435;
import remapped.class_2557;
import remapped.class_2586;
import remapped.class_2945;
import remapped.class_3472;
import remapped.class_3542;
import remapped.class_3934;
import remapped.class_4141;
import remapped.class_447;
import remapped.class_5681;
import remapped.class_6539;
import remapped.class_6815;
import remapped.class_704;
import remapped.class_8761;
import remapped.class_8881;
import remapped.class_9665;
import remapped.class_9706;

public class Main {
   private static final Logger field_1 = LogManager.getLogger();

   public static void main(String[] var0) {
      OptionParser var3 = new OptionParser();
      var3.allowsUnrecognizedOptions();
      var3.accepts("demo");
      var3.accepts("disableMultiplayer");
      var3.accepts("disableChat");
      var3.accepts("fullscreen");
      var3.accepts("checkGlErrors");
      ArgumentAcceptingOptionSpec var4 = var3.accepts("server").withRequiredArg();
      ArgumentAcceptingOptionSpec var5 = var3.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(25565, new Integer[0]);
      ArgumentAcceptingOptionSpec var6 = var3.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      ArgumentAcceptingOptionSpec var7 = var3.accepts("assetsDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var8 = var3.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var9 = var3.accepts("dataPackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec var10 = var3.accepts("proxyHost").withRequiredArg();
      ArgumentAcceptingOptionSpec var11 = var3.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      ArgumentAcceptingOptionSpec var12 = var3.accepts("proxyUser").withRequiredArg();
      ArgumentAcceptingOptionSpec var13 = var3.accepts("proxyPass").withRequiredArg();
      ArgumentAcceptingOptionSpec var14 = var3.accepts("username").withRequiredArg().defaultsTo("Player" + class_9665.method_44650() % 1000L, new String[0]);
      ArgumentAcceptingOptionSpec var15 = var3.accepts("uuid").withRequiredArg();
      ArgumentAcceptingOptionSpec var16 = var3.accepts("accessToken").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var17 = var3.accepts("version").withRequiredArg().required();
      ArgumentAcceptingOptionSpec var18 = var3.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      ArgumentAcceptingOptionSpec var19 = var3.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      ArgumentAcceptingOptionSpec var20 = var3.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec var21 = var3.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec var22 = var3.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var23 = var3.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec var24 = var3.accepts("assetIndex").withRequiredArg();
      ArgumentAcceptingOptionSpec var25 = var3.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      ArgumentAcceptingOptionSpec var26 = var3.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      NonOptionArgumentSpec var27 = var3.nonOptions();
      OptionSet var28 = var3.parse(var0);
      List var29 = var28.valuesOf(var27);
      if (!var29.isEmpty()) {
         System.out.println("Completely ignored arguments: " + var29);
      }

      String var30 = method_2(var28, var10).toString();
      Proxy var31 = Proxy.NO_PROXY;
      if (var30 != null) {
         try {
            var31 = new Proxy(Type.SOCKS, new InetSocketAddress(var30, (Integer) method_2(var28, var11)));
         } catch (Exception var72) {
         }
      }

      String var32 = method_2(var28, var12).toString();
      String var33 = method_2(var28, var13).toString();
      if (!var31.equals(Proxy.NO_PROXY) && method_1(var32) && method_1(var33)) {
         Authenticator.setDefault(new class_1274(var32, var33));
      }

      int var34 = (int) method_2(var28, var18);
      int var35 = (int) method_2(var28, var19);
      OptionalInt var36 = method_3((Integer) method_2(var28, var20));
      OptionalInt var37 = method_3((Integer) method_2(var28, var21));
      boolean var38 = var28.has("fullscreen");
      boolean var39 = var28.has("demo");
      boolean var40 = var28.has("disableMultiplayer");
      boolean var41 = var28.has("disableChat");
      String var42 = method_2(var28, var17).toString();
      Gson var43 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
      PropertyMap var44 = class_6539.<PropertyMap>method_29803(var43, (String) method_2(var28, var22), PropertyMap.class);
      PropertyMap var45 = class_6539.<PropertyMap>method_29803(var43, (String) method_2(var28, var23), PropertyMap.class);
      String var46 = method_2(var28, var26).toString();
      File var47 = (File) method_2(var28, var6);
      File var48 = var28.has(var7) ? (File) method_2(var28, var7) : new File(var47, "assets/");
      File var49 = var28.has(var8) ? (File) method_2(var28, var8) : new File(var47, "resourcepacks/");
      String var50 = var28.has(var15) ? (String)var15.value(var28) : class_704.method_3249((String)var14.value(var28)).toString();
      String var51 = var28.has(var24) ? (String)var24.value(var28) : null;
      String var52 = method_2(var28, var4).toString();
      Integer var53 = (Integer) method_2(var28, var5);
      class_159.method_634();
      class_2557.method_11618();
      class_2557.method_11617();
      class_9665.method_44679();
      class_1210 var54 = new class_1210((String)var14.value(var28), var50, (String)var16.value(var28), (String)var25.value(var28));
      class_3472 var55 = new class_3472(
         new class_3934(var54, var44, var45, var31),
         new class_9706(var34, var35, var36, var37, var38),
         new class_4141(var47, var49, var48, var51),
         new class_2586(var39, var42, var46, var40, var41),
         new class_1505(var52, var53)
      );
      class_5681 var56 = new class_5681("Client Shutdown Thread");
      var56.setUncaughtExceptionHandler(new class_447(field_1));
      Runtime.getRuntime().addShutdownHook(var56);
      new class_8761();

      class_1893 var57;
      try {
         Thread.currentThread().setName("Render thread");
         class_3542.method_16370();
         class_3542.method_16456();
         var57 = new class_1893(var55);
         class_3542.method_16421();
      } catch (class_6815 var70) {
         field_1.warn("Failed to create window: ", var70);
         return;
      } catch (Throwable var71) {
         class_159 var59 = class_159.method_643(var71, "Initializing game");
         var59.method_639("Initialization");
         class_1893.method_8489((class_2435)null, var55.field_17025.field_12806, (class_8881)null, var59);
         class_1893.method_8608(var59);
         return;
      }

      class_2945 var58;
      if (var57.method_8567()) {
         var58 = new class_2945("Game thread", var57);
         var58.start();

         while (var57.method_8570()) {
         }
      } else {
         var58 = null;

         try {
            class_3542.method_16390(false);
            var57.run();
         } catch (Throwable var69) {
            field_1.error("Unhandled game exception", var69);
         }
      }

      try {
         var57.method_8512();
         if (var58 != null) {
            var58.join();
         }
      } catch (InterruptedException var67) {
         field_1.error("Exception during client thread shutdown", var67);
      } finally {
         var57.method_8523();
      }
   }

   private static OptionalInt method_3(Integer var0) {
      return var0 == null ? OptionalInt.empty() : OptionalInt.of(var0);
   }

   @Nullable
   private static <T> T method_2(OptionSet var0, OptionSpec<T> var1) {
      try {
         return (T)var0.valueOf(var1);
      } catch (Throwable var7) {
         if (var1 instanceof ArgumentAcceptingOptionSpec) {
            ArgumentAcceptingOptionSpec var5 = (ArgumentAcceptingOptionSpec)var1;
            List var6 = var5.defaultValues();
            if (!var6.isEmpty()) {
               return (T)var6.get(0);
            }
         }

         throw var7;
      }
   }

   private static boolean method_1(String var0) {
      return var0 != null && !var0.isEmpty();
   }

   static {
      System.setProperty("java.awt.headless", "true");
   }
}
