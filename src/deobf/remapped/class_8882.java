package remapped;

public class class_8882 extends class_2733 {
   public class_8882() {
      super(EntityType.field_34253, "snow_golem", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7749();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7749) {
         class_7749 var5 = (class_7749)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("body_bottom")) {
               if (!var2.equals("head")) {
                  if (!var2.equals("right_hand")) {
                     return !var2.equals("left_hand") ? null : (class_1549)class_7860.field_40219.method_39231(var5, 4);
                  } else {
                     return (class_1549)class_7860.field_40219.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40219.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40219.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40219.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body", "body_bottom", "head", "right_hand", "left_hand"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_437 var6 = new class_437(var5);
      var6.field_32487 = (class_7749<class_223>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
