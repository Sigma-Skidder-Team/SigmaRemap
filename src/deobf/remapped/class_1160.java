package remapped;

public class class_1160 extends class_2520 {
   public class_1160() {
      super(class_6629.field_34322, "stray", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_6300();
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_7459 var6 = new class_7459(var5);
      var6.field_32487 = (class_6300<class_1595>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
