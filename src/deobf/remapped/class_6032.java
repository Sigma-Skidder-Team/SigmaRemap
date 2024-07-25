package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class_6032 implements JsonDeserializer<class_9403> {
   public class_9403 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      List var7 = this.method_27505(var3, var6);
      String var8 = this.method_27501(var6);
      Map var9 = this.method_27507(var6);
      boolean var10 = this.method_27503(var6);
      class_7729 var11 = class_7729.field_39206;
      if (var6.has("display")) {
         JsonObject var12 = class_6539.method_29783(var6, "display");
         var11 = (class_7729)var3.deserialize(var12, class_7729.class);
      }

      List var15 = this.method_27502(var3, var6);
      class_683 var13 = null;
      if (var6.has("gui_light")) {
         var13 = class_683.method_3098(class_6539.method_29796(var6, "gui_light"));
      }

      class_4639 var14 = !var8.isEmpty() ? new class_4639(var8) : null;
      return new class_9403(var14, var7, var9, var10, var13, var11, var15);
   }

   public List<class_2729> method_27502(JsonDeserializationContext var1, JsonObject var2) {
      ArrayList var5 = Lists.newArrayList();
      if (var2.has("overrides")) {
         for (JsonElement var7 : class_6539.method_29787(var2, "overrides")) {
            var5.add(var1.deserialize(var7, class_2729.class));
         }
      }

      return var5;
   }

   private Map<String, Either<class_2843, String>> method_27507(JsonObject var1) {
      class_4639 var4 = class_8359.field_42824;
      HashMap var5 = Maps.newHashMap();
      if (var1.has("textures")) {
         JsonObject var6 = class_6539.method_29783(var1, "textures");

         for (Entry var8 : var6.entrySet()) {
            var5.put(var8.getKey(), method_27506(var4, ((JsonElement)var8.getValue()).getAsString()));
         }
      }

      return var5;
   }

   private static Either<class_2843, String> method_27506(class_4639 var0, String var1) {
      if (!class_9403.method_43555(var1)) {
         class_4639 var4 = class_4639.method_21455(var1);
         if (var4 != null) {
            return Either.left(new class_2843(var0, var4));
         } else {
            throw new JsonParseException(var1 + " is not valid resource location");
         }
      } else {
         return Either.right(var1.substring(1));
      }
   }

   private String method_27501(JsonObject var1) {
      return class_6539.method_29797(var1, "parent", "");
   }

   public boolean method_27503(JsonObject var1) {
      return class_6539.method_29772(var1, "ambientocclusion", true);
   }

   public List<class_9487> method_27505(JsonDeserializationContext var1, JsonObject var2) {
      ArrayList var5 = Lists.newArrayList();
      if (var2.has("elements")) {
         for (JsonElement var7 : class_6539.method_29787(var2, "elements")) {
            var5.add(var1.deserialize(var7, class_9487.class));
         }
      }

      return var5;
   }
}
