package mapped;

import com.google.gson.*;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Type;

public class Class2557 implements JsonDeserializer<Class1903> {
   public Class1903 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      ResourceLocation var7 = this.method10751(var6);
      Class1901 var8 = this.method10750(var6);
      boolean var9 = this.method10749(var6);
      int var10 = this.method10752(var6);
      return new Class1903(var7, var8.method8166(), var9, var10);
   }

   private boolean method10749(JsonObject var1) {
      return JSONUtils.getBoolean(var1, "uvlock", false);
   }

   public Class1901 method10750(JsonObject var1) {
      int var4 = JSONUtils.getInt(var1, "x", 0);
      int var5 = JSONUtils.getInt(var1, "y", 0);
      Class1901 var6 = Class1901.method8167(var4, var5);
      if (var6 != null) {
         return var6;
      } else {
         throw new JsonParseException("Invalid BlockModelRotation x: " + var4 + ", y: " + var5);
      }
   }

   public ResourceLocation method10751(JsonObject var1) {
      return new ResourceLocation(JSONUtils.getString(var1, "model"));
   }

   public int method10752(JsonObject var1) {
      int var4 = JSONUtils.getInt(var1, "weight", 1);
      if (var4 >= 1) {
         return var4;
      } else {
         throw new JsonParseException("Invalid weight " + var4 + " found, expected integer >= 1");
      }
   }
}
