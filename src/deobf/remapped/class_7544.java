package remapped;

public final class class_7544 extends class_3893 {
   public class_7544(class_5476 var1) {
      this.field_38491 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23261(class_8039.field_41157);

         for (int var5 = 0; var5 < var4; var5++) {
            String var6 = var1.<String>method_23261(class_8039.field_41171);
            String var7 = var1.<String>method_23261(class_8039.field_41171).replace("minecraft:", "");
            var0.method_24892(var1, var7);
         }
      });
   }
}
