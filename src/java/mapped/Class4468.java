package mapped;

import com.google.gson.JsonObject;

public class Class4468 extends Class4457 {
   private final Block field21655;
   private final Class7340 field21656;

   public Class4468(Class9587 var1, Block var2, Class7340 var3) {
      super(Class4875.method15061(), var1);
      this.field21655 = var2;
      this.field21656 = var3;
   }

   public static Class4468 method14118(Block var0) {
      return new Class4468(Class9587.field44822, var0, Class7340.field31445);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21655 != null) {
         var4.addProperty("block", Class2348.field16072.method9181(this.field21655).toString());
      }

      var4.add("state", this.field21656.method23262());
      return var4;
   }

   public boolean method14119(Class7380 var1) {
      return this.field21655 != null && !var1.method23448(this.field21655) ? false : this.field21656.method23258(var1);
   }
}
