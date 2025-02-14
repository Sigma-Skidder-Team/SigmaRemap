package mapped;

public class Class1532 implements Runnable {
   private static String[] field8312;
   public final long field8313;
   public final long field8314;
   public final Class2381 field8315;
   public final boolean field8316;
   public final Class3612 field8317;

   public Class1532(Class3612 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8317 = var1;
      this.field8313 = var2;
      this.field8314 = var4;
      this.field8315 = var6;
      this.field8316 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class3612.method12232(this.field8317), false);

      for (long var4 = this.field8313; var4 < this.field8314; var4++) {
         long var6 = var4 * (long)Class3612.method12222(this.field8317);

         for (long var8 = 0L; var8 < Class3612.method12231(this.field8317); var8++) {
            for (long var10 = 0L; var10 < Class3612.method12232(this.field8317); var10++) {
               long var12 = var10 * (long)Class3612.method12220(this.field8317) + var6 + var8;
               var3.method9687(var10, this.field8315.method9653(var12));
            }

            Class3612.method12227(this.field8317).method33661(var3, this.field8316);

            for (long var14 = 0L; var14 < Class3612.method12232(this.field8317); var14++) {
               long var15 = var14 * (long)Class3612.method12220(this.field8317) + var6 + var8;
               this.field8315.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
