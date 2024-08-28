package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2566 implements JsonDeserializer<Class9264> {
   public Class9264 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Class6792 var7 = this.method10758(var3, var6, "thirdperson_righthand");
      Class6792 var8 = this.method10758(var3, var6, "thirdperson_lefthand");
      if (var8 == Class6792.field29588) {
         var8 = var7;
      }

      Class6792 var9 = this.method10758(var3, var6, "firstperson_righthand");
      Class6792 var10 = this.method10758(var3, var6, "firstperson_lefthand");
      if (var10 == Class6792.field29588) {
         var10 = var9;
      }

      Class6792 var11 = this.method10758(var3, var6, "head");
      Class6792 var12 = this.method10758(var3, var6, "gui");
      Class6792 var13 = this.method10758(var3, var6, "ground");
      Class6792 var14 = this.method10758(var3, var6, "fixed");
      return new Class9264(var8, var7, var10, var9, var11, var12, var13, var14);
   }

   private Class6792 method10758(JsonDeserializationContext var1, JsonObject var2, String var3) {
      return !var2.has(var3) ? Class6792.field29588 : (Class6792)var1.deserialize(var2.get(var3), Class6792.class);
   }
}
