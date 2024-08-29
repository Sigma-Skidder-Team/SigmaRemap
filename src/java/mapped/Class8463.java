package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class Class8463 {
   public static final Class8463 field36278 = new Class8463((Class7608<Class7631>)null, (Class7631)null, Class7340.field31445);
   private final Class7608<Class7631> field36279;
   private final Class7631 field36280;
   private final Class7340 field36281;

   public Class8463(Class7608<Class7631> var1, Class7631 var2, Class7340 var3) {
      this.field36279 = var1;
      this.field36280 = var2;
      this.field36281 = var3;
   }

   public boolean method29762(ServerWorld var1, BlockPos var2) {
      if (this != field36278) {
         if (var1.method6763(var2)) {
            Class7379 var5 = var1.method6739(var2);
            Class7631 var6 = var5.method23472();
            if (this.field36279 != null && !this.field36279.method24917(var6)) {
               return false;
            } else {
               return this.field36280 != null && var6 != this.field36280 ? false : this.field36281.method23259(var5);
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static Class8463 method29763(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "fluid");
         Class7631 var4 = null;
         if (var3.has("fluid")) {
            ResourceLocation var5 = new ResourceLocation(JSONUtils.method32763(var3, "fluid"));
            var4 = Registry.field16070.method9184(var5);
         }

         Class7608 var7 = null;
         if (var3.has("tag")) {
            ResourceLocation var6 = new ResourceLocation(JSONUtils.method32763(var3, "tag"));
            var7 = Class9443.method36296().method32659().method27135(var6);
            if (var7 == null) {
               throw new JsonSyntaxException("Unknown fluid tag '" + var6 + "'");
            }
         }

         Class7340 var8 = Class7340.method23261(var3.get("state"));
         return new Class8463(var7, var4, var8);
      } else {
         return field36278;
      }
   }

   public JsonElement method29764() {
      if (this != field36278) {
         JsonObject var3 = new JsonObject();
         if (this.field36280 != null) {
            var3.addProperty("fluid", Registry.field16070.getKey(this.field36280).toString());
         }

         if (this.field36279 != null) {
            var3.addProperty("tag", Class9443.method36296().method32659().method27136(this.field36279).toString());
         }

         var3.add("state", this.field36281.method23262());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
