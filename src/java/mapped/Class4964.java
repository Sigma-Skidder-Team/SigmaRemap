package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4964 extends Class4928<Class145> {
   public void method15246(JsonObject var1, Class145 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.add("damage", var3.serialize(Class145.method445(var2)));
   }

   public Class145 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      return new Class145(var3, Class8963.<Class6872>method32788(var1, "damage", var2, Class6872.class));
   }
}
