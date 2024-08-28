package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class Class9539 {
   public static final Class9539 field44409 = Class9714.method38056().method38060();
   private final Boolean field44410;
   private final Boolean field44411;
   private final Boolean field44412;
   private final Boolean field44413;
   private final Boolean field44414;
   private final Boolean field44415;
   private final Boolean field44416;
   private final Boolean field44417;
   private final Class6671 field44418;
   private final Class6671 field44419;

   public Class9539(
      Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5, Boolean var6, Boolean var7, Boolean var8, Class6671 var9, Class6671 var10
   ) {
      this.field44410 = var1;
      this.field44411 = var2;
      this.field44412 = var3;
      this.field44413 = var4;
      this.field44414 = var5;
      this.field44415 = var6;
      this.field44416 = var7;
      this.field44417 = var8;
      this.field44418 = var9;
      this.field44419 = var10;
   }

   public boolean method36911(Class878 var1, Class8654 var2) {
      return this.method36912(var1.getServerWorld(), var1.getPositionVec(), var2);
   }

   public boolean method36912(ServerWorld var1, Vector3d var2, Class8654 var3) {
      if (this != field44409) {
         if (this.field44410 != null && this.field44410 != var3.method31129()) {
            return false;
         } else if (this.field44411 != null && this.field44411 != var3.method31131()) {
            return false;
         } else if (this.field44412 != null && this.field44412 != var3.method31133()) {
            return false;
         } else if (this.field44413 != null && this.field44413 != var3.method31135()) {
            return false;
         } else if (this.field44414 != null && this.field44414 != var3.method31136()) {
            return false;
         } else if (this.field44415 != null && this.field44415 != var3.method31141()) {
            return false;
         } else if (this.field44416 != null && this.field44416 != var3.method31144()) {
            return false;
         } else if (this.field44417 != null && this.field44417 != (var3 == Class8654.field38993)) {
            return false;
         } else {
            return this.field44418.method20329(var1, var2, var3.method31113()) ? this.field44419.method20329(var1, var2, var3.method31109()) : false;
         }
      } else {
         return true;
      }
   }

   public static Class9539 method36913(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = Class8963.method32781(var0, "damage type");
         Boolean var4 = method36914(var3, "is_projectile");
         Boolean var5 = method36914(var3, "is_explosion");
         Boolean var6 = method36914(var3, "bypasses_armor");
         Boolean var7 = method36914(var3, "bypasses_invulnerability");
         Boolean var8 = method36914(var3, "bypasses_magic");
         Boolean var9 = method36914(var3, "is_fire");
         Boolean var10 = method36914(var3, "is_magic");
         Boolean var11 = method36914(var3, "is_lightning");
         Class6671 var12 = Class6671.method20330(var3.get("direct_entity"));
         Class6671 var13 = Class6671.method20330(var3.get("source_entity"));
         return new Class9539(var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      } else {
         return field44409;
      }
   }

   @Nullable
   private static Boolean method36914(JsonObject var0, String var1) {
      return !var0.has(var1) ? null : Class8963.method32768(var0, var1);
   }

   public JsonElement method36915() {
      if (this != field44409) {
         JsonObject var3 = new JsonObject();
         this.method36916(var3, "is_projectile", this.field44410);
         this.method36916(var3, "is_explosion", this.field44411);
         this.method36916(var3, "bypasses_armor", this.field44412);
         this.method36916(var3, "bypasses_invulnerability", this.field44413);
         this.method36916(var3, "bypasses_magic", this.field44414);
         this.method36916(var3, "is_fire", this.field44415);
         this.method36916(var3, "is_magic", this.field44416);
         this.method36916(var3, "is_lightning", this.field44417);
         var3.add("direct_entity", this.field44418.method20331());
         var3.add("source_entity", this.field44419.method20331());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   private void method36916(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }
}
