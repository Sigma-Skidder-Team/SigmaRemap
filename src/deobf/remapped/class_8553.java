package remapped;

import com.google.gson.JsonObject;

public class class_8553 extends class_4569 {
   private final class_8938 field_43758;
   private final class_8938 field_43759;
   private final class_8938 field_43757;

   public class_8553(class_8938 var1, class_8938 var2, class_8938 var3, class_8938 var4) {
      super(class_1283.method_5731(), var1);
      this.field_43758 = var2;
      this.field_43759 = var3;
      this.field_43757 = var4;
   }

   public static class_8553 method_39345() {
      return new class_8553(class_8938.field_45798, class_8938.field_45798, class_8938.field_45798, class_8938.field_45798);
   }

   public static class_8553 method_39344(class_2184 var0) {
      return new class_8553(class_8938.field_45798, class_8938.field_45798, class_8938.field_45798, class_8938.method_41064(var0.method_10139()));
   }

   public static class_8553 method_39347(class_865 var0, class_865 var1, class_865 var2) {
      return new class_8553(class_8938.field_45798, class_8938.method_41064(var0), class_8938.method_41064(var1), class_8938.method_41064(var2));
   }

   public boolean method_39346(class_2792 var1, class_2792 var2, class_2792 var3) {
      return this.field_43757 == class_8938.field_45798 || var3 != null && this.field_43757.method_41071(var3)
         ? this.field_43758.method_41071(var1) && this.field_43759.method_41071(var2)
            || this.field_43758.method_41071(var2) && this.field_43759.method_41071(var1)
         : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("parent", this.field_43758.method_41067(var1));
      var4.add("partner", this.field_43759.method_41067(var1));
      var4.add("child", this.field_43757.method_41067(var1));
      return var4;
   }
}
