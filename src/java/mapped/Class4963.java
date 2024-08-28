package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public class Class4963 extends Class4928<Class130> {
   public void method15246(JsonObject var1, Class130 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      var1.add("count", var3.serialize(Class130.method380(var2)));
      if (Class130.method381(var2)) {
         var1.add("limit", var3.serialize(Class130.method382(var2)));
      }
   }

   public Class130 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      int var6 = Class8963.method32778(var1, "limit", 0);
      return new Class130(var3, Class8963.method32788(var1, "count", var2, Class6872.class), var6);
   }
}
