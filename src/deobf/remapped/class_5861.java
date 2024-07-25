package remapped;

import com.google.common.collect.ImmutableList;

public class class_5861<T extends Entity> extends class_5272<T> {
   private static String[] field_29778;
   private final class_1549 field_29781;
   private final class_1549 field_29779;
   private final class_1549 field_29782;
   private final class_1549 field_29776;
   private final class_1549 field_29780;
   private final class_1549 field_29777;
   private final class_1549 field_29775;

   public class_5861() {
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_29781 = new class_1549(this, 0, 8);
      this.field_29781.method_7048(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F);
      this.field_29777 = new class_1549(this, 3, 20);
      this.field_29777.method_7048(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F);
      this.field_29777.method_7046(0.0F, -2.0F, 1.0F);
      this.field_29781.method_7043(this.field_29777);
      this.field_29775 = new class_1549(this, 4, 29);
      this.field_29775.method_7048(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F);
      this.field_29775.method_7046(0.0F, 0.5F, 6.0F);
      this.field_29777.method_7043(this.field_29775);
      this.field_29779 = new class_1549(this, 23, 12);
      this.field_29779.method_7048(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.field_29779.method_7046(2.0F, -2.0F, -8.0F);
      this.field_29782 = new class_1549(this, 16, 24);
      this.field_29782.method_7048(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.field_29782.method_7046(6.0F, 0.0F, 0.0F);
      this.field_29779.method_7043(this.field_29782);
      this.field_29776 = new class_1549(this, 23, 12);
      this.field_29776.field_8197 = true;
      this.field_29776.method_7048(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.field_29776.method_7046(-3.0F, -2.0F, -8.0F);
      this.field_29780 = new class_1549(this, 16, 24);
      this.field_29780.field_8197 = true;
      this.field_29780.method_7048(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.field_29780.method_7046(-6.0F, 0.0F, 0.0F);
      this.field_29776.method_7043(this.field_29780);
      this.field_29779.field_8185 = 0.1F;
      this.field_29782.field_8185 = 0.1F;
      this.field_29776.field_8185 = -0.1F;
      this.field_29780.field_8185 = -0.1F;
      this.field_29781.field_8191 = -0.1F;
      class_1549 var3 = new class_1549(this, 0, 0);
      var3.method_7048(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F);
      var3.method_7046(0.0F, 1.0F, -7.0F);
      var3.field_8191 = 0.2F;
      this.field_29781.method_7043(var3);
      this.field_29781.method_7043(this.field_29779);
      this.field_29781.method_7043(this.field_29776);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_29781);
   }

   @Override
   public void method_29700(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = ((float)(var1.method_37145() * 3) + var4) * 0.13F;
      float var10 = 16.0F;
      this.field_29779.field_8185 = MathHelper.cos(var9) * 16.0F * (float) (Math.PI / 180.0);
      this.field_29782.field_8185 = MathHelper.cos(var9) * 16.0F * (float) (Math.PI / 180.0);
      this.field_29776.field_8185 = -this.field_29779.field_8185;
      this.field_29780.field_8185 = -this.field_29782.field_8185;
      this.field_29777.field_8191 = -(5.0F + MathHelper.cos(var9 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.field_29775.field_8191 = -(5.0F + MathHelper.cos(var9 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
