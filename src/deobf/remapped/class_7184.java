package remapped;

public class class_7184 extends class_5236 {
   public class_7184() {
      super(EntityType.field_34234, "zombified_piglin", 0.5F);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_1591 var6 = new class_1591(var5, true);
      var6.field_32487 = (class_672<class_5886>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
