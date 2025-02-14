package mapped;

public class Class1381 implements Runnable {
   private static String[] field7378;
   public final long field7379;
   public final long field7380;
   public final Class2378 field7381;
   public final boolean field7382;
   public final Class7941 field7383;

   public Class1381(Class7941 var1, long var2, long var4, Class2378 var6, boolean var7) {
      this.field7383 = var1;
      this.field7379 = var2;
      this.field7380 = var4;
      this.field7381 = var6;
      this.field7382 = var7;
   }

   @Override
   public void run() {
      Class2378 var3 = new Class2378(Class7941.method26772(this.field7383), false);

      for (long var4 = this.field7379; var4 < this.field7380; var4++) {
         long var6 = var4 * (long)Class7941.method26763(this.field7383);

         for (long var8 = 0L; var8 < Class7941.method26774(this.field7383); var8++) {
            for (long var10 = 0L; var10 < Class7941.method26772(this.field7383); var10++) {
               long var12 = var6 + var10 * (long)Class7941.method26765(this.field7383) + var8;
               var3.method9685(var10, this.field7381.method9651(var12));
            }

            Class7941.method26768(this.field7383).method28929(var3, this.field7382);

            for (long var14 = 0L; var14 < Class7941.method26772(this.field7383); var14++) {
               long var15 = var6 + var14 * (long)Class7941.method26765(this.field7383) + var8;
               this.field7381.method9685(var15, var3.method9651(var14));
            }
         }
      }
   }
}
