package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class class_8431 {
   public static final class_8431 field_43143 = new class_8431((class_2307<class_6414>)null, (class_6414)null, class_1827.field_9269, class_6000.field_30559);
   private final class_2307<class_6414> field_43144;
   private final class_6414 field_43147;
   private final class_1827 field_43146;
   private final class_6000 field_43148;

   public class_8431(class_2307<class_6414> var1, class_6414 var2, class_1827 var3, class_6000 var4) {
      this.field_43144 = var1;
      this.field_43147 = var2;
      this.field_43146 = var3;
      this.field_43148 = var4;
   }

   public boolean method_38797(class_6331 var1, class_1331 var2) {
      if (this == field_43143) {
         return true;
      } else if (var1.method_29585(var2)) {
         class_2522 var5 = var1.method_28262(var2);
         class_6414 var6 = var5.method_8360();
         if (this.field_43144 != null && !this.field_43144.method_10609(var6)) {
            return false;
         } else if (this.field_43147 != null && var6 != this.field_43147) {
            return false;
         } else if (!this.field_43146.method_8076(var5)) {
            return false;
         } else {
            if (this.field_43148 != class_6000.field_30559) {
               class_3757 var7 = var1.method_28260(var2);
               if (var7 == null || !this.field_43148.method_27393(var7.method_17396(new CompoundNBT()))) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static class_8431 method_38796(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "block");
         class_6000 var4 = class_6000.method_27395(var3.get("nbt"));
         class_6414 var5 = null;
         if (var3.has("block")) {
            Identifier var6 = new Identifier(class_6539.method_29796(var3, "block"));
            var5 = class_8669.field_44462.method_39806(var6);
         }

         class_2307 var8 = null;
         if (var3.has("tag")) {
            Identifier var7 = new Identifier(class_6539.method_29796(var3, "tag"));
            var8 = class_8410.method_38721().method_29392().method_43140(var7);
            if (var8 == null) {
               throw new JsonSyntaxException("Unknown block tag '" + var7 + "'");
            }
         }

         class_1827 var9 = class_1827.method_8079(var3.get("state"));
         return new class_8431(var8, var5, var9, var4);
      } else {
         return field_43143;
      }
   }

   public JsonElement method_38794() {
      if (this != field_43143) {
         JsonObject var3 = new JsonObject();
         if (this.field_43147 != null) {
            var3.addProperty("block", class_8669.field_44462.method_39797(this.field_43147).toString());
         }

         if (this.field_43144 != null) {
            var3.addProperty("tag", class_8410.method_38721().method_29392().method_43147(this.field_43144).toString());
         }

         var3.add("nbt", this.field_43148.method_27396());
         var3.add("state", this.field_43146.method_8078());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
