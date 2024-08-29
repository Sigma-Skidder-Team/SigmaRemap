package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import net.minecraft.entity.Entity;

public class Class8713 {
   public static final Class8713 field39324 = new Class8713(false);
   private boolean field39325;

   private Class8713(boolean var1) {
      this.field39325 = var1;
   }

   public static Class8713 method31426(boolean var0) {
      return new Class8713(var0);
   }

   public static Class8713 method31427(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "fishing_hook");
         JsonElement var4 = var3.get("in_open_water");
         return var4 == null ? field39324 : new Class8713(JSONUtils.method32767(var4, "in_open_water"));
      } else {
         return field39324;
      }
   }

   public JsonElement method31428() {
      if (this != field39324) {
         JsonObject var3 = new JsonObject();
         var3.add("in_open_water", new JsonPrimitive(this.field39325));
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public boolean method31429(Entity var1) {
      if (this != field39324) {
         if (var1 instanceof Class904) {
            Class904 var4 = (Class904)var1;
            return this.field39325 == var4.method3541();
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
