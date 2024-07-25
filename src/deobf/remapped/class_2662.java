package remapped;

public class class_2662 implements class_857 {
   private static String[] field_13104;

   public class_2662(class_8123 var1) {
      this.field_13103 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      byte var4 = var1.<Byte>method_23248(class_8039.field_41133, 0);
      if (var4 == 0 || var4 == 2) {
         String var5 = var1.<String>method_23242(class_8039.field_41171);
         var1.method_23236(class_8039.field_41143, class_68.method_70(var5));
         String var6 = var1.<String>method_23242(class_8039.field_41171);
         String var7 = var1.<String>method_23242(class_8039.field_41171);
         var1.<Byte>method_23261(class_8039.field_41133);
         var1.<String>method_23261(class_8039.field_41171);
         var1.<String>method_23261(class_8039.field_41171);
         int var8 = var1.<Byte>method_23242(class_8039.field_41133).intValue();
         if (var8 == -1) {
            var8 = 21;
         }

         if (class_3446.method_15884().method_25833()) {
            class_2909 var9 = this.field_13103.field_41620.method_39631(var6);
            var8 = var9.ordinal();
            var7 = var9.toString() + var7;
         }

         var1.method_23236(class_8039.field_41157, var8);
         var1.method_23236(class_8039.field_41143, class_68.method_70(var6));
         var1.method_23236(class_8039.field_41143, class_68.method_70(var7));
      }

      if (var4 == 0 || var4 == 3 || var4 == 4) {
         String[] var10 = var1.<String[]>method_23242(class_8039.field_41152);

         for (int var11 = 0; var11 < var10.length; var11++) {
            var10[var11] = this.field_13103.field_41620.method_39634(var10[var11]);
         }

         var1.method_23236(class_8039.field_41152, var10);
      }
   }
}
