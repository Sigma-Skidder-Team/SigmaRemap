package remapped;

public class class_5984 implements class_857 {
   private static String[] field_30490;

   public class_5984(class_5771 var1) {
      this.field_30489 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_9371 var4 = var1.<class_9371>method_23248(class_8039.field_41137, 0);
      short var5 = var1.<Short>method_23248(class_8039.field_41175, 0);
      short var6 = var1.<Short>method_23248(class_8039.field_41175, 1);
      int var7 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      if (var7 != 25) {
         if (var7 != 33) {
            if (var7 != 29) {
               if (var7 != 54) {
                  if (var7 != 146) {
                     if (var7 != 130) {
                        if (var7 != 138) {
                           if (var7 != 52) {
                              if (var7 != 209) {
                                 if (var7 >= 219 && var7 <= 234) {
                                    var7 = var7 - 219 + 483;
                                 }
                              } else {
                                 var7 = 472;
                              }
                           } else {
                              var7 = 140;
                           }
                        } else {
                           var7 = 257;
                        }
                     } else {
                        var7 = 249;
                     }
                  } else {
                     var7 = 305;
                  }
               } else {
                  var7 = 142;
               }
            } else {
               var7 = 92;
            }
         } else {
            var7 = 99;
         }
      } else {
         var7 = 73;
      }

      if (var7 == 73) {
         class_5051 var8 = var1.method_23259(11);
         var8.method_23236(class_8039.field_41137, new class_9371(var4));
         var8.method_23236(class_8039.field_41157, 249 + var5 * 24 * 2 + var6 * 2);
         var8.method_23235(class_8633.class, true, true);
      }

      var1.method_23257(class_8039.field_41157, 0, var7);
   }
}
