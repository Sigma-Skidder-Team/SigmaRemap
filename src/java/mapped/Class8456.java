package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import net.minecraft.command.CommandSource;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8456 {
   private static final Logger field36263 = LogManager.getLogger();
   private static final SimpleCommandExceptionType field36264 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType field36265 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.debug.alreadyRunning"));
   private static final FileSystemProvider field36266 = FileSystemProvider.installedProviders()
      .stream()
      .filter(var0 -> var0.getScheme().equalsIgnoreCase("jar"))
      .findFirst()
      .orElse((FileSystemProvider)null);

   public static void method29738(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("debug")
                     .requires(var0x -> var0x.method20129(3)))
                  .then(Class6099.method18839("start").executes(var0x -> method29739((CommandSource)var0x.getSource()))))
               .then(Class6099.method18839("stop").executes(var0x -> method29740((CommandSource)var0x.getSource()))))
            .then(Class6099.method18839("report").executes(var0x -> method29741((CommandSource)var0x.getSource())))
      );
   }

   private static int method29739(CommandSource var0) throws CommandSyntaxException {
      MinecraftServer var3 = var0.method20177();
      if (!var3.method1430()) {
         var3.method1431();
         var0.method20179(new TranslationTextComponent("commands.debug.started", "Started the debug profiler. Type '/debug stop' to stop it."), true);
         return 0;
      } else {
         throw field36265.create();
      }
   }

   private static int method29740(CommandSource var0) throws CommandSyntaxException {
      MinecraftServer var3 = var0.method20177();
      if (var3.method1430()) {
         IProfileResult var4 = var3.method1432();
         File var5 = new File(var3.method1316("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
         var4.method25627(var5);
         float var6 = (float)var4.method25632() / 1.0E9F;
         float var7 = (float)var4.method25633() / var6;
         var0.method20179(
            new TranslationTextComponent("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", var6), var4.method25633(), String.format("%.2f", var7)),
            true
         );
         return MathHelper.floor(var7);
      } else {
         throw field36264.create();
      }
   }

   private static int method29741(CommandSource var0) {
      MinecraftServer var3 = var0.method20177();
      String var4 = "debug-report-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());

      try {
         Path var5 = var3.method1316("debug").toPath();
         Files.createDirectories(var5);
         if (!SharedConstants.developmentMode && field36266 != null) {
            Path var21 = var5.resolve(var4 + ".zip");

            try (FileSystem var7 = field36266.newFileSystem(var21, ImmutableMap.of("create", "true"))) {
               var3.method1422(var7.getPath("/"));
            }
         } else {
            Path var6 = var5.resolve(var4);
            var3.method1422(var6);
         }

         var0.method20179(new TranslationTextComponent("commands.debug.reportSaved", var4), false);
         return 1;
      } catch (IOException var20) {
         field36263.error("Failed to save debug dump", var20);
         var0.method20181(new TranslationTextComponent("commands.debug.reportFailed"));
         return 0;
      }
   }
}
