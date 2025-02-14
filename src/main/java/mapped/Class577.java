package mapped;

public class Class577 implements Runnable {
   private static String[] field2814;
   public final long field2815;
   public final long field2816;
   public final Class2381 field2817;
   public final long field2818;
   public final Class2381 field2819;
   public final boolean field2820;
   public final Class9615 field2821;

   public Class577(Class9615 var1, long var2, long var4, Class2381 var6, long var7, Class2381 var9, boolean var10) {
      this.field2821 = var1;
      this.field2815 = var2;
      this.field2816 = var4;
      this.field2817 = var6;
      this.field2818 = var7;
      this.field2819 = var9;
      this.field2820 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field2815; var3 < this.field2816; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < Class9615.method37426(this.field2821); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * Class9615.method37428(this.field2821) + var5;
            this.field2817.method9687(var3 * this.field2818 + var9, this.field2819.method9653(var11));
            this.field2817.method9687(var3 * this.field2818 + var9 + 1L, this.field2819.method9653(var11 + 1L));
         }

         Class9615.method37425(this.field2821).method27169(this.field2817, var3 * this.field2818, this.field2820);
      }
   }
}
