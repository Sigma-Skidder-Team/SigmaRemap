package mapped;

public class Class1480 implements Runnable {
   private static String[] field7965;
   public final int field7966;
   public final int field7967;
   public final int field7968;
   public final int field7969;
   public final int field7970;
   public final int field7971;
   public final double[] field7972;
   public final Class7274 field7973;

   public Class1480(Class7274 var1, int var2, int var3, int var4, int var5, int var6, int var7, double[] var8) {
      this.field7973 = var1;
      this.field7966 = var2;
      this.field7967 = var3;
      this.field7968 = var4;
      this.field7969 = var5;
      this.field7970 = var6;
      this.field7971 = var7;
      this.field7972 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field7966; var3 < this.field7967; var3++) {
         int var4 = (Class7274.method22900(this.field7973) - var3) % Class7274.method22900(this.field7973);
         int var5 = var4 * this.field7968;
         int var6 = var3 * this.field7968;

         for (int var7 = 1; var7 < this.field7969; var7++) {
            int var8 = Class7274.method22895(this.field7973) - var7;
            int var9 = var8 * this.field7970;
            int var10 = var7 * this.field7970;
            int var11 = var5 + var9;

            for (int var12 = 0; var12 < Class7274.method22898(this.field7973); var12++) {
               int var13 = 2 * var12;
               int var14 = this.field7971 - var13;
               int var15 = var6 + var10 + var13;
               this.field7972[var11 + var14 % this.field7971] = this.field7972[var15];
               this.field7972[var11 + (var14 + 1) % this.field7971] = -this.field7972[var15 + 1];
            }
         }
      }
   }
}
