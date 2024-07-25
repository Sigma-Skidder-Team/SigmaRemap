package remapped;

public class class_3527 implements class_6839 {
   private static String[] field_17281;
   private String field_17282;
   private class_1549 field_17280;
   private class_6689 field_17279;

   public class_3527(String var1, class_1549 var2, class_6689 var3) {
      this.field_17282 = var1;
      this.field_17280 = var2;
      this.field_17279 = var3;
   }

   @Override
   public float method_31353() {
      return this.method_16296();
   }

   public float method_16296() {
      return this.field_17279.method_30674(this.field_17280);
   }

   public void method_16294(float var1) {
      this.field_17279.method_30677(this.field_17280, var1);
   }

   @Override
   public String toString() {
      return this.field_17282;
   }
}
