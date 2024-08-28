package mapped;

public class Class1496 implements Runnable {
   private static String[] field8065;
   public final long field8066;
   public final long field8067;
   public final Class2381 field8068;
   public final Class2381 field8069;
   public final long field8070;
   public final boolean field8071;
   public final Class7274 field8072;

   public Class1496(Class7274 var1, long var2, long var4, Class2381 var6, Class2381 var7, long var8, boolean var10) {
      this.field8072 = var1;
      this.field8066 = var2;
      this.field8067 = var4;
      this.field8068 = var6;
      this.field8069 = var7;
      this.field8070 = var8;
      this.field8071 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field8066; var3 < this.field8067; var3++) {
         long var5 = var3 * Class7274.method22902(this.field8072);

         for (long var7 = 0L; var7 < Class7274.method22903(this.field8072); var7++) {
            Class8133.method28177(
               this.field8068,
               var5 + var7 * Class7274.method22904(this.field8072),
               this.field8069,
               var3 * Class7274.method22903(this.field8072) * this.field8070 + var7 * this.field8070,
               Class7274.method22905(this.field8072)
            );
            Class7274.method22897(this.field8072)
               .method27185(this.field8069, var3 * Class7274.method22903(this.field8072) * this.field8070 + var7 * this.field8070, this.field8071);
         }
      }
   }
}
