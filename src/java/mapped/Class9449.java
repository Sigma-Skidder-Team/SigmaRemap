package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class Class9449 {
   public static final Class9449 field43899 = new Class9449((Class7608<Block>)null, (Block)null, Class7340.field31445, Class8811.field39645);
   private final Class7608<Block> field43900;
   private final Block field43901;
   private final Class7340 field43902;
   private final Class8811 field43903;

   public Class9449(Class7608<Block> var1, Block var2, Class7340 var3, Class8811 var4) {
      this.field43900 = var1;
      this.field43901 = var2;
      this.field43902 = var3;
      this.field43903 = var4;
   }

   public boolean method36328(ServerWorld var1, BlockPos var2) {
      if (this == field43899) {
         return true;
      } else if (var1.method6763(var2)) {
         Class7380 var5 = var1.method6738(var2);
         Block var6 = var5.method23383();
         if (this.field43900 != null && !this.field43900.method24917(var6)) {
            return false;
         } else if (this.field43901 != null && var6 != this.field43901) {
            return false;
         } else if (!this.field43902.method23258(var5)) {
            return false;
         } else {
            if (this.field43903 != Class8811.field39645) {
               Class944 var7 = var1.method6759(var2);
               if (var7 == null || !this.field43903.method31810(var7.method3646(new Class39()))) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static Class9449 method36329(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = Class8963.method32781(var0, "block");
         Class8811 var4 = Class8811.method31812(var3.get("nbt"));
         Block var5 = null;
         if (var3.has("block")) {
            ResourceLocation var6 = new ResourceLocation(Class8963.method32763(var3, "block"));
            var5 = Registry.field16072.method9184(var6);
         }

         Class7608 var8 = null;
         if (var3.has("tag")) {
            ResourceLocation var7 = new ResourceLocation(Class8963.method32763(var3, "tag"));
            var8 = Class9443.method36296().method32657().method27135(var7);
            if (var8 == null) {
               throw new JsonSyntaxException("Unknown block tag '" + var7 + "'");
            }
         }

         Class7340 var9 = Class7340.method23261(var3.get("state"));
         return new Class9449(var8, var5, var9, var4);
      } else {
         return field43899;
      }
   }

   public JsonElement method36330() {
      if (this != field43899) {
         JsonObject var3 = new JsonObject();
         if (this.field43901 != null) {
            var3.addProperty("block", Registry.field16072.method9181(this.field43901).toString());
         }

         if (this.field43900 != null) {
            var3.addProperty("tag", Class9443.method36296().method32657().method27136(this.field43900).toString());
         }

         var3.add("nbt", this.field43903.method31811());
         var3.add("state", this.field43902.method23262());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
