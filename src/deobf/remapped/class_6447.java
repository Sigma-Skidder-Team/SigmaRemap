package remapped;

public class class_6447 extends class_2520 {
   public class_6447() {
      super(class_6629.field_34308, "enderman", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_5415(0.0F);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_7310 var6 = new class_7310(var5);
      var6.field_32487 = (class_5415<class_912>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
