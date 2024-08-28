package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class SetNameSerializer extends LootFunctionSerializer<Class132> {
   public void serialize(JsonObject var1, Class132 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      if (Class132.method387(var2) != null) {
         var1.add("name", ITextComponent$Serializer.toJsonTree(Class132.method387(var2)));
      }

      if (Class132.method388(var2) != null) {
         var1.add("entity", var3.serialize(Class132.method388(var2)));
      }
   }

   public Class132 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      IFormattableTextComponent var6 = ITextComponent$Serializer.func_240641_a_(var1.get("name"));
      Class2063 var7 = JSONUtils.<Class2063>method32789(var1, "entity", (Class2063)null, var2, Class2063.class);
      return new Class132(var3, var6, var7);
   }
}
