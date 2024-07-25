package remapped;

import com.google.common.collect.ImmutableList;

public class class_2313<T extends class_8145> extends class_9387<T> {
   private static String[] field_11574;
   private final class_1549 field_11575;
   private final class_1549 field_11571;
   private final class_1549 field_11570;
   private final class_1549 field_11572;
   private final class_1549 field_11573;
   private final class_1549 field_11576;

   public class_2313(float var1) {
      this.field_49928 = 32;
      this.field_49927 = 32;
      byte var4 = 19;
      this.field_11575 = new class_1549(this, 0, 20);
      this.field_11575.method_7049(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, var1);
      this.field_11575.method_7046(0.0F, 19.0F, 0.0F);
      this.field_11571 = new class_1549(this, 21, 16);
      this.field_11571.method_7049(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, var1);
      this.field_11571.method_7046(0.0F, 19.0F, 3.0F);
      this.field_11570 = new class_1549(this, 2, 16);
      this.field_11570.method_7049(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field_11570.method_7046(-1.0F, 20.0F, 0.0F);
      this.field_11570.field_8190 = (float) (Math.PI / 4);
      this.field_11572 = new class_1549(this, 2, 12);
      this.field_11572.method_7049(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field_11572.method_7046(1.0F, 20.0F, 0.0F);
      this.field_11572.field_8190 = (float) (-Math.PI / 4);
      this.field_11573 = new class_1549(this, 20, 11);
      this.field_11573.method_7049(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.field_11573.method_7046(0.0F, 16.0F, -3.0F);
      this.field_11576 = new class_1549(this, 20, 21);
      this.field_11576.method_7049(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.field_11576.method_7046(0.0F, 22.0F, -3.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_11575, this.field_11571, this.field_11570, this.field_11572, this.field_11573, this.field_11576);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.method_37285()) {
         var9 = 1.5F;
      }

      this.field_11571.field_8190 = -var9 * 0.45F * class_9299.method_42818(0.6F * var4);
   }
}
