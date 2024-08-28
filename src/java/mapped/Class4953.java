package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4953 implements Class4929<Class152> {
   public void method15246(JsonObject var1, Class152 var2, JsonSerializationContext var3) {
      var1.add("term", var3.serialize(Class152.method461(var2)));
   }

   public Class152 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Class122 var5 = Class8963.<Class122>method32788(var1, "term", var2, Class122.class);
      return new Class152(var5);
   }
}
