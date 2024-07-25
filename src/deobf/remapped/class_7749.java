package remapped;

import com.google.common.collect.ImmutableList;

public class class_7749<T extends class_8145> extends class_5272<T> {
   private static String[] field_39286;
   private final class_1549 field_39287;
   private final class_1549 field_39285;
   private final class_1549 field_39284;
   private final class_1549 field_39289;
   private final class_1549 field_39288;

   public class_7749() {
      float var3 = 4.0F;
      float var4 = 0.0F;
      this.field_39284 = new class_1549(this, 0, 0).method_7033(64, 64);
      this.field_39284.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F);
      this.field_39284.method_7046(0.0F, 4.0F, 0.0F);
      this.field_39289 = new class_1549(this, 32, 0).method_7033(64, 64);
      this.field_39289.method_7049(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.field_39289.method_7046(0.0F, 6.0F, 0.0F);
      this.field_39288 = new class_1549(this, 32, 0).method_7033(64, 64);
      this.field_39288.method_7049(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.field_39288.method_7046(0.0F, 6.0F, 0.0F);
      this.field_39287 = new class_1549(this, 0, 16).method_7033(64, 64);
      this.field_39287.method_7049(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F);
      this.field_39287.method_7046(0.0F, 13.0F, 0.0F);
      this.field_39285 = new class_1549(this, 0, 36).method_7033(64, 64);
      this.field_39285.method_7049(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F);
      this.field_39285.method_7046(0.0F, 24.0F, 0.0F);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_39284.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_39284.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_39287.field_8190 = var5 * (float) (Math.PI / 180.0) * 0.25F;
      float var9 = class_9299.method_42818(this.field_39287.field_8190);
      float var10 = class_9299.method_42840(this.field_39287.field_8190);
      this.field_39289.field_8185 = 1.0F;
      this.field_39288.field_8185 = -1.0F;
      this.field_39289.field_8190 = 0.0F + this.field_39287.field_8190;
      this.field_39288.field_8190 = (float) Math.PI + this.field_39287.field_8190;
      this.field_39289.field_8183 = var10 * 5.0F;
      this.field_39289.field_8187 = -var9 * 5.0F;
      this.field_39288.field_8183 = -var10 * 5.0F;
      this.field_39288.field_8187 = var9 * 5.0F;
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_39287, this.field_39285, this.field_39284, this.field_39289, this.field_39288);
   }

   public class_1549 method_35149() {
      return this.field_39284;
   }
}
