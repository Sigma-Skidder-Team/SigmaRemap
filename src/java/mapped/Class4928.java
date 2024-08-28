package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import org.apache.commons.lang3.ArrayUtils;

public abstract class Class4928<T extends Class128> implements Class4929<T> {
   public void method15246(JsonObject var1, T var2, JsonSerializationContext var3) {
      if (!ArrayUtils.isEmpty(var2.field441)) {
         var1.add("conditions", var3.serialize(var2.field441));
      }
   }

   public final T method15248(JsonObject var1, JsonDeserializationContext var2) {
      Class122[] var5 = Class8963.<Class122[]>method32789(var1, "conditions", new Class122[0], var2, Class122[].class);
      return this.method15244(var1, var2, var5);
   }

   public abstract T method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3);
}
