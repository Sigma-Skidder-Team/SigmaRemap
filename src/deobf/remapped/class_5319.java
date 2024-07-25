package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class class_5319 {
   public static final class_5319 field_27132 = new class_5319();
   private final class_2307<class_2451> field_27126;
   private final class_2451 field_27129;
   private final class_7781 field_27131;
   private final class_7781 field_27135;
   private final class_5187[] field_27134;
   private final class_5187[] field_27133;
   private final class_6004 field_27128;
   private final class_6000 field_27127;

   public class_5319() {
      this.field_27126 = null;
      this.field_27129 = null;
      this.field_27128 = null;
      this.field_27131 = class_7781.field_39439;
      this.field_27135 = class_7781.field_39439;
      this.field_27134 = class_5187.field_26690;
      this.field_27133 = class_5187.field_26690;
      this.field_27127 = class_6000.field_30559;
   }

   public class_5319(
      class_2307<class_2451> var1, class_2451 var2, class_7781 var3, class_7781 var4, class_5187[] var5, class_5187[] var6, class_6004 var7, class_6000 var8
   ) {
      this.field_27126 = var1;
      this.field_27129 = var2;
      this.field_27131 = var3;
      this.field_27135 = var4;
      this.field_27134 = var5;
      this.field_27133 = var6;
      this.field_27128 = var7;
      this.field_27127 = var8;
   }

   public boolean method_24266(class_6098 var1) {
      if (this == field_27132) {
         return true;
      } else if (this.field_27126 != null && !this.field_27126.method_10609(var1.method_27960())) {
         return false;
      } else if (this.field_27129 != null && var1.method_27960() != this.field_27129) {
         return false;
      } else if (this.field_27131.method_35307(var1.method_27997())) {
         if (!this.field_27135.method_27852() && !var1.method_27959()) {
            return false;
         } else if (this.field_27135.method_35307(var1.method_27957() - var1.method_28026())) {
            if (!this.field_27127.method_27391(var1)) {
               return false;
            } else {
               if (this.field_27134.length > 0) {
                  Map var4 = class_2931.method_13409(var1.method_27983());

                  for (class_5187 var8 : this.field_27134) {
                     if (!var8.method_23823(var4)) {
                        return false;
                     }
                  }
               }

               if (this.field_27133.length > 0) {
                  Map var9 = class_2931.method_13409(class_7597.method_34501(var1));

                  for (class_5187 var14 : this.field_27133) {
                     if (!var14.method_23823(var9)) {
                        return false;
                     }
                  }
               }

               class_6004 var10 = class_9541.method_43990(var1);
               return this.field_27128 == null || this.field_27128 == var10;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static class_5319 method_24267(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "item");
         class_7781 var4 = class_7781.method_35310(var3.get("count"));
         class_7781 var5 = class_7781.method_35310(var3.get("durability"));
         if (!var3.has("data")) {
            class_6000 var6 = class_6000.method_27395(var3.get("nbt"));
            class_2451 var7 = null;
            if (var3.has("item")) {
               Identifier var8 = new Identifier(class_6539.method_29796(var3, "item"));
               var7 = class_8669.field_44382.method_39794(var8).orElseThrow(() -> new JsonSyntaxException("Unknown item id '" + var8 + "'"));
            }

            class_2307 var12 = null;
            if (var3.has("tag")) {
               Identifier var9 = new Identifier(class_6539.method_29796(var3, "tag"));
               var12 = class_8410.method_38721().method_29393().method_43140(var9);
               if (var12 == null) {
                  throw new JsonSyntaxException("Unknown item tag '" + var9 + "'");
               }
            }

            class_6004 var13 = null;
            if (var3.has("potion")) {
               Identifier var10 = new Identifier(class_6539.method_29796(var3, "potion"));
               var13 = class_8669.field_44365.method_39794(var10).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var10 + "'"));
            }

            class_5187[] var14 = class_5187.method_23824(var3.get("enchantments"));
            class_5187[] var11 = class_5187.method_23824(var3.get("stored_enchantments"));
            return new class_5319(var12, var7, var4, var5, var14, var11, var13, var6);
         } else {
            throw new JsonParseException("Disallowed data tag found");
         }
      } else {
         return field_27132;
      }
   }

   public JsonElement method_24265() {
      if (this == field_27132) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var3 = new JsonObject();
         if (this.field_27129 != null) {
            var3.addProperty("item", class_8669.field_44382.method_39797(this.field_27129).toString());
         }

         if (this.field_27126 != null) {
            var3.addProperty("tag", class_8410.method_38721().method_29393().method_43147(this.field_27126).toString());
         }

         var3.add("count", this.field_27131.method_27853());
         var3.add("durability", this.field_27135.method_27853());
         var3.add("nbt", this.field_27127.method_27396());
         if (this.field_27134.length > 0) {
            JsonArray var4 = new JsonArray();

            for (class_5187 var8 : this.field_27134) {
               var4.add(var8.method_23821());
            }

            var3.add("enchantments", var4);
         }

         if (this.field_27133.length > 0) {
            JsonArray var9 = new JsonArray();

            for (class_5187 var13 : this.field_27133) {
               var9.add(var13.method_23821());
            }

            var3.add("stored_enchantments", var9);
         }

         if (this.field_27128 != null) {
            var3.addProperty("potion", class_8669.field_44365.method_39797(this.field_27128).toString());
         }

         return var3;
      }
   }

   public static class_5319[] method_24268(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var3 = class_6539.method_29786(var0, "items");
         class_5319[] var4 = new class_5319[var3.size()];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = method_24267(var3.get(var5));
         }

         return var4;
      } else {
         return new class_5319[0];
      }
   }
}
