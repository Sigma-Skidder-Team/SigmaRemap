package remapped;

public final class class_3673 implements class_2007 {
   private static String[] field_17912;

   public class_3673(float var1, float var2, class_8112 var3) {
      this.field_17913 = var1;
      this.field_17911 = var2;
      this.field_17914 = var3;
   }

   public float[] 괠蛊浣䩜綋ぶ(class_3316 var1, float var2, float var3) {
      var2 -= var1.method_15203();
      var3 -= var1.method_15216();
      var2 /= var1.method_15200() - var1.method_15203();
      var3 /= var1.method_15208() - var1.method_15216();
      float var6 = var2 * this.field_17913;
      float var7 = var3 * this.field_17911;
      var6 = this.field_17914.method_36883() + this.field_17914.method_36862() * var6;
      var7 = this.field_17914.method_36859() + this.field_17914.method_36867() * var7;
      class_7669.method_34744().method_5924(var6, var7);
      return null;
   }
}
