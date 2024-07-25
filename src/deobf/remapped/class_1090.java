package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.UUID;

public class class_1090 {
   private final String field_6018;
   private final class_225 field_6014;
   private final class_9342 field_6015;
   private final class_7986 field_6016;
   private final UUID field_6012;
   private final class_6943[] field_6013;

   private class_1090(String var1, class_225 var2, class_9342 var3, class_7986 var4, class_6943[] var5, UUID var6) {
      this.field_6018 = var1;
      this.field_6014 = var2;
      this.field_6015 = var3;
      this.field_6016 = var4;
      this.field_6012 = var6;
      this.field_6013 = var5;
   }

   public JsonObject method_4775(JsonSerializationContext var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", this.field_6018);
      var4.addProperty("attribute", class_8669.field_44403.method_39797(this.field_6014).toString());
      var4.addProperty("operation", method_4774(this.field_6015));
      var4.add("amount", var1.serialize(this.field_6016));
      if (this.field_6012 != null) {
         var4.addProperty("id", this.field_6012.toString());
      }

      if (this.field_6013.length != 1) {
         JsonArray var5 = new JsonArray();

         for (class_6943 var9 : this.field_6013) {
            var5.add(new JsonPrimitive(var9.method_31769()));
         }

         var4.add("slot", var5);
      } else {
         var4.addProperty("slot", this.field_6013[0].method_31769());
      }

      return var4;
   }

   public static class_1090 method_4770(JsonObject var0, JsonDeserializationContext var1) {
      String var4 = class_6539.method_29796(var0, "name");
      Identifier var5 = new Identifier(class_6539.method_29796(var0, "attribute"));
      class_225 var6 = class_8669.field_44403.method_39806(var5);
      if (var6 == null) {
         throw new JsonSyntaxException("Unknown attribute: " + var5);
      } else {
         class_9342 var7 = method_4771(class_6539.method_29796(var0, "operation"));
         class_7986 var8 = class_6539.<class_7986>method_29778(var0, "amount", var1, class_7986.class);
         UUID var9 = null;
         class_6943[] var10;
         if (class_6539.method_29793(var0, "slot")) {
            var10 = new class_6943[]{class_6943.method_31771(class_6539.method_29796(var0, "slot"))};
         } else {
            if (!class_6539.method_29763(var0, "slot")) {
               throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }

            JsonArray var11 = class_6539.method_29787(var0, "slot");
            var10 = new class_6943[var11.size()];
            int var12 = 0;

            for (JsonElement var14 : var11) {
               var10[var12++] = class_6943.method_31771(class_6539.method_29795(var14, "slot"));
            }

            if (var10.length == 0) {
               throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
            }
         }

         if (var0.has("id")) {
            String var16 = class_6539.method_29796(var0, "id");

            try {
               var9 = UUID.fromString(var16);
            } catch (IllegalArgumentException var15) {
               throw new JsonSyntaxException("Invalid attribute modifier id '" + var16 + "' (must be UUID format, with dashes)");
            }
         }

         return new class_1090(var4, var6, var7, var8, var10, var9);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static String method_4774(class_9342 var0) {
      switch (var0) {
         case field_47679:
            return "addition";
         case field_47678:
            return "multiply_base";
         case field_47677:
            return "multiply_total";
         default:
            throw new IllegalArgumentException("Unknown operation " + var0);
      }
   }

   private static class_9342 method_4771(String var0) {
      switch (var0) {
         case "addition":
            return class_9342.field_47679;
         case "multiply_base":
            return class_9342.field_47678;
         case "multiply_total":
            return class_9342.field_47677;
         default:
            throw new JsonSyntaxException("Unknown attribute modifier operation " + var0);
      }
   }
}
