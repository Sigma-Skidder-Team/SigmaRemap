package remapped;

import com.google.gson.JsonObject;

public class class_7104 extends class_4569 {
   private final class_6254 field_36640;
   private final class_7781 field_36638;

   public class_7104(class_8938 var1, class_6254 var2, class_7781 var3) {
      super(class_8558.method_39387(), var1);
      this.field_36640 = var2;
      this.field_36638 = var3;
   }

   public static class_7104 method_32647(class_6254 var0) {
      return new class_7104(class_8938.field_45798, var0, class_7781.field_39439);
   }

   public boolean method_32648(class_9359 var1, Vector3d var2, int var3) {
      return this.field_36640.method_28548(var2.field_7336, var2.field_7333, var2.field_7334, var1.getPosX(), var1.method_37309(), var1.getPosZ())
         ? this.field_36638.method_35307(var3)
         : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("distance", this.field_36640.method_28551());
      var4.add("duration", this.field_36638.method_27853());
      return var4;
   }
}
