package remapped;

public class class_7970 implements class_857 {
   private static String[] field_40820;

   public class_7970(class_6794 var1) {
      this.field_40819 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23261(class_8039.field_41157);

      for (int var5 = 0; var5 < var4; var5++) {
         byte var6 = var1.<Byte>method_23242(class_8039.field_41133);
         int var7 = (var6 & 240) >> 4;
         var1.method_23236(class_8039.field_41157, var7);
         var1.<Byte>method_23261(class_8039.field_41133);
         var1.<Byte>method_23261(class_8039.field_41133);
         byte var8 = (byte)(var6 & 15);
         var1.method_23236(class_8039.field_41133, var8);
         var1.method_23236(class_8039.field_41169, null);
      }
   }
}
