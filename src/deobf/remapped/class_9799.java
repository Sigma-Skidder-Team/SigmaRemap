package remapped;

import io.netty.buffer.ByteBuf;

public class class_9799 extends class_8039<class_5167> {
   public class_9799() {
      super("Particle", class_5167.class);
   }

   public void method_45208(ByteBuf var1, class_5167 var2) throws Exception {
      class_8039.field_41157.method_15644(var1, var2.method_23691());

      for (class_7579 var6 : var2.method_23687()) {
         var6.method_34443().method_33275(var1, var6.method_34439());
      }
   }

   public class_5167 method_45209(ByteBuf var1) throws Exception {
      int var4 = class_8039.field_41157.method_15647(var1);
      class_5167 var5 = new class_5167(var4);
      switch (var4) {
         case 3:
         case 23:
            var5.method_23687().add(new class_7579(class_8039.field_41157, class_8039.field_41157.method_15647(var1)));
            break;
         case 14:
            var5.method_23687().add(new class_7579(class_8039.field_41146, class_8039.field_41146.method_2740(var1)));
            var5.method_23687().add(new class_7579(class_8039.field_41146, class_8039.field_41146.method_2740(var1)));
            var5.method_23687().add(new class_7579(class_8039.field_41146, class_8039.field_41146.method_2740(var1)));
            var5.method_23687().add(new class_7579(class_8039.field_41146, class_8039.field_41146.method_2740(var1)));
            break;
         case 32:
            var5.method_23687().add(new class_7579(class_8039.field_41162, class_8039.field_41162.method_9912(var1)));
      }

      return var5;
   }
}
