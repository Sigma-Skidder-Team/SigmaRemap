package remapped;

import com.google.common.collect.ImmutableList;

public class class_6094<T extends Entity> extends class_5272<T> {
   private static String[] field_31186;
   private final class_1549 field_31188;
   private final class_1549 field_31183;
   private final class_1549 field_31185;
   private final class_1549 field_31189;
   private final class_1549 field_31182;
   private final class_1549 field_31187;
   private final class_1549 field_31184;

   public class_6094() {
      this.field_49928 = 32;
      this.field_49927 = 32;
      byte var3 = 22;
      this.field_31188 = new class_1549(this, 0, 0);
      this.field_31188.method_7048(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F);
      this.field_31188.method_7046(0.0F, 22.0F, 0.0F);
      this.field_31185 = new class_1549(this, 11, 0);
      this.field_31185.method_7048(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.field_31185.method_7046(0.0F, 22.0F, 0.0F);
      this.field_31189 = new class_1549(this, 0, 0);
      this.field_31189.method_7048(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F);
      this.field_31189.method_7046(0.0F, 22.0F, -3.0F);
      this.field_31182 = new class_1549(this, 22, 1);
      this.field_31182.method_7048(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.field_31182.method_7046(-1.0F, 23.0F, 0.0F);
      this.field_31182.field_8185 = (float) (-Math.PI / 4);
      this.field_31187 = new class_1549(this, 22, 4);
      this.field_31187.method_7048(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.field_31187.method_7046(1.0F, 23.0F, 0.0F);
      this.field_31187.field_8185 = (float) (Math.PI / 4);
      this.field_31184 = new class_1549(this, 22, 3);
      this.field_31184.method_7048(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F);
      this.field_31184.method_7046(0.0F, 22.0F, 7.0F);
      this.field_31183 = new class_1549(this, 20, -6);
      this.field_31183.method_7048(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F);
      this.field_31183.method_7046(0.0F, 20.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_31188, this.field_31185, this.field_31189, this.field_31182, this.field_31187, this.field_31184, this.field_31183);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = 1.0F;
      if (!var1.method_37285()) {
         var9 = 1.5F;
      }

      this.field_31184.field_8190 = -var9 * 0.45F * MathHelper.sin(0.6F * var4);
   }
}
