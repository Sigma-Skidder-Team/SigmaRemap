package mapped;

public class Class1571 implements Runnable {
   private static String[] field8497;
   public final long field8498;
   public final long field8499;
   public final long field8500;
   public final long field8501;
   public final Class2381 field8502;
   public final Class9615 field8503;

   public Class1571(Class9615 var1, long var2, long var4, long var6, long var8, Class2381 var10) {
      this.field8503 = var1;
      this.field8498 = var2;
      this.field8499 = var4;
      this.field8500 = var6;
      this.field8501 = var8;
      this.field8502 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field8498; var3 < this.field8499; var3++) {
         long var5 = var3 * this.field8500;
         long var7 = (Class9615.method37426(this.field8503) - var3 + 1L) * this.field8500;

         for (long var9 = this.field8501; var9 < Class9615.method37428(this.field8503); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (Class9615.method37428(this.field8503) - var9);
            this.field8502.method9687(var11, this.field8502.method9653(var13));
            this.field8502.method9687(var11 + 1L, -this.field8502.method9653(var13 + 1L));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field8502.method9687(var15, this.field8502.method9653(var17));
            this.field8502.method9687(var15 + 1L, -this.field8502.method9653(var17 + 1L));
         }
      }
   }
}
