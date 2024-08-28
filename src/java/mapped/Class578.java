package mapped;

public class Class578 implements Runnable {
   private static String[] field2822;
   public final long field2823;
   public final long field2824;
   public final long field2825;
   public final long field2826;
   public final Class2381 field2827;
   public final Class9615 field2828;

   public Class578(Class9615 var1, long var2, long var4, long var6, long var8, Class2381 var10) {
      this.field2828 = var1;
      this.field2823 = var2;
      this.field2824 = var4;
      this.field2825 = var6;
      this.field2826 = var8;
      this.field2827 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field2823; var3 < this.field2824; var3++) {
         long var5 = var3 * this.field2825;
         long var7 = (Class9615.method37426(this.field2828) - var3 + 1L) * this.field2825;

         for (long var9 = this.field2826; var9 < Class9615.method37428(this.field2828); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (Class9615.method37428(this.field2828) - var9);
            this.field2827.method9687(var11, this.field2827.method9653(var13));
            this.field2827.method9687(var11 + 1L, -this.field2827.method9653(var13 + 1L));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field2827.method9687(var15, this.field2827.method9653(var17));
            this.field2827.method9687(var15 + 1L, -this.field2827.method9653(var17 + 1L));
         }
      }
   }
}
