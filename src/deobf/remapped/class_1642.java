package remapped;

public class class_1642 {
   private static String[] field_8531;
   private float field_8530;
   private float field_8533;
   private class_2457 field_8532;

   public class_1642(float var1, float var2, class_2457 var3) {
      this.field_8530 = var1;
      this.field_8533 = var2;
      this.field_8532 = var3;
   }

   public float method_7357(float var1, float var2) {
      float var5 = var1 - this.field_8530;
      float var6 = var2 - this.field_8533;
      return var5 * var5 + var6 * var6;
   }

   public float method_7358() {
      return this.field_8530;
   }

   public float method_7359() {
      return this.field_8533;
   }

   public class_2457 method_7360() {
      return this.field_8532;
   }
}
