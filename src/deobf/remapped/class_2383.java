package remapped;

public class class_2383 extends class_3893 {
   private static String[] field_11893;

   public class_2383(class_1739 var1) {
      this.field_11894 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23261(class_8039.field_41157);
         int var5 = var4;

         for (int var6 = 0; var6 < var4; var6++) {
            int var7 = var1.<Integer>method_23242(class_8039.field_41157);
            int var8 = var1.<Integer>method_23242(class_8039.field_41157);
            int var9 = var1.<Integer>method_23242(class_8039.field_41157);
            if (var7 == 8 && class_1739.method_7752(this.field_11894).method_19008().method_28208() != null) {
               var8 = class_1739.method_7752(this.field_11894).method_19008().method_28208().method_6437(var8);
               if (var8 == -1) {
                  var5--;
                  continue;
               }
            } else {
               class_1121 var10 = this.field_11894.method_7751(var7);
               class_3227 var11;
               if (var10 != null && (var11 = this.field_11894.method_7753(var10)) != null) {
                  var8 = var11.method_14784(var8);
               }
            }

            var1.method_23236(class_8039.field_41157, var7);
            var1.method_23236(class_8039.field_41157, var8);
            var1.method_23236(class_8039.field_41157, var9);
         }

         if (var5 != var4) {
            var1.method_23257(class_8039.field_41157, 0, var5);
         }
      });
   }
}
