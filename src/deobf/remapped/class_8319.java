package remapped;

public class class_8319 extends class_2733 {
   public class_8319() {
      super(class_6629.field_34327, "llama", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_9166(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_9166) {
         class_9166 var5 = (class_9166)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("leg1")) {
                  if (!var2.equals("leg2")) {
                     if (!var2.equals("leg3")) {
                        if (!var2.equals("leg4")) {
                           if (!var2.equals("chest_right")) {
                              return !var2.equals("chest_left") ? null : (class_1549)class_7860.field_39891.method_39231(var5, 7);
                           } else {
                              return (class_1549)class_7860.field_39891.method_39231(var5, 6);
                           }
                        } else {
                           return (class_1549)class_7860.field_39891.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_39891.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_39891.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_39891.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_39891.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_39891.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "chest_right", "chest_left"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_5879 var6 = new class_5879(var5);
      var6.field_32487 = (class_9166<class_9310>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
