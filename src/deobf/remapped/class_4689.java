package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class class_4689 {
   public static final class_4689 field_22823 = new class_4689((class_2307<class_2340>)null, (class_2340)null, class_1827.field_9269);
   private final class_2307<class_2340> field_22826;
   private final class_2340 field_22822;
   private final class_1827 field_22825;

   public class_4689(class_2307<class_2340> var1, class_2340 var2, class_1827 var3) {
      this.field_22826 = var1;
      this.field_22822 = var2;
      this.field_22825 = var3;
   }

   public boolean method_21653(class_6331 var1, class_1331 var2) {
      if (this != field_22823) {
         if (var1.method_29585(var2)) {
            class_4774 var5 = var1.method_28258(var2);
            class_2340 var6 = var5.method_22005();
            if (this.field_22826 != null && !this.field_22826.method_10609(var6)) {
               return false;
            } else {
               return this.field_22822 != null && var6 != this.field_22822 ? false : this.field_22825.method_8077(var5);
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static class_4689 method_21656(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "fluid");
         class_2340 var4 = null;
         if (var3.has("fluid")) {
            Identifier var5 = new Identifier(class_6539.method_29796(var3, "fluid"));
            var4 = class_8669.field_44447.method_39806(var5);
         }

         class_2307 var7 = null;
         if (var3.has("tag")) {
            Identifier var6 = new Identifier(class_6539.method_29796(var3, "tag"));
            var7 = class_8410.method_38721().method_29391().method_43140(var6);
            if (var7 == null) {
               throw new JsonSyntaxException("Unknown fluid tag '" + var6 + "'");
            }
         }

         class_1827 var8 = class_1827.method_8079(var3.get("state"));
         return new class_4689(var7, var4, var8);
      } else {
         return field_22823;
      }
   }

   public JsonElement method_21655() {
      if (this != field_22823) {
         JsonObject var3 = new JsonObject();
         if (this.field_22822 != null) {
            var3.addProperty("fluid", class_8669.field_44447.method_39797(this.field_22822).toString());
         }

         if (this.field_22826 != null) {
            var3.addProperty("tag", class_8410.method_38721().method_29391().method_43147(this.field_22826).toString());
         }

         var3.add("state", this.field_22825.method_8078());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
