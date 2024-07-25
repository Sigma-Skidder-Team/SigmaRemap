package remapped;

public class class_5952 implements class_857 {
   public class_5952(class_356 var1) {
      this.field_30346 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (var4.equals("minecraft:trader_list") || var4.equals("trader_list")) {
         var1.<Integer>method_23261(class_8039.field_41179);
         short var5 = var1.<Short>method_23261(class_8039.field_41175);

         for (int var6 = 0; var6 < var5; var6++) {
            class_3166.method_14616(var1.<class_9530>method_23261(class_8039.field_41184));
            class_3166.method_14616(var1.<class_9530>method_23261(class_8039.field_41184));
            boolean var7 = var1.<Boolean>method_23261(class_8039.field_41161);
            if (var7) {
               class_3166.method_14616(var1.<class_9530>method_23261(class_8039.field_41184));
            }

            var1.<Boolean>method_23261(class_8039.field_41161);
            var1.<Integer>method_23261(class_8039.field_41179);
            var1.<Integer>method_23261(class_8039.field_41179);
         }
      }
   }
}
