package mapped;

import com.google.gson.JsonObject;

public class Class4460 extends Class4457 {
   private final Class9587 field21639;

   public Class4460(Class9587 var1, Class9587 var2) {
      super(Class4892.method15117(), var1);
      this.field21639 = var2;
   }

   public static Class4460 method14099() {
      return new Class4460(Class9587.field44822, Class9587.field44822);
   }

   public static Class4460 method14100(Class6671 var0) {
      return new Class4460(Class9587.field44822, Class9587.method37226(var0));
   }

   public boolean method14101(Class7812 var1) {
      return this.field21639.method37227(var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("entity", this.field21639.method37228(var1));
      return var4;
   }
}
