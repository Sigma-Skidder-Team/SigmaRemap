package remapped;

import com.google.common.collect.ImmutableList;

public class class_8875<T extends class_9408> extends class_3666<T> {
   private static String[] field_45369;
   private final class_1549 field_45367;
   private final class_1549 field_45374;
   private final class_1549 field_45371;
   private final class_1549 field_45368;
   private final class_1549 field_45364;
   private final class_1549 field_45372;
   private final class_1549 field_45370;
   private final class_1549 field_45365;
   private final class_1549 field_45373;
   private final class_1549 field_45366;

   public class_8875() {
      float var3 = 0.0F;
      float var4 = 13.5F;
      this.field_45367 = new class_1549(this, 0, 0);
      this.field_45367.method_7046(-1.0F, 13.5F, -7.0F);
      this.field_45374 = new class_1549(this, 0, 0);
      this.field_45374.method_7049(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F);
      this.field_45367.method_7043(this.field_45374);
      this.field_45371 = new class_1549(this, 18, 14);
      this.field_45371.method_7049(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F);
      this.field_45371.method_7046(0.0F, 14.0F, 2.0F);
      this.field_45366 = new class_1549(this, 21, 0);
      this.field_45366.method_7049(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F);
      this.field_45366.method_7046(-1.0F, 14.0F, 2.0F);
      this.field_45368 = new class_1549(this, 0, 18);
      this.field_45368.method_7049(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field_45368.method_7046(-2.5F, 16.0F, 7.0F);
      this.field_45364 = new class_1549(this, 0, 18);
      this.field_45364.method_7049(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field_45364.method_7046(0.5F, 16.0F, 7.0F);
      this.field_45372 = new class_1549(this, 0, 18);
      this.field_45372.method_7049(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field_45372.method_7046(-2.5F, 16.0F, -4.0F);
      this.field_45370 = new class_1549(this, 0, 18);
      this.field_45370.method_7049(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field_45370.method_7046(0.5F, 16.0F, -4.0F);
      this.field_45365 = new class_1549(this, 9, 18);
      this.field_45365.method_7046(-1.0F, 12.0F, 8.0F);
      this.field_45373 = new class_1549(this, 9, 18);
      this.field_45373.method_7049(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
      this.field_45365.method_7043(this.field_45373);
      this.field_45374.method_7037(16, 14).method_7049(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field_45374.method_7037(16, 14).method_7049(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field_45374.method_7037(0, 10).method_7049(-0.5F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F);
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_45367);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_45371, this.field_45368, this.field_45364, this.field_45372, this.field_45370, this.field_45365, this.field_45366);
   }

   public void method_40842(T var1, float var2, float var3, float var4) {
      if (!var1.method_28537()) {
         this.field_45365.field_8190 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
      } else {
         this.field_45365.field_8190 = 0.0F;
      }

      if (!var1.method_41209()) {
         this.field_45371.method_7046(0.0F, 14.0F, 2.0F);
         this.field_45371.field_8191 = (float) (Math.PI / 2);
         this.field_45366.method_7046(-1.0F, 14.0F, -3.0F);
         this.field_45366.field_8191 = this.field_45371.field_8191;
         this.field_45365.method_7046(-1.0F, 12.0F, 8.0F);
         this.field_45368.method_7046(-2.5F, 16.0F, 7.0F);
         this.field_45364.method_7046(0.5F, 16.0F, 7.0F);
         this.field_45372.method_7046(-2.5F, 16.0F, -4.0F);
         this.field_45370.method_7046(0.5F, 16.0F, -4.0F);
         this.field_45368.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
         this.field_45364.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.field_45372.field_8191 = class_9299.method_42840(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
         this.field_45370.field_8191 = class_9299.method_42840(var2 * 0.6662F) * 1.4F * var3;
      } else {
         this.field_45366.method_7046(-1.0F, 16.0F, -3.0F);
         this.field_45366.field_8191 = (float) (Math.PI * 2.0 / 5.0);
         this.field_45366.field_8190 = 0.0F;
         this.field_45371.method_7046(0.0F, 18.0F, 0.0F);
         this.field_45371.field_8191 = (float) (Math.PI / 4);
         this.field_45365.method_7046(-1.0F, 21.0F, 6.0F);
         this.field_45368.method_7046(-2.5F, 22.7F, 2.0F);
         this.field_45368.field_8191 = (float) (Math.PI * 3.0 / 2.0);
         this.field_45364.method_7046(0.5F, 22.7F, 2.0F);
         this.field_45364.field_8191 = (float) (Math.PI * 3.0 / 2.0);
         this.field_45372.field_8191 = 5.811947F;
         this.field_45372.method_7046(-2.49F, 17.0F, -4.0F);
         this.field_45370.field_8191 = 5.811947F;
         this.field_45370.method_7046(0.51F, 17.0F, -4.0F);
      }

      this.field_45374.field_8185 = var1.method_43578(var4) + var1.method_43586(var4, 0.0F);
      this.field_45366.field_8185 = var1.method_43586(var4, -0.08F);
      this.field_45371.field_8185 = var1.method_43586(var4, -0.16F);
      this.field_45373.field_8185 = var1.method_43586(var4, -0.2F);
   }

   public void method_40841(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_45367.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_45367.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_45365.field_8191 = var4;
   }
}
