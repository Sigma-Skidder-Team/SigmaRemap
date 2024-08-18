package remapped;

import com.google.gson.JsonObject;

public class class_2230 extends class_4569 {
   private final class_5093 field_11128;
   private final class_5093 field_11125;
   private final class_6254 field_11126;

   public class_2230(class_8938 var1, class_5093 var2, class_5093 var3, class_6254 var4) {
      super(class_3052.method_13944(), var1);
      this.field_11128 = var2;
      this.field_11125 = var3;
      this.field_11126 = var4;
   }

   public static class_2230 method_10275(class_6254 var0) {
      return new class_2230(class_8938.field_45798, class_5093.field_26274, class_5093.field_26274, var0);
   }

   public boolean method_10274(class_6331 var1, Vector3d var2, double var3, double var5, double var7) {
      if (this.field_11128.method_23401(var1, var2.field_7336, var2.field_7333, var2.field_7334)) {
         return this.field_11125.method_23401(var1, var3, var5, var7)
            ? this.field_11126.method_28548(var2.field_7336, var2.field_7333, var2.field_7334, var3, var5, var7)
            : false;
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("entered", this.field_11128.method_23398());
      var4.add("exited", this.field_11125.method_23398());
      var4.add("distance", this.field_11126.method_28551());
      return var4;
   }
}
