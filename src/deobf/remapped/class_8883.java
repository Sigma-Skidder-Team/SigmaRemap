package remapped;

import com.google.common.collect.ImmutableList;

public class class_8883<T extends Entity> extends class_5272<T> {
   private static String[] field_45584;
   private final class_1549 field_45582 = new class_1549(this, 0, 0);
   private final class_1549 field_45583;
   private final class_1549 field_45585;

   public class_8883() {
      this.field_45582.method_7046(-5.0F, 22.0F, -5.0F);
      this.field_45582.method_7048(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F);
      this.field_45583 = new class_1549(this, 40, 0);
      this.field_45583.method_7046(1.5F, 22.0F, -4.0F);
      this.field_45583.method_7048(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      this.field_45585 = new class_1549(this, 40, 0);
      this.field_45585.method_7046(-1.5F, 22.0F, 4.0F);
      this.field_45585.method_7048(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var2 * 2.0F;
      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 = 1.0F - var9 * var9 * var9;
      this.field_45583.field_8185 = (float) Math.PI - var9 * 0.35F * (float) Math.PI;
      this.field_45585.field_8185 = (float) Math.PI + var9 * 0.35F * (float) Math.PI;
      this.field_45585.field_8190 = (float) Math.PI;
      float var10 = (var2 + MathHelper.sin(var2 * 2.7F)) * 0.6F * 12.0F;
      this.field_45583.field_8181 = 24.0F - var10;
      this.field_45585.field_8181 = this.field_45583.field_8181;
      this.field_45582.field_8181 = this.field_45583.field_8181;
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_45582, this.field_45583, this.field_45585);
   }
}
