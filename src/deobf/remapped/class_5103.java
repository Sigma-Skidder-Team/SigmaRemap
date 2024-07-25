package remapped;

import com.google.common.collect.ImmutableList;

public class class_5103<T extends Entity> extends class_5272<T> implements class_8667, class_6582 {
   private static String[] field_26329;
   public class_1549 field_26323;
   public class_1549 field_26328;
   public final class_1549 field_26324;
   public final class_1549 field_26326;
   public final class_1549 field_26327;
   public final class_1549 field_26331;
   public final class_1549 field_26322;
   public final class_1549 field_26325;
   public final class_1549 field_26330;

   public class_5103(float var1) {
      this(var1, 64, 64);
   }

   public class_5103(float var1, int var2, int var3) {
      float var6 = 0.5F;
      this.field_26323 = new class_1549(this).method_7033(var2, var3);
      this.field_26323.method_7046(0.0F, 0.0F, 0.0F);
      this.field_26323.method_7037(0, 0).method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
      this.field_26328 = new class_1549(this).method_7033(var2, var3);
      this.field_26328.method_7046(0.0F, 0.0F, 0.0F);
      this.field_26328.method_7037(32, 0).method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
      this.field_26323.method_7043(this.field_26328);
      this.field_26324 = new class_1549(this).method_7033(var2, var3);
      this.field_26324.method_7046(0.0F, 0.0F, 0.0F);
      this.field_26324.method_7037(30, 47).method_7049(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
      this.field_26324.field_8191 = (float) (-Math.PI / 2);
      this.field_26328.method_7043(this.field_26324);
      this.field_26330 = new class_1549(this).method_7033(var2, var3);
      this.field_26330.method_7046(0.0F, -2.0F, 0.0F);
      this.field_26330.method_7037(24, 0).method_7049(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
      this.field_26323.method_7043(this.field_26330);
      this.field_26326 = new class_1549(this).method_7033(var2, var3);
      this.field_26326.method_7046(0.0F, 0.0F, 0.0F);
      this.field_26326.method_7037(16, 20).method_7049(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
      this.field_26327 = new class_1549(this).method_7033(var2, var3);
      this.field_26327.method_7046(0.0F, 0.0F, 0.0F);
      this.field_26327.method_7037(0, 38).method_7049(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.5F);
      this.field_26326.method_7043(this.field_26327);
      this.field_26331 = new class_1549(this).method_7033(var2, var3);
      this.field_26331.method_7046(0.0F, 2.0F, 0.0F);
      this.field_26331.method_7037(44, 22).method_7049(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1);
      this.field_26331.method_7037(44, 22).method_7051(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, var1, true);
      this.field_26331.method_7037(40, 38).method_7049(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, var1);
      this.field_26322 = new class_1549(this, 0, 22).method_7033(var2, var3);
      this.field_26322.method_7046(-2.0F, 12.0F, 0.0F);
      this.field_26322.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_26325 = new class_1549(this, 0, 22).method_7033(var2, var3);
      this.field_26325.field_8197 = true;
      this.field_26325.method_7046(2.0F, 12.0F, 0.0F);
      this.field_26325.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_26323, this.field_26326, this.field_26322, this.field_26325, this.field_26331);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = false;
      if (var1 instanceof class_405) {
         var9 = ((class_405)var1).method_2026() > 0;
      }

      this.field_26323.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_26323.field_8191 = var6 * (float) (Math.PI / 180.0);
      if (!var9) {
         this.field_26323.field_8185 = 0.0F;
      } else {
         this.field_26323.field_8185 = 0.3F * class_9299.method_42818(0.45F * var4);
         this.field_26323.field_8191 = 0.4F;
      }

      this.field_26331.field_8181 = 3.0F;
      this.field_26331.field_8187 = -1.0F;
      this.field_26331.field_8191 = -0.75F;
      this.field_26322.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3 * 0.5F;
      this.field_26325.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3 * 0.5F;
      this.field_26322.field_8190 = 0.0F;
      this.field_26325.field_8190 = 0.0F;
   }

   @Override
   public class_1549 method_39733() {
      return this.field_26323;
   }

   @Override
   public void method_30080(boolean var1) {
      this.field_26323.field_8200 = var1;
      this.field_26328.field_8200 = var1;
      this.field_26324.field_8200 = var1;
   }
}
