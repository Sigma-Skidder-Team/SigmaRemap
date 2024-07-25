package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class class_7269 {
   public static final class_7269 field_37227 = new class_4097().method_18939();
   private final Boolean field_37224;
   private final Boolean field_37225;
   private final Boolean field_37222;
   private final Boolean field_37228;
   private final Boolean field_37223;

   public class_7269(Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5) {
      this.field_37224 = var1;
      this.field_37225 = var2;
      this.field_37222 = var3;
      this.field_37228 = var4;
      this.field_37223 = var5;
   }

   public boolean method_33214(Entity var1) {
      if (this.field_37224 != null && var1.method_37264() != this.field_37224) {
         return false;
      } else if (this.field_37225 != null && var1.method_37382() != this.field_37225) {
         return false;
      } else if (this.field_37222 != null && var1.method_37321() != this.field_37222) {
         return false;
      } else {
         return this.field_37228 != null && var1.method_37113() != this.field_37228
            ? false
            : this.field_37223 == null || !(var1 instanceof class_5834) || ((class_5834)var1).method_26449() == this.field_37223;
      }
   }

   @Nullable
   private static Boolean method_33215(JsonObject var0, String var1) {
      return !var0.has(var1) ? null : class_6539.method_29771(var0, var1);
   }

   public static class_7269 method_33213(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "entity flags");
         Boolean var4 = method_33215(var3, "is_on_fire");
         Boolean var5 = method_33215(var3, "is_sneaking");
         Boolean var6 = method_33215(var3, "is_sprinting");
         Boolean var7 = method_33215(var3, "is_swimming");
         Boolean var8 = method_33215(var3, "is_baby");
         return new class_7269(var4, var5, var6, var7, var8);
      } else {
         return field_37227;
      }
   }

   private void method_33212(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }

   public JsonElement method_33211() {
      if (this != field_37227) {
         JsonObject var3 = new JsonObject();
         this.method_33212(var3, "is_on_fire", this.field_37224);
         this.method_33212(var3, "is_sneaking", this.field_37225);
         this.method_33212(var3, "is_sprinting", this.field_37222);
         this.method_33212(var3, "is_swimming", this.field_37228);
         this.method_33212(var3, "is_baby", this.field_37223);
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
