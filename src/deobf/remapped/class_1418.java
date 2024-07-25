package remapped;

public class class_1418 extends class_3893 {
   public class_1418(class_5476 var1) {
      this.field_7688 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23261(class_8039.field_41157);

         for (int var5 = 0; var5 < var4; var5++) {
            String var6 = var1.<String>method_23261(class_8039.field_41171).replace("minecraft:", "");
            String var7 = var1.<String>method_23261(class_8039.field_41171);
            this.field_7688.method_24892(var1, var6);
         }
      });
   }
}
