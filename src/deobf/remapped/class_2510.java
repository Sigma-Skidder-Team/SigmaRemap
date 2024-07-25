package remapped;

public class class_2510 extends class_7398 {
   public class_2510() {
      super(class_6629.field_34229, "polar_bear", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_8539();
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_9872 var6 = new class_9872(var5);
      var6.field_32487 = (class_8539<class_9668>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
