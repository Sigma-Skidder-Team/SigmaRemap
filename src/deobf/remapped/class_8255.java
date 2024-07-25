package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class class_8255 {
   public static final class_8255 field_42355 = class_6724.method_30857().method_30856();
   private final class_6115 field_42360;
   private final class_6115 field_42356;
   private final class_865 field_42361;
   private final Boolean field_42359;
   private final class_8772 field_42358;

   public class_8255() {
      this.field_42360 = class_6115.field_31261;
      this.field_42356 = class_6115.field_31261;
      this.field_42361 = class_865.field_4485;
      this.field_42359 = null;
      this.field_42358 = class_8772.field_44906;
   }

   public class_8255(class_6115 var1, class_6115 var2, class_865 var3, Boolean var4, class_8772 var5) {
      this.field_42360 = var1;
      this.field_42356 = var2;
      this.field_42361 = var3;
      this.field_42359 = var4;
      this.field_42358 = var5;
   }

   public boolean method_37842(class_9359 var1, DamageSource var2, float var3, float var4, boolean var5) {
      if (this != field_42355) {
         if (this.field_42360.method_28088(var3)) {
            if (this.field_42356.method_28088(var4)) {
               if (this.field_42361.method_3737(var1, var2.method_28372())) {
                  return this.field_42359 != null && this.field_42359 != var5 ? false : this.field_42358.method_40300(var1, var2);
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

   public static class_8255 method_37841(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "damage");
         class_6115 var4 = class_6115.method_28093(var3.get("dealt"));
         class_6115 var5 = class_6115.method_28093(var3.get("taken"));
         Boolean var6 = !var3.has("blocked") ? null : class_6539.method_29771(var3, "blocked");
         class_865 var7 = class_865.method_3740(var3.get("source_entity"));
         class_8772 var8 = class_8772.method_40298(var3.get("type"));
         return new class_8255(var4, var5, var7, var6, var8);
      } else {
         return field_42355;
      }
   }

   public JsonElement method_37843() {
      if (this != field_42355) {
         JsonObject var3 = new JsonObject();
         var3.add("dealt", this.field_42360.method_27853());
         var3.add("taken", this.field_42356.method_27853());
         var3.add("source_entity", this.field_42361.method_3735());
         var3.add("type", this.field_42358.method_40297());
         if (this.field_42359 != null) {
            var3.addProperty("blocked", this.field_42359);
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
