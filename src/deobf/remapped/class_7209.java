package remapped;

public class class_7209 extends Setting<Integer> {
   private String[] field_37032;

   public class_7209(String var1, String var2, Integer var3, String... var4) {
      super(var1, var2, class_5195.field_26720, var3);
      this.field_37032 = var4;
   }

   @Override
   public class_1293 method_23042(class_1293 var1) {
      this.field_25890 = class_3332.method_15289(var1, "value", this.method_23039());
      return var1;
   }

   public String[] method_32991() {
      return this.field_37032;
   }
}
