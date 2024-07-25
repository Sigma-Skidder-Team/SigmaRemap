package remapped;

public class class_4540 extends class_6641 {
   public class_4540() {
      super(class_6629.field_34220, "witch", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_4845(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_4845) {
         class_4845 var5 = (class_4845)var1;
         return !var2.equals("mole") ? super.method_12291(var5, var2) : (class_1549)class_7860.method_35557(var5, class_7860.field_39980);
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      String[] var3 = super.method_12292();
      return (String[]) Config.method_14441(var3, "mole");
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_875 var6 = new class_875(var5);
      var6.field_32487 = (class_4845<class_1609>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
