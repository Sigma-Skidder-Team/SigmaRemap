package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class840 extends Class838 {
   private Screen field4636;
   private Class9574 field4637;
   private static Class5805[] field4638 = new Class5805[]{
      Class5805.field25382,
      Class5805.field25383,
      Class5805.field25384,
      Class5805.field25385,
      Class5805.field25391,
      Class5805.field25392,
      Class5805.field25393,
      Class5805.field25394,
      Class5805.field25404,
      Class5805.field25405,
      Class5805.field25406,
      Class5805.field25407,
      Class5805.field25408,
      Class5805.field25411,
      Class5805.field25413,
      Class5805.field25424,
      Class5805.field25409,
      Class5805.field25347
   };

   public Class840(Screen var1, Class9574 var2) {
      super(new StringTextComponent(Class9088.method33883("of.options.animationsTitle")));
      this.field4636 = var1;
      this.field4637 = var2;
   }

   @Override
   public void method1921() {
      this.field4629.clear();

      for (int var3 = 0; var3 < field4638.length; var3++) {
         Class5805 var4 = field4638[var3];
         int var5 = this.field4564 / 2 - 155 + var3 % 2 * 160;
         int var6 = this.field4565 / 6 + 21 * (var3 / 2) - 12;
         this.<Class1197>method2455(var4.method17946(this.field4562.field1299, var5, var6, 150));
      }

      this.<Class1210>method2455(
         new Class1210(210, this.field4564 / 2 - 155, this.field4565 / 6 + 168 + 11, 70, 20, Class8043.method27619("of.options.animation.allOn"))
      );
      this.<Class1210>method2455(
         new Class1210(211, this.field4564 / 2 - 155 + 80, this.field4565 / 6 + 168 + 11, 70, 20, Class8043.method27619("of.options.animation.allOff"))
      );
      this.<Class1211>method2455(new Class1211(200, this.field4564 / 2 + 5, this.field4565 / 6 + 168 + 11, Class9088.method33883("gui.done")));
   }

   @Override
   public void method2563(Class1197 var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.field6482) {
            if (var4.field6523 == 200) {
               this.field4562.field1299.method37146();
               this.field4562.displayGuiScreen(this.field4636);
            }

            if (var4.field6523 == 210) {
               this.field4562.field1299.method37166(true);
            }

            if (var4.field6523 == 211) {
               this.field4562.field1299.method37166(false);
            }

            this.field4562.method1481();
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
   }
}
