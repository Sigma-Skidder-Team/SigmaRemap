package mapped;

public class Class1359 implements Runnable {
   private static String[] field7247;
   public final long field7248;
   public final long field7249;
   public final long field7250;
   public final Class2378 field7251;
   public final long field7252;
   public final Class2378 field7253;
   public final long field7254;
   public final Class8026 field7255;

   public Class1359(Class8026 var1, long var2, long var4, long var6, Class2378 var8, long var9, Class2378 var11, long var12) {
      this.field7255 = var1;
      this.field7248 = var2;
      this.field7249 = var4;
      this.field7250 = var6;
      this.field7251 = var8;
      this.field7252 = var9;
      this.field7253 = var11;
      this.field7254 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field7248; var3 < this.field7249; var3++) {
         long var5 = var3 * this.field7250;

         for (long var7 = 0L; var7 < Class8026.method27521(this.field7255); var7++) {
            Class8133.method28175(
               this.field7251,
               var3 * Class8026.method27521(this.field7255) * this.field7252 + var7 * this.field7252,
               this.field7253,
               var5 + var7 * this.field7254,
               this.field7252
            );
         }
      }
   }
}
