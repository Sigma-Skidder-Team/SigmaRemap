package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.*;
import com.mojang.datafixers.util.Either;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class2553 implements JsonDeserializer<Class7496> {
   public Class7496 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      List var7 = this.method10748(var3, var6);
      String var8 = this.method10746(var6);
      Map var9 = this.method10744(var6);
      boolean var10 = this.method10747(var6);
      ItemCameraTransforms var11 = ItemCameraTransforms.DEFAULT;
      if (var6.has("display")) {
         JsonObject var12 = JSONUtils.method32782(var6, "display");
         var11 = (ItemCameraTransforms)var3.deserialize(var12, ItemCameraTransforms.class);
      }

      List var15 = this.method10743(var3, var6);
      Class2129 var13 = null;
      if (var6.has("gui_light")) {
         var13 = Class2129.method8811(JSONUtils.getString(var6, "gui_light"));
      }

      ResourceLocation var14 = !var8.isEmpty() ? new ResourceLocation(var8) : null;
      return new Class7496(var14, var7, var9, var10, var13, var11, var15);
   }

   public List<Class7781> method10743(JsonDeserializationContext var1, JsonObject var2) {
      ArrayList var5 = Lists.newArrayList();
      if (var2.has("overrides")) {
         for (JsonElement var7 : JSONUtils.method32785(var2, "overrides")) {
            var5.add(var1.deserialize(var7, Class7781.class));
         }
      }

      return var5;
   }

   private Map<String, Either<Class7826, String>> method10744(JsonObject var1) {
      ResourceLocation var4 = AtlasTexture.LOCATION_BLOCKS_TEXTURE;
      HashMap var5 = Maps.newHashMap();
      if (var1.has("textures")) {
         JsonObject var6 = JSONUtils.method32782(var1, "textures");

         for (Entry var8 : var6.entrySet()) {
            var5.put(var8.getKey(), method10745(var4, ((JsonElement)var8.getValue()).getAsString()));
         }
      }

      return var5;
   }

   private static Either<Class7826, String> method10745(ResourceLocation var0, String var1) {
      if (!Class7496.method24444(var1)) {
         ResourceLocation var4 = ResourceLocation.method8289(var1);
         if (var4 != null) {
            return Either.left(new Class7826(var0, var4));
         } else {
            throw new JsonParseException(var1 + " is not valid resource location");
         }
      } else {
         return Either.right(var1.substring(1));
      }
   }

   private String method10746(JsonObject var1) {
      return JSONUtils.method32764(var1, "parent", "");
   }

   public boolean method10747(JsonObject var1) {
      return JSONUtils.getBoolean(var1, "ambientocclusion", true);
   }

   public List<Class9726> method10748(JsonDeserializationContext var1, JsonObject var2) {
      ArrayList var5 = Lists.newArrayList();
      if (var2.has("elements")) {
         for (JsonElement var7 : JSONUtils.method32785(var2, "elements")) {
            var5.add(var1.deserialize(var7, Class9726.class));
         }
      }

      return var5;
   }
}
