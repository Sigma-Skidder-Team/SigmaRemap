package remapped;

public class class_1233 extends class_2255<class_1896> {
   private static String[] field_6803;

   public class_1233(class_3569 var1) {
      super(var1);
   }

   public void method_5483(class_1896 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      var3.method_36063();
      var3.method_36065(0.5, 0.0, 0.5);
      class_3521 var9 = var1.method_8621();
      class_8145 var10 = var9.method_16260();
      if (var10 != null) {
         float var11 = 0.53125F;
         float var12 = Math.max(var10.method_37086(), var10.method_37074());
         if ((double)var12 > 1.0) {
            var11 /= var12;
         }

         var3.method_36065(0.0, 0.4F, 0.0);
         var3.method_36060(class_2426.field_12074.method_11074((float)class_9299.method_42794((double)var2, var9.method_16263(), var9.method_16264()) * 10.0F));
         var3.method_36065(0.0, -0.2F, 0.0);
         var3.method_36060(class_2426.field_12080.method_11074(-30.0F));
         var3.method_36062(var11, var11, var11);
         class_1893.method_8510().method_8587().method_28115(var10, 0.0, 0.0, 0.0, 0.0F, var2, var3, var4, var5);
      }

      var3.method_36064();
   }
}
