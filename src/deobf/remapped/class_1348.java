package remapped;

public class class_1348 extends class_6126 {
   public class_1348() {
      super(class_6629.field_34265, "pillager", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_5723(0.0F, 0.0F, 64, 64);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_564 var6 = new class_564(var5);
      var6.field_32487 = (class_5723<T>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
