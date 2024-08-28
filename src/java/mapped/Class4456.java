package mapped;

import com.google.gson.JsonObject;

public class Class4456 extends Class4457 {
   private final Class9587 field21633;

   public Class4456(Class9587 var1, Class9587 var2) {
      super(Class4881.method15082(), var1);
      this.field21633 = var2;
   }

   public static Class4456 method14090(Class7552 var0) {
      return new Class4456(Class9587.field44822, Class9587.method37226(var0.method24717()));
   }

   public boolean method14091(Class7812 var1) {
      return this.field21633.method37227(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("entity", this.field21633.method37228(var1));
      return var4;
   }
}
