package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class class_6920 implements JsonDeserializer<class_944> {
   private static final class_2426 field_35552 = new class_2426(0.0F, 0.0F, 0.0F);
   private static final class_2426 field_35553 = new class_2426(0.0F, 0.0F, 0.0F);
   private static final class_2426 field_35551 = new class_2426(1.0F, 1.0F, 1.0F);

   public class_944 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      class_2426 var7 = this.method_31679(var6, "rotation", field_35552);
      class_2426 var8 = this.method_31679(var6, "translation", field_35553);
      var8.method_11068(0.0625F);
      var8.method_11073(-5.0F, 5.0F);
      class_2426 var9 = this.method_31679(var6, "scale", field_35551);
      var9.method_11073(-4.0F, 4.0F);
      return new class_944(var7, var8, var9);
   }

   private class_2426 method_31679(JsonObject var1, String var2, class_2426 var3) {
      if (!var1.has(var2)) {
         return var3;
      } else {
         JsonArray var6 = class_6539.method_29787(var1, var2);
         if (var6.size() != 3) {
            throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var6.size());
         } else {
            float[] var7 = new float[3];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = class_6539.method_29773(var6.get(var8), var2 + "[" + var8 + "]");
            }

            return new class_2426(var7[0], var7[1], var7[2]);
         }
      }
   }
}
