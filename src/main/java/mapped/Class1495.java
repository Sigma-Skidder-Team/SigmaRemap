package mapped;

public class Class1495 implements Runnable {
   private static String[] field8058;
   public final long field8059;
   public final long field8060;
   public final long field8061;
   public final long field8062;
   public final Class2378 field8063;
   public final Class8543 field8064;

   public Class1495(Class8543 var1, long var2, long var4, long var6, long var8, Class2378 var10) {
      this.field8064 = var1;
      this.field8059 = var2;
      this.field8060 = var4;
      this.field8061 = var6;
      this.field8062 = var8;
      this.field8063 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field8059; var3 < this.field8060; var3++) {
         long var5 = var3 * this.field8061;
         long var7 = (Class8543.method30437(this.field8064) - var3 + 1L) * this.field8061;

         for (long var9 = this.field8062; var9 < Class8543.method30439(this.field8064); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (Class8543.method30439(this.field8064) - var9);
            this.field8063.method9687(var11, (double)this.field8063.method9651(var13));
            this.field8063.method9687(var11 + 1L, (double)(-this.field8063.method9651(var13 + 1L)));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field8063.method9687(var15, (double)this.field8063.method9651(var17));
            this.field8063.method9687(var15 + 1L, (double)(-this.field8063.method9651(var17 + 1L)));
         }
      }
   }
}
