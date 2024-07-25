package remapped;

public class class_3038 implements class_857 {
   public class_3038(class_3911 var1) {
      this.field_14905 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (var4.equals("minecraft:trader_list") || var4.equals("trader_list")) {
         var1.<Integer>method_23261(class_8039.field_41179);
         short var5 = var1.<Short>method_23261(class_8039.field_41175);

         for (int var6 = 0; var6 < var5; var6++) {
            var1.method_23236(class_8039.field_41162, var1.<class_9530>method_23242(class_8039.field_41184));
            var1.method_23236(class_8039.field_41162, var1.<class_9530>method_23242(class_8039.field_41184));
            boolean var7 = var1.<Boolean>method_23261(class_8039.field_41161);
            if (var7) {
               var1.method_23236(class_8039.field_41162, var1.<class_9530>method_23242(class_8039.field_41184));
            }

            var1.<Boolean>method_23261(class_8039.field_41161);
            var1.<Integer>method_23261(class_8039.field_41179);
            var1.<Integer>method_23261(class_8039.field_41179);
         }
      }
   }
}
