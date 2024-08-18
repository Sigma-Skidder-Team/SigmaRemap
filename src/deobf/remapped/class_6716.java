package remapped;

import com.google.gson.JsonObject;

public class class_6716 extends class_4569 {
   private final class_7781 field_34699;
   private final class_8938 field_34700;

   public class_6716(class_8938 var1, class_7781 var2, class_8938 var3) {
      super(class_8892.method_40925(), var1);
      this.field_34699 = var2;
      this.field_34700 = var3;
   }

   public static class_6716 method_30838(class_7781 var0, class_8938 var1) {
      return new class_6716(class_8938.field_45798, var0, var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("signal_strength", this.field_34699.method_27853());
      var4.add("projectile", this.field_34700.method_41067(var1));
      return var4;
   }

   public boolean method_30837(class_2792 var1, Vector3d var2, int var3) {
      return this.field_34699.method_35307(var3) ? this.field_34700.method_41071(var1) : false;
   }
}
