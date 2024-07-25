package remapped;

import java.util.ArrayList;

public class class_7692 implements class_857 {
   public class_7692(class_8652 var1) {
      this.field_39062 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23242(class_8039.field_41157);
      ArrayList var5 = new ArrayList();

      for (int var6 = 0; var6 < var4; var6++) {
         String var7 = var1.<String>method_23242(class_8039.field_41171);
         String[] var8 = var7.split("\\.");
         byte var9 = 0;
         int var10 = -1;
         int var11 = var1.<Integer>method_23242(class_8039.field_41157);
         if (var8.length == 2) {
            var9 = 8;
            Integer var12 = class_2486.field_12381.get(var7);
            if (var12 != null) {
               var10 = var12;
            } else {
               class_3446.method_15886().method_34617().warning("Could not find 1.13 -> 1.12.2 statistic mapping for " + var7);
            }
         } else {
            String var17 = var8[1];
            switch (var17) {
               case "mineBlock":
                  var9 = 0;
                  break;
               case "craftItem":
                  var9 = 1;
                  break;
               case "useItem":
                  var9 = 2;
                  break;
               case "breakItem":
                  var9 = 3;
                  break;
               case "pickup":
                  var9 = 4;
                  break;
               case "drop":
                  var9 = 5;
                  break;
               case "killEntity":
                  var9 = 6;
                  break;
               case "entityKilledBy":
                  var9 = 7;
            }
         }

         if (var10 != -1) {
            var5.add(new class_303(var9, var10, var11));
         }
      }

      var1.method_23236(class_8039.field_41157, var5.size());

      for (class_303 var16 : var5) {
         var1.method_23236(class_8039.field_41157, var16.method_1355());
         var1.method_23236(class_8039.field_41157, var16.method_1356());
         var1.method_23236(class_8039.field_41157, var16.method_1353());
      }
   }
}
