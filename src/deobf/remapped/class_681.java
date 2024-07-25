package remapped;

public class class_681 extends class_7398 {
   public class_681() {
      super(class_6629.field_34325, "cow", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_2611();
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_3264 var6 = new class_3264(var5);
      var6.field_32487 = (class_2611<class_2803>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
