package mapped;

public class Class1578 implements Runnable {
   private static String[] field8546;
   public final int field8547;
   public final int field8548;
   public final double[][][] field8549;
   public final boolean field8550;
   public final Class6352 field8551;

   public Class1578(Class6352 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field8551 = var1;
      this.field8547 = var2;
      this.field8548 = var3;
      this.field8549 = var4;
      this.field8550 = var5;
   }

   @Override
   public void run() {
      double[] var3 = new double[Class6352.method19328(this.field8551)];

      for (int var4 = this.field8547; var4 < this.field8548; var4++) {
         for (int var5 = 0; var5 < Class6352.method19331(this.field8551); var5++) {
            for (int var6 = 0; var6 < Class6352.method19328(this.field8551); var6++) {
               var3[var6] = this.field8549[var4][var6][var5];
            }

            Class6352.method19332(this.field8551).method38580(var3, this.field8550);

            for (int var7 = 0; var7 < Class6352.method19328(this.field8551); var7++) {
               this.field8549[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
