package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class841 extends Class838 {
   private Screen field4639;
   private Class9574 field4640;
   private Class9046 field4641 = new Class9046(this, new Class7548());

   public Class841(Screen var1, Class9574 var2) {
      super(new StringTextComponent(Class9088.method33883("of.options.otherTitle")));
      this.field4639 = var1;
      this.field4640 = var2;
   }

   @Override
   public void method1921() {
      this.field4629.clear();
      Class5810 var3 = new Class5810(this.field4562.method1580());
      AbstractOption[] var4 = new AbstractOption[]{
         AbstractOption.field25387,
         AbstractOption.field25410,
         AbstractOption.field25388,
         AbstractOption.field25438,
         AbstractOption.field25395,
         AbstractOption.field25402,
         AbstractOption.field25369,
         AbstractOption.field25389,
         AbstractOption.field25439,
         AbstractOption.field25442,
         var3,
         null
      };

      for (int var5 = 0; var5 < var4.length; var5++) {
         AbstractOption var6 = var4[var5];
         int var7 = this.field4564 / 2 - 155 + var5 % 2 * 160;
         int var8 = this.field4565 / 6 + 21 * (var5 / 2) - 12;
         Class1197 var9 = this.<Class1197>method2455(var6.method17946(this.field4562.gameSettings, var7, var8, 150));
         if (var6 == var3) {
            var9.method5741(310);
            var5++;
         }
      }

      this.<Class1210>method2455(
         new Class1210(210, this.field4564 / 2 - 100, this.field4565 / 6 + 168 + 11 - 44, Class9088.method33883("of.options.other.reset"))
      );
      this.<Class1210>method2455(new Class1210(200, this.field4564 / 2 - 100, this.field4565 / 6 + 168 + 11, Class9088.method33883("gui.done")));
   }

   @Override
   public void method2563(Class1197 var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.field6482) {
            if (var4.field6523 == 200) {
               this.field4562.gameSettings.method37146();
               this.field4562.method1580().method8032();
               this.field4562.displayGuiScreen(this.field4639);
            }

            if (var4.field6523 == 210) {
               this.field4562.gameSettings.method37146();
               String var5 = Class9088.method33883("of.message.other.reset");
               Class829 var6 = new Class829(this::method2568, new StringTextComponent(var5), new StringTextComponent(""));
               this.field4562.displayGuiScreen(var6);
            }
         }
      }
   }

   @Override
   public void onClose() {
      this.field4562.gameSettings.method37146();
      this.field4562.method1580().method8032();
      super.onClose();
   }

   public void method2568(boolean var1) {
      if (var1) {
         this.field4562.gameSettings.method37163();
      }

      this.field4562.displayGuiScreen(this);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4630, this.field4560, this.field4564 / 2, 15, 16777215);
      super.method1923(var1, var2, var3, var4);
      this.field4641.method33640(var1, var2, var3, this.field4629);
   }
}
