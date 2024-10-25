package mapped;



public class Class6540 implements Class6515, Class6541 {
   private static final int field28885 = 20;
   private static final int[] field28886 = new int[]{1, 4, 3};
   private static final int[] field28887 = new int[]{2, 6, 5};
   private int[] field28888 = new int[8];
   private int[][] field28889 = new int[8][4];
   private int[][] field28890;
   private boolean[][] field28891 = new boolean[8][4];
   private float[][][] field28892;

   public Class6540() {
      this.field28890 = new int[8][4];
      this.field28892 = new float[8][4][20];
   }

   public void method19884(Class9189 var1, Class6538 var2) throws AACException {
      int var5 = var2.method19870();
      int[] var6 = !var2.method19874() ? field28887 : field28886;

      for (int var7 = 0; var7 < var5; var7++) {
         if ((this.field28888[var7] = var1.method34397(var6[0])) != 0) {
            int var8 = var1.method34398();

            for (int var9 = 0; var9 < this.field28888[var7]; var9++) {
               this.field28889[var7][var9] = var1.method34397(var6[1]);
               if ((this.field28890[var7][var9] = var1.method34397(var6[2])) > 20) {
                  throw new AACException("TNS filter out of range: " + this.field28890[var7][var9]);
               }

               if (this.field28890[var7][var9] != 0) {
                  this.field28891[var7][var9] = var1.method34399();
                  int var10 = var1.method34398();
                  int var11 = var8 + 3 - var10;
                  int var12 = 2 * var10 + var8;

                  for (int var13 = 0; var13 < this.field28890[var7][var9]; var13++) {
                     this.field28892[var7][var9][var13] = field28897[var12][var1.method34397(var11)];
                  }
               }
            }
         }
      }
   }

   public void method19885(Class6512 var1, float[] var2, Class2288 var3, boolean var4) {
   }
}
