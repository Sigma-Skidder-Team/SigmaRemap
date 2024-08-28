package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4945 implements Class4929<Class150> {
   public void method15246(JsonObject var1, Class150 var2, JsonSerializationContext var3) {
      var1.add("terms", var3.serialize(Class150.method455(var2)));
   }

   public Class150 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Class122[] var5 = Class8963.<Class122[]>method32788(var1, "terms", var2, Class122[].class);
      return new Class150(var5);
   }
}
