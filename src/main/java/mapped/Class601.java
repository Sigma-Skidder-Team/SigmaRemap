package mapped;

public class Class601 implements Runnable {
   private static String[] field2965;
   public final long field2966;
   public final long field2967;
   public final Class2378 field2968;
   public final long field2969;
   public final Class2378 field2970;
   public final Class8543 field2971;

   public Class601(Class8543 var1, long var2, long var4, Class2378 var6, long var7, Class2378 var9) {
      this.field2971 = var1;
      this.field2966 = var2;
      this.field2967 = var4;
      this.field2968 = var6;
      this.field2969 = var7;
      this.field2970 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field2966; var3 < this.field2967; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < Class8543.method30437(this.field2971); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * Class8543.method30439(this.field2971) + var5;
            this.field2968.method9687(var3 * this.field2969 + var9, (double)this.field2970.method9651(var11));
            this.field2968.method9687(var3 * this.field2969 + var9 + 1L, (double)this.field2970.method9651(var11 + 1L));
         }

         Class8543.method30436(this.field2971).method30932(this.field2968, var3 * this.field2969);
      }
   }
}
