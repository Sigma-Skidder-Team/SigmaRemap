package mapped;

import com.google.gson.JsonObject;

public class Class4484 extends Class4457 {
   private final Class8634 field21678;
   private final Class8840 field21679;
   private final Class8840 field21680;

   public Class4484(Class9587 var1, Class8634 var2, Class8840 var3, Class8840 var4) {
      super(Class4889.method15108(), var1);
      this.field21678 = var2;
      this.field21679 = var3;
      this.field21680 = var4;
   }

   public static Class4484 method14149(Class9587 var0, Class8634 var1, Class8840 var2) {
      return new Class4484(var0, var1, var2, Class8840.field39936);
   }

   public boolean method14150(ItemStack var1, int var2) {
      if (this.field21678.method31016(var1)) {
         return this.field21679.method32015(var1.method32119() - var2) ? this.field21680.method32015(var1.method32117() - var2) : false;
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21678.method31018());
      var4.add("durability", this.field21679.method32005());
      var4.add("delta", this.field21680.method32005());
      return var4;
   }
}
