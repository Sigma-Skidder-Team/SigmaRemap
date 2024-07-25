package remapped;

public class class_6458 {
   private String field_32923;
   private class_7751 field_32922;
   private class_3999 field_32919;
   private class_6045 field_32921;

   public class_6458(String var1, class_7751 var2, class_3999 var3) {
      this.field_32923 = var1;
      this.field_32922 = var2;
      this.field_32919 = var3;
      this.field_32921 = var2.method_35170(var1);
   }

   public void method_29429(int var1) {
      this.field_32921.method_27607(var1);
   }

   public void method_29426() {
      if (this.field_32921.method_27601()) {
         try {
            this.field_32922.method_35169(this.field_32919, this.field_32921);
         } catch (RuntimeException var4) {
            class_1910.method_8673("Error updating custom uniform: " + this.field_32921.method_27605());
            class_1910.method_8673(var4.getClass().getName() + ": " + var4.getMessage());
            this.field_32921.method_27600();
            class_1910.method_8673("Custom uniform disabled: " + this.field_32921.method_27605());
         }
      }
   }

   public void method_29430() {
      this.field_32921.method_27598();
   }

   public String method_29428() {
      return this.field_32923;
   }

   public class_7751 method_29425() {
      return this.field_32922;
   }

   public class_3999 method_29424() {
      return this.field_32919;
   }

   public class_6045 method_29427() {
      return this.field_32921;
   }

   @Override
   public String toString() {
      return this.field_32922.name().toLowerCase() + " " + this.field_32923;
   }
}
