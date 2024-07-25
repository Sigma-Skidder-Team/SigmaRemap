package remapped;

public class class_2705 implements class_857 {
   private static String[] field_13247;

   public class_2705(class_1575 var1) {
      this.field_13246 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 1);
      class_4630 var6 = class_5764.method_26066(var5, true);
      var5 = this.field_13246.field_8270.method_33115(var6.method_3416());
      class_6124 var7 = class_415.method_2063(var5);
      if (var7 != null) {
         int var8 = var1.<Integer>method_23248(class_8039.field_41179, 0);
         if (var7.method_3420(class_6124.field_31396)) {
            var1.method_23257(class_8039.field_41179, 0, this.field_13246.field_8271.method_27301().method_28217(var8));
         } else if (var7.method_3420(class_6124.field_31440)) {
            switch (var8) {
               case 1:
                  var5 = class_6124.field_31367.method_3416();
                  break;
               case 2:
                  var5 = class_6124.field_31368.method_3416();
                  break;
               case 3:
                  var5 = class_6124.field_31439.method_3416();
                  break;
               case 4:
                  var5 = class_6124.field_31339.method_3416();
                  break;
               case 5:
                  var5 = class_6124.field_31420.method_3416();
                  break;
               case 6:
                  var5 = class_6124.field_31366.method_3416();
            }
         } else if (var7.method_3420(class_6124.field_31332) && var8 > 0 || var7.method_3418(class_6124.field_31337)) {
            if (var7.method_3418(class_6124.field_31337)) {
               var1.method_23257(class_8039.field_41179, 0, var8 - 1);
            }

            class_5051 var9 = var1.method_23259(69);
            var9.method_23236(class_8039.field_41157, var4);
            var9.method_23236(class_8039.field_41166, var1.<Short>method_23248(class_8039.field_41166, 0));
            var9.method_23236(class_8039.field_41166, var1.<Short>method_23248(class_8039.field_41166, 1));
            var9.method_23236(class_8039.field_41166, var1.<Short>method_23248(class_8039.field_41166, 2));
            var9.method_23233(class_5988.class);
         }

         var1.method_23255().<class_4074>method_6746(class_4074.class).method_14878(var4, var7);
      }

      var1.method_23257(class_8039.field_41157, 1, var5);
   }
}
