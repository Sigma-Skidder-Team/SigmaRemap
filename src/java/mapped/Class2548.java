package mapped;

import com.google.common.base.Preconditions;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class Class2548 {
   public void deserialize(JsonObject var1, Class7626 var2, JsonDeserializationContext var3) {
      if (var1.has("color")) {
         var2.method25017(ChatFormatting.valueOf(var1.get("color").getAsString().toUpperCase(Locale.ROOT)));
      }

      if (var1.has("bold")) {
         var2.method25018(var1.get("bold").getAsBoolean());
      }

      if (var1.has("italic")) {
         var2.method25019(var1.get("italic").getAsBoolean());
      }

      if (var1.has("underlined")) {
         var2.method25020(var1.get("underlined").getAsBoolean());
      }

      if (var1.has("strikethrough")) {
         var2.method25021(var1.get("strikethrough").getAsBoolean());
      }

      if (var1.has("obfuscated")) {
         var2.method25022(var1.get("obfuscated").getAsBoolean());
      }

      if (var1.has("insertion")) {
         var2.method25023(var1.get("insertion").getAsString());
      }

      if (var1.has("extra")) {
         var2.method25010(Arrays.asList(var3.deserialize(var1.get("extra"), Class7626[].class)));
      }

      if (var1.has("clickEvent")) {
         JsonObject var6 = var1.getAsJsonObject("clickEvent");
         var2.method25024(new Class7576(Class2027.valueOf(var6.get("action").getAsString().toUpperCase(Locale.ROOT)), var6.get("value").getAsString()));
      }

      if (var1.has("hoverEvent")) {
         JsonObject var8 = var1.getAsJsonObject("hoverEvent");
         Class7626[] var7;
         if (!var8.get("value").isJsonArray()) {
            var7 = new Class7626[]{(Class7626)var3.deserialize(var8.get("value"), Class7626.class)};
         } else {
            var7 = (Class7626[])var3.deserialize(var8.get("value"), Class7626[].class);
         }

         var2.method25025(new Class8632(Class1856.valueOf(var8.get("action").getAsString().toUpperCase(Locale.ROOT)), var7));
      }
   }

   public void serialize(JsonObject var1, Class7626 var2, JsonSerializationContext var3) {
      boolean var6 = false;
      if (Class2577.field16799.get() == null) {
         var6 = true;
         Class2577.field16799.set(new HashSet<Class7626>());
      }

      try {
         Preconditions.checkArgument(!Class2577.field16799.get().contains(var2), "Component loop");
         Class2577.field16799.get().add(var2);
         if (var2.method24999() != null) {
            var1.addProperty("color", var2.method24999().getControlCode());
         }

         if (var2.method25001() != null) {
            var1.addProperty("bold", var2.method25001());
         }

         if (var2.method25003() != null) {
            var1.addProperty("italic", var2.method25003());
         }

         if (var2.method25005() != null) {
            var1.addProperty("underlined", var2.method25005());
         }

         if (var2.method25007() != null) {
            var1.addProperty("strikethrough", var2.method25007());
         }

         if (var2.method25009() != null) {
            var1.addProperty("obfuscated", var2.method25009());
         }

         if (var2.method25026() != null) {
            var1.addProperty("insertion", var2.method25026());
         }

         if (var2.method25027() != null) {
            var1.add("extra", var3.serialize(var2.method25027()));
         }

         if (var2.method25028() != null) {
            JsonObject var7 = new JsonObject();
            var7.addProperty("action", var2.method25028().method24801().toString().toLowerCase(Locale.ROOT));
            var7.addProperty("value", var2.method25028().method24802());
            var1.add("clickEvent", var7);
         }

         if (var2.method25029() != null) {
            JsonObject var11 = new JsonObject();
            var11.addProperty("action", var2.method25029().method31012().toString().toLowerCase(Locale.ROOT));
            var11.add("value", var3.serialize(var2.method25029().method31013()));
            var1.add("hoverEvent", var11);
         }
      } finally {
         Class2577.field16799.get().remove(var2);
         if (var6) {
            Class2577.field16799.set(null);
         }
      }
   }
}
