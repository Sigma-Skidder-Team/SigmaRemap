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
import net.minecraft.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.server.management.PlayerProfileCache;
import net.minecraft.util.DefaultUncaughtExceptionHandler;
import net.minecraft.util.WorldOptimizer;
import net.minecraft.util.datafix.codec.DatapackCodec;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.chunk.listener.LoggingChunkStatusListener;
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

         CrashReport.method14414();
         Bootstrap.method25566();
         Bootstrap.method25570();
         Util.method38531();
         DynamicRegistriesImpl var19 = DynamicRegistries.func_239770_b_();
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
         PlayerProfileCache var28 = new PlayerProfileCache(var27, new File(var24, MinecraftServer.USER_CACHE_FILE.getName()));
         String var29 = (String)Optional.<Object>ofNullable(var18.valueOf(var14)).orElse(var21.getProperties().field43798);
         SaveFormat var30 = SaveFormat.method38455(var24.toPath());
         SaveFormat.LevelSave var31 = var30.getLevelSave(var29);
         MinecraftServer.func_240777_a_(var31);
         DatapackCodec var32 = var31.readDatapackCodec();
         boolean var33 = var18.has(var10);
         if (var33) {
            field40474.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         ResourcePackList var34 = new ResourcePackList(new ServerPackFinder(), new FolderPackFinder(var31.resolveFilePath(FolderName.DATAPACKS).toFile(), IPackNameDecorator.WORLD));
         DatapackCodec var35 = MinecraftServer.func_240772_a_(var34, var32 == null ? DatapackCodec.VANILLA_CODEC : var32, var33);
         CompletableFuture var36 = DataPackRegistries.func_240961_a_(
            var34.func_232623_f_(), Commands.DEDICATED, var21.getProperties().field43817, Util.getServerExecutor(), Runnable::run
         );

         DataPackRegistries var37;
         try {
            var37 = (DataPackRegistries)var36.get();
         } catch (Exception var43) {
            field40474.warn(
               "Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var43
            );
            var34.close();
            return;
         }

         var37.updateTags();
         WorldSettingsImport var38 = WorldSettingsImport.create(NBTDynamicOps.INSTANCE, var37.getResourceManager(), var19);
         IServerConfiguration var39 = var31.readServerConfiguration(var38, var35);
         if (var39 == null) {
            WorldSettings var40;
            DimensionGeneratorSettings var41;
            if (var18.has(var6)) {
               var40 = MinecraftServer.field1210;
               var41 = DimensionGeneratorSettings.method26256(var19);
            } else {
               ServerProperties var42 = var21.getProperties();
               var40 = new WorldSettings(var42.field43798, var42.gamemode, var42.field43809, var42.field43796, false, new GameRules(), var35);
               var41 = var18.has(var7) ? var42.field43833.method26270() : var42.field43833;
            }

            var39 = new ServerWorldInfo(var40, var41, Lifecycle.stable());
         }

         if (var18.has(var8)) {
            method32728(var31, DataFixesManager.getDataFixer(), var18.has(var9), () -> true, ((IServerConfiguration)var39).getDimensionGeneratorSettings().method26266());
         }

         var31.saveLevel(var19, (IServerConfiguration)var39);
         IServerConfiguration var45 = var39;
         DedicatedServer var46 = MinecraftServer.<DedicatedServer>func_240784_a_(var16x -> {
            DedicatedServer var19x = new DedicatedServer(var16x, var19, var31, var34, var37, var45, var21, DataFixesManager.getDataFixer(), var26, var27, var28, LoggingChunkStatusListener::new);
            var19x.setServerOwner((String)var18.valueOf(var12));
            var19x.setServerPort((Integer)var18.valueOf(var15));
            var19x.setDemo(var18.has(var6));
            var19x.method1314((String)var18.valueOf(var16));
            boolean var20x = !var18.has(var4) && !var18.valuesOf(var17).contains("nogui");
            if (var20x && !GraphicsEnvironment.isHeadless()) {
               var19x.method6504();
            }

            return var19x;
         });
         Class374 var47 = new Class374("Server Shutdown Thread", var46);
         var47.setUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler(field40474));
         Runtime.getRuntime().addShutdownHook(var47);
      } catch (Exception var44) {
         field40474.fatal("Failed to start the minecraft server", var44);
      }
   }

   private static void method32728(SaveFormat.LevelSave var0, DataFixer var1, boolean var2, BooleanSupplier var3, ImmutableSet<RegistryKey<World>> var4) {
      field40474.info("Forcing world upgrade!");
      WorldOptimizer var7 = new WorldOptimizer(var0, var1, var4, var2);
      ITextComponent var8 = null;

      while (!var7.isFinished()) {
         ITextComponent var9 = var7.getStatusText();
         if (var8 != var9) {
            var8 = var9;
            field40474.info(var7.getStatusText().getString());
         }

         int var10 = var7.getTotalChunks();
         if (var10 > 0) {
            int var11 = var7.getConverted() + var7.getSkipped();
            field40474.info("{}% completed ({} / {} chunks)...", MathHelper.floor((float)var11 / (float)var10 * 100.0F), var11, var10);
         }

         if (!var3.getAsBoolean()) {
            var7.cancel();
         } else {

         }
      }
   }
}
