package mapped;

public enum FuzzedBiomeMagnifier implements IBiomeMagnifier {
   INSTANCE;

   public ThreadLocal<double[]> field12766 = ThreadLocal.<double[]>withInitial(() -> new double[8]);
   private static final FuzzedBiomeMagnifier[] field12767 = new FuzzedBiomeMagnifier[]{INSTANCE};

   @Override
   public Biome method8225(long var1, int var3, int var4, int var5, Class1683 var6) {
      int var9 = var3 - 2;
      int var10 = var4 - 2;
      int var11 = var5 - 2;
      int var12 = var9 >> 2;
      int var13 = var10 >> 2;
      int var14 = var11 >> 2;
      double var15 = (double)(var9 & 3) / 4.0;
      double var17 = (double)(var10 & 3) / 4.0;
      double var19 = (double)(var11 & 3) / 4.0;
      double[] var21 = this.field12766.get();

      for (int var22 = 0; var22 < 8; var22++) {
         boolean var26 = (var22 & 4) == 0;
         boolean var27 = (var22 & 2) == 0;
         boolean var25 = (var22 & 1) == 0;
         int var28 = !var26 ? var12 + 1 : var12;
         int var29 = !var27 ? var13 + 1 : var13;
         int var30 = !var25 ? var14 + 1 : var14;
         double var31 = !var26 ? var15 - 1.0 : var15;
         double var33 = !var27 ? var17 - 1.0 : var17;
         double var35 = !var25 ? var19 - 1.0 : var19;
         var21[var22] = method8226(var1, var28, var29, var30, var31, var33, var35);
      }

      int var37 = 0;
      double var23 = var21[0];

      for (int var38 = 1; var38 < 8; var38++) {
         if (var23 > var21[var38]) {
            var37 = var38;
            var23 = var21[var38];
         }
      }

      int var39 = (var37 & 4) != 0 ? var12 + 1 : var12;
      int var40 = (var37 & 2) != 0 ? var13 + 1 : var13;
      int var41 = (var37 & 1) != 0 ? var14 + 1 : var14;
      return var6.method7005(var39, var40, var41);
   }

   private static double method8226(long var0, int var2, int var3, int var4, double var5, double var7, double var9) {
      long var13 = Class7793.method25883(var0, (long)var2);
      var13 = Class7793.method25883(var13, (long)var3);
      var13 = Class7793.method25883(var13, (long)var4);
      var13 = Class7793.method25883(var13, (long)var2);
      var13 = Class7793.method25883(var13, (long)var3);
      var13 = Class7793.method25883(var13, (long)var4);
      double var15 = method8227(var13);
      var13 = Class7793.method25883(var13, var0);
      double var17 = method8227(var13);
      var13 = Class7793.method25883(var13, var0);
      double var19 = method8227(var13);
      return method8228(var9 + var19) + method8228(var7 + var17) + method8228(var5 + var15);
   }

   private static double method8227(long var0) {
      double var4 = (double)((int)Math.floorMod(var0 >> 24, 1024L)) / 1024.0;
      return (var4 - 0.5) * 0.9;
   }

   private static double method8228(double var0) {
      return var0 * var0;
   }
}
