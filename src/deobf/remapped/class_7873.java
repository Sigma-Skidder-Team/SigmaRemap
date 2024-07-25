package remapped;

public class class_7873 extends class_7690 {
   private static String[] field_40308;
   private final class_7907 field_40306;
   private double field_40305;
   private double field_40311;
   private double field_40309;
   private float field_40307;
   private float field_40310;

   private class_7873(class_7907 var1, int var2, int var3, int var4, int var5) {
      this.field_40306 = var1;
      super.method_34845(var2, var3, var4, var5);
   }

   @Override
   public void method_34845(int var1, int var2, int var3, int var4) {
   }

   @Override
   public class_7907 method_35761(double var1, double var3, double var5) {
      this.field_40305 = var1;
      this.field_40311 = var3;
      this.field_40309 = var5;
      return this;
   }

   @Override
   public class_7907 method_35743(int var1, int var2, int var3, int var4) {
      return this;
   }

   @Override
   public class_7907 method_35745(float var1, float var2) {
      this.field_40307 = var1;
      this.field_40310 = var2;
      return this;
   }

   @Override
   public class_7907 method_35738(int var1, int var2) {
      return this;
   }

   @Override
   public class_7907 method_35748(int var1, int var2) {
      return this;
   }

   @Override
   public class_7907 method_35755(float var1, float var2, float var3) {
      return this;
   }

   @Override
   public void method_35744(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      this.field_40306
         .method_35761((double)var1, (double)var2, (double)var3)
         .method_35743(this.field_39056, this.field_39059, this.field_39057, this.field_39055)
         .method_35745(var8, var9)
         .method_35735();
   }

   @Override
   public void method_35735() {
      this.field_40306
         .method_35761(this.field_40305, this.field_40311, this.field_40309)
         .method_35743(this.field_39056, this.field_39059, this.field_39057, this.field_39055)
         .method_35745(this.field_40307, this.field_40310)
         .method_35735();
   }
}
