package remapped;

public class class_6913 extends class_2733 {
   public class_6913() {
      super(class_6629.field_34262, "cod", 0.3F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_6094();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_6094) {
         class_6094 var5 = (class_6094)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("fin_back")) {
               if (!var2.equals("head")) {
                  if (!var2.equals("nose")) {
                     if (!var2.equals("fin_right")) {
                        if (!var2.equals("fin_left")) {
                           return !var2.equals("tail") ? null : (class_1549)class_7860.field_40048.method_39231(var5, 6);
                        } else {
                           return (class_1549)class_7860.field_40048.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_40048.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_40048.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40048.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40048.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40048.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body", "fin_back", "head", "nose", "fin_right", "fin_left", "tail"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_3277 var6 = new class_3277(var5);
      var6.field_32487 = (class_6094<class_105>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
