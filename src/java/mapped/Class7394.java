package mapped;

public class Class7394 {
   private static String[] field31653;
   public final Class8161[] field31654;
   public final Class7680 field31655;

   public Class7394(Class8161[] var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, Direction var9) {
      this.field31654 = var1;
      float var12 = 0.0F / var6;
      float var13 = 0.0F / var7;
      var1[0] = var1[0].method28370(var4 / var6 - var12, var3 / var7 + var13);
      var1[1] = var1[1].method28370(var2 / var6 + var12, var3 / var7 + var13);
      var1[2] = var1[2].method28370(var2 / var6 + var12, var5 / var7 - var13);
      var1[3] = var1[3].method28370(var4 / var6 - var12, var5 / var7 - var13);
      if (var8) {
         int var14 = var1.length;

         for (int var15 = 0; var15 < var14 / 2; var15++) {
            Class8161 var16 = var1[var15];
            var1[var15] = var1[var14 - 1 - var15];
            var1[var14 - 1 - var15] = var16;
         }
      }

      this.field31655 = var9.method542();
      if (var8) {
         this.field31655.method25273(-1.0F, 1.0F, 1.0F);
      }
   }
}
