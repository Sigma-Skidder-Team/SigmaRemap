package mapped;

import com.google.gson.JsonObject;

public class Class4471 extends Class4457 {
   private final Class8840 field21660;

   public Class4471(Class9587 var1, Class8840 var2) {
      super(Class4886.method15098(), var1);
      this.field21660 = var2;
   }

   public static Class4471 method14124(Class8840 var0) {
      return new Class4471(Class9587.field44822, var0);
   }

   public boolean method14125(Class950 var1) {
      return this.field21660.method32015(var1.method3824());
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("level", this.field21660.method32005());
      return var4;
   }
}
