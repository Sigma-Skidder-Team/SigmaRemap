package mapped;

import net.minecraft.util.text.TranslationTextComponent;

public class Class834 extends Screen {
   private final boolean field4621;

   public Class834(boolean var1) {
      super(!var1 ? new TranslationTextComponent("menu.paused") : new TranslationTextComponent("menu.game"));
      this.field4621 = var1;
   }

   @Override
   public void method1921() {
      if (this.field4621) {
         this.method2548();
      }
   }

   private void method2548() {
      byte var3 = -16;
      byte var4 = 98;
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 102, this.field4565 / 4 + 24 + -16, 204, 20, new TranslationTextComponent("menu.returnToGame"), var1 -> {
            this.field4562.displayGuiScreen((Screen)null);
            this.field4562.field1301.method36742();
         })
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 102,
            this.field4565 / 4 + 48 + -16,
            98,
            20,
            new TranslationTextComponent("gui.advancements"),
            var1 -> this.field4562.displayGuiScreen(new Class1130(this.field4562.field1339.connection.method15795()))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 / 4 + 48 + -16,
            98,
            20,
            new TranslationTextComponent("gui.stats"),
            var1 -> this.field4562.displayGuiScreen(new Class1305(this, this.field4562.field1339.method5396()))
         )
      );
      String var5 = !SharedConstants.method34773().isStable() ? "https://aka.ms/snapshotfeedback?ref=game" : "https://aka.ms/javafeedback?ref=game";
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 102,
            this.field4565 / 4 + 72 + -16,
            98,
            20,
            new TranslationTextComponent("menu.sendFeedback"),
            var2 -> this.field4562.displayGuiScreen(new Class830(var2x -> {
                  if (var2x) {
                     Util.getOSType().method8181(var5);
                  }

                  this.field4562.displayGuiScreen(this);
               }, var5, true))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 / 4 + 72 + -16,
            98,
            20,
            new TranslationTextComponent("menu.reportBugs"),
            var1 -> this.field4562.displayGuiScreen(new Class830(var1x -> {
                  if (var1x) {
                     Util.getOSType().method8181("https://aka.ms/snapshotbugs?ref=game");
                  }

                  this.field4562.displayGuiScreen(this);
               }, "https://aka.ms/snapshotbugs?ref=game", true))
         )
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 102,
            this.field4565 / 4 + 96 + -16,
            98,
            20,
            new TranslationTextComponent("menu.options"),
            var1 -> this.field4562.displayGuiScreen(new Class1129(this, this.field4562.field1299))
         )
      );
      Class1206 var6 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 4,
            this.field4565 / 4 + 96 + -16,
            98,
            20,
            new TranslationTextComponent("menu.shareToLan"),
            var1 -> this.field4562.displayGuiScreen(new Class1149(this))
         )
      );
      var6.field6482 = this.field4562.method1530() && !this.field4562.method1531().method1369();
      Class1206 var7 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 102, this.field4565 / 4 + 120 + -16, 204, 20, new TranslationTextComponent("menu.returnToMenu"), var1 -> {
            boolean var4x = this.field4562.method1529();
            boolean var5x = this.field4562.method1559();
            var1.field6482 = false;
            this.field4562.field1338.method6782();
            if (!var4x) {
               this.field4562.method1505();
            } else {
               this.field4562.method1506(new Class1310(new TranslationTextComponent("menu.savingLevel")));
            }

            if (!var4x) {
               if (!var5x) {
                  this.field4562.displayGuiScreen(new Class1316(new Class849()));
               } else {
                  Class810 var6x = new Class810();
                  var6x.method2209(new Class849());
               }
            } else {
               this.field4562.displayGuiScreen(new Class849());
            }
         })
      );
      if (!this.field4562.method1529()) {
         var7.method5743(new TranslationTextComponent("menu.disconnect"));
      }
   }

   @Override
   public void method1919() {
      super.method1919();
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      if (!this.field4621) {
         method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 10, 16777215);
      } else {
         this.method2469(var1);
         method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 40, 16777215);
      }

      super.method1923(var1, var2, var3, var4);
   }
}
