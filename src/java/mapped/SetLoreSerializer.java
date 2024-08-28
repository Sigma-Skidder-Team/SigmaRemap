package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class SetLoreSerializer extends LootFunctionSerializer<Class137> {
   public void serialize(JsonObject var1, Class137 var2, JsonSerializationContext var3) {
      super.serialize(var1, var2, var3);
      var1.addProperty("replace", Class137.method403(var2));
      JsonArray var6 = new JsonArray();

      for (ITextComponent var8 : Class137.method404(var2)) {
         var6.add(ITextComponent$Serializer.toJsonTree(var8));
      }

      var1.add("lore", var6);
      if (Class137.method405(var2) != null) {
         var1.add("entity", var3.serialize(Class137.method405(var2)));
      }
   }

   public Class137 deserialize(JsonObject var1, JsonDeserializationContext var2, ILootCondition[] var3) {
      boolean var6 = JSONUtils.getBoolean(var1, "replace", false);
      List var7 = Streams.stream(JSONUtils.method32785(var1, "lore"))
         .<IFormattableTextComponent>map(ITextComponent$Serializer::func_240641_a_)
         .collect(ImmutableList.toImmutableList());
      Class2063 var8 = JSONUtils.<Class2063>method32789(var1, "entity", (Class2063)null, var2, Class2063.class);
      return new Class137(var3, var6, var7, var8);
   }
}
