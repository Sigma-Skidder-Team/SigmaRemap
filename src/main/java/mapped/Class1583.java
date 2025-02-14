package mapped;

public class Class1583 implements Runnable {
   private static String[] field8571;
   public final long field8572;
   public final long field8573;
   public final Class2381 field8574;
   public final boolean field8575;
   public final Class8832 field8576;

   public Class1583(Class8832 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field8576 = var1;
      this.field8572 = var2;
      this.field8573 = var4;
      this.field8574 = var6;
      this.field8575 = var7;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(Class8832.method31965(this.field8576), false);

      for (long var4 = this.field8572; var4 < this.field8573; var4++) {
         long var6 = var4 * Class8832.method31967(this.field8576);

         for (long var8 = 0L; var8 < Class8832.method31964(this.field8576); var8++) {
            for (long var10 = 0L; var10 < Class8832.method31965(this.field8576); var10++) {
               long var12 = var10 * Class8832.method31966(this.field8576) + var6 + var8;
               var3.method9687(var10, this.field8574.method9653(var12));
            }

            Class8832.method31962(this.field8576).method33651(var3, this.field8575);

            for (long var14 = 0L; var14 < Class8832.method31965(this.field8576); var14++) {
               long var15 = var14 * Class8832.method31966(this.field8576) + var6 + var8;
               this.field8574.method9687(var15, var3.method9653(var14));
            }
         }
      }
   }
}
