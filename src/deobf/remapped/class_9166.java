package remapped;

import com.google.common.collect.ImmutableList;

public class class_9166<T extends class_5521> extends class_6521<T> {
   private static String[] field_46918;
   private final class_1549 field_46917;
   private final class_1549 field_46919;
   private final class_1549 field_46913;
   private final class_1549 field_46916;
   private final class_1549 field_46915;
   private final class_1549 field_46920;
   private final class_1549 field_46912;
   private final class_1549 field_46914;

   public class_9166(float var1) {
      this.field_49928 = 128;
      this.field_49927 = 64;
      this.field_46917 = new class_1549(this, 0, 0);
      this.field_46917.method_7049(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, var1);
      this.field_46917.method_7046(0.0F, 7.0F, -6.0F);
      this.field_46917.method_7037(0, 14).method_7049(-4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, var1);
      this.field_46917.method_7037(17, 0).method_7049(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.field_46917.method_7037(17, 0).method_7049(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.field_46919 = new class_1549(this, 29, 0);
      this.field_46919.method_7049(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, var1);
      this.field_46919.method_7046(0.0F, 5.0F, 2.0F);
      this.field_46912 = new class_1549(this, 45, 28);
      this.field_46912.method_7049(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.field_46912.method_7046(-8.5F, 3.0F, 3.0F);
      this.field_46912.field_8190 = (float) (Math.PI / 2);
      this.field_46914 = new class_1549(this, 45, 41);
      this.field_46914.method_7049(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.field_46914.method_7046(5.5F, 3.0F, 3.0F);
      this.field_46914.field_8190 = (float) (Math.PI / 2);
      byte var4 = 4;
      byte var5 = 14;
      this.field_46913 = new class_1549(this, 29, 29);
      this.field_46913.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field_46913.method_7046(-2.5F, 10.0F, 6.0F);
      this.field_46916 = new class_1549(this, 29, 29);
      this.field_46916.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field_46916.method_7046(2.5F, 10.0F, 6.0F);
      this.field_46915 = new class_1549(this, 29, 29);
      this.field_46915.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field_46915.method_7046(-2.5F, 10.0F, -4.0F);
      this.field_46920 = new class_1549(this, 29, 29);
      this.field_46920.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.field_46920.method_7046(2.5F, 10.0F, -4.0F);
      this.field_46913.field_8183--;
      this.field_46916.field_8183++;
      this.field_46913.field_8187 += 0.0F;
      this.field_46916.field_8187 += 0.0F;
      this.field_46915.field_8183--;
      this.field_46920.field_8183++;
      this.field_46915.field_8187--;
      this.field_46920.field_8187--;
   }

   public void method_42257(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_46917.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_46917.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_46919.field_8191 = (float) (Math.PI / 2);
      this.field_46913.field_8191 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field_46916.field_8191 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_46915.field_8191 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_46920.field_8191 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      boolean var9 = !var1.method_26449() && var1.method_25017();
      this.field_46912.field_8200 = var9;
      this.field_46914.field_8200 = var9;
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (!this.field_33204) {
         ImmutableList.of(
               this.field_46917, this.field_46919, this.field_46913, this.field_46916, this.field_46915, this.field_46920, this.field_46912, this.field_46914
            )
            .forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
      } else {
         float var11 = 2.0F;
         var1.method_36063();
         float var12 = 0.7F;
         var1.method_36062(0.71428573F, 0.64935064F, 0.7936508F);
         var1.method_36065(0.0, 1.3125, 0.22F);
         this.field_46917.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.method_36064();
         var1.method_36063();
         float var13 = 1.1F;
         var1.method_36062(0.625F, 0.45454544F, 0.45454544F);
         var1.method_36065(0.0, 2.0625, 0.0);
         this.field_46919.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.method_36064();
         var1.method_36063();
         var1.method_36062(0.45454544F, 0.41322312F, 0.45454544F);
         var1.method_36065(0.0, 2.0625, 0.0);
         ImmutableList.of(this.field_46913, this.field_46916, this.field_46915, this.field_46920, this.field_46912, this.field_46914)
            .forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.method_36064();
      }
   }
}
