package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_8533 implements JsonDeserializer<class_9487> {
   public class_9487 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      class_2426 var7 = this.method_39282(var6);
      class_2426 var8 = this.method_39291(var6);
      class_1868 var9 = this.method_39285(var6);
      Map var10 = this.method_39286(var3, var6);
      if (var6.has("shade") && !class_6539.method_29794(var6, "shade")) {
         throw new JsonParseException("Expected shade to be a Boolean");
      } else {
         boolean var11 = class_6539.method_29772(var6, "shade", true);
         return new class_9487(var7, var8, var10, var9, var11);
      }
   }

   @Nullable
   private class_1868 method_39285(JsonObject var1) {
      class_1868 var4 = null;
      if (var1.has("rotation")) {
         JsonObject var5 = class_6539.method_29783(var1, "rotation");
         class_2426 var6 = this.method_39288(var5, "origin");
         var6.method_11068(0.0625F);
         class_9249 var7 = this.method_39284(var5);
         float var8 = this.method_39289(var5);
         boolean var9 = class_6539.method_29772(var5, "rescale", false);
         var4 = new class_1868(var6, var7, var8, var9);
      }

      return var4;
   }

   private float method_39289(JsonObject var1) {
      float var4 = class_6539.method_29774(var1, "angle");
      if (var4 != 0.0F && MathHelper.abs(var4) != 22.5F && MathHelper.abs(var4) != 45.0F) {
         throw new JsonParseException("Invalid rotation " + var4 + " found, only -45/-22.5/0/22.5/45 allowed");
      } else {
         return var4;
      }
   }

   private class_9249 method_39284(JsonObject var1) {
      String var4 = class_6539.method_29796(var1, "axis");
      class_9249 var5 = class_9249.method_42625(var4.toLowerCase(Locale.ROOT));
      if (var5 != null) {
         return var5;
      } else {
         throw new JsonParseException("Invalid rotation axis: " + var4);
      }
   }

   private Map<Direction, class_7300> method_39286(JsonDeserializationContext var1, JsonObject var2) {
      Map var5 = this.method_39290(var1, var2);
      if (!var5.isEmpty()) {
         return var5;
      } else {
         throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
      }
   }

   private Map<Direction, class_7300> method_39290(JsonDeserializationContext var1, JsonObject var2) {
      EnumMap var5 = Maps.newEnumMap(Direction.class);
      JsonObject var6 = class_6539.method_29783(var2, "faces");

      for (Entry var8 : var6.entrySet()) {
         Direction var9 = this.method_39283((String)var8.getKey());
         var5.put(var9, var1.deserialize((JsonElement)var8.getValue(), class_7300.class));
      }

      return var5;
   }

   private Direction method_39283(String var1) {
      Direction var4 = Direction.method_1035(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new JsonParseException("Unknown facing: " + var1);
      }
   }

   private class_2426 method_39291(JsonObject var1) {
      class_2426 var4 = this.method_39288(var1, "to");
      if (!(var4.method_11057() < -16.0F)
         && !(var4.method_11061() < -16.0F)
         && !(var4.method_11055() < -16.0F)
         && !(var4.method_11057() > 32.0F)
         && !(var4.method_11061() > 32.0F)
         && !(var4.method_11055() > 32.0F)) {
         return var4;
      } else {
         throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + var4);
      }
   }

   private class_2426 method_39282(JsonObject var1) {
      class_2426 var4 = this.method_39288(var1, "from");
      if (!(var4.method_11057() < -16.0F)
         && !(var4.method_11061() < -16.0F)
         && !(var4.method_11055() < -16.0F)
         && !(var4.method_11057() > 32.0F)
         && !(var4.method_11061() > 32.0F)
         && !(var4.method_11055() > 32.0F)) {
         return var4;
      } else {
         throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + var4);
      }
   }

   private class_2426 method_39288(JsonObject var1, String var2) {
      JsonArray var5 = class_6539.method_29787(var1, var2);
      if (var5.size() != 3) {
         throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var5.size());
      } else {
         float[] var6 = new float[3];

         for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = class_6539.method_29773(var5.get(var7), var2 + "[" + var7 + "]");
         }

         return new class_2426(var6[0], var6[1], var6[2]);
      }
   }
}
