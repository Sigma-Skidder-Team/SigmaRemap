package remapped;

public class class_110 extends class_7398 {
   public class_110() {
      super(class_6629.field_34283, "turtle", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7677(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_6484) {
         class_7677 var5 = (class_7677)var1;
         return !var2.equals("body2") ? super.method_12291(var1, var2) : (class_1549)class_7860.field_40067.method_7980(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      String[] var3 = super.method_12292();
      return (String[])class_3111.method_14441(var3, "body2");
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_9391 var6 = new class_9391(var5);
      var6.field_32487 = (class_7677<class_3845>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
