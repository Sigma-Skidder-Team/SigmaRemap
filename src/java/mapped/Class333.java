package mapped;

public class Class333 implements Runnable {
   private static String[] field1445;
   public final long field1446;
   public final long field1447;
   public final long field1448;
   public final Class2378 field1449;
   public final boolean field1450;
   public final Class8543 field1451;

   public Class333(Class8543 var1, long var2, long var4, long var6, Class2378 var8, boolean var9) {
      this.field1451 = var1;
      this.field1446 = var2;
      this.field1447 = var4;
      this.field1448 = var6;
      this.field1449 = var8;
      this.field1450 = var9;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(2L * Class8543.method30437(this.field1451), false);

      for (long var4 = this.field1446; var4 < this.field1447; var4++) {
         long var6 = 2L * var4;

         for (long var8 = 0L; var8 < Class8543.method30437(this.field1451); var8++) {
            long var10 = 2L * var8;
            long var12 = var8 * this.field1448 + var6;
            var3.method9687(var10, (double)this.field1449.method9651(var12));
            var3.method9687(var10 + 1L, (double)this.field1449.method9651(var12 + 1L));
         }

         Class8543.method30436(this.field1451).method30934(var3, this.field1450);

         for (long var14 = 0L; var14 < Class8543.method30437(this.field1451); var14++) {
            long var15 = 2L * var14;
            long var16 = var14 * this.field1448 + var6;
            this.field1449.method9687(var16, (double)var3.method9651(var15));
            this.field1449.method9687(var16 + 1L, (double)var3.method9651(var15 + 1L));
         }
      }
   }
}
