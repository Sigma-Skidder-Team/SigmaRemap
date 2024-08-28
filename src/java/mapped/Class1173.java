package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.hash.Hashing;
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
   private final Class1341 field6352;
   private final Class2024 field6353;
   private final ResourceLocation field6354;
   private File field6355;
   private final Class291 field6356;
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
   public void method5544(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var13 = this.field6353.method8644();
      String var14 = this.field6353.method8643() + " (" + Class1276.method6070().format(new Date(this.field6353.method8647())) + ")";
      if (StringUtils.isEmpty(var13)) {
         var13 = Class9088.method33883("selectWorld.world") + " " + (var2 + 1);
      }

      ITextComponent var15 = this.field6353.method8657();
      this.field6351.field1294.method38801(var1, var13, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      this.field6351.field1294.method38801(var1, var14, (float)(var4 + 32 + 3), (float)(var3 + 9 + 3), 8421504);
      this.field6351.field1294.method38805(var1, var15, (float)(var4 + 32 + 3), (float)(var3 + 9 + 9 + 3), 8421504);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field6351.getTextureManager().bindTexture(this.field6356 == null ? Class1276.method6071() : this.field6354);
      RenderSystem.enableBlend();
      Class1193.method5699(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      RenderSystem.disableBlend();
      if (this.field6351.field1299.field44625 || var9) {
         this.field6351.getTextureManager().bindTexture(Class1276.method6072());
         Class1193.method5686(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         int var16 = var7 - var4;
         boolean var17 = var16 < 32;
         int var18 = !var17 ? 0 : 32;
         if (!this.field6353.method8656()) {
            if (!this.field6353.method8653()) {
               Class1193.method5699(var1, var4, var3, 0.0F, (float)var18, 32, 32, 256, 256);
            } else {
               Class1193.method5699(var1, var4, var3, 32.0F, (float)var18, 32, 32, 256, 256);
               if (!this.field6353.method8654()) {
                  if (!Class9246.method34773().isStable()) {
                     Class1193.method5699(var1, var4, var3, 64.0F, (float)var18, 32, 32, 256, 256);
                     if (var17) {
                        this.field6352.method6421(ImmutableList.of(Class1276.method6076().func_241878_f(), Class1276.method6077().func_241878_f()));
                     }
                  }
               } else {
                  Class1193.method5699(var1, var4, var3, 96.0F, (float)var18, 32, 32, 256, 256);
                  if (var17) {
                     this.field6352.method6421(ImmutableList.of(Class1276.method6074().func_241878_f(), Class1276.method6075().func_241878_f()));
                  }
               }
            }
         } else {
            Class1193.method5699(var1, var4, var3, 96.0F, (float)var18, 32, 32, 256, 256);
            if (var17) {
               this.field6352.method6421(this.field6351.field1294.method38828(Class1276.method6073(), 175));
            }
         }
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (!this.field6353.method8656()) {
         this.field6358.method6024(this);
         this.field6352.method6422(this.field6358.method6067().isPresent());
         if (!(var1 - (double)this.field6358.method6053() <= 32.0)) {
            if (Util.method38487() - this.field6357 >= 250L) {
               this.field6357 = Util.method38487();
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
                     new Class829(
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
                           Class7127.field30659
                        )
                     )
                  );
            }
         } else {
            TranslationTextComponent var3 = new TranslationTextComponent("selectWorld.backupQuestion");
            TranslationTextComponent var4 = new TranslationTextComponent(
               "selectWorld.backupWarning", this.field6353.method8651(), Class9246.method34773().getName()
            );
            this.field6351.displayGuiScreen(new Class1315(this.field6352, (var1, var2) -> {
               if (var1) {
                  String var5 = this.field6353.method8643();

                  try (Class1814 var6 = this.field6351.method1472().method38468(var5)) {
                     Class1329.method6323(var6);
                  } catch (IOException var19) {
                     Class7603.method24908(this.field6351, var5);
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
            new Class829(
               var1 -> {
                  if (var1) {
                     this.field6351.displayGuiScreen(new Class1338());
                     Class9774 var4 = this.field6351.method1472();
                     String var5 = this.field6353.method8643();

                     try (Class1814 var6 = var4.method38468(var5)) {
                        var6.method8003();
                     } catch (IOException var19) {
                        Class7603.method24909(this.field6351, var5);
                        Class1276.method6078().error("Failed to delete world {}", var5, var19);
                     }

                     this.field6358.method6066(() -> this.field6352.field7119.method5636(), true);
                  }

                  this.field6351.displayGuiScreen(this.field6352);
               },
               new TranslationTextComponent("selectWorld.deleteQuestion"),
               new TranslationTextComponent("selectWorld.deleteWarning", this.field6353.method8644()),
               new TranslationTextComponent("selectWorld.deleteButton"),
               Class7127.field30659
            )
         );
   }

   public void method5580() {
      String var3 = this.field6353.method8643();

      try {
         Class1814 var4 = this.field6351.method1472().method38468(var3);
         this.field6351.displayGuiScreen(new Class1329(var3x -> {
            try {
               var4.close();
            } catch (IOException var7) {
               Class1276.method6078().error("Failed to unlock level {}", var3, var7);
            }

            if (var3x) {
               this.field6358.method6066(() -> this.field6352.field7119.method5636(), true);
            }

            this.field6351.displayGuiScreen(this.field6352);
         }, var4));
      } catch (IOException var5) {
         Class7603.method24908(this.field6351, var3);
         Class1276.method6078().error("Failed to access level {}", var3, var5);
         this.field6358.method6066(() -> this.field6352.field7119.method5636(), true);
      }
   }

   public void method5581() {
      this.method5583();
      Class8905 var3 = Class8904.method32457();

      try (
              Class1814 var4 = this.field6351.method1472().method38468(this.field6353.method8643());
              Class1811 var6 = this.field6351.method1503(var3, Minecraft::method1497, Minecraft::method1498, false, var4);
      ) {
         Class8898 var8 = var6.method7959().method20099();
         Class7818 var9 = var8.method32432();
         Class7846 var10 = var6.method7959().method20087();
         Path var11 = Class1335.method6369(var4.method7991(Class5137.field23352), this.field6351);
         if (var10.method26269()) {
            this.field6351
               .displayGuiScreen(
                  new Class829(
                     var6x -> this.field6351.displayGuiScreen((Screen)(!var6x ? this.field6352 : new Class1335(this.field6352, var8, var10, var11, var9, var3))),
                     new TranslationTextComponent("selectWorld.recreate.customized.title"),
                     new TranslationTextComponent("selectWorld.recreate.customized.text"),
                     Class7127.field30662,
                     Class7127.field30659
                  )
               );
         } else {
            this.field6351.displayGuiScreen(new Class1335(this.field6352, var8, var10, var11, var9, var3));
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
      this.field6351.method1546().method1000(Class6339.method19292(Class6067.field27176, 1.0F));
      if (this.field6351.method1472().method38465(this.field6353.method8643())) {
         this.method5583();
         this.field6351.method1499(this.field6353.method8643());
      }
   }

   private void method5583() {
      this.field6351.method1508(new Class1310(new TranslationTextComponent("selectWorld.data_read")));
   }

   @Nullable
   private Class291 method5584() {
      boolean var3 = this.field6355 != null && this.field6355.isFile();
      if (var3) {
         try (FileInputStream var4 = new FileInputStream(this.field6355)) {
            Class1806 var6 = Class1806.method7879(var4);
            Validate.validState(var6.method7886() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var6.method7887() == 64, "Must be 64 pixels high", new Object[0]);
            Class291 var7 = new Class291(var6);
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
