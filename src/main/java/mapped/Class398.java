package mapped;

public class Class398 implements Runnable {
   private static String[] field1704;
   public final int field1705;
   public final int field1706;
   public final int field1707;
   public final int field1708;
   public final double[] field1709;
   public final Class7990 field1710;

   public Class398(Class7990 var1, int var2, int var3, int var4, int var5, double[] var6) {
      this.field1710 = var1;
      this.field1705 = var2;
      this.field1706 = var3;
      this.field1707 = var4;
      this.field1708 = var5;
      this.field1709 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field1705; var3 < this.field1706; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field1707 + (this.field1708 - var4) % this.field1708;
         this.field1709[var5] = this.field1709[this.field1707 + var4];
         this.field1709[var5 + 1] = -this.field1709[this.field1707 + var4 + 1];
      }
   }
}
