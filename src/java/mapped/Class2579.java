package mapped;

import com.google.common.collect.Maps;
import com.google.gson.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public class Class2579 implements JsonDeserializer<Class9726> {
   public Class9726 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Vector3f var7 = this.method10780(var6);
      Vector3f var8 = this.method10779(var6);
      Class7360 var9 = this.method10773(var6);
      Map var10 = this.method10776(var3, var6);
      if (var6.has("shade") && !JSONUtils.method32758(var6, "shade")) {
         throw new JsonParseException("Expected shade to be a Boolean");
      } else {
         boolean var11 = JSONUtils.getBoolean(var6, "shade", true);
         return new Class9726(var7, var8, var10, var9, var11);
      }
   }

   @Nullable
   private Class7360 method10773(JsonObject var1) {
      Class7360 var4 = null;
      if (var1.has("rotation")) {
         JsonObject var5 = JSONUtils.method32782(var1, "rotation");
         Vector3f var6 = this.method10781(var5, "origin");
         var6.method25272(0.0625F);
         Direction.Axis var7 = this.method10775(var5);
         float var8 = this.method10774(var5);
         boolean var9 = JSONUtils.getBoolean(var5, "rescale", false);
         var4 = new Class7360(var6, var7, var8, var9);
      }

      return var4;
   }

   private float method10774(JsonObject var1) {
      float var4 = JSONUtils.method32771(var1, "angle");
      if (var4 != 0.0F && MathHelper.method37771(var4) != 22.5F && MathHelper.method37771(var4) != 45.0F) {
         throw new JsonParseException("Invalid rotation " + var4 + " found, only -45/-22.5/0/22.5/45 allowed");
      } else {
         return var4;
      }
   }

   private Direction.Axis method10775(JsonObject var1) {
      String var4 = JSONUtils.getString(var1, "axis");
      Direction.Axis var5 = Direction.Axis.method321(var4.toLowerCase(Locale.ROOT));
      if (var5 != null) {
         return var5;
      } else {
         throw new JsonParseException("Invalid rotation axis: " + var4);
      }
   }

   private Map<Direction, Class9163> method10776(JsonDeserializationContext var1, JsonObject var2) {
      Map var5 = this.method10777(var1, var2);
      if (!var5.isEmpty()) {
         return var5;
      } else {
         throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
      }
   }

   private Map<Direction, Class9163> method10777(JsonDeserializationContext var1, JsonObject var2) {
      EnumMap var5 = Maps.newEnumMap(Direction.class);
      JsonObject var6 = JSONUtils.method32782(var2, "faces");

      for (Entry var8 : var6.entrySet()) {
         Direction var9 = this.method10778((String)var8.getKey());
         var5.put(var9, var1.deserialize((JsonElement)var8.getValue(), Class9163.class));
      }

      return var5;
   }

   private Direction method10778(String var1) {
      Direction var4 = Direction.byName(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new JsonParseException("Unknown facing: " + var1);
      }
   }

   private Vector3f method10779(JsonObject var1) {
      Vector3f var4 = this.method10781(var1, "to");
      if (!(var4.method25269() < -16.0F)
         && !(var4.method25270() < -16.0F)
         && !(var4.method25271() < -16.0F)
         && !(var4.method25269() > 32.0F)
         && !(var4.method25270() > 32.0F)
         && !(var4.method25271() > 32.0F)) {
         return var4;
      } else {
         throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + var4);
      }
   }

   private Vector3f method10780(JsonObject var1) {
      Vector3f var4 = this.method10781(var1, "from");
      if (!(var4.method25269() < -16.0F)
         && !(var4.method25270() < -16.0F)
         && !(var4.method25271() < -16.0F)
         && !(var4.method25269() > 32.0F)
         && !(var4.method25270() > 32.0F)
         && !(var4.method25271() > 32.0F)) {
         return var4;
      } else {
         throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + var4);
      }
   }

   private Vector3f method10781(JsonObject var1, String var2) {
      JsonArray var5 = JSONUtils.method32785(var1, var2);
      if (var5.size() != 3) {
         throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var5.size());
      } else {
         float[] var6 = new float[3];

         for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = JSONUtils.method32770(var5.get(var7), var2 + "[" + var7 + "]");
         }

         return new Vector3f(var6[0], var6[1], var6[2]);
      }
   }
}
