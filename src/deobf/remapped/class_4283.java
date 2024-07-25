package remapped;

public class class_4283 extends class_2520 {
   public class_4283() {
      super(class_6629.field_34277, "vex", 0.3F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_8071) {
         class_1549 var5 = super.method_12291(var1, var2);
         if (var5 == null) {
            class_8071 var6 = (class_8071)var1;
            if (!var2.equals("left_wing")) {
               return !var2.equals("right_wing") ? null : (class_1549)class_7860.method_35557(var6, class_7860.field_39877);
            } else {
               return (class_1549)class_7860.method_35557(var6, class_7860.field_39854);
            }
         } else {
            return var5;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      String[] var3 = super.method_12292();
      return (String[])class_3111.method_14357(var3, new String[]{"left_wing", "right_wing"});
   }

   @Override
   public class_9873 method_12295() {
      return new class_8071();
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_7224 var6 = new class_7224(var5);
      var6.field_32487 = (class_8071)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
