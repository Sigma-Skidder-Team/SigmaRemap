package mapped;

import com.google.gson.JsonObject;

public class Class4479 extends Class4457 {
   private final Block field21669;
   private final Class8634 field21670;
   private final Class8840 field21671;

   public Class4479(Class9587 var1, Block var2, Class8634 var3, Class8840 var4) {
      super(Class4880.method15079(), var1);
      this.field21669 = var2;
      this.field21670 = var3;
      this.field21671 = var4;
   }

   public static Class4479 method14139(Block var0, Class9735 var1, Class8840 var2) {
      return new Class4479(Class9587.field44822, var0, var1.method38151(), var2);
   }

   public boolean method14140(Block var1, Class8848 var2, int var3) {
      if (this.field21669 != null && var1 != this.field21669) {
         return false;
      } else {
         return this.field21670.method31016(var2) ? this.field21671.method32015(var3) : false;
      }
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21669 != null) {
         var4.addProperty("block", Class2348.field16072.method9181(this.field21669).toString());
      }

      var4.add("item", this.field21670.method31018());
      var4.add("num_bees_inside", this.field21671.method32005());
      return var4;
   }
}
