package remapped;

import com.google.common.collect.ImmutableList;

public class class_7236<T extends class_8145> extends class_5272<T> {
   private static String[] field_37121;
   private final class_1549 field_37126;
   private final class_1549 field_37122;
   private final class_1549 field_37124;
   private final class_1549 field_37125;
   private final class_1549 field_37127;
   private final class_1549 field_37123;
   private final class_1549 field_37128;

   public class_7236() {
      this(0.0F);
   }

   public class_7236(float var1) {
      byte var4 = 6;
      this.field_37126 = new class_1549(this, 0, 0);
      this.field_37126.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.field_37126.method_7046(0.0F, 6.0F, 0.0F);
      this.field_37122 = new class_1549(this, 32, 0);
      this.field_37122.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 + 0.5F);
      this.field_37122.method_7046(0.0F, 6.0F, 0.0F);
      this.field_37124 = new class_1549(this, 16, 16);
      this.field_37124.method_7049(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.field_37124.method_7046(0.0F, 6.0F, 0.0F);
      this.field_37125 = new class_1549(this, 0, 16);
      this.field_37125.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field_37125.method_7046(-2.0F, 18.0F, 4.0F);
      this.field_37127 = new class_1549(this, 0, 16);
      this.field_37127.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field_37127.method_7046(2.0F, 18.0F, 4.0F);
      this.field_37123 = new class_1549(this, 0, 16);
      this.field_37123.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field_37123.method_7046(-2.0F, 18.0F, -4.0F);
      this.field_37128 = new class_1549(this, 0, 16);
      this.field_37128.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.field_37128.method_7046(2.0F, 18.0F, -4.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_37126, this.field_37124, this.field_37125, this.field_37127, this.field_37123, this.field_37128);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_37126.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_37126.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_37125.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
      this.field_37127.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_37123.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_37128.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
   }
}
