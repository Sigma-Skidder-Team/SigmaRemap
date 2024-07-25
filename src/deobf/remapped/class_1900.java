package remapped;

public class class_1900 {
   private static String[] field_9702;
   public final class_3802[] field_9701;
   public final class_2426 field_9703;

   public class_1900(class_3802[] var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, class_240 var9) {
      this.field_9701 = var1;
      float var12 = 0.0F / var6;
      float var13 = 0.0F / var7;
      var1[0] = var1[0].method_17679(var4 / var6 - var12, var3 / var7 + var13);
      var1[1] = var1[1].method_17679(var2 / var6 + var12, var3 / var7 + var13);
      var1[2] = var1[2].method_17679(var2 / var6 + var12, var5 / var7 - var13);
      var1[3] = var1[3].method_17679(var4 / var6 - var12, var5 / var7 - var13);
      if (var8) {
         int var14 = var1.length;

         for (int var15 = 0; var15 < var14 / 2; var15++) {
            class_3802 var16 = var1[var15];
            var1[var15] = var1[var14 - 1 - var15];
            var1[var14 - 1 - var15] = var16;
         }
      }

      this.field_9703 = var9.method_1038();
      if (var8) {
         this.field_9703.method_11069(-1.0F, 1.0F, 1.0F);
      }
   }
}
