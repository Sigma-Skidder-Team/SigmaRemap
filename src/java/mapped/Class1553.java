package mapped;

public class Class1553 implements Runnable {
   private static String[] field8426;
   public final long field8427;
   public final long field8428;
   public final Class2381 field8429;
   public final boolean field8430;
   public final Class3612 field8431;

   public Class1553(Class3612 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8431 = var1;
      this.field8427 = var2;
      this.field8428 = var4;
      this.field8429 = var6;
      this.field8430 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class3612.method12229(this.field8431), false);

      for (long var4 = this.field8427; var4 < this.field8428; var4++) {
         long var6 = var4 * Class3612.method12228(this.field8431);

         for (long var8 = 0L; var8 < Class3612.method12231(this.field8431); var8++) {
            for (long var10 = 0L; var10 < Class3612.method12229(this.field8431); var10++) {
               long var12 = var6 + var10 * Class3612.method12230(this.field8431) + var8;
               var3.method9687(var10, this.field8429.method9653(var12));
            }

            Class3612.method12225(this.field8431).method33657(var3, this.field8430);

            for (long var14 = 0L; var14 < Class3612.method12229(this.field8431); var14++) {
               long var15 = var6 + var14 * Class3612.method12230(this.field8431) + var8;
               this.field8429.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
