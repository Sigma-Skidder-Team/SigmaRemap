package remapped;

public class class_7415 extends class_2733 {
   public class_7415() {
      super(class_6629.field_34298, "iron_golem", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7946();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7946) {
         class_7946 var5 = (class_7946)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("right_arm")) {
                  if (!var2.equals("left_arm")) {
                     if (!var2.equals("left_leg")) {
                        return !var2.equals("right_leg") ? null : (class_1549)class_7860.field_40128.method_39231(var5, 5);
                     } else {
                        return (class_1549)class_7860.field_40128.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40128.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40128.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40128.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40128.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "body", "right_arm", "left_arm", "left_leg", "right_leg"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_743 var6 = new class_743(var5);
      var6.field_32487 = (class_7946<class_8127>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
