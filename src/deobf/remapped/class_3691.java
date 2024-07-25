package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class class_3691 implements JsonDeserializer<class_7729> {
   public class_7729 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      class_944 var7 = this.method_17172(var3, var6, "thirdperson_righthand");
      class_944 var8 = this.method_17172(var3, var6, "thirdperson_lefthand");
      if (var8 == class_944.field_4823) {
         var8 = var7;
      }

      class_944 var9 = this.method_17172(var3, var6, "firstperson_righthand");
      class_944 var10 = this.method_17172(var3, var6, "firstperson_lefthand");
      if (var10 == class_944.field_4823) {
         var10 = var9;
      }

      class_944 var11 = this.method_17172(var3, var6, "head");
      class_944 var12 = this.method_17172(var3, var6, "gui");
      class_944 var13 = this.method_17172(var3, var6, "ground");
      class_944 var14 = this.method_17172(var3, var6, "fixed");
      return new class_7729(var8, var7, var10, var9, var11, var12, var13, var14);
   }

   private class_944 method_17172(JsonDeserializationContext var1, JsonObject var2, String var3) {
      return !var2.has(var3) ? class_944.field_4823 : (class_944)var1.deserialize(var2.get(var3), class_944.class);
   }
}
