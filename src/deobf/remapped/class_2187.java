package remapped;

public class class_2187 implements class_7907 {
   private static String[] field_10883;
   private final class_7907 field_10882;
   private final class_5155 field_10881;

   public class_2187(class_7907 var1, class_5155 var2) {
      this.field_10882 = var1;
      this.field_10881 = var2;
   }

   @Override
   public class_7907 method_35761(double var1, double var3, double var5) {
      return this.field_10882.method_35761(var1, var3, var5);
   }

   @Override
   public class_7907 method_35743(int var1, int var2, int var3, int var4) {
      return this.field_10882.method_35743(var1, var2, var3, var4);
   }

   @Override
   public class_7907 method_35745(float var1, float var2) {
      return this.field_10882.method_35745(this.field_10881.method_23602((double)(var1 * 16.0F)), this.field_10881.method_23639((double)(var2 * 16.0F)));
   }

   @Override
   public class_7907 method_35738(int var1, int var2) {
      return this.field_10882.method_35738(var1, var2);
   }

   @Override
   public class_7907 method_35748(int var1, int var2) {
      return this.field_10882.method_35748(var1, var2);
   }

   @Override
   public class_7907 method_35755(float var1, float var2, float var3) {
      return this.field_10882.method_35755(var1, var2, var3);
   }

   @Override
   public void method_35735() {
      this.field_10882.method_35735();
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
      this.field_10882
         .method_35744(
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            var7,
            this.field_10881.method_23602((double)(var8 * 16.0F)),
            this.field_10881.method_23639((double)(var9 * 16.0F)),
            var10,
            var11,
            var12,
            var13,
            var14
         );
   }
}
