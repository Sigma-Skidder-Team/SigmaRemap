package mapped;

import com.google.common.collect.Maps;
import com.google.gson.*;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class2560 implements JsonDeserializer<Class7781> {
   public Class7781 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      ResourceLocation var7 = new ResourceLocation(JSONUtils.getString(var6, "model"));
      Map var8 = this.method10756(var6);
      return new Class7781(var7, var8);
   }

   public Map<ResourceLocation, Float> method10756(JsonObject var1) {
      LinkedHashMap var4 = Maps.newLinkedHashMap();
      JsonObject var5 = JSONUtils.method32782(var1, "predicate");

      for (Entry var7 : var5.entrySet()) {
         var4.put(new ResourceLocation((String)var7.getKey()), JSONUtils.method32770((JsonElement)var7.getValue(), (String)var7.getKey()));
      }

      return var4;
   }
}
