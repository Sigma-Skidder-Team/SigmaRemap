package remapped;

public class class_8184 extends class_2733 {
   public class_8184() {
      super(EntityType.field_34228, "parrot", 0.3F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_151();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_151) {
         class_151 var5 = (class_151)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("tail")) {
               if (!var2.equals("left_wing")) {
                  if (!var2.equals("right_wing")) {
                     if (!var2.equals("head")) {
                        if (!var2.equals("left_leg")) {
                           return !var2.equals("right_leg") ? null : (class_1549)class_7860.method_35558(var5, class_7860.field_40060, 10);
                        } else {
                           return (class_1549)class_7860.method_35558(var5, class_7860.field_40060, 9);
                        }
                     } else {
                        return (class_1549)class_7860.method_35558(var5, class_7860.field_40060, 4);
                     }
                  } else {
                     return (class_1549)class_7860.method_35558(var5, class_7860.field_40060, 3);
                  }
               } else {
                  return (class_1549)class_7860.method_35558(var5, class_7860.field_40060, 2);
               }
            } else {
               return (class_1549)class_7860.method_35558(var5, class_7860.field_40060, 1);
            }
         } else {
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40060, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body", "tail", "left_wing", "right_wing", "head", "left_leg", "right_leg"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_1677 var6 = new class_1677(var5);
      var6.field_32487 = (class_151)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
