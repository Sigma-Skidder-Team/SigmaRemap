package remapped;

public class class_5401 implements class_857 {
   public class_5401(class_4834 var1) {
      this.field_27567 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (var4.equalsIgnoreCase("MC|BOpen")) {
         var1.<byte[]>method_23242(class_8039.field_41181);
         var1.method_23236(class_8039.field_41157, 0);
      }

      if (var4.equalsIgnoreCase("MC|TrList")) {
         var1.<Integer>method_23261(class_8039.field_41179);
         Short var5 = var1.<Short>method_23261(class_8039.field_41175);

         for (int var6 = 0; var6 < var5; var6++) {
            class_9530 var7 = var1.<class_9530>method_23261(class_8039.field_41149);
            class_5825.method_26375(var7);
            class_9530 var8 = var1.<class_9530>method_23261(class_8039.field_41149);
            class_5825.method_26375(var8);
            boolean var9 = var1.<Boolean>method_23261(class_8039.field_41161);
            if (var9) {
               class_9530 var10 = var1.<class_9530>method_23261(class_8039.field_41149);
               class_5825.method_26375(var10);
            }

            var1.<Boolean>method_23261(class_8039.field_41161);
            var1.<Integer>method_23261(class_8039.field_41179);
            var1.<Integer>method_23261(class_8039.field_41179);
         }
      }
   }
}
