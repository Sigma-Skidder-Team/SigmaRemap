package remapped;

public class class_8586 implements class_857 {
   public class_8586(class_1718 var1) {
      this.field_43999 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41157, 0);

      for (int var5 = 0; var5 < (var4 != 0 ? 1 : 2); var5++) {
         int[] var6 = var1.<int[]>method_23242(class_8039.field_41144);
         String[] var7 = new String[var6.length];

         for (int var8 = 0; var8 < var6.length; var8++) {
            var7[var8] = "viaversion:legacy/" + var6[var8];
         }

         var1.method_23236(class_8039.field_41152, var7);
      }
   }
}
