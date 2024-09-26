package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DataResult.PartialResult;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

public class EditWorldScreen extends Screen {
   private static final Logger field7029 = LogManager.getLogger();
   private static final Gson field7030 = new GsonBuilder().setPrettyPrinting().serializeNulls().disableHtmlEscaping().create();
   private static final ITextComponent field7031 = new TranslationTextComponent("selectWorld.enterName");
   private Button field7032;
   private final BooleanConsumer field7033;
   private TextFieldWidget field7034;
   private final SaveFormat.LevelSave field7035;

   public EditWorldScreen(BooleanConsumer var1, SaveFormat.LevelSave var2) {
      super(new TranslationTextComponent("selectWorld.edit.title"));
      this.field7033 = var1;
      this.field7035 = var2;
   }

   @Override
   public void tick() {
      this.field7034.method5633();
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      Button var3 = this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height / 4 + 0 + 5, 200, 20, new TranslationTextComponent("selectWorld.edit.resetIcon"), var1 -> {
            FileUtils.deleteQuietly(this.field7035.method8002());
            var1.active = false;
         })
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            this.height / 4 + 24 + 5,
            200,
            20,
            new TranslationTextComponent("selectWorld.edit.openFolder"),
            var1 -> Util.getOSType().openFile(this.field7035.resolveFilePath(FolderName.field23354).toFile())
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height / 4 + 48 + 5, 200, 20, new TranslationTextComponent("selectWorld.edit.backup"), var1 -> {
            boolean var4x = method6323(this.field7035);
            this.field7033.accept(!var4x);
         })
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height / 4 + 72 + 5, 200, 20, new TranslationTextComponent("selectWorld.edit.backupFolder"), var1 -> {
            SaveFormat var4x = this.mc.getSaveLoader();
            Path var5x = var4x.method38467();

            try {
               Files.createDirectories(Files.exists(var5x) ? var5x.toRealPath() : var5x);
            } catch (IOException var7) {
               throw new RuntimeException(var7);
            }

            Util.getOSType().openFile(var5x.toFile());
         })
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            this.height / 4 + 96 + 5,
            200,
            20,
            new TranslationTextComponent("selectWorld.edit.optimize"),
            var1 -> this.mc.displayGuiScreen(new ConfirmBackupScreen(this, (var1x, var2) -> {
                  if (var1x) {
                     method6323(this.field7035);
                  }

                  this.mc.displayGuiScreen(Class837.method2560(this.mc, this.field7033, this.mc.getDataFixer(), this.field7035, var2));
               }, new TranslationTextComponent("optimizeWorld.confirm.title"), new TranslationTextComponent("optimizeWorld.confirm.description"), true))
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 100,
            this.height / 4 + 120 + 5,
            200,
            20,
            new TranslationTextComponent("selectWorld.edit.export_worldgen_settings"),
            var1 -> {
               DynamicRegistriesImpl var4x = DynamicRegistries.func_239770_b_();

               DataResult<String> var9;
               try (Minecraft.PackManager var5x = this.mc.reloadDatapacks(var4x, Minecraft::loadDataPackCodec, Minecraft::loadWorld, false, this.field7035)) {
                  WorldGenSettingsExport<JsonElement> var7 = WorldGenSettingsExport.create(JsonOps.INSTANCE, var4x);
                  DataResult<JsonElement> var8 = DimensionGeneratorSettings.field_236201_a_.encodeStart(var7, var5x.getServerConfiguration().getDimensionGeneratorSettings());
                  var9 = var8.flatMap(var1x -> {
                     Path var4xx = this.field7035.resolveFilePath(FolderName.field23354).resolve("worldgen_settings_export.json");

                     try {
                        JsonWriter var5xx = field7030.newJsonWriter(Files.newBufferedWriter(var4xx, StandardCharsets.UTF_8));
                        Throwable var6 = null;

                        try {
                           field7030.toJson(var1x, var5xx);
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

               StringTextComponent var21 = new StringTextComponent(var9.get().map(Function.identity(), PartialResult::message));
               TranslationTextComponent var22 = new TranslationTextComponent(
                  var9.result().isPresent() ? "selectWorld.edit.export_worldgen_settings.success" : "selectWorld.edit.export_worldgen_settings.failure"
               );
               var9.error().ifPresent(var0 -> field7029.error("Error exporting world settings: {}", var0));
               this.mc.getToastGui().method5914(SystemToast.method24902(this.mc, SystemToast.Type.field11198, var22, var21));
            }
         )
      );
      this.field7032 = this.<Button>addButton(
         new Button(
            this.width / 2 - 100, this.height / 4 + 144 + 5, 98, 20, new TranslationTextComponent("selectWorld.edit.save"), var1 -> this.method6321()
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 2, this.height / 4 + 144 + 5, 98, 20, DialogTexts.GUI_CANCEL, var1 -> this.field7033.accept(false))
      );
      var3.active = this.field7035.method8002().isFile();
      Class2024 var4 = this.field7035.method7997();
      String var5 = var4 != null ? var4.method8644() : "";
      this.field7034 = new TextFieldWidget(this.fontRenderer, this.width / 2 - 100, 38, 200, 20, new TranslationTextComponent("selectWorld.enterName"));
      this.field7034.method5635(var5);
      this.field7034.method5631(var1 -> this.field7032.active = !var1.trim().isEmpty());
      this.children.add(this.field7034);
      this.setFocusedDefault(this.field7034);
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field7034.getText();
      this.init(var1, var2, var3);
      this.field7034.method5635(var6);
   }

   @Override
   public void method1945() {
      this.field7033.accept(false);
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   private void method6321() {
      try {
         this.field7035.method8004(this.field7034.getText().trim());
         this.field7033.accept(true);
      } catch (IOException var4) {
         field7029.error("Failed to access world '{}'", this.field7035.method7990(), var4);
         SystemToast.func_238535_a_(this.mc, this.field7035.method7990());
         this.field7033.accept(true);
      }
   }

   public static void func_241651_a_(SaveFormat var0, String var1) {
      boolean var4 = false;

      try (SaveFormat.LevelSave var5 = var0.getLevelSave(var1)) {
         var4 = true;
         method6323(var5);
      } catch (IOException var18) {
         if (!var4) {
            SystemToast.func_238535_a_(Minecraft.getInstance(), var1);
         }

         field7029.warn("Failed to create backup of level {}", var1, var18);
      }
   }

   public static boolean method6323(SaveFormat.LevelSave var0) {
      long var3 = 0L;
      IOException var5 = null;

      try {
         var3 = var0.method8005();
      } catch (IOException var8) {
         var5 = var8;
      }

      if (var5 != null) {
         TranslationTextComponent var9 = new TranslationTextComponent("selectWorld.edit.backupFailed");
         StringTextComponent var10 = new StringTextComponent(var5.getMessage());
         Minecraft.getInstance().getToastGui().method5914(new SystemToast(SystemToast.Type.field11197, var9, var10));
         return false;
      } else {
         TranslationTextComponent var6 = new TranslationTextComponent("selectWorld.edit.backupCreated", var0.method7990());
         TranslationTextComponent var7 = new TranslationTextComponent("selectWorld.edit.backupSize", MathHelper.method37774((double)var3 / 1048576.0));
         Minecraft.getInstance().getToastGui().method5914(new SystemToast(SystemToast.Type.field11197, var6, var7));
         return true;
      }
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 15, 16777215);
      method5693(var1, this.fontRenderer, field7031, this.width / 2 - 100, 24, 10526880);
      this.field7034.render(var1, var2, var3, var4);
      super.render(var1, var2, var3, var4);
   }
}
