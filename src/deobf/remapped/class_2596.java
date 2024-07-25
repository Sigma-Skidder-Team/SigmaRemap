package remapped;

public abstract class class_2596 extends class_7038 {
   public static int field_12830 = 0;

   public class_2596(String var1) {
      super(null, var1, 0, 0, MinecraftClient.getInstance().window.method_43166(), MinecraftClient.getInstance().window.method_43163());
   }

   public int method_11773() {
      return 30;
   }

   @Override
   public void method_32159(class_1293 var1) {
      super.method_32159(var1);
      this.method_32142(MinecraftClient.getInstance().window.method_43166());
      this.method_32158(MinecraftClient.getInstance().window.method_43163());
   }

   @Override
   public void method_29509(int var1) {
      if (var1 == MinecraftClient.getInstance().field_9577.field_45460.field_30027.field_17800) {
         MinecraftClient.getInstance().window.method_43156();
         MinecraftClient.getInstance().field_9577.field_45453 = MinecraftClient.getInstance().window.method_43174();
      }

      super.method_29509(var1);
   }
}
