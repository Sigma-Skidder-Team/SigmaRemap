package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class Class2896 extends Class2797<Class1100> {
   private static String[] field17431;
   private final Class7219 field17934;
   private final Class7219 field17935;

   public Class2896() {
      super(0.0F, 0.0F, 64, 64);
      this.field17438.field31039 = false;
      this.field17433.field31039 = false;
      this.field17437 = new Class7219(this, 32, 0);
      this.field17437.method22675(-1.0F, -1.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F);
      this.field17437.method22679(-1.9F, 12.0F, 0.0F);
      this.field17935 = new Class7219(this, 0, 32);
      this.field17935.method22673(-20.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
      this.field17934 = new Class7219(this, 0, 32);
      this.field17934.field31038 = true;
      this.field17934.method22673(0.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
   }

   @Override
   public Iterable<Class7219> method11002() {
      return Iterables.concat(super.method11002(), ImmutableList.of(this.field17935, this.field17934));
   }

   public void method10998(Class1100 var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998(var1, var2, var3, var4, var5, var6);
      if (var1.method5275()) {
         if (!var1.method3090().method32105()) {
            if (var1.method2967() != Class2205.field14418) {
               this.field17436.field31035 = 3.7699115F;
            } else {
               this.field17435.field31035 = 3.7699115F;
            }
         } else {
            this.field17435.field31035 = (float) (Math.PI * 3.0 / 2.0);
            this.field17436.field31035 = (float) (Math.PI * 3.0 / 2.0);
         }
      }

      this.field17437.field31035 += (float) (Math.PI / 5);
      this.field17935.field31034 = 2.0F;
      this.field17934.field31034 = 2.0F;
      this.field17935.field31033 = 1.0F;
      this.field17934.field31033 = 1.0F;
      this.field17935.field31036 = 0.47123894F + MathHelper.method37764(var4 * 0.8F) * (float) Math.PI * 0.05F;
      this.field17934.field31036 = -this.field17935.field31036;
      this.field17934.field31037 = -0.47123894F;
      this.field17934.field31035 = 0.47123894F;
      this.field17935.field31035 = 0.47123894F;
      this.field17935.field31037 = 0.47123894F;
   }
}
