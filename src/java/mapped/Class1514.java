package mapped;

public class Class1514 implements Runnable {
   private static String[] field8189;
   public final long field8190;
   public final long field8191;
   public final Class2381 field8192;
   public final boolean field8193;
   public final Class3612 field8194;

   public Class1514(Class3612 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8194 = var1;
      this.field8190 = var2;
      this.field8191 = var4;
      this.field8192 = var6;
      this.field8193 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class3612.method12232(this.field8194), false);

      for (long var4 = this.field8190; var4 < this.field8191; var4++) {
         long var6 = var4 * Class3612.method12230(this.field8194);

         for (long var8 = 0L; var8 < Class3612.method12231(this.field8194); var8++) {
            for (long var10 = 0L; var10 < Class3612.method12232(this.field8194); var10++) {
               long var12 = var10 * Class3612.method12228(this.field8194) + var6 + var8;
               var3.method9687(var10, this.field8192.method9653(var12));
            }

            Class3612.method12227(this.field8194).method33657(var3, this.field8193);

            for (long var14 = 0L; var14 < Class3612.method12232(this.field8194); var14++) {
               long var15 = var14 * Class3612.method12228(this.field8194) + var6 + var8;
               this.field8192.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
