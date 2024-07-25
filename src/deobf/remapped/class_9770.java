package remapped;

public class class_9770 extends class_5369 {
   public class_9770() {
      super(class_6629.field_34294, "giant", 3.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_8265();
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_8179 var6 = new class_8179(var5, 6.0F);
      var6.field_32487 = (class_8265)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
