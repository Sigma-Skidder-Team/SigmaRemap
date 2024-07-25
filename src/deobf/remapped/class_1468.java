package remapped;

public class class_1468 extends class_2733 {
   public class_1468() {
      super(class_6629.field_34263, "chicken", 0.3F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_472();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_472) {
         class_472 var5 = (class_472)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("right_leg")) {
                  if (!var2.equals("left_leg")) {
                     if (!var2.equals("right_wing")) {
                        if (!var2.equals("left_wing")) {
                           if (!var2.equals("bill")) {
                              return !var2.equals("chin") ? null : (class_1549)class_7860.field_40040.method_39231(var5, 7);
                           } else {
                              return (class_1549)class_7860.field_40040.method_39231(var5, 6);
                           }
                        } else {
                           return (class_1549)class_7860.field_40040.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_40040.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40040.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40040.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40040.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40040.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_4782 var6 = new class_4782(var5);
      var6.field_32487 = (class_472<class_3024>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
