package mapped;

public class Class1581 implements Runnable {
   private static String[] field8559;
   public final long field8560;
   public final long field8561;
   public final long field8562;
   public final long field8563;
   public final Class2378 field8564;
   public final Class8543 field8565;

   public Class1581(Class8543 var1, long var2, long var4, long var6, long var8, Class2378 var10) {
      this.field8565 = var1;
      this.field8560 = var2;
      this.field8561 = var4;
      this.field8562 = var6;
      this.field8563 = var8;
      this.field8564 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field8560; var3 < this.field8561; var3++) {
         long var5 = var3 * this.field8562;
         long var7 = (Class8543.method30437(this.field8565) - var3 + 1L) * this.field8562;

         for (long var9 = this.field8563; var9 < Class8543.method30439(this.field8565); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (Class8543.method30439(this.field8565) - var9);
            this.field8564.method9687(var11, (double)this.field8564.method9651(var13));
            this.field8564.method9687(var11 + 1L, (double)(-this.field8564.method9651(var13 + 1L)));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field8564.method9687(var15, (double)this.field8564.method9651(var17));
            this.field8564.method9687(var15 + 1L, (double)(-this.field8564.method9651(var17 + 1L)));
         }
      }
   }
}
