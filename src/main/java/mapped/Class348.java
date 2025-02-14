package mapped;

public class Class348 implements Runnable {
   private static String[] field1544;
   public final int field1545;
   public final int field1546;
   public final int field1547;
   public final int field1548;
   public final int field1549;
   public final double[] field1550;
   public final Class7274 field1551;

   public Class348(Class7274 var1, int var2, int var3, int var4, int var5, int var6, double[] var7) {
      this.field1551 = var1;
      this.field1545 = var2;
      this.field1546 = var3;
      this.field1547 = var4;
      this.field1548 = var5;
      this.field1549 = var6;
      this.field1550 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field1545; var3 < this.field1546; var3++) {
         int var4 = (Class7274.method22900(this.field1551) - var3) % Class7274.method22900(this.field1551) * this.field1547;
         int var5 = var3 * this.field1547;

         for (int var6 = 1; var6 < this.field1548; var6++) {
            int var7 = var5 + (Class7274.method22895(this.field1551) - var6) * this.field1549;
            int var8 = var4 + var6 * this.field1549 + Class7274.method22898(this.field1551);
            int var9 = var7 + Class7274.method22898(this.field1551);
            int var10 = var7 + 1;
            this.field1550[var8] = this.field1550[var10];
            this.field1550[var9] = this.field1550[var10];
            this.field1550[var8 + 1] = -this.field1550[var7];
            this.field1550[var9 + 1] = this.field1550[var7];
         }
      }
   }
}
