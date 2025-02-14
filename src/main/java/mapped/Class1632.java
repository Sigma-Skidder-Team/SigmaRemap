package mapped;

public class Class1632 implements Runnable {
   private static String[] field8849;
   public final int field8850;
   public final int field8851;
   public final int field8852;
   public final double[][][] field8853;
   public final Class7274 field8854;

   public Class1632(Class7274 var1, int var2, int var3, int var4, double[][][] var5) {
      this.field8854 = var1;
      this.field8850 = var2;
      this.field8851 = var3;
      this.field8852 = var4;
      this.field8853 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8850; var3 < this.field8851; var3++) {
         int var4 = (Class7274.method22900(this.field8854) - var3) % Class7274.method22900(this.field8854);

         for (int var5 = 1; var5 < this.field8852; var5++) {
            int var6 = Class7274.method22895(this.field8854) - var5;
            this.field8853[var4][var5][Class7274.method22898(this.field8854)] = this.field8853[var3][var6][1];
            this.field8853[var3][var6][Class7274.method22898(this.field8854)] = this.field8853[var3][var6][1];
            this.field8853[var4][var5][Class7274.method22898(this.field8854) + 1] = -this.field8853[var3][var6][0];
            this.field8853[var3][var6][Class7274.method22898(this.field8854) + 1] = this.field8853[var3][var6][0];
         }
      }
   }
}
