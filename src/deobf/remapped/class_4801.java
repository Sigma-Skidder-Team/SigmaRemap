package remapped;

public class class_4801 {
   private String field_23989;
   private String field_23991;
   private class_3527 field_23992;
   private class_6839 field_23990;

   public boolean method_22121(class_4091 var1) {
      this.field_23992 = var1.method_18896(this.field_23989);
      if (this.field_23992 == null) {
         class_3111.method_14317("Model variable not found: " + this.field_23989);
         return false;
      } else {
         try {
            class_1833 var4 = new class_1833(var1);
            this.field_23990 = var4.method_8091(this.field_23991);
            return true;
         } catch (class_425 var5) {
            class_3111.method_14317("Error parsing expression: " + this.field_23991);
            class_3111.method_14317(var5.getClass().getName() + ": " + var5.getMessage());
            return false;
         }
      }
   }

   public class_4801(String var1, String var2) {
      this.field_23989 = var1;
      this.field_23991 = var2;
   }

   public void method_22123() {
      float var3 = this.field_23990.method_31353();
      this.field_23992.method_16294(var3);
   }
}
