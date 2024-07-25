package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public class class_592 implements JsonDeserializer<class_7300> {
   public class_7300 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      class_240 var7 = this.method_2784(var6);
      int var8 = this.method_2785(var6);
      String var9 = this.method_2782(var6);
      class_9874 var10 = (class_9874)var3.deserialize(var6, class_9874.class);
      return new class_7300(var7, var8, var9, var10);
   }

   public int method_2785(JsonObject var1) {
      return class_6539.method_29768(var1, "tintindex", -1);
   }

   private String method_2782(JsonObject var1) {
      return class_6539.method_29796(var1, "texture");
   }

   @Nullable
   private class_240 method_2784(JsonObject var1) {
      String var4 = class_6539.method_29797(var1, "cullface", "");
      return class_240.method_1035(var4);
   }
}
