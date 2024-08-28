package mapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Lifecycle;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.net.Proxy;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BooleanSupplier;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpecBuilder;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8958 {
   private static final Logger field40474 = LogManager.getLogger();

   public static void main(String[] var0) {
      OptionParser var3 = new OptionParser();
      OptionSpecBuilder var4 = var3.accepts("nogui");
      OptionSpecBuilder var5 = var3.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
      OptionSpecBuilder var6 = var3.accepts("demo");
      OptionSpecBuilder var7 = var3.accepts("bonusChest");
      OptionSpecBuilder var8 = var3.accepts("forceUpgrade");
      OptionSpecBuilder var9 = var3.accepts("eraseCache");
      OptionSpecBuilder var10 = var3.accepts("safeMode", "Loads level with vanilla datapack only");
      AbstractOptionSpec var11 = var3.accepts("help").forHelp();
      ArgumentAcceptingOptionSpec var12 = var3.accepts("singleplayer").withRequiredArg();
      ArgumentAcceptingOptionSpec var13 = var3.accepts("universe").withRequiredArg().defaultsTo(".", new String[0]);
      ArgumentAcceptingOptionSpec var14 = var3.accepts("world").withRequiredArg();
      ArgumentAcceptingOptionSpec var15 = var3.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(-1, new Integer[0]);
      ArgumentAcceptingOptionSpec var16 = var3.accepts("serverId").withRequiredArg();
      NonOptionArgumentSpec var17 = var3.nonOptions();

      try {
         OptionSet var18 = var3.parse(var0);
         if (var18.has(var11)) {
            var3.printHelpOn(System.err);
            return;
         }

         Class4526.method14414();
         Class7729.method25566();
         Class7729.method25570();
         Util.method38531();
         Class8905 var19 = Class8904.method32457();
         Path var20 = Paths.get("server.properties");
         Class6816 var21 = new Class6816(var19, var20);
         var21.method20780();
         Path var22 = Paths.get("eula.txt");
         Class7036 var23 = new Class7036(var22);
         if (var18.has(var5)) {
            field40474.info("Initialized '{}' and '{}'", var20.toAbsolutePath(), var22.toAbsolutePath());
            return;
         }

         if (!var23.method21845()) {
            field40474.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File var24 = new File((String)var18.valueOf(var13));
         YggdrasilAuthenticationService var25 = new YggdrasilAuthenticationService(Proxy.NO_PROXY);
         MinecraftSessionService var26 = var25.createMinecraftSessionService();
         GameProfileRepository var27 = var25.createProfileRepository();
         Class8805 var28 = new Class8805(var27, new File(var24, Class314.field1209.getName()));
         String var29 = (String)Optional.<Object>ofNullable(var18.valueOf(var14)).orElse(var21.method20779().field43798);
         Class9774 var30 = Class9774.method38455(var24.toPath());
         Class1814 var31 = var30.method38468(var29);
         Class314.method1278(var31);
         Class7818 var32 = var31.method7999();
         boolean var33 = var18.has(var10);
         if (var33) {
            field40474.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         Class313 var34 = new Class313(new Class7650(), new Class7652(var31.method7991(Class5137.field23352).toFile(), Class7725.field33172));
         Class7818 var35 = Class314.method1399(var34, var32 == null ? Class7818.field33531 : var32, var33);
         CompletableFuture var36 = Class1701.method7338(
            var34.method1273(), Class2085.field13576, var21.method20779().field43817, Util.method38492(), Runnable::run
         );

         Class1701 var37;
         try {
            var37 = (Class1701)var36.get();
         } catch (Exception var43) {
            field40474.warn(
               "Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var43
            );
            var34.close();
            return;
         }

         var37.method7339();
         Class6711 var38 = Class6711.method20471(Class8063.field34602, var37.method7337(), var19);
         Class6611 var39 = var31.method7998(var38, var35);
         if (var39 == null) {
            Class8898 var40;
            Class7846 var41;
            if (var18.has(var6)) {
               var40 = Class314.field1210;
               var41 = Class7846.method26256(var19);
            } else {
               Class9437 var42 = var21.method20779();
               var40 = new Class8898(var42.field43798, var42.field43797, var42.field43809, var42.field43796, false, new Class5462(), var35);
               var41 = var18.has(var7) ? var42.field43833.method26270() : var42.field43833;
            }

            var39 = new Class6610(var40, var41, Lifecycle.stable());
         }

         if (var18.has(var8)) {
            method32728(var31, Class4497.method14181(), var18.has(var9), () -> true, ((Class6611)var39).method20087().method26266());
         }

         var31.method8000(var19, (Class6611)var39);
         Class6611 var45 = var39;
         Class1645 var46 = Class314.<Class1645>method1275(var16x -> {
            Class1645 var19x = new Class1645(var16x, var19, var31, var34, var37, var45, var21, Class4497.method14181(), var26, var27, var28, Class7244::new);
            var19x.method1333((String)var18.valueOf(var12));
            var19x.method1331((Integer)var18.valueOf(var15));
            var19x.method1343(var18.has(var6));
            var19x.method1314((String)var18.valueOf(var16));
            boolean var20x = !var18.has(var4) && !var18.valuesOf(var17).contains("nogui");
            if (var20x && !GraphicsEnvironment.isHeadless()) {
               var19x.method6504();
            }

            return var19x;
         });
         Class374 var47 = new Class374("Server Shutdown Thread", var46);
         var47.setUncaughtExceptionHandler(new Class6030(field40474));
         Runtime.getRuntime().addShutdownHook(var47);
      } catch (Exception var44) {
         field40474.fatal("Failed to start the minecraft server", var44);
      }
   }

   private static void method32728(Class1814 var0, DataFixer var1, boolean var2, BooleanSupplier var3, ImmutableSet<Class8705<Class1655>> var4) {
      field40474.info("Forcing world upgrade!");
      Class7958 var7 = new Class7958(var0, var1, var4, var2);
      ITextComponent var8 = null;

      while (!var7.method27062()) {
         ITextComponent var9 = var7.method27069();
         if (var8 != var9) {
            var8 = var9;
            field40474.info(var7.method27069().getString());
         }

         int var10 = var7.method27066();
         if (var10 > 0) {
            int var11 = var7.method27067() + var7.method27068();
            field40474.info("{}% completed ({} / {} chunks)...", Class9679.method37767((float)var11 / (float)var10 * 100.0F), var11, var10);
         }

         if (!var3.getAsBoolean()) {
            var7.method27059();
         } else {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var12) {
            }
         }
      }
   }
}
