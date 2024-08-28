package net.minecraft.client.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import joptsimple.*;
import mapped.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import java.util.OptionalInt;

public class Main {
   private static final Logger LOGGER = LogManager.getLogger();

   public static void main(String[] var0) {
      OptionParser var3 = new OptionParser();
      var3.allowsUnrecognizedOptions();
      var3.accepts("demo");
      var3.accepts("disableMultiplayer");
      var3.accepts("disableChat");
      var3.accepts("fullscreen");
      var3.accepts("checkGlErrors");
      ArgumentAcceptingOptionSpec<String> var4 = var3.accepts("server").withRequiredArg();
      ArgumentAcceptingOptionSpec<Integer> var5 = var3.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(25565, new Integer[0]);
      ArgumentAcceptingOptionSpec<File> var6 = var3.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
      ArgumentAcceptingOptionSpec<File> var7 = var3.accepts("assetsDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec<File> var8 = var3.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec<File> var9 = var3.accepts("dataPackDir").withRequiredArg().ofType(File.class);
      ArgumentAcceptingOptionSpec<String> var10 = var3.accepts("proxyHost").withRequiredArg();
      ArgumentAcceptingOptionSpec<Integer> var11 = var3.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
      ArgumentAcceptingOptionSpec<String> var12 = var3.accepts("proxyUser").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var13 = var3.accepts("proxyPass").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var14 = var3.accepts("username").withRequiredArg().defaultsTo("aoASYBBVV_" + Util.milliTime() % 1000L, new String[0]);
      ArgumentAcceptingOptionSpec<String> var15 = var3.accepts("uuid").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var16 = var3.accepts("accessToken").withRequiredArg().required();
      ArgumentAcceptingOptionSpec<String> var17 = var3.accepts("version").withRequiredArg().required();
      ArgumentAcceptingOptionSpec<Integer> var18 = var3.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
      ArgumentAcceptingOptionSpec<Integer> var19 = var3.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
      ArgumentAcceptingOptionSpec<Integer> var20 = var3.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec<Integer> var21 = var3.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
      ArgumentAcceptingOptionSpec<String> var22 = var3.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec<String> var23 = var3.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
      ArgumentAcceptingOptionSpec<String> var24 = var3.accepts("assetIndex").withRequiredArg();
      ArgumentAcceptingOptionSpec<String> var25 = var3.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
      ArgumentAcceptingOptionSpec<String> var26 = var3.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
      NonOptionArgumentSpec<String> var27 = var3.nonOptions();
      OptionSet var28 = var3.parse(var0);
      List<String> var29 = var28.valuesOf(var27);
      if (!var29.isEmpty()) {
         System.out.println("Completely ignored arguments: " + var29);
      }

      String var30 = getOptionValueOrDefault(var28, var10);
      Proxy var31 = Proxy.NO_PROXY;
      if (var30 != null) {
         try {
            var31 = new Proxy(Type.SOCKS, new InetSocketAddress(var30, getOptionValueOrDefault(var28, var11)));
         } catch (Exception var72) {
         }
      }

      String var32 = getOptionValueOrDefault(var28, var12);
      String var33 = getOptionValueOrDefault(var28, var13);
      if (!var31.equals(Proxy.NO_PROXY) && isStrEmptyOrNull(var32) && isStrEmptyOrNull(var33)) {
         Authenticator.setDefault(new Class7014(var32, var33));
      }

      int var34 = getOptionValueOrDefault(var28, var18);
      int var35 = getOptionValueOrDefault(var28, var19);
      OptionalInt var36 = toOptionalInt(getOptionValueOrDefault(var28, var20));
      OptionalInt var37 = toOptionalInt(getOptionValueOrDefault(var28, var21));
      boolean var38 = var28.has("fullscreen");
      boolean var39 = var28.has("demo");
      boolean var40 = var28.has("disableMultiplayer");
      boolean var41 = var28.has("disableChat");
      String var42 = getOptionValueOrDefault(var28, var17);
      Gson var43 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
      PropertyMap var44 = Class8963.<PropertyMap>method32797(var43, getOptionValueOrDefault(var28, var22), PropertyMap.class);
      PropertyMap var45 = Class8963.<PropertyMap>method32797(var43, getOptionValueOrDefault(var28, var23), PropertyMap.class);
      String var46 = getOptionValueOrDefault(var28, var26);
      File var47 = getOptionValueOrDefault(var28, var6);
      File var48 = var28.has(var7) ? getOptionValueOrDefault(var28, var7) : new File(var47, "assets/");
      File var49 = var28.has(var8) ? getOptionValueOrDefault(var28, var8) : new File(var47, "resourcepacks/");
      String var50 = var28.has(var15) ? (String)var15.value(var28) : PlayerEntity.method2961((String)var14.value(var28)).toString();
      String var51 = var28.has(var24) ? (String)var24.value(var28) : null;
      String var52 = getOptionValueOrDefault(var28, var4);
      Integer var53 = getOptionValueOrDefault(var28, var5);
      Class4526.method14414();
      Class7729.method25566();
      Class7729.method25570();
      Util.method38531();
      Class6974 var54 = new Class6974((String)var14.value(var28), var50, (String)var16.value(var28), (String)var25.value(var28));
      Class8051 var55 = new Class8051(
         new Class8227(var54, var44, var45, var31),
         new Class9790(var34, var35, var36, var37, var38),
         new Class8281(var47, var49, var48, var51),
         new Class7745(var39, var42, var46, var40, var41),
         new Class7199(var52, var53)
      );
      Class386 var56 = new Class386("Client Shutdown Thread");
      var56.setUncaughtExceptionHandler(new Class6030(LOGGER));
      Runtime.getRuntime().addShutdownHook(var56);
      new Class9536();

      Minecraft var57;
      try {
         Thread.currentThread().setName("Render thread");
         RenderSystem.method27802();
         RenderSystem.method27934();
         var57 = new Minecraft(var55);
         RenderSystem.method27935();
      } catch (Class2472 var70) {
         LOGGER.warn("Failed to create window: ", var70);
         return;
      } catch (Throwable var71) {
         Class4526 var59 = Class4526.method14413(var71, "Initializing game");
         var59.method14410("Initialization");
         Minecraft.method1522((Class267)null, var55.field34580.field33254, (Class9574)null, var59);
         Minecraft.method1468(var59);
         return;
      }

      Class357 var58;
      if (var57.method1579()) {
         var58 = new Class357("Game thread", var57);
         var58.start();

         while (var57.method1488()) {
         }
      } else {
         var58 = null;

         try {
            RenderSystem.method27805(false);
            var57.run();
         } catch (Throwable var69) {
            LOGGER.error("Unhandled game exception", var69);
         }
      }

      try {
         var57.shutdown();
         if (var58 != null) {
            var58.join();
         }
      } catch (InterruptedException var67) {
         LOGGER.error("Exception during client thread shutdown", var67);
      } finally {
         var57.shutdownMinecraftApplet();
      }
   }

   private static OptionalInt toOptionalInt(Integer var0) {
      return var0 == null ? OptionalInt.empty() : OptionalInt.of(var0);
   }

   @Nullable
   private static <T> T getOptionValueOrDefault(OptionSet optionSet, OptionSpec<T> var1) {
      try {
         return (T)optionSet.valueOf(var1);
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

   private static boolean isStrEmptyOrNull(String input) {
      return input != null && !input.isEmpty();
   }

   // $VF: synthetic method
   public static Logger getLogger() {
      return LOGGER;
   }

   static {
      System.setProperty("java.awt.headless", "true");
   }
}
