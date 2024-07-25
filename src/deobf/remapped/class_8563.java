package remapped;

public class class_8563 extends class_5004<Boolean> {
   public boolean field_43797 = false;

   public class_8563(String var1, String var2, boolean var3) {
      super(var1, var2, class_5195.field_26724, var3);
   }

   public class_8563 method_39397() {
      this.field_43797 = true;
      return this;
   }

   @Override
   public void method_23040() {
      this.field_43797 = false;
   }

   @Override
   public boolean method_23043() {
      return this.field_43797;
   }

   public void method_39399(Boolean var1, boolean var2) {
      if (this.field_43797 && var2) {
         class_727.method_3328().method_3335().method_27841(new class_8235("Premium", "Not yet available for free version"));
      }

      super.method_23038(var1, var2);
   }

   public Boolean method_39398() {
      return !this.field_43797 ? this.field_25890 : this.field_25891;
   }

   @Override
   public class_1293 method_23042(class_1293 var1) {
      this.field_25890 = class_3332.method_15294(var1, "value", this.method_23039());
      return var1;
   }
}
