package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_7627 implements class_7978 {
   public List<Object> method_34575(Object var1, class_7291 var2) throws Exception {
      if (!(var1 instanceof class_5051)) {
         throw new IllegalArgumentException("The default packet has to be a PacketWrapper for transformMapChunkBulk, unexpected " + var1.getClass());
      } else {
         ArrayList var5 = new ArrayList();
         class_5051 var6 = (class_5051)var1;
         boolean var7 = var6.<Boolean>method_23242(class_8039.field_41161);
         int var8 = var6.<Integer>method_23242(class_8039.field_41157);
         class_8176[] var9 = new class_8176[var8];

         for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = class_8176.method_37493(var6, var7);
         }

         for (class_8176 var13 : var9) {
            class_206 var14 = new class_206(var13.method_37491());
            var13.method_37485(var6.<byte[]>method_23242(var14));
            class_5051 var15 = new class_5051(33, null, var6.method_23255());
            var15.method_23236(class_8039.field_41179, var13.method_37494());
            var15.method_23236(class_8039.field_41179, var13.method_37488());
            var15.method_23236(class_8039.field_41161, true);
            var15.method_23236(class_8039.field_41138, var13.method_37487());
            var15.method_23236(class_8039.field_41157, var13.method_37491());
            var15.method_23236(var14, var13.method_37492());
            var2.method_33285().add(class_7291.method_33287(var13.method_37494(), var13.method_37488()));
            var5.add(var15);
         }

         return var5;
      }
   }

   public boolean method_34572(Class<?> var1) {
      return false;
   }

   public boolean method_34574() {
      return true;
   }
}
