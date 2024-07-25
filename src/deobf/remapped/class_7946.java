package remapped;

import com.google.common.collect.ImmutableList;

public class class_7946<T extends IronGolemEntity> extends class_5272<T> {
   private static String[] field_40670;
   private final class_1549 field_40665;
   private final class_1549 field_40666;
   private final class_1549 field_40669;
   private final class_1549 field_40668;
   private final class_1549 field_40667;
   private final class_1549 field_40664;

   public class_7946() {
      short var3 = 128;
      short var4 = 128;
      this.field_40665 = new class_1549(this).method_7033(128, 128);
      this.field_40665.method_7046(0.0F, -7.0F, -2.0F);
      this.field_40665.method_7037(0, 0).method_7049(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F);
      this.field_40665.method_7037(24, 0).method_7049(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F);
      this.field_40666 = new class_1549(this).method_7033(128, 128);
      this.field_40666.method_7046(0.0F, -7.0F, 0.0F);
      this.field_40666.method_7037(0, 40).method_7049(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F);
      this.field_40666.method_7037(0, 70).method_7049(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F);
      this.field_40669 = new class_1549(this).method_7033(128, 128);
      this.field_40669.method_7046(0.0F, -7.0F, 0.0F);
      this.field_40669.method_7037(60, 21).method_7049(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.field_40668 = new class_1549(this).method_7033(128, 128);
      this.field_40668.method_7046(0.0F, -7.0F, 0.0F);
      this.field_40668.method_7037(60, 58).method_7049(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.field_40667 = new class_1549(this, 0, 22).method_7033(128, 128);
      this.field_40667.method_7046(-4.0F, 11.0F, 0.0F);
      this.field_40667.method_7037(37, 0).method_7049(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
      this.field_40664 = new class_1549(this, 0, 22).method_7033(128, 128);
      this.field_40664.field_8197 = true;
      this.field_40664.method_7037(60, 0).method_7046(5.0F, 11.0F, 0.0F);
      this.field_40664.method_7049(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_40665, this.field_40666, this.field_40667, this.field_40664, this.field_40669, this.field_40668);
   }

   public void method_35976(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_40665.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_40665.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_40667.field_8191 = -1.5F * MathHelper.method_42852(var2, 13.0F) * var3;
      this.field_40664.field_8191 = 1.5F * MathHelper.method_42852(var2, 13.0F) * var3;
      this.field_40667.field_8190 = 0.0F;
      this.field_40664.field_8190 = 0.0F;
   }

   public void method_35978(T var1, float var2, float var3, float var4) {
      int var7 = var1.method_36977();
      if (var7 <= 0) {
         int var8 = var1.method_36978();
         if (var8 <= 0) {
            this.field_40669.field_8191 = (-0.2F + 1.5F * MathHelper.method_42852(var2, 13.0F)) * var3;
            this.field_40668.field_8191 = (-0.2F - 1.5F * MathHelper.method_42852(var2, 13.0F)) * var3;
         } else {
            this.field_40669.field_8191 = -0.8F + 0.025F * MathHelper.method_42852((float)var8, 70.0F);
            this.field_40668.field_8191 = 0.0F;
         }
      } else {
         this.field_40669.field_8191 = -2.0F + 1.5F * MathHelper.method_42852((float)var7 - var4, 10.0F);
         this.field_40668.field_8191 = -2.0F + 1.5F * MathHelper.method_42852((float)var7 - var4, 10.0F);
      }
   }

   public class_1549 method_35977() {
      return this.field_40669;
   }
}
