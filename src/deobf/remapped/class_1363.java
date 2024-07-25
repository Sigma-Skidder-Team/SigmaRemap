package remapped;

public class class_1363 implements class_857 {
   private static String[] field_7414;

   public class_1363(class_6105 var1) {
      this.field_7413 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_1455 var4 = var1.method_23255();
      int var5 = (int)Math.floor((double)var1.<Float>method_23248(class_8039.field_41146, 0).floatValue());
      int var6 = (int)Math.floor((double)var1.<Float>method_23248(class_8039.field_41146, 1).floatValue());
      int var7 = (int)Math.floor((double)var1.<Float>method_23248(class_8039.field_41146, 2).floatValue());
      int var8 = var1.<Integer>method_23248(class_8039.field_41179, 0);
      class_9371[] var9 = new class_9371[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         class_9371 var11 = new class_9371(
            var5 + var1.<Byte>method_23261(class_8039.field_41133),
            (short)(var6 + var1.<Byte>method_23261(class_8039.field_41133)),
            var7 + var1.<Byte>method_23261(class_8039.field_41133)
         );
         var9[var10] = var11;
         class_7943.method_35960(var4, var11.method_43340(), var11.method_43342(), var11.method_43343(), 0);
      }

      var1.method_23235(class_8633.class, true, true);
      var1.method_23245();

      for (int var12 = 0; var12 < var8; var12++) {
         class_7943.method_35972(var4, var9[var12]);
      }
   }
}
