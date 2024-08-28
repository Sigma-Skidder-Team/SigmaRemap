package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class Class2893 extends Class2892 {
   private static String[] field17913;
   private final Class7219 field17914;
   private final Class7219 field17915;
   private final Class7219 field17916;
   private final Class7219 field17917;

   public Class2893() {
      this(0.0F);
   }

   public Class2893(float var1) {
      super(var1, 64, 64);
      this.field17432 = new Class7219(this, 0, 0);
      this.field17432.method22675(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field17432.method22679(0.0F, 0.0F, 0.0F);
      this.field17434 = new Class7219(this, 0, 26);
      this.field17434.method22675(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F, var1);
      this.field17434.method22679(0.0F, 0.0F, 0.0F);
      this.field17435 = new Class7219(this, 24, 0);
      this.field17435.method22675(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.field17435.method22679(-5.0F, 2.0F, 0.0F);
      this.field17436 = new Class7219(this, 32, 16);
      this.field17436.field31038 = true;
      this.field17436.method22675(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
      this.field17436.method22679(5.0F, 2.0F, 0.0F);
      this.field17437 = new Class7219(this, 8, 0);
      this.field17437.method22675(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.field17437.method22679(-1.9F, 12.0F, 0.0F);
      this.field17438 = new Class7219(this, 40, 16);
      this.field17438.field31038 = true;
      this.field17438.method22675(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, var1);
      this.field17438.method22679(1.9F, 12.0F, 0.0F);
      this.field17914 = new Class7219(this, 16, 0);
      this.field17914.method22675(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field17914.method22679(0.0F, 0.0F, 0.0F);
      this.field17914.field31039 = true;
      this.field17915 = new Class7219(this, 48, 16);
      this.field17915.method22675(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F, var1);
      this.field17915.method22679(0.0F, 0.0F, 0.0F);
      this.field17916 = new Class7219(this, 0, 48);
      this.field17916.method22675(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, var1);
      this.field17916.method22679(0.0F, 0.0F, 0.0F);
      this.field17917 = new Class7219(this, 0, 32);
      this.field17917.method22675(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F, var1);
      this.field17917.method22679(0.0F, 12.0F, 0.0F);
      this.field17433.field31039 = false;
   }

   public void method10997(Class1005 var1, float var2, float var3, float var4) {
      this.field17917.field31035 = 0.0F;
      this.field17917.field31036 = (float) (Math.PI / 180.0) * -MathHelper.method37827(var4, var1.field5033, var1.field5031);
      this.field17917.field31037 = 0.0F;
   }

   @Override
   public void method10998(Class1005 var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998(var1, var2, var3, var4, var5, var6);
      this.field17436.field31039 = var1.method4199();
      this.field17435.field31039 = var1.method4199();
      this.field17917.field31039 = !var1.method4201();
      this.field17438.method22679(1.9F, 12.0F, 0.0F);
      this.field17437.method22679(-1.9F, 12.0F, 0.0F);
      this.field17914.field31035 = (float) (Math.PI / 180.0) * var1.method4212().method22013();
      this.field17914.field31036 = (float) (Math.PI / 180.0) * var1.method4212().method22014();
      this.field17914.field31037 = (float) (Math.PI / 180.0) * var1.method4212().method22015();
      this.field17915.field31035 = (float) (Math.PI / 180.0) * var1.method4212().method22013();
      this.field17915.field31036 = (float) (Math.PI / 180.0) * var1.method4212().method22014();
      this.field17915.field31037 = (float) (Math.PI / 180.0) * var1.method4212().method22015();
      this.field17916.field31035 = (float) (Math.PI / 180.0) * var1.method4212().method22013();
      this.field17916.field31036 = (float) (Math.PI / 180.0) * var1.method4212().method22014();
      this.field17916.field31037 = (float) (Math.PI / 180.0) * var1.method4212().method22015();
   }

   @Override
   public Iterable<Class7219> method11002() {
      return Iterables.concat(super.method11002(), ImmutableList.of(this.field17914, this.field17915, this.field17916, this.field17917));
   }

   @Override
   public void method11010(Class2205 var1, MatrixStack var2) {
      Class7219 var5 = this.method11011(var1);
      boolean var6 = var5.field31039;
      var5.field31039 = true;
      super.method11010(var1, var2);
      var5.field31039 = var6;
   }
}
