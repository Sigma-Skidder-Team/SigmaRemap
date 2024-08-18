package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class class_8772 {
   public static final class_8772 field_44906 = class_9447.method_43695().method_43693();
   private final Boolean field_44905;
   private final Boolean field_44913;
   private final Boolean field_44904;
   private final Boolean field_44903;
   private final Boolean field_44911;
   private final Boolean field_44910;
   private final Boolean field_44912;
   private final Boolean field_44908;
   private final class_865 field_44907;
   private final class_865 field_44902;

   public class_8772(
      Boolean var1, Boolean var2, Boolean var3, Boolean var4, Boolean var5, Boolean var6, Boolean var7, Boolean var8, class_865 var9, class_865 var10
   ) {
      this.field_44905 = var1;
      this.field_44913 = var2;
      this.field_44904 = var3;
      this.field_44903 = var4;
      this.field_44911 = var5;
      this.field_44910 = var6;
      this.field_44912 = var7;
      this.field_44908 = var8;
      this.field_44907 = var9;
      this.field_44902 = var10;
   }

   public boolean method_40300(class_9359 var1, DamageSource var2) {
      return this.method_40299(var1.method_43235(), var1.method_37245(), var2);
   }

   public boolean method_40299(class_6331 var1, Vector3d var2, DamageSource var3) {
      if (this != field_44906) {
         if (this.field_44905 != null && this.field_44905 != var3.method_28357()) {
            return false;
         } else if (this.field_44913 != null && this.field_44913 != var3.method_28367()) {
            return false;
         } else if (this.field_44904 != null && this.field_44904 != var3.method_28380()) {
            return false;
         } else if (this.field_44903 != null && this.field_44903 != var3.method_28346()) {
            return false;
         } else if (this.field_44911 != null && this.field_44911 != var3.method_28348()) {
            return false;
         } else if (this.field_44910 != null && this.field_44910 != var3.method_28360()) {
            return false;
         } else if (this.field_44912 != null && this.field_44912 != var3.method_28352()) {
            return false;
         } else if (this.field_44908 != null && this.field_44908 != (var3 == DamageSource.field_31674)) {
            return false;
         } else {
            return this.field_44907.method_3736(var1, var2, var3.method_28353()) ? this.field_44902.method_3736(var1, var2, var3.method_28372()) : false;
         }
      } else {
         return true;
      }
   }

   public static class_8772 method_40298(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "damage type");
         Boolean var4 = method_40295(var3, "is_projectile");
         Boolean var5 = method_40295(var3, "is_explosion");
         Boolean var6 = method_40295(var3, "bypasses_armor");
         Boolean var7 = method_40295(var3, "bypasses_invulnerability");
         Boolean var8 = method_40295(var3, "bypasses_magic");
         Boolean var9 = method_40295(var3, "is_fire");
         Boolean var10 = method_40295(var3, "is_magic");
         Boolean var11 = method_40295(var3, "is_lightning");
         class_865 var12 = class_865.method_3740(var3.get("direct_entity"));
         class_865 var13 = class_865.method_3740(var3.get("source_entity"));
         return new class_8772(var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
      } else {
         return field_44906;
      }
   }

   @Nullable
   private static Boolean method_40295(JsonObject var0, String var1) {
      return !var0.has(var1) ? null : class_6539.method_29771(var0, var1);
   }

   public JsonElement method_40297() {
      if (this != field_44906) {
         JsonObject var3 = new JsonObject();
         this.method_40294(var3, "is_projectile", this.field_44905);
         this.method_40294(var3, "is_explosion", this.field_44913);
         this.method_40294(var3, "bypasses_armor", this.field_44904);
         this.method_40294(var3, "bypasses_invulnerability", this.field_44903);
         this.method_40294(var3, "bypasses_magic", this.field_44911);
         this.method_40294(var3, "is_fire", this.field_44910);
         this.method_40294(var3, "is_magic", this.field_44912);
         this.method_40294(var3, "is_lightning", this.field_44908);
         var3.add("direct_entity", this.field_44907.method_3735());
         var3.add("source_entity", this.field_44902.method_3735());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   private void method_40294(JsonObject var1, String var2, Boolean var3) {
      if (var3 != null) {
         var1.addProperty(var2, var3);
      }
   }
}
