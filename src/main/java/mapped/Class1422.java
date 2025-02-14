package mapped;

public class Class1422 implements Runnable {
   private static String[] field7623;
   public final int field7624;
   public final int field7625;
   public final int field7626;
   public final int field7627;
   public final int field7628;
   public final double[] field7629;
   public final Class7274 field7630;

   public Class1422(Class7274 var1, int var2, int var3, int var4, int var5, int var6, double[] var7) {
      this.field7630 = var1;
      this.field7624 = var2;
      this.field7625 = var3;
      this.field7626 = var4;
      this.field7627 = var5;
      this.field7628 = var6;
      this.field7629 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field7624; var3 < this.field7625; var3++) {
         int var4 = (Class7274.method22900(this.field7630) - var3) % Class7274.method22900(this.field7630) * this.field7626;
         int var5 = var3 * this.field7626;

         for (int var6 = 0; var6 < Class7274.method22895(this.field7630); var6++) {
            int var7 = (Class7274.method22895(this.field7630) - var6) % Class7274.method22895(this.field7630) * this.field7627;
            int var8 = var6 * this.field7627;

            for (int var9 = 1; var9 < Class7274.method22898(this.field7630); var9 += 2) {
               int var10 = var4 + var7 + this.field7628 - var9;
               int var11 = var5 + var8 + var9;
               this.field7629[var10] = -this.field7629[var11 + 2];
               this.field7629[var10 - 1] = this.field7629[var11 + 1];
            }
         }
      }
   }
}
