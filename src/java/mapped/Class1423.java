package mapped;

public class Class1423 implements Runnable {
   private static String[] field7631;
   public final int field7632;
   public final int field7633;
   public final int field7634;
   public final double[] field7635;
   public final int field7636;
   public final int field7637;
   public final Class9615 field7638;

   public Class1423(Class9615 var1, int var2, int var3, int var4, double[] var5, int var6, int var7) {
      this.field7638 = var1;
      this.field7632 = var2;
      this.field7633 = var3;
      this.field7634 = var4;
      this.field7635 = var5;
      this.field7636 = var6;
      this.field7637 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field7632; var3 < this.field7633; var3++) {
         int var4 = var3 * this.field7634;
         int var5 = (Class9615.method37424(this.field7638) - var3) * this.field7634;
         int var6 = var4 + Class9615.method37427(this.field7638);
         this.field7635[var6] = this.field7635[var5 + 1];
         this.field7635[var6 + 1] = -this.field7635[var5];
      }

      for (int var9 = this.field7632; var9 < this.field7633; var9++) {
         int var11 = var9 * this.field7634;
         int var15 = (Class9615.method37424(this.field7638) - var9 + 1) * this.field7634;

         for (int var7 = Class9615.method37427(this.field7638) + 2; var7 < this.field7634; var7 += 2) {
            int var13 = var15 - var7;
            int var8 = var11 + var7;
            this.field7635[var8] = this.field7635[var13];
            this.field7635[var8 + 1] = -this.field7635[var13 + 1];
         }
      }

      for (int var10 = this.field7636; var10 < this.field7637; var10++) {
         int var16 = (Class9615.method37424(this.field7638) - var10) % Class9615.method37424(this.field7638) * this.field7634;
         int var18 = var10 * this.field7634;

         for (int var17 = 0; var17 < this.field7634; var17 += 2) {
            int var12 = var16 + (this.field7634 - var17) % this.field7634;
            int var14 = var18 + var17;
            this.field7635[var12] = this.field7635[var14];
            this.field7635[var12 + 1] = -this.field7635[var14 + 1];
         }
      }
   }
}
