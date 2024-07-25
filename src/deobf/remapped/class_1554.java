package remapped;

public class class_1554 extends class_6126 {
   public class_1554() {
      super(class_6629.field_34296, "evoker", 0.5F, new String[]{"evocation_illager"});
   }

   @Override
   public class_9873 method_12295() {
      return new class_5723(0.0F, 0.0F, 64, 64);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_6314 var6 = new class_6314(var5);
      var6.field_32487 = (class_6521)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
