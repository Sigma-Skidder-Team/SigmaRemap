package remapped;

import com.google.gson.JsonObject;

public class class_8281 extends class_8273<class_6459> {
   private static final class_4639 field_42454 = new class_4639("inventory_changed");

   @Override
   public class_4639 method_3899() {
      return field_42454;
   }

   public class_6459 method_38161(JsonObject var1, class_8938 var2, class_8096 var3) {
      JsonObject var6 = class_6539.method_29784(var1, "slots", new JsonObject());
      class_7781 var7 = class_7781.method_35310(var6.get("occupied"));
      class_7781 var8 = class_7781.method_35310(var6.get("full"));
      class_7781 var9 = class_7781.method_35310(var6.get("empty"));
      class_5319[] var10 = class_5319.method_24268(var1.get("items"));
      return new class_6459(var2, var7, var8, var9, var10);
   }

   public void method_38159(class_9359 var1, class_7051 var2, class_6098 var3) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 0; var9 < var2.method_31505(); var9++) {
         class_6098 var10 = var2.method_31498(var9);
         if (!var10.method_28022()) {
            var8++;
            if (var10.method_27997() >= var10.method_28016()) {
               var6++;
            }
         } else {
            var7++;
         }
      }

      this.method_38160(var1, var2, var3, var6, var7, var8);
   }

   private void method_38160(class_9359 var1, class_7051 var2, class_6098 var3, int var4, int var5, int var6) {
      this.method_38137(var1, var5x -> var5x.method_29435(var2, var3, var4, var5, var6));
   }
}
