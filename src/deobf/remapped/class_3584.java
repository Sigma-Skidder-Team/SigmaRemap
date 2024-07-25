package remapped;

public class class_3584 extends class_2733 {
   public class_3584() {
      super(class_6629.field_34225, "wolf", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_8875();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_8875) {
         class_8875 var5 = (class_8875)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("leg1")) {
                  if (!var2.equals("leg2")) {
                     if (!var2.equals("leg3")) {
                        if (!var2.equals("leg4")) {
                           if (!var2.equals("tail")) {
                              return !var2.equals("mane") ? null : (class_1549)class_7860.field_40087.method_39231(var5, 9);
                           } else {
                              return (class_1549)class_7860.field_40087.method_39231(var5, 7);
                           }
                        } else {
                           return (class_1549)class_7860.field_40087.method_39231(var5, 6);
                        }
                     } else {
                        return (class_1549)class_7860.field_40087.method_39231(var5, 5);
                     }
                  } else {
                     return (class_1549)class_7860.field_40087.method_39231(var5, 4);
                  }
               } else {
                  return (class_1549)class_7860.field_40087.method_39231(var5, 3);
               }
            } else {
               return (class_1549)class_7860.field_40087.method_39231(var5, 2);
            }
         } else {
            return (class_1549)class_7860.field_40087.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_5162 var6 = new class_5162(var5);
      var6.field_32487 = (class_8875<class_9408>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
