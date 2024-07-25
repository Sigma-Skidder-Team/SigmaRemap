package remapped;

public class class_2602 extends class_7398 {
   public class_2602() {
      super(EntityType.field_34269, "mooshroom", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_2611();
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_1995 var6 = new class_1995(var5);
      var6.field_32487 = (class_2611<class_4393>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
