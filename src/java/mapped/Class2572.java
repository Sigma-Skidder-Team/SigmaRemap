package mapped;

import com.google.gson.*;
import net.minecraft.util.JSONUtils;

import javax.annotation.Nullable;
import java.lang.reflect.Type;

public class Class2572 implements JsonDeserializer<Class9840> {
   public Class9840 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      float[] var7 = this.method10770(var6);
      int var8 = this.method10769(var6);
      return new Class9840(var7, var8);
   }

   public int method10769(JsonObject var1) {
      int var4 = JSONUtils.getInt(var1, "rotation", 0);
      if (var4 >= 0 && var4 % 90 == 0 && var4 / 90 <= 3) {
         return var4;
      } else {
         throw new JsonParseException("Invalid rotation " + var4 + " found, only 0/90/180/270 allowed");
      }
   }

   @Nullable
   private float[] method10770(JsonObject var1) {
      if (!var1.has("uv")) {
         return null;
      } else {
         JsonArray var4 = JSONUtils.method32785(var1, "uv");
         if (var4.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + var4.size());
         } else {
            float[] var5 = new float[4];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = JSONUtils.method32770(var4.get(var6), "uv[" + var6 + "]");
            }

            return var5;
         }
      }
   }
}
