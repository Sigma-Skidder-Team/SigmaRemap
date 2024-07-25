package remapped;

public class class_9884 implements class_857 {
   public class_9884(class_4629 var1) {
      this.field_50135 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (var4.equals("minecraft:trader_list") || var4.equals("trader_list")) {
         var1.method_23253(39);
         var1.method_23251();
         var1.<String>method_23242(class_8039.field_41171);
         int var9 = var1.<Integer>method_23242(class_8039.field_41179);
         var1.method_23255().<class_4074>method_6746(class_4074.class).method_18776(var9);
         var1.method_23236(class_8039.field_41157, var9);
         short var6 = var1.<Short>method_23261(class_8039.field_41175);

         for (int var7 = 0; var7 < var6; var7++) {
            class_5830.method_26389(var1.<class_9530>method_23261(class_8039.field_41162));
            class_5830.method_26389(var1.<class_9530>method_23261(class_8039.field_41162));
            boolean var8 = var1.<Boolean>method_23261(class_8039.field_41161);
            if (var8) {
               class_5830.method_26389(var1.<class_9530>method_23261(class_8039.field_41162));
            }

            var1.<Boolean>method_23261(class_8039.field_41161);
            var1.<Integer>method_23261(class_8039.field_41179);
            var1.<Integer>method_23261(class_8039.field_41179);
            var1.method_23236(class_8039.field_41179, 0);
            var1.method_23236(class_8039.field_41179, 0);
            var1.method_23236(class_8039.field_41146, 0.0F);
         }

         var1.method_23236(class_8039.field_41157, 0);
         var1.method_23236(class_8039.field_41157, 0);
         var1.method_23236(class_8039.field_41161, false);
      } else if (var4.equals("minecraft:book_open") || var4.equals("book_open")) {
         int var5 = var1.<Integer>method_23242(class_8039.field_41157);
         var1.method_23240();
         var1.method_23253(45);
         var1.method_23236(class_8039.field_41157, var5);
      }
   }
}
