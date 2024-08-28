package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4959 extends Class4928<Class140> {
   public void method15246(JsonObject var1, Class140 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.add("count", Class9288.method35014(Class140.method422(var2), var3));
   }

   public Class140 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class6870 var6 = Class9288.method35013(var1.get("count"), var2);
      return new Class140(var3, var6);
   }
}
