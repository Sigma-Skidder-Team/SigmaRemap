package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.PartialResult;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7404 extends class_266 {
   private static final Logger field_37786 = LogManager.getLogger();
   private static final Gson field_37790 = new GsonBuilder().setPrettyPrinting().serializeNulls().disableHtmlEscaping().create();
   private static final ITextComponent field_37788 = new TranslationTextComponent(field_37789[9]);
   private class_9521 field_37791;
   private final BooleanConsumer field_37787;
   private class_1863 field_37785;
   private final class_3676 field_37792;

   public class_7404(BooleanConsumer var1, class_3676 var2) {
      super(new TranslationTextComponent("selectWorld.edit.title"));
      this.field_37787 = var1;
      this.field_37792 = var2;
   }

   @Override
   public void method_5312() {
      this.field_37785.method_8279();
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      class_9521 var3 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 0 + 5, 200, 20, new TranslationTextComponent("selectWorld.edit.resetIcon"), var1 -> {
            FileUtils.deleteQuietly(this.field_37792.method_17060());
            var1.field_36675 = false;
         })
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            this.field_940 / 4 + 24 + 5,
            200,
            20,
            new TranslationTextComponent("selectWorld.edit.openFolder"),
            var1 -> class_9665.method_44667().method_37578(this.field_37792.method_17064(class_263.field_932).toFile())
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 48 + 5, 200, 20, new TranslationTextComponent("selectWorld.edit.backup"), var1 -> {
            boolean var4x = method_33721(this.field_37792);
            this.field_37787.accept(!var4x);
         })
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 4 + 72 + 5, 200, 20, new TranslationTextComponent("selectWorld.edit.backupFolder"), var1 -> {
               class_9663 var4x = this.field_943.method_8591();
               Path var5x = var4x.method_44625();

               try {
                  Files.createDirectories(Files.exists(var5x) ? var5x.toRealPath() : var5x);
               } catch (IOException var7) {
                  throw new RuntimeException(var7);
               }

               class_9665.method_44667().method_37578(var5x.toFile());
            }
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            this.field_940 / 4 + 96 + 5,
            200,
            20,
            new TranslationTextComponent("selectWorld.edit.optimize"),
            var1 -> this.field_943.method_8609(new class_7262(this, (var1x, var2) -> {
                  if (var1x) {
                     method_33721(this.field_37792);
                  }

                  this.field_943.method_8609(class_2387.method_10892(this.field_943, this.field_37787, this.field_943.method_8496(), this.field_37792, var2));
               }, new TranslationTextComponent("optimizeWorld.confirm.title"), new TranslationTextComponent("optimizeWorld.confirm.description"), true))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            this.field_940 / 4 + 120 + 5,
            200,
            20,
            new TranslationTextComponent("selectWorld.edit.export_worldgen_settings"),
            var1 -> {
               class_7522 var4x = class_6322.method_28810();

               DataResult var9;
               try (class_4266 var5x = this.field_943.method_8572(var4x, MinecraftClient::method_8582, MinecraftClient::method_8527, false, this.field_37792)) {
                  class_8876 var7 = class_8876.method_40843(JsonOps.INSTANCE, var4x);
                  DataResult var8 = class_2904.field_14169.encodeStart(var7, var5x.method_19864().method_25703());
                  var9 = var8.flatMap(var1x -> {
                     Path var4xx = this.field_37792.method_17064(class_263.field_932).resolve("worldgen_settings_export.json");

                     try {
                        JsonWriter var5xx = field_37790.newJsonWriter(Files.newBufferedWriter(var4xx, StandardCharsets.UTF_8));
                        Throwable var6 = null;

                        try {
                           field_37790.toJson(var1x, var5xx);
                        } catch (Throwable var16) {
                           var6 = var16;
                           throw var16;
                        } finally {
                           if (var5xx != null) {
                              if (var6 != null) {
                                 try {
                                    var5xx.close();
                                 } catch (Throwable var15) {
                                    var6.addSuppressed(var15);
                                 }
                              } else {
                                 var5xx.close();
                              }
                           }
                        }
                     } catch (IOException | JsonIOException var18) {
                        return DataResult.error("Error writing file: " + var18.getMessage());
                     }

                     return DataResult.success(var4xx.toString());
                  });
               } catch (InterruptedException | ExecutionException var20) {
                  var9 = DataResult.error("Could not parse level data!");
               }

               StringTextComponent var21 = new StringTextComponent((String)var9.get().map(Function.identity(), PartialResult::message));
               TranslationTextComponent var22 = new TranslationTextComponent(
                  var9.result().isPresent() ? "selectWorld.edit.export_worldgen_settings.success" : "selectWorld.edit.export_worldgen_settings.failure"
               );
               var9.error().ifPresent(var0 -> field_37786.error("Error exporting world settings: {}", var0));
               this.field_943.method_8519().method_42329(class_4201.method_19556(this.field_943, class_200.field_664, var22, var21));
            }
         )
      );
      this.field_37791 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 / 4 + 144 + 5, 98, 20, new TranslationTextComponent("selectWorld.edit.save"), var1 -> this.method_33720()
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 2, this.field_940 / 4 + 144 + 5, 98, 20, class_1402.field_7633, var1 -> this.field_37787.accept(false))
      );
      var3.field_36675 = this.field_37792.method_17060().isFile();
      class_460 var4 = this.field_37792.method_17058();
      String var5 = var4 != null ? var4.method_2206() : "";
      this.field_37785 = new class_1863(this.field_948, this.field_941 / 2 - 100, 38, 200, 20, new TranslationTextComponent("selectWorld.enterName"));
      this.field_37785.method_8281(var5);
      this.field_37785.method_8277(var1 -> this.field_37791.field_36675 = !var1.trim().isEmpty());
      this.field_942.add(this.field_37785);
      this.method_41178(this.field_37785);
   }

   @Override
   public void method_1191(MinecraftClient var1, int var2, int var3) {
      String var6 = this.field_37785.method_8246();
      this.method_1164(var1, var2, var3);
      this.field_37785.method_8281(var6);
   }

   @Override
   public void method_1156() {
      this.field_37787.accept(false);
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_33720() {
      try {
         this.field_37792.method_17062(this.field_37785.method_8246().trim());
         this.field_37787.accept(true);
      } catch (IOException var4) {
         field_37786.error("Failed to access world '{}'", this.field_37792.method_17070(), var4);
         class_4201.method_19563(this.field_943, this.field_37792.method_17070());
         this.field_37787.accept(true);
      }
   }

   public static void method_33719(class_9663 var0, String var1) {
      boolean var4 = false;

      try (class_3676 var5 = var0.method_44633(var1)) {
         var4 = true;
         method_33721(var5);
      } catch (IOException var18) {
         if (!var4) {
            class_4201.method_19563(MinecraftClient.method_8510(), var1);
         }

         field_37786.warn("Failed to create backup of level {}", var1, var18);
      }
   }

   public static boolean method_33721(class_3676 var0) {
      long var3 = 0L;
      IOException var5 = null;

      try {
         var3 = var0.method_17071();
      } catch (IOException var8) {
         var5 = var8;
      }

      if (var5 != null) {
         TranslationTextComponent var9 = new TranslationTextComponent("selectWorld.edit.backupFailed");
         StringTextComponent var10 = new StringTextComponent(var5.getMessage());
         MinecraftClient.method_8510().method_8519().method_42329(new class_4201(class_200.field_669, var9, var10));
         return false;
      } else {
         TranslationTextComponent var6 = new TranslationTextComponent("selectWorld.edit.backupCreated", var0.method_17070());
         TranslationTextComponent var7 = new TranslationTextComponent("selectWorld.edit.backupSize", class_9299.method_42815((double)var3 / 1048576.0));
         MinecraftClient.method_8510().method_8519().method_42329(new class_4201(class_200.field_669, var6, var7));
         return true;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 15, 16777215);
      method_9771(var1, this.field_948, field_37788, this.field_941 / 2 - 100, 24, 10526880);
      this.field_37785.method_6767(var1, var2, var3, var4);
      super.method_6767(var1, var2, var3, var4);
   }
}
