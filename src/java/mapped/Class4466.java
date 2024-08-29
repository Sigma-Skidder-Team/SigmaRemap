package mapped;

import com.google.gson.JsonObject;

public class Class4466 extends Class4457 {
   private final Block field21651;
   private final Class7340 field21652;

   public Class4466(Class9587 var1, Block var2, Class7340 var3) {
      super(Class4910.method15173(), var1);
      this.field21651 = var2;
      this.field21652 = var3;
   }

   public static Class4466 method14113(Block var0) {
      return new Class4466(Class9587.field44822, var0, Class7340.field31445);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21651 != null) {
         var4.addProperty("block", Registry.BLOCK.getKey(this.field21651).toString());
      }

      var4.add("state", this.field21652.method23262());
      return var4;
   }

   public boolean method14114(BlockState var1) {
      return this.field21651 != null && !var1.method23448(this.field21651) ? false : this.field21652.method23258(var1);
   }
}
