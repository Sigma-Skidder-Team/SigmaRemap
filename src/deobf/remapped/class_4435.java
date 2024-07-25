package remapped;

public class class_4435 extends class_6126 {
   public class_4435() {
      super(class_6629.field_34270, "illusioner", 0.5F, new String[]{"illusion_illager"});
   }

   @Override
   public class_9873 method_12295() {
      class_5723 var3 = new class_5723(0.0F, 0.0F, 64, 64);
      var3.method_25894().field_8200 = true;
      return var3;
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_6339 var6 = new class_6339(var5);
      var6.field_32487 = (class_5723<T>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
