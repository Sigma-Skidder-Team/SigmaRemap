package remapped;

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
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4665 {
   private static final Logger field_22751 = LogManager.getLogger();
   private static final SimpleCommandExceptionType field_22752 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.debug.notRunning"));
   private static final SimpleCommandExceptionType field_22754 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.debug.alreadyRunning"));
   private static final FileSystemProvider field_22755 = FileSystemProvider.installedProviders()
      .stream()
      .filter(var0 -> var0.getScheme().equalsIgnoreCase("jar"))
      .findFirst()
      .orElse((FileSystemProvider)null);

   public static void method_21582(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("debug")
                     .requires(var0x -> var0x.method_40314(3)))
                  .then(class_465.method_2231("start").executes(var0x -> method_21580((class_9155)var0x.getSource()))))
               .then(class_465.method_2231("stop").executes(var0x -> method_21579((class_9155)var0x.getSource()))))
            .then(class_465.method_2231("report").executes(var0x -> method_21581((class_9155)var0x.getSource())))
      );
   }

   private static int method_21580(class_9155 var0) throws CommandSyntaxException {
      class_341 var3 = var0.method_42177();
      if (!var3.method_1617()) {
         var3.method_1729();
         var0.method_42196(new TranslationTextComponent("commands.debug.started", "Started the debug profiler. Type '/debug stop' to stop it."), true);
         return 0;
      } else {
         throw field_22754.create();
      }
   }

   private static int method_21579(class_9155 var0) throws CommandSyntaxException {
      class_341 var3 = var0.method_42177();
      if (var3.method_1617()) {
         class_2578 var4 = var3.method_1663();
         File var5 = new File(var3.method_1687("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
         var4.method_11740(var5);
         float var6 = (float)var4.method_11736() / 1.0E9F;
         float var7 = (float)var4.method_11741() / var6;
         var0.method_42196(
            new TranslationTextComponent("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", var6), var4.method_11741(), String.format("%.2f", var7)),
            true
         );
         return MathHelper.floor(var7);
      } else {
         throw field_22752.create();
      }
   }

   private static int method_21581(class_9155 var0) {
      class_341 var3 = var0.method_42177();
      String var4 = "debug-report-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());

      try {
         Path var5 = var3.method_1687("debug").toPath();
         Files.createDirectories(var5);
         if (!class_7665.field_38958 && field_22755 != null) {
            Path var21 = var5.resolve(var4 + ".zip");

            try (FileSystem var7 = field_22755.newFileSystem(var21, ImmutableMap.of("create", "true"))) {
               var3.method_1623(var7.getPath("/"));
            }
         } else {
            Path var6 = var5.resolve(var4);
            var3.method_1623(var6);
         }

         var0.method_42196(new TranslationTextComponent("commands.debug.reportSaved", var4), false);
         return 1;
      } catch (IOException var20) {
         field_22751.error("Failed to save debug dump", var20);
         var0.method_42175(new TranslationTextComponent("commands.debug.reportFailed"));
         return 0;
      }
   }
}
