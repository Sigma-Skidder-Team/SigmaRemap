package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class class_8447 implements JsonDeserializer<class_8338> {
   public class_8338 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Identifier var7 = this.method_38851(var6);
      class_7507 var8 = this.method_38847(var6);
      boolean var9 = this.method_38849(var6);
      int var10 = this.method_38850(var6);
      return new class_8338(var7, var8.method_25403(), var9, var10);
   }

   private boolean method_38849(JsonObject var1) {
      return class_6539.method_29772(var1, "uvlock", false);
   }

   public class_7507 method_38847(JsonObject var1) {
      int var4 = class_6539.method_29768(var1, "x", 0);
      int var5 = class_6539.method_29768(var1, "y", 0);
      class_7507 var6 = class_7507.method_34222(var4, var5);
      if (var6 != null) {
         return var6;
      } else {
         throw new JsonParseException("Invalid BlockModelRotation x: " + var4 + ", y: " + var5);
      }
   }

   public Identifier method_38851(JsonObject var1) {
      return new Identifier(class_6539.method_29796(var1, "model"));
   }

   public int method_38850(JsonObject var1) {
      int var4 = class_6539.method_29768(var1, "weight", 1);
      if (var4 >= 1) {
         return var4;
      } else {
         throw new JsonParseException("Invalid weight " + var4 + " found, expected integer >= 1");
      }
   }
}
