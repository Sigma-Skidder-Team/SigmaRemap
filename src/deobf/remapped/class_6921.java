package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class class_6921 implements JsonDeserializer<class_9874> {
   public class_9874 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      float[] var7 = this.method_31681(var6);
      int var8 = this.method_31680(var6);
      return new class_9874(var7, var8);
   }

   public int method_31680(JsonObject var1) {
      int var4 = class_6539.method_29768(var1, "rotation", 0);
      if (var4 >= 0 && var4 % 90 == 0 && var4 / 90 <= 3) {
         return var4;
      } else {
         throw new JsonParseException("Invalid rotation " + var4 + " found, only 0/90/180/270 allowed");
      }
   }

   @Nullable
   private float[] method_31681(JsonObject var1) {
      if (!var1.has("uv")) {
         return null;
      } else {
         JsonArray var4 = class_6539.method_29787(var1, "uv");
         if (var4.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + var4.size());
         } else {
            float[] var5 = new float[4];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = class_6539.method_29773(var4.get(var6), "uv[" + var6 + "]");
            }

            return var5;
         }
      }
   }
}
