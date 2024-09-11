package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;

public class Class2814 extends Class2803<Class1015> {
   private static String[] field17526;
   private final Class7219 field17527;
   private final Class7219 field17528;
   private final Class7219 field17529;
   private final Class7219 field17530;
   private final Class7219 field17531;
   private final Class7219 field17532;
   private final Class7219 field17533;
   private final Class7219 field17534;
   private final Class7219 field17535;
   private final Class7219 field17536;
   private final Class7219 field17537;

   public Class2814() {
      this.field17604 = 32;
      this.field17605 = 32;
      this.field17527 = new Class7219(this, 2, 8);
      this.field17527.method22673(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F);
      this.field17527.method22679(0.0F, 16.5F, -3.0F);
      this.field17528 = new Class7219(this, 22, 1);
      this.field17528.method22673(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F);
      this.field17528.method22679(0.0F, 21.07F, 1.16F);
      this.field17529 = new Class7219(this, 19, 8);
      this.field17529.method22673(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.field17529.method22679(1.5F, 16.94F, -2.76F);
      this.field17530 = new Class7219(this, 19, 8);
      this.field17530.method22673(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.field17530.method22679(-1.5F, 16.94F, -2.76F);
      this.field17531 = new Class7219(this, 2, 2);
      this.field17531.method22673(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F);
      this.field17531.method22679(0.0F, 15.69F, -2.76F);
      this.field17532 = new Class7219(this, 10, 0);
      this.field17532.method22673(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F);
      this.field17532.method22679(0.0F, -2.0F, -1.0F);
      this.field17531.method22670(this.field17532);
      this.field17533 = new Class7219(this, 11, 7);
      this.field17533.method22673(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field17533.method22679(0.0F, -0.5F, -1.5F);
      this.field17531.method22670(this.field17533);
      this.field17534 = new Class7219(this, 16, 7);
      this.field17534.method22673(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field17534.method22679(0.0F, -1.75F, -2.45F);
      this.field17531.method22670(this.field17534);
      this.field17535 = new Class7219(this, 2, 18);
      this.field17535.method22673(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F);
      this.field17535.method22679(0.0F, -2.15F, 0.15F);
      this.field17531.method22670(this.field17535);
      this.field17536 = new Class7219(this, 14, 18);
      this.field17536.method22673(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field17536.method22679(1.0F, 22.0F, -1.05F);
      this.field17537 = new Class7219(this, 14, 18);
      this.field17537.method22673(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field17537.method22679(-1.0F, 22.0F, -1.05F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17527, this.field17529, this.field17530, this.field17528, this.field17531, this.field17536, this.field17537);
   }

   public void method10998(Class1015 var1, float var2, float var3, float var4, float var5, float var6) {
      this.method11020(method11022(var1), var1.ticksExisted, var2, var3, var4, var5, var6);
   }

   public void method10997(Class1015 var1, float var2, float var3, float var4) {
      this.method11021(method11022(var1));
   }

   public void method11019(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9) {
      this.method11021(Class2075.field13522);
      this.method11020(Class2075.field13522, var9, var5, var6, 0.0F, var7, var8);
      this.method11015().forEach(var4x -> var4x.method22680(var1, var2, var3, var4));
   }

   private void method11020(Class2075 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      this.field17531.field31035 = var7 * (float) (Math.PI / 180.0);
      this.field17531.field31036 = var6 * (float) (Math.PI / 180.0);
      this.field17531.field31037 = 0.0F;
      this.field17531.field31032 = 0.0F;
      this.field17527.field31032 = 0.0F;
      this.field17528.field31032 = 0.0F;
      this.field17530.field31032 = -1.5F;
      this.field17529.field31032 = 1.5F;
      switch (Class7738.field33233[var1.ordinal()]) {
         case 1:
            break;
         case 2:
            float var10 = MathHelper.cos((float)var2);
            float var11 = MathHelper.sin((float)var2);
            this.field17531.field31032 = var10;
            this.field17531.field31033 = 15.69F + var11;
            this.field17531.field31035 = 0.0F;
            this.field17531.field31036 = 0.0F;
            this.field17531.field31037 = MathHelper.sin((float)var2) * 0.4F;
            this.field17527.field31032 = var10;
            this.field17527.field31033 = 16.5F + var11;
            this.field17529.field31037 = -0.0873F - var5;
            this.field17529.field31032 = 1.5F + var10;
            this.field17529.field31033 = 16.94F + var11;
            this.field17530.field31037 = 0.0873F + var5;
            this.field17530.field31032 = -1.5F + var10;
            this.field17530.field31033 = 16.94F + var11;
            this.field17528.field31032 = var10;
            this.field17528.field31033 = 21.07F + var11;
            break;
         case 3:
            this.field17536.field31035 = this.field17536.field31035 + MathHelper.cos(var3 * 0.6662F) * 1.4F * var4;
            this.field17537.field31035 = this.field17537.field31035 + MathHelper.cos(var3 * 0.6662F + (float) Math.PI) * 1.4F * var4;
         case 4:
         case 5:
         default:
            float var12 = var5 * 0.3F;
            this.field17531.field31033 = 15.69F + var12;
            this.field17528.field31035 = 1.015F + MathHelper.cos(var3 * 0.6662F) * 0.3F * var4;
            this.field17528.field31033 = 21.07F + var12;
            this.field17527.field31033 = 16.5F + var12;
            this.field17529.field31037 = -0.0873F - var5;
            this.field17529.field31033 = 16.94F + var12;
            this.field17530.field31037 = 0.0873F + var5;
            this.field17530.field31033 = 16.94F + var12;
            this.field17536.field31033 = 22.0F + var12;
            this.field17537.field31033 = 22.0F + var12;
      }
   }

   private void method11021(Class2075 var1) {
      this.field17535.field31035 = -0.2214F;
      this.field17527.field31035 = 0.4937F;
      this.field17529.field31035 = -0.6981F;
      this.field17529.field31036 = (float) -Math.PI;
      this.field17530.field31035 = -0.6981F;
      this.field17530.field31036 = (float) -Math.PI;
      this.field17536.field31035 = -0.0299F;
      this.field17537.field31035 = -0.0299F;
      this.field17536.field31033 = 22.0F;
      this.field17537.field31033 = 22.0F;
      this.field17536.field31037 = 0.0F;
      this.field17537.field31037 = 0.0F;
      switch (Class7738.field33233[var1.ordinal()]) {
         case 1:
            float var4 = 1.9F;
            this.field17531.field31033 = 17.59F;
            this.field17528.field31035 = 1.5388988F;
            this.field17528.field31033 = 22.97F;
            this.field17527.field31033 = 18.4F;
            this.field17529.field31037 = -0.0873F;
            this.field17529.field31033 = 18.84F;
            this.field17530.field31037 = 0.0873F;
            this.field17530.field31033 = 18.84F;
            this.field17536.field31033++;
            this.field17537.field31033++;
            this.field17536.field31035++;
            this.field17537.field31035++;
            break;
         case 2:
            this.field17536.field31037 = (float) (-Math.PI / 9);
            this.field17537.field31037 = (float) (Math.PI / 9);
         case 3:
         case 5:
         default:
            break;
         case 4:
            this.field17536.field31035 += (float) (Math.PI * 2.0 / 9.0);
            this.field17537.field31035 += (float) (Math.PI * 2.0 / 9.0);
      }
   }

   private static Class2075 method11022(Class1015 var0) {
      if (!var0.method4407()) {
         if (!var0.method4395()) {
            return !var0.method4416() ? Class2075.field13519 : Class2075.field13518;
         } else {
            return Class2075.field13520;
         }
      } else {
         return Class2075.field13521;
      }
   }
}
