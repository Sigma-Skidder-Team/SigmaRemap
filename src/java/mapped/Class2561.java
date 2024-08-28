package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2561 implements JsonDeserializer<Class6792> {
   private static final Class7680 field16787 = new Class7680(0.0F, 0.0F, 0.0F);
   private static final Class7680 field16788 = new Class7680(0.0F, 0.0F, 0.0F);
   private static final Class7680 field16789 = new Class7680(1.0F, 1.0F, 1.0F);

   public Class6792 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Class7680 var7 = this.method10757(var6, "rotation", field16787);
      Class7680 var8 = this.method10757(var6, "translation", field16788);
      var8.method25272(0.0625F);
      var8.method25274(-5.0F, 5.0F);
      Class7680 var9 = this.method10757(var6, "scale", field16789);
      var9.method25274(-4.0F, 4.0F);
      return new Class6792(var7, var8, var9);
   }

   private Class7680 method10757(JsonObject var1, String var2, Class7680 var3) {
      if (!var1.has(var2)) {
         return var3;
      } else {
         JsonArray var6 = Class8963.method32785(var1, var2);
         if (var6.size() != 3) {
            throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var6.size());
         } else {
            float[] var7 = new float[3];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = Class8963.method32770(var6.get(var8), var2 + "[" + var8 + "]");
            }

            return new Class7680(var7[0], var7[1], var7[2]);
         }
      }
   }
}
