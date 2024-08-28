package mapped;

import com.google.gson.JsonObject;

public class Class4470 extends Class4457 {
   private final Class8812 field21659;

   public Class4470(Class9587 var1, Class8812 var2) {
      super(Class4879.method15074(), var1);
      this.field21659 = var2;
   }

   public static Class4470 method14122() {
      return new Class4470(Class9587.field44822, (Class8812)null);
   }

   public boolean method14123(Class8812 var1) {
      return this.field21659 == null || this.field21659 == var1;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21659 != null) {
         var4.addProperty("potion", Class2348.field16076.method9181(this.field21659).toString());
      }

      return var4;
   }
}
