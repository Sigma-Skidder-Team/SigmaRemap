package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.hash.Hashing;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.CreateWorldScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.WorldSelectionScreen;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.datafix.codec.DatapackCodec;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import javax.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;

public final class Class1173 extends Class1155<Class1173> implements AutoCloseable {
   private final Minecraft field6351;
   private final WorldSelectionScreen field6352;
   private final Class2024 field6353;
   private final ResourceLocation field6354;
   private File field6355;
   private final DynamicTexture field6356;
   private long field6357;
   public final Class1276 field6358;

   public Class1173(Class1276 var1, Class1276 var2, Class2024 var3) {
      this.field6358 = var1;
      this.field6352 = var2.method6068();
      this.field6353 = var3;
      this.field6351 = Minecraft.getInstance();
      String var6 = var3.method8643();
      this.field6354 = new ResourceLocation(
         "minecraft", "worlds/" + Util.method38533(var6, ResourceLocation::method8298) + "/" + Hashing.sha1().hashUnencodedChars(var6) + "/icon"
      );
      this.field6355 = var3.method8645();
      if (!this.field6355.isFile()) {
         this.field6355 = null;
      }

      this.field6356 = this.method5584();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var13 = this.field6353.method8644();
      String var14 = this.field6353.method8643() + " (" + Class1276.method6070().format(new Date(this.field6353.method8647())) + ")";
      if (StringUtils.isEmpty(var13)) {
         var13 = I18n.format("selectWorld.world") + " " + (var2 + 1);
      }

      ITextComponent var15 = this.field6353.method8657();
      this.field6351.fontRenderer.method38801(var1, var13, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      this.field6351.fontRenderer.method38801(var1, var14, (float)(var4 + 32 + 3), (float)(var3 + 9 + 3), 8421504);
      this.field6351.fontRenderer.func_243248_b(var1, var15, (float)(var4 + 32 + 3), (float)(var3 + 9 + 9 + 3), 8421504);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field6351.getTextureManager().bindTexture(this.field6356 == null ? Class1276.method6071() : this.field6354);
      RenderSystem.enableBlend();
      AbstractGui.method5699(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      RenderSystem.disableBlend();
      if (this.field6351.gameSettings.touchscreen || var9) {
         this.field6351.getTextureManager().bindTexture(Class1276.method6072());
         AbstractGui.fill(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var16 = var7 - var4;
         boolean var17 = var16 < 32;
         int var18 = !var17 ? 0 : 32;
         if (!this.field6353.method8656()) {
            if (!this.field6353.method8653()) {
               AbstractGui.method5699(var1, var4, var3, 0.0F, (float)var18, 32, 32, 256, 256);
            } else {
               AbstractGui.method5699(var1, var4, var3, 32.0F, (float)var18, 32, 32, 256, 256);
               if (!this.field6353.method8654()) {
                  if (!SharedConstants.getVersion().isStable()) {
                     AbstractGui.method5699(var1, var4, var3, 64.0F, (float)var18, 32, 32, 256, 256);
                     if (var17) {
                        this.field6352.method6421(ImmutableList.of(Class1276.method6076().func_241878_f(), Class1276.method6077().func_241878_f()));
                     }
                  }
               } else {
                  AbstractGui.method5699(var1, var4, var3, 96.0F, (float)var18, 32, 32, 256, 256);
                  if (var17) {
                     this.field6352.method6421(ImmutableList.of(Class1276.method6074().func_241878_f(), Class1276.method6075().func_241878_f()));
                  }
               }
            }
         } else {
            AbstractGui.method5699(var1, var4, var3, 96.0F, (float)var18, 32, 32, 256, 256);
            if (var17) {
               this.field6352.method6421(this.field6351.fontRenderer.method38828(Class1276.method6073(), 175));
            }
         }
      }
   }

   @Override
   public boolean mouseClicked(double var1, double var3, int var5) {
      if (!this.field6353.method8656()) {
         this.field6358.method6024(this);
         this.field6352.method6422(this.field6358.method6067().isPresent());
         if (!(var1 - (double)this.field6358.method6053() <= 32.0)) {
            if (Util.milliTime() - this.field6357 >= 250L) {
               this.field6357 = Util.milliTime();
               return false;
            } else {
               this.method5578();
               return true;
            }
         } else {
            this.method5578();
            return true;
         }
      } else {
         return true;
      }
   }

   public void method5578() {
      if (!this.field6353.method8656()) {
         if (!this.field6353.method8655()) {
            if (!this.field6353.method8654()) {
               this.method5582();
            } else {
               this.field6351
                  .displayGuiScreen(
                     new ConfirmScreen(
                        var1 -> {
                           if (var1) {
                              try {
                                 this.method5582();
                              } catch (Exception var5) {
                                 Class1276.method6078().error("Failure to open 'future world'", var5);
                                 this.field6351
                                    .displayGuiScreen(
                                       new Class1311(
                                          () -> this.field6351.displayGuiScreen(this.field6352),
                                          new TranslationTextComponent("selectWorld.futureworld.error.title"),
                                          new TranslationTextComponent("selectWorld.futureworld.error.text")
                                       )
                                    );
                              }
                           } else {
                              this.field6351.displayGuiScreen(this.field6352);
                           }
                        },
                        new TranslationTextComponent("selectWorld.versionQuestion"),
                        new TranslationTextComponent(
                           "selectWorld.versionWarning",
                           this.field6353.method8651(),
                           new TranslationTextComponent("selectWorld.versionJoinButton"),
                           DialogTexts.GUI_CANCEL
                        )
                     )
                  );
            }
         } else {
            TranslationTextComponent var3 = new TranslationTextComponent("selectWorld.backupQuestion");
            TranslationTextComponent var4 = new TranslationTextComponent(
               "selectWorld.backupWarning", this.field6353.method8651(), SharedConstants.getVersion().getName()
            );
            this.field6351.displayGuiScreen(new ConfirmBackupScreen(this.field6352, (var1, var2) -> {
               if (var1) {
                  String var5 = this.field6353.method8643();

                  try (SaveFormat.LevelSave var6 = this.field6351.getSaveLoader().getLevelSave(var5)) {
                     EditWorldScreen.method6323(var6);
                  } catch (IOException var19) {
                     SystemToast.func_238535_a_(this.field6351, var5);
                     Class1276.method6078().error("Failed to backup level {}", var5, var19);
                  }
               }

               this.method5582();
            }, var3, var4, false));
         }
      }
   }

   public void method5579() {
      this.field6351
         .displayGuiScreen(
            new ConfirmScreen(
               var1 -> {
                  if (var1) {
                     this.field6351.displayGuiScreen(new WorkingScreen());
                     SaveFormat var4 = this.field6351.getSaveLoader();
                     String var5 = this.field6353.method8643();

                     try (SaveFormat.LevelSave var6 = var4.getLevelSave(var5)) {
                        var6.deleteSave();
                     } catch (IOException var19) {
                        SystemToast.func_238538_b_(this.field6351, var5);
                        Class1276.method6078().error("Failed to delete world {}", var5, var19);
                     }

                     this.field6358.method6066(() -> this.field6352.field7119.getText(), true);
                  }

                  this.field6351.displayGuiScreen(this.field6352);
               },
               new TranslationTextComponent("selectWorld.deleteQuestion"),
               new TranslationTextComponent("selectWorld.deleteWarning", this.field6353.method8644()),
               new TranslationTextComponent("selectWorld.deleteButton"),
               DialogTexts.GUI_CANCEL
            )
         );
   }

   public void method5580() {
      String var3 = this.field6353.method8643();

      try {
         SaveFormat.LevelSave var4 = this.field6351.getSaveLoader().getLevelSave(var3);
         this.field6351.displayGuiScreen(new EditWorldScreen(var3x -> {
            try {
               var4.close();
            } catch (IOException var7) {
               Class1276.method6078().error("Failed to unlock level {}", var3, var7);
            }

            if (var3x) {
               this.field6358.method6066(() -> this.field6352.field7119.getText(), true);
            }

            this.field6351.displayGuiScreen(this.field6352);
         }, var4));
      } catch (IOException var5) {
         SystemToast.func_238535_a_(this.field6351, var3);
         Class1276.method6078().error("Failed to access level {}", var3, var5);
         this.field6358.method6066(() -> this.field6352.field7119.getText(), true);
      }
   }

   public void method5581() {
      this.method5583();
      DynamicRegistriesImpl var3 = DynamicRegistries.func_239770_b_();

      try (
              SaveFormat.LevelSave var4 = this.field6351.getSaveLoader().getLevelSave(this.field6353.method8643());
              Minecraft.PackManager var6 = this.field6351.reloadDatapacks(var3, Minecraft::loadDataPackCodec, Minecraft::loadWorld, false, var4);
      ) {
         WorldSettings var8 = var6.getServerConfiguration().method20099();
         DatapackCodec var9 = var8.getDatapackCodec();
         DimensionGeneratorSettings var10 = var6.getServerConfiguration().getDimensionGeneratorSettings();
         Path var11 = CreateWorldScreen.method6369(var4.resolveFilePath(FolderName.DATAPACKS), this.field6351);
         if (var10.func_236229_j_()) {
            this.field6351
               .displayGuiScreen(
                  new ConfirmScreen(
                     var6x -> this.field6351.displayGuiScreen((Screen)(!var6x ? this.field6352 : new CreateWorldScreen(this.field6352, var8, var10, var11, var9, var3))),
                     new TranslationTextComponent("selectWorld.recreate.customized.title"),
                     new TranslationTextComponent("selectWorld.recreate.customized.text"),
                     DialogTexts.GUI_PROCEED,
                     DialogTexts.GUI_CANCEL
                  )
               );
         } else {
            this.field6351.displayGuiScreen(new CreateWorldScreen(this.field6352, var8, var10, var11, var9, var3));
         }
      } catch (Exception var39) {
         Class1276.method6078().error("Unable to recreate world", var39);
         this.field6351
            .displayGuiScreen(
               new Class1311(
                  () -> this.field6351.displayGuiScreen(this.field6352),
                  new TranslationTextComponent("selectWorld.recreate.error.title"),
                  new TranslationTextComponent("selectWorld.recreate.error.text")
               )
            );
      }
   }

   private void method5582() {
      this.field6351.getSoundHandler().method1000(MinecraftSoundManager.playSoundWithCustomPitch(SoundEvents.field27176, 1.0F));
      if (this.field6351.getSaveLoader().method38465(this.field6353.method8643())) {
         this.method5583();
         this.field6351.loadWorld(this.field6353.method8643());
      }
   }

   private void method5583() {
      this.field6351.forcedScreenTick(new DirtMessageScreen(new TranslationTextComponent("selectWorld.data_read")));
   }

   @Nullable
   private DynamicTexture method5584() {
      boolean var3 = this.field6355 != null && this.field6355.isFile();
      if (var3) {
         try (FileInputStream var4 = new FileInputStream(this.field6355)) {
            Class1806 var6 = Class1806.method7879(var4);
            Validate.validState(var6.method7886() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var6.method7887() == 64, "Must be 64 pixels high", new Object[0]);
            DynamicTexture var7 = new DynamicTexture(var6);
            this.field6351.getTextureManager().method1073(this.field6354, var7);
            return var7;
         } catch (Throwable var20) {
            Class1276.method6078().error("Invalid icon for world {}", this.field6353.method8643(), var20);
            this.field6355 = null;
            return null;
         }
      } else {
         this.field6351.getTextureManager().method1081(this.field6354);
         return null;
      }
   }

   @Override
   public void close() {
      if (this.field6356 != null) {
         this.field6356.close();
      }
   }

   // $VF: synthetic method
   public static Class2024 method5595(Class1173 var0) {
      return var0.field6353;
   }
}
