package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4954 extends Class4928<Class139> {
   public void method15246(JsonObject var1, Class139 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.addProperty("source", Class139.method419(var2).field14000);
   }

   public Class139 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      Class2138 var6 = Class2138.method8831(Class8963.method32763(var1, "source"));
      return new Class139(var3, var6);
   }
}
