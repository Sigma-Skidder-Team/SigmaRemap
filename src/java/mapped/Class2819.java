package mapped;

import com.google.common.collect.ImmutableList;

public class Class2819 extends Class2803<Class1029> {
   private static String[] field17556;
   private final Class7219 field17557;
   private final Class7219 field17558;
   private final Class7219 field17559;
   private final Class7219 field17560;
   private final Class7219 field17561;
   private final Class7219 field17562;
   private final Class7219 field17563;
   private final Class7219 field17564;

   public Class2819() {
      this.field17604 = 128;
      this.field17605 = 128;

      this.field17564 = new Class7219(this);
      this.field17564.method22679(0.0F, -7.0F, -1.5F);
      this.field17564.method22671(68, 73).method22675(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F, 0.0F);
      this.field17557 = new Class7219(this);
      this.field17557.method22679(0.0F, 16.0F, -17.0F);
      this.field17557.method22671(0, 0).method22675(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, 0.0F);
      this.field17557.method22671(0, 0).method22675(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, 0.0F);
      Class7219 var5 = new Class7219(this);
      var5.method22679(-10.0F, -14.0F, -8.0F);
      var5.method22671(74, 55).method22675(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var5.field31035 = 1.0995574F;
      this.field17557.method22670(var5);
      Class7219 var6 = new Class7219(this);
      var6.field31038 = true;
      var6.method22679(8.0F, -14.0F, -8.0F);
      var6.method22671(74, 55).method22675(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var6.field31035 = 1.0995574F;
      this.field17557.method22670(var6);
      this.field17558 = new Class7219(this);
      this.field17558.method22679(0.0F, -2.0F, 2.0F);
      this.field17558.method22671(0, 36).method22675(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F, 0.0F);
      this.field17557.method22670(this.field17558);
      this.field17564.method22670(this.field17557);
      this.field17559 = new Class7219(this);
      this.field17559.method22671(0, 55).method22675(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, 0.0F);
      this.field17559.method22671(0, 91).method22675(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, 0.0F);
      this.field17559.method22679(0.0F, 1.0F, 2.0F);
      this.field17560 = new Class7219(this, 96, 0);
      this.field17560.method22675(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17560.method22679(-8.0F, -13.0F, 18.0F);
      this.field17561 = new Class7219(this, 96, 0);
      this.field17561.field31038 = true;
      this.field17561.method22675(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17561.method22679(8.0F, -13.0F, 18.0F);
      this.field17562 = new Class7219(this, 64, 0);
      this.field17562.method22675(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17562.method22679(-8.0F, -13.0F, -5.0F);
      this.field17563 = new Class7219(this, 64, 0);
      this.field17563.field31038 = true;
      this.field17563.method22675(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field17563.method22679(8.0F, -13.0F, -5.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17564, this.field17559, this.field17560, this.field17561, this.field17562, this.field17563);
   }

   public void method10998(Class1029 var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17557.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17557.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17559.field31035 = (float) (Math.PI / 2);
      float var9 = 0.4F * var3;
      this.field17560.field31035 = MathHelper.cos(var2 * 0.6662F) * var9;
      this.field17561.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var9;
      this.field17562.field31035 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var9;
      this.field17563.field31035 = MathHelper.cos(var2 * 0.6662F) * var9;
   }

   public void method10997(Class1029 var1, float var2, float var3, float var4) {
      super.method10997(var1, var2, var3, var4);
      int var7 = var1.method4586();
      int var8 = var1.method4587();

      int var10 = var1.method4585();
      if (var10 <= 0) {
         float var12 = -1.0F;
         float var13 = -1.0F * MathHelper.sin(this.field17564.field31035);
         this.field17564.field31032 = 0.0F;
         this.field17564.field31033 = -7.0F - var13;
         this.field17564.field31034 = 5.5F;
         boolean var14 = var7 > 0;
         this.field17564.field31035 = !var14 ? 0.0F : 0.21991149F;
         this.field17558.field31035 = (float) Math.PI * (!var14 ? 0.01F : 0.05F);
         if (!var14) {
            if (var8 > 0) {
               float var15 = MathHelper.sin(((float)(20 - var8) - var4) / 20.0F * (float) Math.PI * 0.25F);
               this.field17558.field31035 = (float) (Math.PI / 2) * var15;
            }
         } else {
            double var17 = (double)var7 / 40.0;
            this.field17564.field31032 = (float)Math.sin(var17 * 10.0) * 3.0F;
         }
      } else {
         float var19 = MathHelper.method37830((float)var10 - var4, 10.0F);
         float var20 = (1.0F + var19) * 0.5F;
         float var21 = var20 * var20 * var20 * 12.0F;
         float var22 = var21 * MathHelper.sin(this.field17564.field31035);
         this.field17564.field31034 = -6.5F + var21;
         this.field17564.field31033 = -7.0F - var22;
         float var16 = MathHelper.sin(((float)var10 - var4) / 10.0F * (float) Math.PI * 0.25F);
         this.field17558.field31035 = (float) (Math.PI / 2) * var16;
         if (var10 <= 5) {
            this.field17558.field31035 = (float) (Math.PI / 20) * MathHelper.sin((float) Math.PI * ((float)var10 - var4) / 10.0F);
         } else {
            this.field17558.field31035 = MathHelper.sin(((float)(-4 + var10) - var4) / 4.0F) * (float) Math.PI * 0.4F;
         }
      }
   }
}
