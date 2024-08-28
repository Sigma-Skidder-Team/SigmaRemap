package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4962 extends Class4928<Class143> {
   public void method15246(JsonObject var1, Class143 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.add("levels", Class9288.method35014(Class143.method440(var2), var3));
      var1.addProperty("treasure", Class143.method441(var2));
   }

   public Class143 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class6870 var6 = Class9288.method35013(var1.get("levels"), var2);
      boolean var7 = Class8963.method32769(var1, "treasure", false);
      return new Class143(var3, var6, var7);
   }
}
