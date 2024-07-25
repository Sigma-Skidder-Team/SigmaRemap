package remapped;

public class class_524 implements class_857 {
   public class_524(class_2350 var1) {
      this.field_3196 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23261(class_8039.field_41157);

      for (int var5 = 0; var5 < var4; var5++) {
         var1.<String>method_23261(class_8039.field_41171);
         String var6 = var1.<String>method_23261(class_8039.field_41171);
         if (!var6.equals("crafting_shapeless")) {
            if (!var6.equals("crafting_shaped")) {
               if (var6.equals("smelting")) {
                  var1.<String>method_23261(class_8039.field_41171);
                  var1.method_23236(class_8039.field_41185, var1.<class_9530[]>method_23242(class_8039.field_41174));
                  var1.method_23236(class_8039.field_41162, var1.<class_9530>method_23242(class_8039.field_41184));
                  var1.<Float>method_23261(class_8039.field_41146);
                  var1.<Integer>method_23261(class_8039.field_41157);
               }
            } else {
               int var9 = var1.<Integer>method_23261(class_8039.field_41157) * var1.<Integer>method_23261(class_8039.field_41157);
               var1.<String>method_23261(class_8039.field_41171);

               for (int var10 = 0; var10 < var9; var10++) {
                  var1.method_23236(class_8039.field_41185, var1.<class_9530[]>method_23242(class_8039.field_41174));
               }

               var1.method_23236(class_8039.field_41162, var1.<class_9530>method_23242(class_8039.field_41184));
            }
         } else {
            var1.<String>method_23261(class_8039.field_41171);
            int var7 = var1.<Integer>method_23261(class_8039.field_41157);

            for (int var8 = 0; var8 < var7; var8++) {
               var1.method_23236(class_8039.field_41185, var1.<class_9530[]>method_23242(class_8039.field_41174));
            }

            var1.method_23236(class_8039.field_41162, var1.<class_9530>method_23242(class_8039.field_41184));
         }
      }
   }
}
