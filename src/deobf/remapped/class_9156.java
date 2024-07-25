package remapped;

public class class_9156 extends class_2733 {
   public class_9156() {
      super(class_6629.field_34231, "shulker", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7916();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7916) {
         class_7916 var5 = (class_7916)var1;
         if (!var2.equals("base")) {
            if (!var2.equals("lid")) {
               return !var2.equals("head") ? null : (class_1549)class_7860.field_40216.method_39231(var5, 2);
            } else {
               return (class_1549)class_7860.field_40216.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40216.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"base", "lid", "head"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_5595 var6 = new class_5595(var5);
      var6.field_32487 = (class_7916<class_6092>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
