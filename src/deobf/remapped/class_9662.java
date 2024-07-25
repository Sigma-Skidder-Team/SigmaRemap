package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.hash.Hashing;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public final class class_9662 extends class_4785<class_9662> implements AutoCloseable {
   private final MinecraftClient field_49207;
   private final class_7899 field_49213;
   private final class_460 field_49209;
   private final class_4639 field_49211;
   private File field_49212;
   private final class_7884 field_49210;
   private long field_49214;

   public class_9662(class_8224 var1, class_8224 var2, class_460 var3) {
      this.field_49215 = var1;
      this.field_49213 = var2.method_37656();
      this.field_49209 = var3;
      this.field_49207 = MinecraftClient.getInstance();
      String var6 = var3.method_2203();
      this.field_49211 = new class_4639(
         "minecraft", "worlds/" + class_9665.method_44678(var6, class_4639::method_21460) + "/" + Hashing.sha1().hashUnencodedChars(var6) + "/icon"
      );
      this.field_49212 = var3.method_2196();
      if (!this.field_49212.isFile()) {
         this.field_49212 = null;
      }

      this.field_49210 = this.method_44606();
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var13 = this.field_49209.method_2206();
      String var14 = this.field_49209.method_2203() + " (" + class_8224.method_37652().format(new Date(this.field_49209.method_2210())) + ")";
      if (StringUtils.isEmpty(var13)) {
         var13 = class_6956.method_31803("selectWorld.world") + " " + (var2 + 1);
      }

      ITextComponent var15 = this.field_49209.method_2205();
      this.field_49207.textRenderer.method_45385(var1, var13, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      this.field_49207.textRenderer.method_45385(var1, var14, (float)(var4 + 32 + 3), (float)(var3 + 9 + 3), 8421504);
      this.field_49207.textRenderer.method_45378(var1, var15, (float)(var4 + 32 + 3), (float)(var3 + 9 + 9 + 3), 8421504);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_49207.method_8577().method_35674(this.field_49210 == null ? class_8224.method_37657() : this.field_49211);
      class_3542.method_16488();
      class_2089.method_9778(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      class_3542.method_16448();
      if (this.field_49207.field_9577.field_45570 || var9) {
         this.field_49207.method_8577().method_35674(class_8224.method_37654());
         class_2089.method_9774(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         int var16 = var7 - var4;
         boolean var17 = var16 < 32;
         int var18 = !var17 ? 0 : 32;
         if (!this.field_49209.method_2208()) {
            if (!this.field_49209.method_2204()) {
               class_2089.method_9778(var1, var4, var3, 0.0F, (float)var18, 32, 32, 256, 256);
            } else {
               class_2089.method_9778(var1, var4, var3, 32.0F, (float)var18, 32, 32, 256, 256);
               if (!this.field_49209.method_2201()) {
                  if (!class_7665.method_34674().isStable()) {
                     class_2089.method_9778(var1, var4, var3, 64.0F, (float)var18, 32, 32, 256, 256);
                     if (var17) {
                        this.field_49213.method_35708(ImmutableList.of(class_8224.method_37646().func_241878_f(), class_8224.method_37651().func_241878_f()));
                     }
                  }
               } else {
                  class_2089.method_9778(var1, var4, var3, 96.0F, (float)var18, 32, 32, 256, 256);
                  if (var17) {
                     this.field_49213.method_35708(ImmutableList.of(class_8224.method_37649().func_241878_f(), class_8224.method_37655().func_241878_f()));
                  }
               }
            }
         } else {
            class_2089.method_9778(var1, var4, var3, 96.0F, (float)var18, 32, 32, 256, 256);
            if (var17) {
               this.field_49213.method_35708(this.field_49207.textRenderer.method_45391(class_8224.method_37653(), 175));
            }
         }
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (!this.field_49209.method_2208()) {
         this.field_49215.method_37648(this);
         this.field_49213.method_35707(this.field_49215.method_37647().isPresent());
         if (!(var1 - (double)this.field_49215.method_36229() <= 32.0)) {
            if (class_9665.method_44650() - this.field_49214 >= 250L) {
               this.field_49214 = class_9665.method_44650();
               return false;
            } else {
               this.method_44610();
               return true;
            }
         } else {
            this.method_44610();
            return true;
         }
      } else {
         return true;
      }
   }

   public void method_44610() {
      if (!this.field_49209.method_2208()) {
         if (!this.field_49209.method_2209()) {
            if (!this.field_49209.method_2201()) {
               this.method_44608();
            } else {
               this.field_49207
                  .method_8609(
                     new class_9640(
                        var1 -> {
                           if (var1) {
                              try {
                                 this.method_44608();
                              } catch (Exception var5) {
                                 class_8224.method_37650().error("Failure to open 'future world'", var5);
                                 this.field_49207
                                    .method_8609(
                                       new class_4780(
                                          () -> this.field_49207.method_8609(this.field_49213),
                                          new TranslationTextComponent("selectWorld.futureworld.error.title"),
                                          new TranslationTextComponent("selectWorld.futureworld.error.text")
                                       )
                                    );
                              }
                           } else {
                              this.field_49207.method_8609(this.field_49213);
                           }
                        },
                        new TranslationTextComponent("selectWorld.versionQuestion"),
                        new TranslationTextComponent(
                           "selectWorld.versionWarning",
                           this.field_49209.method_2207(),
                           new TranslationTextComponent("selectWorld.versionJoinButton"),
                           class_1402.field_7633
                        )
                     )
                  );
            }
         } else {
            TranslationTextComponent var3 = new TranslationTextComponent("selectWorld.backupQuestion");
            TranslationTextComponent var4 = new TranslationTextComponent(
               "selectWorld.backupWarning", this.field_49209.method_2207(), class_7665.method_34674().getName()
            );
            this.field_49207.method_8609(new class_7262(this.field_49213, (var1, var2) -> {
               if (var1) {
                  String var5 = this.field_49209.method_2203();

                  try (class_3676 var6 = this.field_49207.method_8591().method_44633(var5)) {
                     class_7404.method_33721(var6);
                  } catch (IOException var19) {
                     class_4201.method_19563(this.field_49207, var5);
                     class_8224.method_37650().error("Failed to backup level {}", var5, var19);
                  }
               }

               this.method_44608();
            }, var3, var4, false));
         }
      }
   }

   public void method_44605() {
      this.field_49207
         .method_8609(
            new class_9640(
               var1 -> {
                  if (var1) {
                     this.field_49207.method_8609(new class_7152());
                     class_9663 var4 = this.field_49207.method_8591();
                     String var5 = this.field_49209.method_2203();

                     try (class_3676 var6 = var4.method_44633(var5)) {
                        var6.method_17074();
                     } catch (IOException var19) {
                        class_4201.method_19560(this.field_49207, var5);
                        class_8224.method_37650().error("Failed to delete world {}", var5, var19);
                     }

                     this.field_49215.method_37658(() -> this.field_49213.field_40390.method_8246(), true);
                  }

                  this.field_49207.method_8609(this.field_49213);
               },
               new TranslationTextComponent("selectWorld.deleteQuestion"),
               new TranslationTextComponent("selectWorld.deleteWarning", this.field_49209.method_2206()),
               new TranslationTextComponent("selectWorld.deleteButton"),
               class_1402.field_7633
            )
         );
   }

   public void method_44607() {
      String var3 = this.field_49209.method_2203();

      try {
         class_3676 var4 = this.field_49207.method_8591().method_44633(var3);
         this.field_49207.method_8609(new class_7404(var3x -> {
            try {
               var4.close();
            } catch (IOException var7) {
               class_8224.method_37650().error("Failed to unlock level {}", var3, var7);
            }

            if (var3x) {
               this.field_49215.method_37658(() -> this.field_49213.field_40390.method_8246(), true);
            }

            this.field_49207.method_8609(this.field_49213);
         }, var4));
      } catch (IOException var5) {
         class_4201.method_19563(this.field_49207, var3);
         class_8224.method_37650().error("Failed to access level {}", var3, var5);
         this.field_49215.method_37658(() -> this.field_49213.field_40390.method_8246(), true);
      }
   }

   public void method_44609() {
      this.method_44603();
      class_7522 var3 = class_6322.method_28810();

      try (
              class_3676 var4 = this.field_49207.method_8591().method_44633(this.field_49209.method_2203());
              class_4266 var6 = this.field_49207.method_8572(var3, MinecraftClient::method_8582, MinecraftClient::method_8527, false, var4);
      ) {
         class_6292 var8 = var6.method_19864().method_25699();
         class_2805 var9 = var8.method_28713();
         class_2904 var10 = var6.method_19864().method_25703();
         Path var11 = class_6577.method_30063(var4.method_17064(class_263.field_924), this.field_49207);
         if (var10.method_13301()) {
            this.field_49207
               .method_8609(
                  new class_9640(
                     var6x -> this.field_49207
                           .method_8609((class_266)(!var6x ? this.field_49213 : new class_6577(this.field_49213, var8, var10, var11, var9, var3))),
                     new TranslationTextComponent("selectWorld.recreate.customized.title"),
                     new TranslationTextComponent("selectWorld.recreate.customized.text"),
                     class_1402.field_7631,
                     class_1402.field_7633
                  )
               );
         } else {
            this.field_49207.method_8609(new class_6577(this.field_49213, var8, var10, var11, var9, var3));
         }
      } catch (Exception var39) {
         class_8224.method_37650().error("Unable to recreate world", var39);
         this.field_49207
            .method_8609(
               new class_4780(
                  () -> this.field_49207.method_8609(this.field_49213),
                  new TranslationTextComponent("selectWorld.recreate.error.title"),
                  new TranslationTextComponent("selectWorld.recreate.error.text")
               )
            );
      }
   }

   private void method_44608() {
      this.field_49207.method_8590().method_16345(class_4949.method_22675(class_463.field_1995, 1.0F));
      if (this.field_49207.method_8591().method_44634(this.field_49209.method_2203())) {
         this.method_44603();
         this.field_49207.method_8599(this.field_49209.method_2203());
      }
   }

   private void method_44603() {
      this.field_49207.method_8580(new class_6476(new TranslationTextComponent("selectWorld.data_read")));
   }

   @Nullable
   private class_7884 method_44606() {
      boolean var3 = this.field_49212 != null && this.field_49212.isFile();
      if (var3) {
         try (FileInputStream var4 = new FileInputStream(this.field_49212)) {
            class_5797 var6 = class_5797.method_26230(var4);
            Validate.validState(var6.method_26228() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState(var6.method_26253() == 64, "Must be 64 pixels high", new Object[0]);
            class_7884 var7 = new class_7884(var6);
            this.field_49207.method_8577().method_35682(this.field_49211, var7);
            return var7;
         } catch (Throwable var20) {
            class_8224.method_37650().error("Invalid icon for world {}", this.field_49209.method_2203(), var20);
            this.field_49212 = null;
            return null;
         }
      } else {
         this.field_49207.method_8577().method_35678(this.field_49211);
         return null;
      }
   }

   @Override
   public void close() {
      if (this.field_49210 != null) {
         this.field_49210.close();
      }
   }
}
