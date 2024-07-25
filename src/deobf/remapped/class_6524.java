package remapped;

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

public class class_6524 {
   private static final Logger field_33208 = LogManager.getLogger();

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

         class_159.method_634();
         class_2557.method_11618();
         class_2557.method_11617();
         Util.method_44679();
         class_7522 var19 = class_6322.method_28810();
         Path var20 = Paths.get("server.properties");
         class_991 var21 = new class_991(var19, var20);
         var21.method_4318();
         Path var22 = Paths.get("eula.txt");
         class_1311 var23 = new class_1311(var22);
         if (var18.has(var5)) {
            field_33208.info("Initialized '{}' and '{}'", var20.toAbsolutePath(), var22.toAbsolutePath());
            return;
         }

         if (!var23.method_5974()) {
            field_33208.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File var24 = new File((String)var18.valueOf(var13));
         YggdrasilAuthenticationService var25 = new YggdrasilAuthenticationService(Proxy.NO_PROXY);
         MinecraftSessionService var26 = var25.createMinecraftSessionService();
         GameProfileRepository var27 = var25.createProfileRepository();
         class_5969 var28 = new class_5969(var27, new File(var24, class_341.field_1312.getName()));
         String var29 = (String)Optional.<Object>ofNullable(var18.valueOf(var14)).orElse(var21.method_4319().field_50129);
         class_9663 var30 = class_9663.method_44628(var24.toPath());
         class_3676 var31 = var30.method_44633(var29);
         class_341.method_1666(var31);
         class_2805 var32 = var31.method_17073();
         boolean var33 = var18.has(var10);
         if (var33) {
            field_33208.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         class_6354 var34 = new class_6354(new class_2362(), new class_8936(var31.method_17064(class_263.field_924).toFile(), class_2541.field_12594));
         class_2805 var35 = class_341.method_1673(var34, var32 == null ? class_2805.field_13766 : var32, var33);
         CompletableFuture var36 = class_6298.method_28747(
            var34.method_29115(), class_9019.field_46139, var21.method_4319().field_50086, Util.getMainWorkerExecutor(), Runnable::run
         );

         class_6298 var37;
         try {
            var37 = (class_6298)var36.get();
         } catch (Exception var43) {
            field_33208.warn(
               "Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var43
            );
            var34.close();
            return;
         }

         var37.method_28748();
         class_888 var38 = class_888.method_3825(class_3504.field_17178, var37.method_28743(), var19);
         Object var39 = var31.method_17072(var38, var35);
         if (var39 == null) {
            class_6292 var40;
            class_2904 var41;
            if (var18.has(var6)) {
               var40 = class_341.field_1290;
               var41 = class_2904.method_13303(var19);
            } else {
               class_9882 var42 = var21.method_4319();
               var40 = new class_6292(var42.field_50129, var42.field_50117, var42.field_50096, var42.field_50123, false, new GameRules(), var35);
               var41 = var18.has(var7) ? var42.field_50122.method_13285() : var42.field_50122;
            }

            var39 = new class_5056(var40, var41, Lifecycle.stable());
         }

         if (var18.has(var8)) {
            method_29709(var31, class_148.method_580(), var18.has(var9), () -> true, ((class_5684)var39).method_25703().method_13297());
         }

         var31.method_17065(var19, (class_5684)var39);
         Object var45 = var39;
         class_4497 var46 = class_341.<class_4497>method_1648(var16x -> {
            class_4497 var19x = new class_4497(var16x, var19, var31, var34, var37, var45, var21, class_148.method_580(), var26, var27, var28, class_2925::new);
            var19x.method_1757((String)var18.valueOf(var12));
            var19x.method_1723((Integer)var18.valueOf(var15));
            var19x.method_1751(var18.has(var6));
            var19x.method_1745((String)var18.valueOf(var16));
            boolean var20x = !var18.has(var4) && !var18.valuesOf(var17).contains("nogui");
            if (var20x && !GraphicsEnvironment.isHeadless()) {
               var19x.method_20897();
            }

            return var19x;
         });
         class_9087 var47 = new class_9087("Server Shutdown Thread", var46);
         var47.setUncaughtExceptionHandler(new class_447(field_33208));
         Runtime.getRuntime().addShutdownHook(var47);
      } catch (Exception var44) {
         field_33208.fatal("Failed to start the minecraft server", var44);
      }
   }

   private static void method_29709(class_3676 var0, DataFixer var1, boolean var2, BooleanSupplier var3, ImmutableSet<class_5621<World>> var4) {
      field_33208.info("Forcing world upgrade!");
      class_3160 var7 = new class_3160(var0, var1, var4, var2);
      ITextComponent var8 = null;

      while (!var7.method_14582()) {
         ITextComponent var9 = var7.method_14581();
         if (var8 != var9) {
            var8 = var9;
            field_33208.info(var7.method_14581().getString());
         }

         int var10 = var7.method_14576();
         if (var10 > 0) {
            int var11 = var7.method_14580() + var7.method_14574();
            field_33208.info("{}% completed ({} / {} chunks)...", MathHelper.floor((float)var11 / (float)var10 * 100.0F), var11, var10);
         }

         if (!var3.getAsBoolean()) {
            var7.method_14575();
         } else {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var12) {
            }
         }
      }
   }
}
