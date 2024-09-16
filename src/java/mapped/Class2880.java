package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2880<T extends Class1058> extends Class2803<T> {
   private static String[] field17855;
   private final Class7219 field17856;
   private final Class7219 field17857;
   private final Class7219 field17858;
   private final Class7219 field17859;
   private final Class7219 field17860;
   private final Class7219 field17861;

   public Class2880() {
      short var3 = 128;
      short var4 = 128;
      this.field17856 = new Class7219(this).method22684(128, 128);
      this.field17856.method22679(0.0F, -7.0F, -2.0F);
      this.field17856.method22671(0, 0).method22675(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F);
      this.field17856.method22671(24, 0).method22675(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F);
      this.field17857 = new Class7219(this).method22684(128, 128);
      this.field17857.method22679(0.0F, -7.0F, 0.0F);
      this.field17857.method22671(0, 40).method22675(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F);
      this.field17857.method22671(0, 70).method22675(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F);
      this.field17858 = new Class7219(this).method22684(128, 128);
      this.field17858.method22679(0.0F, -7.0F, 0.0F);
      this.field17858.method22671(60, 21).method22675(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.field17859 = new Class7219(this).method22684(128, 128);
      this.field17859.method22679(0.0F, -7.0F, 0.0F);
      this.field17859.method22671(60, 58).method22675(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.field17860 = new Class7219(this, 0, 22).method22684(128, 128);
      this.field17860.method22679(-4.0F, 11.0F, 0.0F);
      this.field17860.method22671(37, 0).method22675(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
      this.field17861 = new Class7219(this, 0, 22).method22684(128, 128);
      this.field17861.field31038 = true;
      this.field17861.method22671(60, 0).method22679(5.0F, 11.0F, 0.0F);
      this.field17861.method22675(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17856, this.field17857, this.field17860, this.field17861, this.field17858, this.field17859);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17856.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17856.field31035 = var6 * (float) (Math.PI / 180.0);
      this.field17860.field31035 = -1.5F * MathHelper.method37830(var2, 13.0F) * var3;
      this.field17861.field31035 = 1.5F * MathHelper.method37830(var2, 13.0F) * var3;
      this.field17860.field31036 = 0.0F;
      this.field17861.field31036 = 0.0F;
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      int var7 = var1.method4866();
      if (var7 <= 0) {
         int var8 = var1.method4868();
         if (var8 <= 0) {
            this.field17858.field31035 = (-0.2F + 1.5F * MathHelper.method37830(var2, 13.0F)) * var3;
            this.field17859.field31035 = (-0.2F - 1.5F * MathHelper.method37830(var2, 13.0F)) * var3;
         } else {
            this.field17858.field31035 = -0.8F + 0.025F * MathHelper.method37830((float)var8, 70.0F);
            this.field17859.field31035 = 0.0F;
         }
      } else {
         this.field17858.field31035 = -2.0F + 1.5F * MathHelper.method37830((float)var7 - var4, 10.0F);
         this.field17859.field31035 = -2.0F + 1.5F * MathHelper.method37830((float)var7 - var4, 10.0F);
      }
   }

   public Class7219 method11198() {
      return this.field17858;
   }
}
