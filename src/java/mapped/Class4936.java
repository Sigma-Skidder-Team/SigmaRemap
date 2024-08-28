package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class Class4936<T extends Class4686> extends Class4934<T> {
   public void method15249(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (var2.field22265 != 1) {
         var1.addProperty("weight", var2.field22265);
      }

      if (var2.field22266 != 0) {
         var1.addProperty("quality", var2.field22266);
      }

      if (!ArrayUtils.isEmpty(var2.field22267)) {
         var1.add("functions", var3.serialize(var2.field22267));
      }
   }

   public final T method15250(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      int var6 = Class8963.method32778(var1, "weight", 1);
      int var7 = Class8963.method32778(var1, "quality", 0);
      Class127[] var8 = Class8963.<Class127[]>method32789(var1, "functions", new Class127[0], var2, Class127[].class);
      return this.method15251(var1, var2, var6, var7, var3, var8);
   }

   public abstract T method15251(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, Class122[] var5, Class127[] var6);
}
