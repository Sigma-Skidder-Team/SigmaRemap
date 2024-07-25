package remapped;

public class class_3056 extends class_2733 {
   public class_3056() {
      super(class_6629.field_34223, "spider", 1.0F);
   }

   public class_3056(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1207();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_1207) {
         class_1207 var5 = (class_1207)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("neck")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("leg1")) {
                     if (!var2.equals("leg2")) {
                        if (!var2.equals("leg3")) {
                           if (!var2.equals("leg4")) {
                              if (!var2.equals("leg5")) {
                                 if (!var2.equals("leg6")) {
                                    if (!var2.equals("leg7")) {
                                       return !var2.equals("leg8") ? null : (class_1549)class_7860.field_40000.method_39231(var5, 10);
                                    } else {
                                       return (class_1549)class_7860.field_40000.method_39231(var5, 9);
                                    }
                                 } else {
                                    return (class_1549)class_7860.field_40000.method_39231(var5, 8);
                                 }
                              } else {
                                 return (class_1549)class_7860.field_40000.method_39231(var5, 7);
                              }
                           } else {
                              return (class_1549)class_7860.field_40000.method_39231(var5, 6);
                           }
                        } else {
                           return (class_1549)class_7860.field_40000.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_40000.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40000.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40000.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40000.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40000.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "neck", "body", "leg1", "leg2", "leg3", "leg4", "leg5", "leg6", "leg7", "leg8"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_1815 var6 = new class_1815(var5);
      var6.field_32487 = (class_6521)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
