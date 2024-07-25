package remapped;

public class class_2641 extends class_5369 {
   public class_2641() {
      super(EntityType.field_34211, "drowned", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_62(0.0F, 0.0F, 64, 64);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_5347 var6 = new class_5347(var5);
      var6.field_32487 = (class_62<class_4359>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
