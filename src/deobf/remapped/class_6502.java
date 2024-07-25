package remapped;

public class class_6502 extends class_2272 {
   public class_6502() {
      super(EntityType.field_34249, "cat", 0.4F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_6399(0.0F);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_9652 var6 = new class_9652(var5);
      var6.field_32487 = (class_6399<class_5583>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
