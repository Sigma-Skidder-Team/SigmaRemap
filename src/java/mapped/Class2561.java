package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2561 implements JsonDeserializer<Class6792> {
   private static final Vector3f field16787 = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Vector3f field16788 = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Vector3f field16789 = new Vector3f(1.0F, 1.0F, 1.0F);

   public Class6792 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Vector3f var7 = this.method10757(var6, "rotation", field16787);
      Vector3f var8 = this.method10757(var6, "translation", field16788);
      var8.method25272(0.0625F);
      var8.method25274(-5.0F, 5.0F);
      Vector3f var9 = this.method10757(var6, "scale", field16789);
      var9.method25274(-4.0F, 4.0F);
      return new Class6792(var7, var8, var9);
   }

   private Vector3f method10757(JsonObject var1, String var2, Vector3f var3) {
      if (!var1.has(var2)) {
         return var3;
      } else {
         JsonArray var6 = JSONUtils.method32785(var1, var2);
         if (var6.size() != 3) {
            throw new JsonParseException("Expected 3 " + var2 + " values, found: " + var6.size());
         } else {
            float[] var7 = new float[3];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = JSONUtils.method32770(var6.get(var8), var2 + "[" + var8 + "]");
            }

            return new Vector3f(var7[0], var7[1], var7[2]);
         }
      }
   }
}
