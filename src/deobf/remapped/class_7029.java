package remapped;

public class class_7029 implements class_857 {
   private static String[] field_36199;

   public class_7029(class_5732 var1) {
      this.field_36200 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_6545 var4 = var1.<class_6545>method_23242(new class_498());
      var1.method_23236(new class_9424(), var4);
      if (var4.method_29863()) {
         int[] var5 = var4.method_29867();
         int[] var6 = new int[1024];
         if (var5 != null) {
            for (int var7 = 0; var7 < 4; var7++) {
               for (int var8 = 0; var8 < 4; var8++) {
                  int var9 = (var8 << 2) + 2;
                  int var10 = (var7 << 2) + 2;
                  int var11 = var10 << 4 | var9;
                  var6[var7 << 2 | var8] = var5[var11];
               }
            }

            for (int var14 = 1; var14 < 64; var14++) {
               System.arraycopy(var6, 0, var6, var14 * 16, 16);
            }
         }

         var4.method_29859(var6);
      }

      for (int var12 = 0; var12 < 16; var12++) {
         class_3929 var13 = var4.method_29869()[var12];
         if (var13 != null) {
            for (int var15 = 0; var15 < var13.method_18193(); var15++) {
               int var16 = var13.method_18168(var15);
               int var17 = this.field_36200.field_28962.method_17872().method_28217(var16);
               var13.method_18167(var15, var17);
            }
         }
      }
   }
}
