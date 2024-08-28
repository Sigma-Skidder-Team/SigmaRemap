package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4961 extends Class4928<Class147> {
   public void method15246(JsonObject var1, Class147 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.add("entity", var3.serialize(Class147.method450(var2)));
   }

   public Class147 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class2063 var6 = Class8963.<Class2063>method32788(var1, "entity", var2, Class2063.class);
      return new Class147(var3, var6);
   }
}
