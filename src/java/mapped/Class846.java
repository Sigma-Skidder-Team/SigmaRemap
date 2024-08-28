package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class846 extends Class838 {
   private Screen field4686;
   private Class9574 field4687;
   private static Class5805[] field4688 = new Class5805[]{
      Class5805.field25330,
      Class5805.field25376,
      Class5805.field25423,
      Class5805.field25422,
      Class5805.field25426,
      Class5805.field25415,
      Class5805.field25390,
      Class5805.field25412,
      Class5805.field25417,
      Class5805.field25418,
      Class5805.field25420,
      Class5805.field25425,
      Class5805.field25430,
      Class5805.field25421,
      Class5805.field25437,
      Class5805.field25440,
      Class5805.field25327,
      Class5805.field25325
   };
   private Class9046 field4689 = new Class9046(this, new Class7548());

   public Class846(Screen var1, Class9574 var2) {
      super(new StringTextComponent(Class9088.method33883("of.options.qualityTitle")));
      this.field4686 = var1;
      this.field4687 = var2;
   }

   @Override
   public void method1921() {
      this.field4629.clear();

      for (int var3 = 0; var3 < field4688.length; var3++) {
         Class5805 var4 = field4688[var3];
         int var5 = this.field4564 / 2 - 155 + var3 % 2 * 160;
         int var6 = this.field4565 / 6 + 21 * (var3 / 2) - 12;
         Class1197 var7 = this.<Class1197>method2455(var4.method17946(this.field4562.field1299, var5, var6, 150));
         if (var4 == Class5805.field25423 || var4 == Class5805.field25422) {
            var7.field6482 = false;
         }
      }

      this.<Class1210>method2455(new Class1210(200, this.field4564 / 2 - 100, this.field4565 / 6 + 168 + 11, Class9088.method33883("gui.done")));
   }

   @Override
   public void method2563(Class1197 var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.field6482 && var4.field6523 == 200) {
            this.field4562.field1299.method37146();
            this.field4562.displayGuiScreen(this.field4686);
         }
      }
   }

   @Override
   public void method1931() {
      this.field4562.field1299.method37146();
      super.method1931();
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4630, this.field4560, this.field4564 / 2, 15, 16777215);
      super.method1923(var1, var2, var3, var4);
      this.field4689.method33640(var1, var2, var3, this.field4629);
   }
}
