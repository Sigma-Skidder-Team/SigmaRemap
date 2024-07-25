package remapped;

import java.util.LinkedList;

public class class_4942 implements class_857 {
   private static String[] field_25593;

   public class_4942(class_1566 var1) {
      this.field_25592 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      short var4 = var1.<Short>method_23261(class_8039.field_41175);
      if (var4 == 2) {
         class_4074 var5 = var1.method_23255().<class_4074>method_6746(class_4074.class);
         int var6 = var1.<Integer>method_23248(class_8039.field_41157, 0);
         var5.method_18779(var6, false);
         class_5051 var7 = var1.method_23259(67);
         var7.method_23236(class_8039.field_41157, var6);
         LinkedList var8 = new LinkedList();
         if (var5.method_14874() != var6) {
            var8.add(new class_5407(6, class_5884.field_29892, class_2152.method_10042(var6, var5)));
         }

         var8.add(new class_5407(12, class_5884.field_29876, null));
         var7.method_23236(class_7498.field_38252, var8);
         var7.method_23233(class_5988.class);
      }
   }
}
