package remapped;

public class class_4776 {
   private static String[] field_23144;
   private class_4801[] field_23143;

   public class_4776(class_4801[] var1) {
      this.field_23143 = var1;
   }

   public void method_22013() {
      for (int var3 = 0; var3 < this.field_23143.length; var3++) {
         class_4801 var4 = this.field_23143[var3];
         var4.method_22123();
      }
   }

   public boolean method_22014(class_4091 var1) {
      for (int var4 = 0; var4 < this.field_23143.length; var4++) {
         class_4801 var5 = this.field_23143[var4];
         if (!var5.method_22121(var1)) {
            return false;
         }
      }

      return true;
   }
}
