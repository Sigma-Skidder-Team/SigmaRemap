package remapped;

import com.google.common.util.concurrent.Runnables;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainMenuScreen extends Screen {
   private static final Logger field_9517 = LogManager.getLogger();
   public static final class_1973 field_9509 = new class_1973(new Identifier("textures/gui/title/background/panorama"));
   private static final Identifier field_9511 = new Identifier("textures/gui/title/background/panorama_overlay.png");
   private static final Identifier field_9502 = new Identifier("textures/gui/accessibility.png");
   private final boolean field_9501;
   private String field_9506;
   private class_9521 field_9500;
   private static final Identifier field_9513 = new Identifier("textures/gui/title/minecraft.png");
   private static final Identifier field_9510 = new Identifier("textures/gui/title/edition.png");
   private boolean field_9507;
   private Screen field_9508;
   private int field_9516;
   private int field_9503;
   private final class_130 field_9505 = new class_130(field_9509);
   private final boolean field_9514;
   private long field_9504;
   private Screen field_9515;

   public MainMenuScreen() {
      this(false);
   }

   public MainMenuScreen(boolean var1) {
      super(new TranslationTextComponent("narrator.screen.title"));
      this.field_9514 = var1;
      this.field_9501 = (double)new Random().nextFloat() < 1.0E-4;
   }

   private boolean method_8400() {
      return this.field_943.gameOptions.field_45435 && this.field_9508 != null;
   }

   @Override
   public void method_5312() {
      if (this.method_8400()) {
         this.field_9508.method_5312();
      }
   }

   public static CompletableFuture<Void> method_8397(TextureManager var0, Executor var1) {
      return CompletableFuture.allOf(
         var0.method_35676(field_9513, var1), var0.method_35676(field_9510, var1), var0.method_35676(field_9511, var1), field_9509.method_9075(var0, var1)
      );
   }

   @Override
   public boolean method_1161() {
      return false;
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public void method_1163() {
      if (this.field_9506 == null) {
         this.field_9506 = this.field_943.method_8601().method_44056();
      }

      this.field_9516 = this.field_948.method_45395("Copyright Mojang AB. Do not distribute!");
      this.field_9503 = this.field_941 - this.field_9516 - 2;
      byte var3 = 24;
      int var4 = this.field_940 / 4 + 48;
      class_9521 var5 = null;
      if (!this.field_943.method_8493()) {
         this.method_8395(var4, 24);
         if (class_7860.field_39987.method_22501()) {
            var5 = class_8835.method_40638(this, var4, 24);
            this.<class_9521>method_1186(var5);
         }
      } else {
         this.method_8398(var4, 24);
      }

      this.<class_77>method_1186(
         new class_77(
            this.field_941 / 2 - 124,
            var4 + 72 + 12,
            20,
            20,
            0,
            106,
            20,
            class_9521.field_36678,
            256,
            256,
            var1 -> this.field_943.method_8609(new class_1709(this, this.field_943.gameOptions, this.field_943.method_8561())),
            new TranslationTextComponent("narrator.button.language")
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            var4 + 72 + 12,
            98,
            20,
            new TranslationTextComponent("menu.options"),
            var1 -> this.field_943.method_8609(new OptionsScreen(this, this.field_943.gameOptions))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 + 2, var4 + 72 + 12, 98, 20, new TranslationTextComponent("menu.quit"), var1 -> this.field_943.method_8512())
      );
      this.<class_77>method_1186(
         new class_77(
            this.field_941 / 2 + 104,
            var4 + 72 + 12,
            20,
            20,
            0,
            0,
            20,
            field_9502,
            32,
            64,
            var1 -> this.field_943.method_8609(new class_9728(this, this.field_943.gameOptions)),
            new TranslationTextComponent("narrator.button.accessibility")
         )
      );
      this.field_943.method_8509(false);
      if (this.field_943.gameOptions.field_45435 && !this.field_9507) {
         class_2488 var6 = new class_2488();
         this.field_9508 = var6.method_11391(this);
         this.field_9507 = true;
      }

      if (this.method_8400()) {
         this.field_9508.method_1164(this.field_943, this.field_941, this.field_940);
      }

      if (class_7860.field_40098.method_3596()) {
         this.field_9515 = (Screen)class_7860.method_35556(class_7860.field_40098, this, var5);
      }
   }

   private void method_8395(int var1, int var2) {
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            var1,
            200,
            20,
            new TranslationTextComponent("menu.singleplayer"),
            var1x -> this.field_943.method_8609(new class_7899(this))
         )
      );
      boolean var5 = this.field_943.method_8537();
      class_3623 var6 = !var5
         ? (var1x, var2x, var3, var4) -> {
            if (!var1x.field_36675) {
               this.method_1175(
                  var2x,
                  this.field_943.field_9668.method_45391(new TranslationTextComponent("title.multiplayer.disabled"), Math.max(this.field_941 / 2 - 43, 170)),
                  var3,
                  var4
               );
            }
         }
         : class_9521.field_48465;
      this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 - 100, var1 + var2 * 1, 200, 20, new TranslationTextComponent("menu.multiplayer"), var1x -> {
               Object var4 = !this.field_943.gameOptions.field_45481 ? new class_6557(this) : new class_4145(this);
               this.field_943.method_8609((Screen)var4);
            }, var6)
         )
         .field_36675 = var5;
      this.<class_9521>method_1186(
            new class_9521(this.field_941 / 2 - 100, var1 + var2 * 2, 200, 20, new TranslationTextComponent("menu.online"), var1x -> this.method_8399(), var6)
         )
         .field_36675 = var5;
      if (class_7860.field_39987.method_22501() && this.field_950.size() > 0) {
         class_7114 var7 = this.field_950.get(this.field_950.size() - 1);
         var7.field_36670 = this.field_941 / 2 + 2;
         var7.method_32688(98);
      }
   }

   private void method_8398(int var1, int var2) {
      boolean var5 = this.method_8396();
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 100, var1, 200, 20, new TranslationTextComponent("menu.playdemo"), var2x -> {
         if (!var5) {
            class_7522 var5x = class_6322.method_28810();
            this.field_943.method_8518("Demo_World", class_341.field_1290, var5x, class_2904.method_13303(var5x));
         } else {
            this.field_943.method_8599("Demo_World");
         }
      }));
      this.field_9500 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100,
            var1 + var2 * 1,
            200,
            20,
            new TranslationTextComponent("menu.resetdemo"),
            var1x -> {
               class_9663 var4 = this.field_943.method_8591();

               try (class_3676 var5x = var4.method_44633("Demo_World")) {
                  class_460 var7 = var5x.method_17058();
                  if (var7 != null) {
                     this.field_943
                        .method_8609(
                           new class_9640(
                              this::method_8394,
                              new TranslationTextComponent("selectWorld.deleteQuestion"),
                              new TranslationTextComponent("selectWorld.deleteWarning", var7.method_2206()),
                              new TranslationTextComponent("selectWorld.deleteButton"),
                              class_1402.field_7633
                           )
                        );
                  }
               } catch (IOException var18) {
                  class_4201.method_19563(this.field_943, "Demo_World");
                  field_9517.warn("Failed to access demo world", var18);
               }
            }
         )
      );
      this.field_9500.field_36675 = var5;
   }

   private boolean method_8396() {
      try (class_3676 var3 = this.field_943.method_8591().method_44633("Demo_World")) {
         return var3.method_17058() != null;
      } catch (IOException var17) {
         class_4201.method_19563(this.field_943, "Demo_World");
         field_9517.warn("Failed to read demo world data", var17);
         return false;
      }
   }

   private void method_8399() {
      class_2488 var3 = new class_2488();
      var3.method_11390(this);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_9504 == 0L && this.field_9514) {
         this.field_9504 = Util.getMeasuringTimeMs();
      }

      float var7 = !this.field_9514 ? 1.0F : (float)(Util.getMeasuringTimeMs() - this.field_9504) / 1000.0F;
      class_1920.method_8786();
      method_9774(var1, 0, 0, this.field_941, this.field_940, -1);
      this.field_9505.method_401(var4, class_9299.method_42828(var7, 0.0F, 1.0F));
      short var8 = 274;
      int var9 = this.field_941 / 2 - 137;
      byte var10 = 30;
      this.field_943.method_8577().method_35674(field_9511);
      class_3542.method_16488();
      class_3542.method_16398(class_5033.field_26042, class_8535.field_43697);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, !this.field_9514 ? 1.0F : (float)class_9299.method_42816(class_9299.method_42828(var7, 0.0F, 1.0F)));
      method_9780(var1, 0, 0, this.field_941, this.field_940, 0.0F, 0.0F, 16, 128, 16, 128);
      float var11 = !this.field_9514 ? 1.0F : class_9299.method_42828(var7 - 1.0F, 0.0F, 1.0F);
      int var12 = class_9299.method_42816(var11 * 255.0F) << 24;
      if ((var12 & -67108864) != 0) {
         this.field_943.method_8577().method_35674(field_9513);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, var11);
         if (!this.field_9501) {
            this.method_9784(var9, 30, (var2x, var3x) -> {
               this.method_9781(var1, var2x + 0, var3x, 0, 0, 155, 44);
               this.method_9781(var1, var2x + 155, var3x, 0, 45, 155, 44);
            });
         } else {
            this.method_9784(var9, 30, (var2x, var3x) -> {
               this.method_9781(var1, var2x + 0, var3x, 0, 0, 99, 44);
               this.method_9781(var1, var2x + 99, var3x, 129, 0, 27, 44);
               this.method_9781(var1, var2x + 99 + 26, var3x, 126, 0, 3, 44);
               this.method_9781(var1, var2x + 99 + 26 + 3, var3x, 99, 0, 26, 44);
               this.method_9781(var1, var2x + 155, var3x, 0, 45, 155, 44);
            });
         }

         this.field_943.method_8577().method_35674(field_9510);
         method_9778(var1, var9 + 88, 67, 0.0F, 0.0F, 98, 14, 128, 16);
         if (class_7860.field_40140.method_3596()) {
            class_7860.method_35547(class_7860.field_40140, this, var1, this.field_948, this.field_941, this.field_940);
         }

         if (this.field_9506 != null) {
            class_3542.method_16438();
            class_3542.method_16413((float)(this.field_941 / 2 + 90), 70.0F, 0.0F);
            class_3542.method_16410(-20.0F, 0.0F, 0.0F, 1.0F);
            float var13 = 1.8F
               - class_9299.method_42804(class_9299.method_42818((float)(Util.getMeasuringTimeMs() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
            var13 = var13 * 100.0F / (float)(this.field_948.method_45395(this.field_9506) + 32);
            class_3542.method_16403(var13, var13, var13);
            method_9787(var1, this.field_948, this.field_9506, 0, -8, 16776960 | var12);
            class_3542.method_16489();
         }

         String var17 = "Minecraft " + class_7665.method_34674().getName();
         if (!this.field_943.method_8493()) {
            var17 = var17 + (!"release".equalsIgnoreCase(this.field_943.method_8539()) ? "/" + this.field_943.method_8539() : "");
         } else {
            var17 = var17 + " Demo";
         }

         if (this.field_943.method_8522()) {
            var17 = var17 + class_6956.method_31803("menu.modded");
         }

         if (!class_7860.field_39875.method_45472()) {
            method_9770(var1, this.field_948, var17, 2, this.field_940 - 10, 16777215 | var12);
         } else {
            if (class_7860.field_39963.method_3596()) {
               BiConsumer var14 = (var3x, var4x) -> method_9770(var1, this.field_948, var4x, 2, this.field_940 - (10 + var3x * 10), 16777215 | var12);
               class_7860.method_35556(class_7860.field_39963, true, true, var14);
            }

            if (class_7860.field_40125.method_3596()) {
               BiConsumer var19 = (var3x, var4x) -> method_9770(
                     var1,
                     this.field_948,
                     var4x,
                     this.field_941 - this.field_948.method_45395(var4x),
                     this.field_940 - (10 + (var3x + 1) * 10),
                     16777215 | var12
                  );
               class_7860.method_35556(class_7860.field_40125, var19);
            }
         }

         method_9770(var1, this.field_948, "Copyright Mojang AB. Do not distribute!", this.field_9503, this.field_940 - 10, 16777215 | var12);
         if (var2 > this.field_9503 && var2 < this.field_9503 + this.field_9516 && var3 > this.field_940 - 10 && var3 < this.field_940) {
            method_9774(var1, this.field_9503, this.field_940 - 1, this.field_9503 + this.field_9516, this.field_940, 16777215 | var12);
         }

         for (class_7114 var15 : this.field_950) {
            var15.method_32689(var11);
         }

         super.method_6767(var1, var2, var3, var4);
         if (this.method_8400() && var11 >= 1.0F) {
            this.field_9508.method_6767(var1, var2, var3, var4);
         }
      }

      if (this.field_9515 != null) {
         this.field_9515.method_6767(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (!super.method_26940(var1, var3, var5)) {
         if (this.method_8400() && this.field_9508.method_26940(var1, var3, var5)) {
            return true;
         } else {
            if (var1 > (double)this.field_9503
               && var1 < (double)(this.field_9503 + this.field_9516)
               && var3 > (double)(this.field_940 - 10)
               && var3 < (double)this.field_940) {
               this.field_943.method_8609(new class_3129(false, Runnables.doNothing()));
            }

            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_1162() {
      if (this.field_9508 != null) {
         this.field_9508.method_1162();
      }
   }

   private void method_8394(boolean var1) {
      if (var1) {
         try (class_3676 var4 = this.field_943.method_8591().method_44633("Demo_World")) {
            var4.method_17074();
         } catch (IOException var17) {
            class_4201.method_19560(this.field_943, "Demo_World");
            field_9517.warn("Failed to delete demo world", var17);
         }
      }

      this.field_943.method_8609(this);
   }
}
