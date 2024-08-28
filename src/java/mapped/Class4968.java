package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4968 extends Class4928<Class135> {
   public void method15246(JsonObject var1, Class135 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.add("limit", var3.serialize(Class135.method398(var2)));
   }

   public Class135 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class12 var6 = Class8963.<Class12>method32788(var1, "limit", var2, Class12.class);
      return new Class135(var3, var6);
   }
}
