package remapped;

import com.google.common.collect.ImmutableList;

public class class_1818<T extends Entity> extends class_9387<T> {
   private static String[] field_9231;
   private final class_1549 field_9229;
   private final class_1549 field_9230;
   private final class_1549 field_9234;
   private final class_1549 field_9233;
   private final class_1549 field_9232;

   public class_1818(float var1) {
      this.field_49928 = 32;
      this.field_49927 = 32;
      byte var4 = 22;
      this.field_9229 = new class_1549(this, 0, 0);
      this.field_9229.method_7049(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, var1);
      this.field_9229.method_7046(0.0F, 22.0F, 0.0F);
      this.field_9230 = new class_1549(this, 22, -6);
      this.field_9230.method_7049(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, var1);
      this.field_9230.method_7046(0.0F, 22.0F, 3.0F);
      this.field_9234 = new class_1549(this, 2, 16);
      this.field_9234.method_7049(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field_9234.method_7046(-1.0F, 22.5F, 0.0F);
      this.field_9234.field_8190 = (float) (Math.PI / 4);
      this.field_9233 = new class_1549(this, 2, 12);
      this.field_9233.method_7049(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.field_9233.method_7046(1.0F, 22.5F, 0.0F);
      this.field_9233.field_8190 = (float) (-Math.PI / 4);
      this.field_9232 = new class_1549(this, 10, -5);
      this.field_9232.method_7049(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, var1);
      this.field_9232.method_7046(0.0F, 20.5F, -3.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_9229, this.field_9230, this.field_9234, this.field_9233, this.field_9232);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.method_37285()) {
         var9 = 1.5F;
      }

      this.field_9230.field_8190 = -var9 * 0.45F * MathHelper.sin(0.6F * var4);
   }
}
