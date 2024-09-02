package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public class Class7231 {
   public static final Class7231 field31074 = new Class7231(Class8840.field39936);
   private final Class8840 field31075;

   private Class7231(Class8840 var1) {
      this.field31075 = var1;
   }

   public boolean method22704(ServerWorld var1, BlockPos var2) {
      if (this != field31074) {
         return var1.method6763(var2) ? this.field31075.method32015(var1.method7015(var2)) : false;
      } else {
         return true;
      }
   }

   public JsonElement method22705() {
      if (this != field31074) {
         JsonObject var3 = new JsonObject();
         var3.add("light", this.field31075.method32005());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static Class7231 method22706(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "light");
         Class8840 var4 = Class8840.method32016(var3.get("light"));
         return new Class7231(var4);
      } else {
         return field31074;
      }
   }
}
