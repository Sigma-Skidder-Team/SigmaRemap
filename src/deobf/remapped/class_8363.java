package remapped;

import com.google.common.base.Preconditions;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class class_8363 {
   public void deserialize(JsonObject var1, class_6349 var2, JsonDeserializationContext var3) {
      if (var1.has("color")) {
         var2.method_29073(class_2909.valueOf(var1.get("color").getAsString().toUpperCase(Locale.ROOT)));
      }

      if (var1.has("bold")) {
         var2.method_29050(var1.get("bold").getAsBoolean());
      }

      if (var1.has("italic")) {
         var2.method_29053(var1.get("italic").getAsBoolean());
      }

      if (var1.has("underlined")) {
         var2.method_29068(var1.get("underlined").getAsBoolean());
      }

      if (var1.has("strikethrough")) {
         var2.method_29075(var1.get("strikethrough").getAsBoolean());
      }

      if (var1.has("obfuscated")) {
         var2.method_29082(var1.get("obfuscated").getAsBoolean());
      }

      if (var1.has("insertion")) {
         var2.method_29062(var1.get("insertion").getAsString());
      }

      if (var1.has("extra")) {
         var2.method_29043(Arrays.<class_6349>asList((Object[])var3.deserialize(var1.get("extra"), class_6349[].class)));
      }

      if (var1.has("clickEvent")) {
         JsonObject var6 = var1.getAsJsonObject("clickEvent");
         var2.method_29060(new class_2257(class_7354.valueOf(var6.get("action").getAsString().toUpperCase(Locale.ROOT)), var6.get("value").getAsString()));
      }

      if (var1.has("hoverEvent")) {
         JsonObject var8 = var1.getAsJsonObject("hoverEvent");
         class_6349[] var7;
         if (!var8.get("value").isJsonArray()) {
            var7 = new class_6349[]{(class_6349)var3.deserialize(var8.get("value"), class_6349.class)};
         } else {
            var7 = (class_6349[])var3.deserialize(var8.get("value"), class_6349[].class);
         }

         var2.method_29072(new class_5316(class_6991.valueOf(var8.get("action").getAsString().toUpperCase(Locale.ROOT)), var7));
      }
   }

   public void serialize(JsonObject var1, class_6349 var2, JsonSerializationContext var3) {
      boolean var6 = false;
      if (class_9578.field_48718.get() == null) {
         var6 = true;
         class_9578.field_48718.set(new HashSet<class_6349>());
      }

      try {
         Preconditions.checkArgument(!class_9578.field_48718.get().contains(var2), "Component loop");
         class_9578.field_48718.get().add(var2);
         if (var2.method_29076() != null) {
            var1.addProperty("color", var2.method_29076().method_13311());
         }

         if (var2.method_29058() != null) {
            var1.addProperty("bold", var2.method_29058());
         }

         if (var2.method_29064() != null) {
            var1.addProperty("italic", var2.method_29064());
         }

         if (var2.method_29061() != null) {
            var1.addProperty("underlined", var2.method_29061());
         }

         if (var2.method_29081() != null) {
            var1.addProperty("strikethrough", var2.method_29081());
         }

         if (var2.method_29046() != null) {
            var1.addProperty("obfuscated", var2.method_29046());
         }

         if (var2.method_29078() != null) {
            var1.addProperty("insertion", var2.method_29078());
         }

         if (var2.method_29048() != null) {
            var1.add("extra", var3.serialize(var2.method_29048()));
         }

         if (var2.method_29041() != null) {
            JsonObject var7 = new JsonObject();
            var7.addProperty("action", var2.method_29041().method_10371().toString().toLowerCase(Locale.ROOT));
            var7.addProperty("value", var2.method_29041().method_10372());
            var1.add("clickEvent", var7);
         }

         if (var2.method_29074() != null) {
            JsonObject var11 = new JsonObject();
            var11.addProperty("action", var2.method_29074().method_24252().toString().toLowerCase(Locale.ROOT));
            var11.add("value", var3.serialize(var2.method_29074().method_24253()));
            var1.add("hoverEvent", var11);
         }
      } finally {
         class_9578.field_48718.get().remove(var2);
         if (var6) {
            class_9578.field_48718.set(null);
         }
      }
   }
}
