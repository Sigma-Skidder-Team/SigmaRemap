package mapped;

public class Class396 implements Runnable {
   private static String[] field1689;
   public final long field1690;
   public final long field1691;
   public final long field1692;
   public final Class2378 field1693;
   public final long field1694;
   public final long field1695;
   public final Class8543 field1696;

   public Class396(Class8543 var1, long var2, long var4, long var6, Class2378 var8, long var9, long var11) {
      this.field1696 = var1;
      this.field1690 = var2;
      this.field1691 = var4;
      this.field1692 = var6;
      this.field1693 = var8;
      this.field1694 = var9;
      this.field1695 = var11;
   }

   @Override
   public void run() {
      for (long var3 = this.field1690; var3 < this.field1691; var3++) {
         long var5 = var3 * this.field1692;
         long var7 = (Class8543.method30437(this.field1696) - var3) * this.field1692;
         long var9 = var5 + Class8543.method30439(this.field1696);
         this.field1693.method9687(var9, (double)this.field1693.method9651(var7 + 1L));
         this.field1693.method9687(var9 + 1L, (double)(-this.field1693.method9651(var7)));
      }

      for (long var15 = this.field1690; var15 < this.field1691; var15++) {
         long var17 = var15 * this.field1692;
         long var21 = (Class8543.method30437(this.field1696) - var15 + 1L) * this.field1692;

         for (long var11 = Class8543.method30439(this.field1696) + 2L; var11 < this.field1692; var11 += 2L) {
            long var19 = var21 - var11;
            long var13 = var17 + var11;
            this.field1693.method9687(var13, (double)this.field1693.method9651(var19));
            this.field1693.method9687(var13 + 1L, (double)(-this.field1693.method9651(var19 + 1L)));
         }
      }

      for (long var16 = this.field1694; var16 < this.field1695; var16++) {
         long var22 = (Class8543.method30437(this.field1696) - var16) % Class8543.method30437(this.field1696) * this.field1692;
         long var24 = var16 * this.field1692;

         for (long var23 = 0L; var23 < this.field1692; var23 += 2L) {
            long var18 = var22 + (this.field1692 - var23) % this.field1692;
            long var20 = var24 + var23;
            this.field1693.method9687(var18, (double)this.field1693.method9651(var20));
            this.field1693.method9687(var18 + 1L, (double)(-this.field1693.method9651(var20 + 1L)));
         }
      }
   }
}
