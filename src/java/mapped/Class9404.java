package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class Class9404 {
   public static final Class9404 field43627 = Class9024.method33410().method33413();
   private final Class8841 field43628;
   private final Class8841 field43629;
   private final Class6671 field43630;
   private final Boolean field43631;
   private final Class9539 field43632;

   public Class9404() {
      this.field43628 = Class8841.field39940;
      this.field43629 = Class8841.field39940;
      this.field43630 = Class6671.field29242;
      this.field43631 = null;
      this.field43632 = Class9539.field44409;
   }

   public Class9404(Class8841 var1, Class8841 var2, Class6671 var3, Boolean var4, Class9539 var5) {
      this.field43628 = var1;
      this.field43629 = var2;
      this.field43630 = var3;
      this.field43631 = var4;
      this.field43632 = var5;
   }

   public boolean method35779(ServerPlayerEntity var1, Class8654 var2, float var3, float var4, boolean var5) {
      if (this != field43627) {
         if (this.field43628.method32023(var3)) {
            if (this.field43629.method32023(var4)) {
               if (this.field43630.method20328(var1, var2.method31109())) {
                  return this.field43631 != null && this.field43631 != var5 ? false : this.field43632.method36911(var1, var2);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static Class9404 method35780(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = Class8963.method32781(var0, "damage");
         Class8841 var4 = Class8841.method32025(var3.get("dealt"));
         Class8841 var5 = Class8841.method32025(var3.get("taken"));
         Boolean var6 = !var3.has("blocked") ? null : Class8963.method32768(var3, "blocked");
         Class6671 var7 = Class6671.method20330(var3.get("source_entity"));
         Class9539 var8 = Class9539.method36913(var3.get("type"));
         return new Class9404(var4, var5, var7, var6, var8);
      } else {
         return field43627;
      }
   }

   public JsonElement method35781() {
      if (this != field43627) {
         JsonObject var3 = new JsonObject();
         var3.add("dealt", this.field43628.method32005());
         var3.add("taken", this.field43629.method32005());
         var3.add("source_entity", this.field43630.method20331());
         var3.add("type", this.field43632.method36915());
         if (this.field43631 != null) {
            var3.addProperty("blocked", this.field43631);
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
