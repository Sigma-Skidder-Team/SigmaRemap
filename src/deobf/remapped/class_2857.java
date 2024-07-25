package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Locale;

public class class_2857 extends class_7789<class_2882> {
   public void method_13086(JsonObject var1, class_2882 var2, JsonSerializationContext var3) {
      super.method_35344(var1, var2, var3);
      if (!class_2882.method_13220(var2).equals(class_2882.field_14112)) {
         var1.add("destination", var3.serialize(class_2882.method_13220(var2).method_24556()));
      }

      if (class_2882.method_13222(var2) != class_2882.field_14116) {
         var1.add("decoration", var3.serialize(class_2882.method_13222(var2).toString().toLowerCase(Locale.ROOT)));
      }

      if (class_2882.method_13223(var2) != 2) {
         var1.addProperty("zoom", class_2882.method_13223(var2));
      }

      if (class_2882.method_13225(var2) != 50) {
         var1.addProperty("search_radius", class_2882.method_13225(var2));
      }

      if (!class_2882.method_13224(var2)) {
         var1.addProperty("skip_existing_chunks", class_2882.method_13224(var2));
      }
   }

   public class_2882 method_13088(JsonObject var1, JsonDeserializationContext var2, class_7279[] var3) {
      class_5390 var6 = method_13087(var1);
      String var7 = var1.has("decoration") ? class_6539.method_29796(var1, "decoration") : "mansion";
      class_8086 var8 = class_2882.field_14116;

      try {
         var8 = class_8086.valueOf(var7.toUpperCase(Locale.ROOT));
      } catch (IllegalArgumentException var12) {
         class_2882.method_13221().error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + class_2882.field_14116, var7);
      }

      byte var9 = class_6539.method_29762(var1, "zoom", (byte)2);
      int var10 = class_6539.method_29768(var1, "search_radius", 50);
      boolean var11 = class_6539.method_29772(var1, "skip_existing_chunks", true);
      return new class_2882(var3, var6, var8, var9, var10, var11, null);
   }

   private static class_5390<?> method_13087(JsonObject var0) {
      if (var0.has("destination")) {
         String var3 = class_6539.method_29796(var0, "destination");
         class_5390 var4 = (class_5390)class_5390.field_27500.get(var3.toLowerCase(Locale.ROOT));
         if (var4 != null) {
            return var4;
         }
      }

      return class_2882.field_14112;
   }
}
