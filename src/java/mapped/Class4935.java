package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public final class Class4935<T extends Class4688> extends Class4934<T> {
   public final Class8732 field22840;

   public Class4935(Class8732 var1) {
      this.field22840 = var1;
   }

   public void method15249(JsonObject jsonObject, T t, JsonSerializationContext jsonSerializationContext) {
      jsonObject.add("children", jsonSerializationContext.serialize(((Class4689)t).field22273));
   }

   public final T method15250(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      Class4688[] var6 = JSONUtils.<Class4688[]>method32788(var1, "children", var2, Class4688[].class);
      return (T)this.field22840.method31518(var6, var3);
   }
}
