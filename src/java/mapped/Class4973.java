package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Arrays;

public class Class4973 extends Class4928<Class146> {
   public void method15246(JsonObject var1, Class146 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.add("entries", var3.serialize(Class146.method449(var2)));
   }

   public Class146 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class4688[] var6 = Class8963.method32788(var1, "entries", var2, Class4688[].class);
      return new Class146(var3, Arrays.asList(var6));
   }
}
