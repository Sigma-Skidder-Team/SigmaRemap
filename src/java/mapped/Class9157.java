package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import javax.annotation.Nullable;

public class Class9157 {
   public static final Class9157 field42036 = new Class8265().method28833();
   private final Boolean field42037;
   private final Boolean field42038;
   private final Boolean field42039;
   private final Boolean field42040;
   private final Boolean field42041;

   public Class9157(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5) {
      this.field42037 = var1;
      this.field42038 = var2;
      this.field42039 = var3;
      this.field42040 = var4;
      this.field42041 = var5;
   }

   public boolean method34187(Entity var1) {
      if (this.field42037 != null && var1.method3327() != this.field42037) {
         return false;
      } else if (this.field42038 != null && var1.method3336() != this.field42038) {
         return false;
      } else if (this.field42039 != null && var1.method3337() != this.field42039) {
         return false;
      } else {
         return this.field42040 != null && var1.method2951() != this.field42040
            ? false
            : this.field42041 == null || !(var1 instanceof LivingEntity) || ((LivingEntity)var1).method3005() == this.field42041;
      }
   }

   @Nullable
   private static Boolean method34188(JsonObject var0, String var1) {
      return !var0.has(var1) ? null : JSONUtils.method32768(var0, var1);
   }

   public static Class9157 method34189(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "entity flags");
         Boolean var4 = method34188(var3, "is_on_fire");
         Boolean var5 = method34188(var3, "is_sneaking");
         Boolean var6 = method34188(var3, "is_sprinting");
         Boolean var7 = method34188(var3, "is_swimming");
         Boolean var8 = method34188(var3, "is_baby");
         return new Class9157(var4, var5, var6, var7, var8);
      } else {
         return field42036;
      }
   }

   private void method34190(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }

   public JsonElement method34191() {
      if (this != field42036) {
         JsonObject var3 = new JsonObject();
         this.method34190(var3, "is_on_fire", this.field42037);
         this.method34190(var3, "is_sneaking", this.field42038);
         this.method34190(var3, "is_sprinting", this.field42039);
         this.method34190(var3, "is_swimming", this.field42040);
         this.method34190(var3, "is_baby", this.field42041);
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
