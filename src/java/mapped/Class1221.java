package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Class1221 implements IScreen, Class1190 {
   private static final Logger field6549 = LogManager.getLogger();
   private static final ITextComponent field6550 = new TranslationTextComponent("generator.custom");
   private static final ITextComponent field6551 = new TranslationTextComponent("generator.amplified.info");
   private static final ITextComponent field6552 = new TranslationTextComponent("selectWorld.mapFeatures.info");
   private Class5991 field6553 = Class5991.field26162;
   private FontRenderer field6554;
   private int field6555;
   private TextFieldWidget field6556;
   private Button field6557;
   public Button field6558;
   private Button field6559;
   private Button field6560;
   private Button field6561;
   private DynamicRegistriesImpl field6562;
   private DimensionGeneratorSettings field6563;
   private Optional<Class5970> field6564;
   private OptionalLong field6565;

   public Class1221(DynamicRegistriesImpl var1, DimensionGeneratorSettings var2, Optional<Class5970> var3, OptionalLong var4) {
      this.field6562 = var1;
      this.field6563 = var2;
      this.field6564 = var3;
      this.field6565 = var4;
   }

   public void method5780(Class1335 var1, Minecraft var2, FontRenderer var3) {
      this.field6554 = var3;
      this.field6555 = var1.width;
      this.field6556 = new TextFieldWidget(this.field6554, this.field6555 / 2 - 100, 60, 200, 20, new TranslationTextComponent("selectWorld.enterSeed"));
      this.field6556.method5635(method5783(this.field6565));
      this.field6556.method5631(var1x -> this.field6565 = this.method5786());
      var1.<TextFieldWidget>addListener(this.field6556);
      int var6 = this.field6555 / 2 - 155;
      int var7 = this.field6555 / 2 + 5;
      this.field6557 = var1.<Button>addButton(new Class1239(this, var6, 100, 150, 20, new TranslationTextComponent("selectWorld.mapFeatures"), var1x -> {
         this.field6563 = this.field6563.method26271();
         var1x.method5744(250);
      }));
      this.field6557.field6483 = false;
      this.field6559 = var1.<Button>addButton(new Class1227(this, var7, 100, 150, 20, new TranslationTextComponent("selectWorld.mapType"), var2x -> {
         while (this.field6564.isPresent()) {
            int var5 = Class5970.field26033.indexOf(this.field6564.get()) + 1;
            if (var5 >= Class5970.field26033.size()) {
               var5 = 0;
            }

            Class5970 var6x = Class5970.field26033.get(var5);
            this.field6564 = Optional.<Class5970>of(var6x);
            this.field6563 = var6x.method18506(this.field6562, this.field6563.method26259(), this.field6563.method26260(), this.field6563.method26261());
            if (!this.field6563.method26267() || Screen.method2476()) {
               break;
            }
         }

         var1.method6359();
         var2x.method5744(250);
      }));
      this.field6559.field6483 = false;
      this.field6559.active = this.field6564.isPresent();
      this.field6560 = var1.<Button>addButton(new Button(var7, 120, 150, 20, new TranslationTextComponent("selectWorld.customizeType"), var3x -> {
         Class7837 var6x = Class5970.field26034.get(this.field6564);
         if (var6x != null) {
            var2.displayGuiScreen(var6x.method26250(var1, this.field6563));
         }
      }));
      this.field6560.field6483 = false;
      this.field6558 = var1.<Button>addButton(new Class1208(this, var6, 151, 150, 20, new TranslationTextComponent("selectWorld.bonusItems"), var1x -> {
         this.field6563 = this.field6563.method26272();
         var1x.method5744(250);
      }, var1));
      this.field6558.field6483 = false;
      this.field6561 = var1.<Button>addButton(
         new Button(
            var6,
            185,
            150,
            20,
            new TranslationTextComponent("selectWorld.import_worldgen_settings"),
            var3x -> {
               TranslationTextComponent var6x = new TranslationTextComponent("selectWorld.import_worldgen_settings.select_file");
               String var7x = TinyFileDialogs.tinyfd_openFileDialog(var6x.getString(), (CharSequence)null, (PointerBuffer)null, (CharSequence)null, false);
               if (var7x != null) {
                  DynamicRegistriesImpl var8 = DynamicRegistries.func_239770_b_();
                  ResourcePackList var9 = new ResourcePackList(new ServerPackFinder(), new FolderPackFinder(var1.method6363().toFile(), IPackNameDecorator.WORLD));

                  DataPackRegistries var11;
                  try {
                     MinecraftServer.func_240772_a_(var9, var1.field7077, false);
                     CompletableFuture var10 = DataPackRegistries.func_240961_a_(var9.func_232623_f_(), Commands.INTEGRATED, 2, Util.getServerExecutor(), var2);
                     var2.driveUntil(var10::isDone);
                     var11 = (DataPackRegistries)var10.get();
                  } catch (InterruptedException | ExecutionException var27) {
                     field6549.error("Error loading data packs when importing world settings", var27);
                     TranslationTextComponent var12 = new TranslationTextComponent("selectWorld.import_worldgen_settings.failure");
                     StringTextComponent var13 = new StringTextComponent(var27.getMessage());
                     var2.getToastGui().method5914(SystemToast.method24902(var2, SystemToast.Type.field11198, var12, var13));
                     var9.close();
                     return;
                  }

                  WorldSettingsImport<JsonElement> var30 = WorldSettingsImport.create(JsonOps.INSTANCE, var11.getResourceManager(), var8);
                  JsonParser var31 = new JsonParser();

                  DataResult<DimensionGeneratorSettings> var32;
                  try (BufferedReader var14 = Files.newBufferedReader(Paths.get(var7x))) {
                     JsonElement var16 = var31.parse(var14);
                     var32 = DimensionGeneratorSettings.field_236201_a_.parse(var30, var16);
                  } catch (JsonSyntaxException | IOException | JsonIOException var29) {
                     var32 = DataResult.error("Failed to parse file: " + var29.getMessage());
                  }

                  if (var32.error().isPresent()) {
                     TranslationTextComponent var33 = new TranslationTextComponent("selectWorld.import_worldgen_settings.failure");
                     String var35 = var32.error().get().message();
                     field6549.error("Error parsing world settings: {}", var35);
                     StringTextComponent var36 = new StringTextComponent(var35);
                     var2.getToastGui().method5914(SystemToast.method24902(var2, SystemToast.Type.field11198, var33, var36));
                  }

                  var11.close();
                  Lifecycle var34 = var32.lifecycle();
                  var32.resultOrPartial(field6549::error)
                     .ifPresent(
                        var5 -> {
                           BooleanConsumer var8x = var5x -> {
                              var2.displayGuiScreen(var1);
                              if (var5x) {
                                 this.method5781(var8, var5);
                              }
                           };
                           if (var34 != Lifecycle.stable()) {
                              if (var34 != Lifecycle.experimental()) {
                                 var2.displayGuiScreen(
                                    new ConfirmScreen(
                                       var8x,
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.deprecated.title"),
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.deprecated.question")
                                    )
                                 );
                              } else {
                                 var2.displayGuiScreen(
                                    new ConfirmScreen(
                                       var8x,
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.experimental.title"),
                                       new TranslationTextComponent("selectWorld.import_worldgen_settings.experimental.question")
                                    )
                                 );
                              }
                           } else {
                              this.method5781(var8, var5);
                           }
                        }
                     );
               }
            }
         )
      );
      this.field6561.field6483 = false;
      this.field6553 = Class5991.method18584(var3, field6551, this.field6559.method5740());
   }

   private void method5781(DynamicRegistriesImpl var1, DimensionGeneratorSettings var2) {
      this.field6562 = var1;
      this.field6563 = var2;
      this.field6564 = Class5970.method18504(var2);
      this.field6565 = OptionalLong.of(var2.method26259());
      this.field6556.method5635(method5783(this.field6565));
      this.field6559.active = this.field6564.isPresent();
   }

   @Override
   public void tick() {
      this.field6556.method5633();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (this.field6557.field6483) {
         this.field6554.method38803(var1, field6552, (float)(this.field6555 / 2 - 150), 122.0F, -6250336);
      }

      this.field6556.render(var1, var2, var3, var4);
      if (this.field6564.equals(Optional.<Class5970>of(Class5970.field26028))) {
         this.field6553.method18590(var1, this.field6559.field6477 + 2, this.field6559.field6478 + 22, 9, 10526880);
      }
   }

   public void method5782(DimensionGeneratorSettings var1) {
      this.field6563 = var1;
   }

   private static String method5783(OptionalLong var0) {
      return !var0.isPresent() ? "" : Long.toString(var0.getAsLong());
   }

   private static OptionalLong method5784(String var0) {
      try {
         return OptionalLong.of(Long.parseLong(var0));
      } catch (NumberFormatException var4) {
         return OptionalLong.empty();
      }
   }

   public DimensionGeneratorSettings method5785(boolean var1) {
      OptionalLong var4 = this.method5786();
      return this.field6563.method26274(var1, var4);
   }

   private OptionalLong method5786() {
      String var3 = this.field6556.getText();
      OptionalLong var5;
      if (!StringUtils.isEmpty(var3)) {
         OptionalLong var4 = method5784(var3);
         if (var4.isPresent() && var4.getAsLong() != 0L) {
            var5 = var4;
         } else {
            var5 = OptionalLong.of((long)var3.hashCode());
         }
      } else {
         var5 = OptionalLong.empty();
      }

      return var5;
   }

   public boolean method5787() {
      return this.field6563.method26267();
   }

   public void method5788(boolean var1) {
      this.field6559.field6483 = var1;
      if (!this.field6563.method26267()) {
         this.field6557.field6483 = var1;
         this.field6558.field6483 = var1;
         this.field6560.field6483 = var1 && Class5970.field26034.containsKey(this.field6564);
         this.field6561.field6483 = var1;
      } else {
         this.field6557.field6483 = false;
         this.field6558.field6483 = false;
         this.field6560.field6483 = false;
         this.field6561.field6483 = false;
      }

      this.field6556.method5671(var1);
   }

   public DynamicRegistriesImpl method5789() {
      return this.field6562;
   }

   public void method5790(DataPackRegistries var1) {
      DynamicRegistriesImpl var4 = DynamicRegistries.func_239770_b_();
      WorldGenSettingsExport<JsonElement> var5 = WorldGenSettingsExport.create(JsonOps.INSTANCE, this.field6562);
      WorldSettingsImport<JsonElement> var6 = WorldSettingsImport.create(JsonOps.INSTANCE, var1.getResourceManager(), var4);
      DataResult<DimensionGeneratorSettings> var7 = DimensionGeneratorSettings.field_236201_a_.encodeStart(var5, this.field6563).flatMap(var1x -> DimensionGeneratorSettings.field_236201_a_.parse(var6, var1x));
      var7.resultOrPartial(Util.func_240982_a_("Error parsing worldgen settings after loading data packs: ", field6549::error)).ifPresent(var2 -> {
         this.field6563 = var2;
         this.field6562 = var4;
      });
   }

   // $VF: synthetic method
   public static DimensionGeneratorSettings method5801(Class1221 var0) {
      return var0.field6563;
   }

   // $VF: synthetic method
   public static ITextComponent method5802() {
      return field6550;
   }

   // $VF: synthetic method
   public static Optional<Class5970> method5803(Class1221 var0) {
      return var0.field6564;
   }

   // $VF: synthetic method
   public static ITextComponent method5804() {
      return field6551;
   }
}
