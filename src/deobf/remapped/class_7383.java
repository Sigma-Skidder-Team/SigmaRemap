package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class class_7383 implements class_2994<class_3197> {
   public class_3197 method_33630(Identifier var1, JsonObject var2) {
      String var5 = class_6539.method_29797(var2, "group", "");
      class_2831 var6 = method_33628(class_6539.method_29787(var2, "ingredients"));
      if (!var6.isEmpty()) {
         if (var6.size() <= 9) {
            class_6098 var7 = class_644.method_2961(class_6539.method_29783(var2, "result"));
            return new class_3197(var1, var5, var7, var6);
         } else {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
         }
      } else {
         throw new JsonParseException("No ingredients for shapeless recipe");
      }
   }

   private static class_2831<class_8137> method_33628(JsonArray var0) {
      class_2831 var3 = class_2831.method_12874();

      for (int var4 = 0; var4 < var0.size(); var4++) {
         class_8137 var5 = class_8137.method_37024(var0.get(var4));
         if (!var5.method_37033()) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public class_3197 method_33631(Identifier var1, class_8248 var2) {
      String var5 = var2.method_37784(32767);
      int var6 = var2.method_37778();
      class_2831 var7 = class_2831.<class_8137>method_12872(var6, class_8137.field_41675);

      for (int var8 = 0; var8 < var7.size(); var8++) {
         var7.set(var8, class_8137.method_37026(var2));
      }

      class_6098 var9 = var2.method_37755();
      return new class_3197(var1, var5, var9, var7);
   }

   public void method_33629(class_8248 var1, class_3197 var2) {
      var1.method_37760(class_3197.method_14713(var2));
      var1.method_37743(class_3197.method_14716(var2).size());

      for (class_8137 var6 : class_3197.method_14716(var2)) {
         var6.method_37028(var1);
      }

      var1.method_37764(class_3197.method_14712(var2));
   }
}
