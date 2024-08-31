package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.util.ResourceLocation;

import java.util.UUID;

public class Class6884 {
   private final String field29832;
   private final Class4869 field29833;
   private final AttributeModifierOperation field29834;
   private final Class6872 field29835;
   private final UUID field29836;
   private final Class2106[] field29837;

   private Class6884(String var1, Class4869 var2, AttributeModifierOperation var3, Class6872 var4, Class2106[] var5, UUID var6) {
      this.field29832 = var1;
      this.field29833 = var2;
      this.field29834 = var3;
      this.field29835 = var4;
      this.field29836 = var6;
      this.field29837 = var5;
   }

   public JsonObject method20960(JsonSerializationContext var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", this.field29832);
      var4.addProperty("attribute", Registry.field16087.getKey(this.field29833).toString());
      var4.addProperty("operation", method20962(this.field29834));
      var4.add("amount", var1.serialize(this.field29835));
      if (this.field29836 != null) {
         var4.addProperty("id", this.field29836.toString());
      }

      if (this.field29837.length != 1) {
         JsonArray var5 = new JsonArray();

         for (Class2106 var9 : this.field29837) {
            var5.add(new JsonPrimitive(var9.method8775()));
         }

         var4.add("slot", var5);
      } else {
         var4.addProperty("slot", this.field29837[0].method8775());
      }

      return var4;
   }

   public static Class6884 method20961(JsonObject var0, JsonDeserializationContext var1) {
      String var4 = JSONUtils.method32763(var0, "name");
      ResourceLocation var5 = new ResourceLocation(JSONUtils.method32763(var0, "attribute"));
      Class4869 var6 = Registry.field16087.method9184(var5);
      if (var6 == null) {
         throw new JsonSyntaxException("Unknown attribute: " + var5);
      } else {
         AttributeModifierOperation var7 = method20963(JSONUtils.method32763(var0, "operation"));
         Class6872 var8 = JSONUtils.<Class6872>method32788(var0, "amount", var1, Class6872.class);
         UUID var9 = null;
         Class2106[] var10;
         if (JSONUtils.method32755(var0, "slot")) {
            var10 = new Class2106[]{Class2106.method8776(JSONUtils.method32763(var0, "slot"))};
         } else {
            if (!JSONUtils.method32759(var0, "slot")) {
               throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }

            JsonArray var11 = JSONUtils.method32785(var0, "slot");
            var10 = new Class2106[var11.size()];
            int var12 = 0;

            for (JsonElement var14 : var11) {
               var10[var12++] = Class2106.method8776(JSONUtils.method32762(var14, "slot"));
            }

            if (var10.length == 0) {
               throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
            }
         }

         if (var0.has("id")) {
            String var16 = JSONUtils.method32763(var0, "id");

            try {
               var9 = UUID.fromString(var16);
            } catch (IllegalArgumentException var15) {
               throw new JsonSyntaxException("Invalid attribute modifier id '" + var16 + "' (must be UUID format, with dashes)");
            }
         }

         return new Class6884(var4, var6, var7, var8, var10, var9);
      }
   }

   private static String method20962(AttributeModifierOperation var0) {
      switch (Class8163.field35137[var0.ordinal()]) {
         case 1:
            return "addition";
         case 2:
            return "multiply_base";
         case 3:
            return "multiply_total";
         default:
            throw new IllegalArgumentException("Unknown operation " + var0);
      }
   }

   private static AttributeModifierOperation method20963(String var0) {
      switch (var0) {
         case "addition":
            return AttributeModifierOperation.ADDITION;
         case "multiply_base":
            return AttributeModifierOperation.field13353;
         case "multiply_total":
            return AttributeModifierOperation.MULTIPLY_TOTAL;
         default:
            throw new JsonSyntaxException("Unknown attribute modifier operation " + var0);
      }
   }

   // $VF: synthetic method
   public static UUID method20964(Class6884 var0) {
      return var0.field29836;
   }

   // $VF: synthetic method
   public static Class2106[] method20965(Class6884 var0) {
      return var0.field29837;
   }

   // $VF: synthetic method
   public static Class4869 method20966(Class6884 var0) {
      return var0.field29833;
   }

   // $VF: synthetic method
   public static String method20967(Class6884 var0) {
      return var0.field29832;
   }

   // $VF: synthetic method
   public static Class6872 method20968(Class6884 var0) {
      return var0.field29835;
   }

   // $VF: synthetic method
   public static AttributeModifierOperation method20969(Class6884 var0) {
      return var0.field29834;
   }
}
