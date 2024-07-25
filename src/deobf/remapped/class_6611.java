package remapped;

public class class_6611 extends class_2733 {
   public class_6611() {
      super(class_6629.field_34210, "creeper", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7236();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7236) {
         class_7236 var5 = (class_7236)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("armor")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("leg1")) {
                     if (!var2.equals("leg2")) {
                        if (!var2.equals("leg3")) {
                           return !var2.equals("leg4") ? null : (class_1549)class_7860.field_40110.method_39231(var5, 6);
                        } else {
                           return (class_1549)class_7860.field_40110.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_40110.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40110.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40110.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40110.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40110.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "armor", "body", "leg1", "leg2", "leg3", "leg4"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_8317 var6 = new class_8317(var5);
      var6.field_32487 = (class_7236<class_9490>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
