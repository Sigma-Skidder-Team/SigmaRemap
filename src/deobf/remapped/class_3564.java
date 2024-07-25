package remapped;

import com.google.gson.JsonObject;
import java.util.Map;

public class class_3564 implements class_2994<class_644> {
   public class_644 method_16568(Identifier var1, JsonObject var2) {
      String var5 = class_6539.method_29797(var2, "group", "");
      Map var6 = class_644.method_2954(class_6539.method_29783(var2, "key"));
      String[] var7 = class_644.method_2963(class_644.method_2952(class_6539.method_29787(var2, "pattern")));
      int var8 = var7[0].length();
      int var9 = var7.length;
      class_2831 var10 = class_644.method_2951(var7, var6, var8, var9);
      ItemStack var11 = class_644.method_2961(class_6539.method_29783(var2, "result"));
      return new class_644(var1, var5, var8, var9, var10, var11);
   }

   public class_644 method_16569(Identifier var1, class_8248 var2) {
      int var5 = var2.method_37778();
      int var6 = var2.method_37778();
      String var7 = var2.method_37784(32767);
      class_2831 var8 = class_2831.<class_8137>method_12872(var5 * var6, class_8137.field_41675);

      for (int var9 = 0; var9 < var8.size(); var9++) {
         var8.set(var9, class_8137.method_37026(var2));
      }

      ItemStack var10 = var2.method_37755();
      return new class_644(var1, var7, var5, var6, var8, var10);
   }

   public void method_16567(class_8248 var1, class_644 var2) {
      var1.method_37743(class_644.method_2947(var2));
      var1.method_37743(class_644.method_2956(var2));
      var1.method_37760(class_644.method_2960(var2));

      for (class_8137 var6 : class_644.method_2962(var2)) {
         var6.method_37028(var1);
      }

      var1.method_37764(class_644.method_2953(var2));
   }
}
