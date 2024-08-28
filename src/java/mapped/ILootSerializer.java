package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public interface ILootSerializer<T> {
   void serialize(JsonObject var1, T var2, JsonSerializationContext var3);

   T method15248(JsonObject var1, JsonDeserializationContext var2);
}
