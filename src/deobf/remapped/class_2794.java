package remapped;

import net.minecraft.util.text.TranslationTextComponent;

public class class_2794 extends Screen {
   private final boolean field_13725;

   public class_2794(boolean var1) {
      super(!var1 ? new TranslationTextComponent("menu.paused") : new TranslationTextComponent("menu.game"));
      this.field_13725 = var1;
   }

   @Override
   public void method_1163() {
      if (this.field_13725) {
         this.method_12709();
      }
   }

   private void method_12709() {
      byte var3 = -16;
      byte var4 = 98;
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 102, this.field_940 / 4 + 24 + -16, 204, 20, new TranslationTextComponent("menu.returnToGame"), var1 -> {
            this.field_943.method_8609((Screen)null);
            this.field_943.field_9625.method_39834();
         })
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 102,
            this.field_940 / 4 + 48 + -16,
            98,
            20,
            new TranslationTextComponent("gui.advancements"),
            var1 -> this.field_943.method_8609(new class_9044(this.field_943.field_9632.field_30532.method_4796()))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 4,
            this.field_940 / 4 + 48 + -16,
            98,
            20,
            new TranslationTextComponent("gui.stats"),
            var1 -> this.field_943.method_8609(new class_3231(this, this.field_943.field_9632.method_27331()))
         )
      );
      String var5 = !class_7665.method_34674().isStable() ? "https://aka.ms/snapshotfeedback?ref=game" : "https://aka.ms/javafeedback?ref=game";
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 102,
            this.field_940 / 4 + 72 + -16,
            98,
            20,
            new TranslationTextComponent("menu.sendFeedback"),
            var2 -> this.field_943.method_8609(new class_260(var2x -> {
                  if (var2x) {
                     Util.getOperatingSystem().method_37581(var5);
                  }

                  this.field_943.method_8609(this);
               }, var5, true))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 4,
            this.field_940 / 4 + 72 + -16,
            98,
            20,
            new TranslationTextComponent("menu.reportBugs"),
            var1 -> this.field_943.method_8609(new class_260(var1x -> {
                  if (var1x) {
                     Util.getOperatingSystem().method_37581("https://aka.ms/snapshotbugs?ref=game");
                  }

                  this.field_943.method_8609(this);
               }, "https://aka.ms/snapshotbugs?ref=game", true))
         )
      );
      this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 102,
            this.field_940 / 4 + 96 + -16,
            98,
            20,
            new TranslationTextComponent("menu.options"),
            var1 -> this.field_943.method_8609(new OptionsScreen(this, this.field_943.gameOptions))
         )
      );
      class_9521 var6 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 4,
            this.field_940 / 4 + 96 + -16,
            98,
            20,
            new TranslationTextComponent("menu.shareToLan"),
            var1 -> this.field_943.method_8609(new class_6713(this))
         )
      );
      var6.field_36675 = this.field_943.method_8520() && !this.field_943.method_8515().method_1624();
      class_9521 var7 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 102, this.field_940 / 4 + 120 + -16, 204, 20, new TranslationTextComponent("menu.returnToMenu"), var1 -> {
            boolean var4x = this.field_943.method_8566();
            boolean var5x = this.field_943.method_8534();
            var1.field_36675 = false;
            this.field_943.field_9601.method_29519();
            if (!var4x) {
               this.field_943.method_8499();
            } else {
               this.field_943.method_8500(new class_6476(new TranslationTextComponent("menu.savingLevel")));
            }

            if (!var4x) {
               if (!var5x) {
                  this.field_943.method_8609(new class_4145(new class_1876()));
               } else {
                  class_2488 var6x = new class_2488();
                  var6x.method_11390(new class_1876());
               }
            } else {
               this.field_943.method_8609(new class_1876());
            }
         })
      );
      if (!this.field_943.method_8566()) {
         var7.method_32687(new TranslationTextComponent("menu.disconnect"));
      }
   }

   @Override
   public void method_5312() {
      super.method_5312();
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (!this.field_13725) {
         method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 10, 16777215);
      } else {
         this.method_1183(var1);
         method_9788(var1, this.field_948, this.field_947, this.field_941 / 2, 40, 16777215);
      }

      super.method_6767(var1, var2, var3, var4);
   }
}
