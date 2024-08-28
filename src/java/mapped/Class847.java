package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class847 extends Class838 {
   private Screen field4690;
   private Class9574 field4691;
   private static Class5805[] field4692 = new Class5805[]{
      Class5805.field25378,
      Class5805.field25379,
      Class5805.field25380,
      Class5805.field25381,
      Class5805.field25396,
      Class5805.field25397,
      Class5805.field25398,
      Class5805.field25419,
      Class5805.field25374,
      Class5805.field25375,
      Class5805.field25433,
      Class5805.field25427,
      Class5805.field25428,
      Class5805.field25414,
      Class5805.field25399,
      Class5805.field25436,
      Class5805.field25334,
      Class5805.field25315
   };
   private Class9046 field4693 = new Class9046(this, new Class7548());

   public Class847(Screen var1, Class9574 var2) {
      super(new StringTextComponent(Class9088.method33883("of.options.detailsTitle")));
      this.field4690 = var1;
      this.field4691 = var2;
   }

   @Override
   public void method1921() {
      this.field4629.clear();

      for (int var3 = 0; var3 < field4692.length; var3++) {
         Class5805 var4 = field4692[var3];
         int var5 = this.field4564 / 2 - 155 + var3 % 2 * 160;
         int var6 = this.field4565 / 6 + 21 * (var3 / 2) - 12;
         this.<Class1197>method2455(var4.method17946(this.field4562.field1299, var5, var6, 150));
      }

      this.<Class1210>method2455(new Class1210(200, this.field4564 / 2 - 100, this.field4565 / 6 + 168 + 11, Class9088.method33883("gui.done")));
   }

   @Override
   public void method2563(Class1197 var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.field6482 && var4.field6523 == 200) {
            this.field4562.field1299.method37146();
            this.field4562.displayGuiScreen(this.field4690);
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
      method5691(var1, this.field4562.field1294, this.field4560, this.field4564 / 2, 15, 16777215);
      super.method1923(var1, var2, var3, var4);
      this.field4693.method33640(var1, var2, var3, this.field4629);
   }
}
