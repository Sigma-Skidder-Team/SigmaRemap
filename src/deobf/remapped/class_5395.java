package remapped;

public class class_5395 implements class_857 {
   private static String[] field_27535;

   public class_5395(class_9250 var1) {
      this.field_27536 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      short var4 = var1.<Short>method_23242(class_8039.field_41166);
      if (var4 != 0) {
         class_5051 var5 = new class_5051(60, null, var1.method_23255());
         var5.method_23236(class_8039.field_41157, var1.<Integer>method_23248(class_8039.field_41157, 0));
         var5.method_23236(class_8039.field_41157, 0);
         var5.method_23236(class_8039.field_41149, new class_9530(var4, (byte)1, (short)0, null));

         try {
            var5.method_23235(class_6890.class, true, true);
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      }
   }
}
