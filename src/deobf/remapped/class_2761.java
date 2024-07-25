package remapped;

public class class_2761 extends class_2733 {
   public class_2761() {
      super(class_6629.field_34217, "bat", 0.25F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_5301();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_5301) {
         class_5301 var5 = (class_5301)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("right_wing")) {
                  if (!var2.equals("left_wing")) {
                     if (!var2.equals("outer_right_wing")) {
                        return !var2.equals("outer_left_wing") ? null : (class_1549)class_7860.method_35558(var5, class_7860.field_40014, 5);
                     } else {
                        return (class_1549)class_7860.method_35558(var5, class_7860.field_40014, 4);
                     }
                  } else {
                     return (class_1549)class_7860.method_35558(var5, class_7860.field_40014, 3);
                  }
               } else {
                  return (class_1549)class_7860.method_35558(var5, class_7860.field_40014, 2);
               }
            } else {
               return (class_1549)class_7860.method_35558(var5, class_7860.field_40014, 1);
            }
         } else {
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40014, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_2759 var6 = new class_2759(var5);
      var6.field_32487 = (class_5301)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
