package mapped;

public class Class1603 implements Runnable {
   private static String[] field8684;
   public final long field8685;
   public final long field8686;
   public final long field8687;
   public final long field8688;
   public final long field8689;
   public final long field8690;
   public final Class2378 field8691;
   public final Class8026 field8692;

   public Class1603(Class8026 var1, long var2, long var4, long var6, long var8, long var10, long var12, Class2378 var14) {
      this.field8692 = var1;
      this.field8685 = var2;
      this.field8686 = var4;
      this.field8687 = var6;
      this.field8688 = var8;
      this.field8689 = var10;
      this.field8690 = var12;
      this.field8691 = var14;
   }

   @Override
   public void run() {
      for (long var3 = this.field8685; var3 < this.field8686; var3++) {
         long var5 = (Class8026.method27524(this.field8692) - var3) % Class8026.method27524(this.field8692);
         long var7 = var5 * this.field8687;
         long var9 = var3 * this.field8687;

         for (long var11 = 1L; var11 < this.field8688; var11++) {
            long var13 = Class8026.method27521(this.field8692) - var11;
            long var15 = var13 * this.field8689;
            long var17 = var11 * this.field8689;
            long var19 = var7 + var15;

            for (long var21 = 0L; var21 < Class8026.method27523(this.field8692); var21++) {
               long var23 = 2L * var21;
               long var25 = this.field8690 - var23;
               long var27 = var9 + var17 + var23;
               this.field8691.method9685(var19 + var25 % this.field8690, this.field8691.method9651(var27));
               this.field8691.method9685(var19 + (var25 + 1L) % this.field8690, -this.field8691.method9651(var27 + 1L));
            }
         }
      }
   }
}
