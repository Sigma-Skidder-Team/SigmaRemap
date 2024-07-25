package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class class_766 {
   public static final class_766 field_4155 = new class_766(
      class_5319.field_27132, class_5319.field_27132, class_5319.field_27132, class_5319.field_27132, class_5319.field_27132, class_5319.field_27132
   );
   public static final class_766 field_4152 = new class_766(
      class_9518.method_43918().method_43915(class_4897.field_24696).method_43916(class_2452.method_11292().method_27990()).method_43921(),
      class_5319.field_27132,
      class_5319.field_27132,
      class_5319.field_27132,
      class_5319.field_27132,
      class_5319.field_27132
   );
   private final class_5319 field_4148;
   private final class_5319 field_4151;
   private final class_5319 field_4153;
   private final class_5319 field_4150;
   private final class_5319 field_4154;
   private final class_5319 field_4149;

   public class_766(class_5319 var1, class_5319 var2, class_5319 var3, class_5319 var4, class_5319 var5, class_5319 var6) {
      this.field_4148 = var1;
      this.field_4151 = var2;
      this.field_4153 = var3;
      this.field_4150 = var4;
      this.field_4154 = var5;
      this.field_4149 = var6;
   }

   public boolean method_3453(Entity var1) {
      if (this != field_4155) {
         if (var1 instanceof class_5834) {
            class_5834 var4 = (class_5834)var1;
            if (this.field_4148.method_24266(var4.method_26520(class_6943.field_35704))) {
               if (this.field_4151.method_24266(var4.method_26520(class_6943.field_35708))) {
                  if (this.field_4153.method_24266(var4.method_26520(class_6943.field_35698))) {
                     if (this.field_4150.method_24266(var4.method_26520(class_6943.field_35700))) {
                        return this.field_4154.method_24266(var4.method_26520(class_6943.field_35707))
                           ? this.field_4149.method_24266(var4.method_26520(class_6943.field_35701))
                           : false;
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
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static class_766 method_3454(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = class_6539.method_29782(var0, "equipment");
         class_5319 var4 = class_5319.method_24267(var3.get("head"));
         class_5319 var5 = class_5319.method_24267(var3.get("chest"));
         class_5319 var6 = class_5319.method_24267(var3.get("legs"));
         class_5319 var7 = class_5319.method_24267(var3.get("feet"));
         class_5319 var8 = class_5319.method_24267(var3.get("mainhand"));
         class_5319 var9 = class_5319.method_24267(var3.get("offhand"));
         return new class_766(var4, var5, var6, var7, var8, var9);
      } else {
         return field_4155;
      }
   }

   public JsonElement method_3452() {
      if (this != field_4155) {
         JsonObject var3 = new JsonObject();
         var3.add("head", this.field_4148.method_24265());
         var3.add("chest", this.field_4151.method_24265());
         var3.add("legs", this.field_4153.method_24265());
         var3.add("feet", this.field_4150.method_24265());
         var3.add("mainhand", this.field_4154.method_24265());
         var3.add("offhand", this.field_4149.method_24265());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
