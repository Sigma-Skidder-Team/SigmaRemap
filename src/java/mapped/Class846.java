package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class846 extends Class838 {
   private Screen field4686;
   private GameSettings field4687;
   private static AbstractOption[] field4688 = new AbstractOption[]{
      AbstractOption.field25330,
      AbstractOption.field25376,
      AbstractOption.field25423,
      AbstractOption.field25422,
      AbstractOption.field25426,
      AbstractOption.field25415,
      AbstractOption.field25390,
      AbstractOption.field25412,
      AbstractOption.field25417,
      AbstractOption.field25418,
      AbstractOption.field25420,
      AbstractOption.field25425,
      AbstractOption.field25430,
      AbstractOption.field25421,
      AbstractOption.field25437,
      AbstractOption.field25440,
      AbstractOption.field25327,
      AbstractOption.field25325
   };
   private Class9046 field4689 = new Class9046(this, new Class7548());

   public Class846(Screen var1, GameSettings var2) {
      super(new StringTextComponent(I18n.format("of.options.qualityTitle")));
      this.field4686 = var1;
      this.field4687 = var2;
   }

   @Override
   public void method1921() {
      this.field4629.clear();

      for (int var3 = 0; var3 < field4688.length; var3++) {
         AbstractOption var4 = field4688[var3];
         int var5 = this.field4564 / 2 - 155 + var3 % 2 * 160;
         int var6 = this.field4565 / 6 + 21 * (var3 / 2) - 12;
         Class1197 var7 = this.<Class1197>method2455(var4.method17946(this.field4562.gameSettings, var5, var6, 150));
         if (var4 == AbstractOption.field25423 || var4 == AbstractOption.field25422) {
            var7.field6482 = false;
         }
      }

      this.<Class1210>method2455(new Class1210(200, this.field4564 / 2 - 100, this.field4565 / 6 + 168 + 11, I18n.format("gui.done")));
   }

   @Override
   public void method2563(Class1197 var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.field6482 && var4.field6523 == 200) {
            this.field4562.gameSettings.saveOptions();
            this.field4562.displayGuiScreen(this.field4686);
         }
      }
   }

   @Override
   public void onClose() {
      this.field4562.gameSettings.saveOptions();
      super.onClose();
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4630, this.field4560, this.field4564 / 2, 15, 16777215);
      super.method1923(var1, var2, var3, var4);
      this.field4689.method33640(var1, var2, var3, this.field4629);
   }
}
