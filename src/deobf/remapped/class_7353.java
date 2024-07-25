package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_7353 {
   private final class_5154 field_37589;

   public class_7353(class_5154 var1) {
      this.field_37589 = var1;
   }

   public class_7353() {
      this.field_37589 = null;
   }

   public void method_33503(class_8248 var1) {
   }

   public static class_7353 method_33504(JsonObject var0, class_8096 var1) {
      class_4639 var4 = new class_4639(class_6539.method_29796(var0, "trigger"));
      class_911 var5 = class_8807.method_40478(var4);
      if (var5 != null) {
         class_5154 var6 = var5.method_3898(class_6539.method_29784(var0, "conditions", new JsonObject()), var1);
         return new class_7353(var6);
      } else {
         throw new JsonSyntaxException("Invalid criterion trigger: " + var4);
      }
   }

   public static class_7353 method_33501(class_8248 var0) {
      return new class_7353();
   }

   public static Map<String, class_7353> method_33506(JsonObject var0, class_8096 var1) {
      HashMap var4 = Maps.newHashMap();

      for (Entry var6 : var0.entrySet()) {
         var4.put(var6.getKey(), method_33504(class_6539.method_29782((JsonElement)var6.getValue(), "criterion"), var1));
      }

      return var4;
   }

   public static Map<String, class_7353> method_33507(class_8248 var0) {
      HashMap var3 = Maps.newHashMap();
      int var4 = var0.method_37778();

      for (int var5 = 0; var5 < var4; var5++) {
         var3.put(var0.method_37784(32767), method_33501(var0));
      }

      return var3;
   }

   public static void method_33502(Map<String, class_7353> var0, class_8248 var1) {
      var1.method_37743(var0.size());

      for (Entry var5 : var0.entrySet()) {
         var1.method_37760((String)var5.getKey());
         ((class_7353)var5.getValue()).method_33503(var1);
      }
   }

   @Nullable
   public class_5154 method_33505() {
      return this.field_37589;
   }

   public JsonElement method_33500() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("trigger", this.field_37589.method_23585().toString());
      JsonObject var4 = this.field_37589.method_23586(class_3630.field_17721);
      if (var4.size() != 0) {
         var3.add("conditions", var4);
      }

      return var3;
   }
}
