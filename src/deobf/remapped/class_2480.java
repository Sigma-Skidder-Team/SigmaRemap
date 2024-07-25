package remapped;

public class class_2480 extends class_4575 {
   public class_2480(class_3229 var1) {
      this.field_12368 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      String var4 = this.field_12368.method_42421((class_8437)var1).toString().replaceAll("\\s", "");
      return class_5055.method_23296(var4.toCharArray());
   }
}
