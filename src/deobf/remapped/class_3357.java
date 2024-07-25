package remapped;

public class class_3357 {
   private static String[] field_16542;
   private class_8145 field_16543;
   private class_8594 field_16541;

   public class_3357(class_8145 var1) {
      this.field_16543 = var1;
      this.field_16541 = null;
   }

   public class_3357(class_8145 var1, class_8594 var2) {
      this.field_16543 = var1;
      this.field_16541 = var2;
   }

   public class_8145 method_15377() {
      return this.field_16543;
   }

   public boolean method_15375() {
      return this.field_16541 != null && this.field_16541.method_39510();
   }

   public class_8594 method_15378() {
      return this.field_16541;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         return var1 instanceof class_3357 ? ((class_3357)var1).method_15377() == this.method_15377() : false;
      } else {
         return true;
      }
   }
}
