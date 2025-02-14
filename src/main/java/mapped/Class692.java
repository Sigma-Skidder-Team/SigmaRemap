package mapped;

public class Class692 implements Runnable {
   private static String[] field3527;
   public final long field3528;
   public final long field3529;
   public final Class2381 field3530;
   public final boolean field3531;
   public final Class3612 field3532;

   public Class692(Class3612 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field3532 = var1;
      this.field3528 = var2;
      this.field3529 = var4;
      this.field3530 = var6;
      this.field3531 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class3612.method12229(this.field3532), false);

      for (long var4 = this.field3528; var4 < this.field3529; var4++) {
         long var6 = var4 * (long)Class3612.method12220(this.field3532);

         for (long var8 = 0L; var8 < Class3612.method12231(this.field3532); var8++) {
            for (long var10 = 0L; var10 < Class3612.method12229(this.field3532); var10++) {
               long var12 = var6 + var10 * (long)Class3612.method12222(this.field3532) + var8;
               var3.method9687(var10, this.field3530.method9653(var12));
            }

            Class3612.method12225(this.field3532).method33661(var3, this.field3531);

            for (long var14 = 0L; var14 < Class3612.method12229(this.field3532); var14++) {
               long var15 = var6 + var14 * (long)Class3612.method12222(this.field3532) + var8;
               this.field3530.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
