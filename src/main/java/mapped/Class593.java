package mapped;

public class Class593 implements Runnable {
   private static String[] field2914;
   public final long field2915;
   public final long field2916;
   public final Class2381 field2917;
   public final Class8832 field2918;

   public Class593(Class8832 var1, long var2, long var4, Class2381 var6) {
      this.field2918 = var1;
      this.field2915 = var2;
      this.field2916 = var4;
      this.field2917 = var6;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class8832.method31963(this.field2918), false);

      for (long var4 = this.field2915; var4 < this.field2916; var4++) {
         long var6 = var4 * (long)Class8832.method31955(this.field2918);

         for (long var8 = 0L; var8 < Class8832.method31964(this.field2918); var8++) {
            for (long var10 = 0L; var10 < Class8832.method31963(this.field2918); var10++) {
               long var12 = var6 + var10 * (long)Class8832.method31957(this.field2918) + var8;
               var3.method9687(var10, this.field2917.method9653(var12));
            }

            Class8832.method31960(this.field2918).method33647(var3);

            for (long var14 = 0L; var14 < Class8832.method31963(this.field2918); var14++) {
               long var15 = var6 + var14 * (long)Class8832.method31957(this.field2918) + var8;
               this.field2917.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
