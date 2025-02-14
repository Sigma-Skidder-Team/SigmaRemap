package mapped;

public class Class9042 {
   private static String[] field41364;
   private final int field41365;
   private final double field41366;
   private final double field41367;

   public Class9042(double var1) {
      int var5 = (int)(var1 * 0.6366197723675814);

      while (true) {
         double var6 = (double)(-var5) * 1.5707963F;
         double var8 = var1 + var6;
         double var10 = -(var8 - var1 - var6);
         var6 = (double)(-var5) * 7.549789948768648E-8;
         double var16 = var6 + var8;
         var10 += -(var16 - var8 - var6);
         var6 = (double)(-var5) * 6.123233995736766E-17;
         var8 = var6 + var16;
         var10 += -(var8 - var16 - var6);
         if (var8 > 0.0) {
            this.field41365 = var5;
            this.field41366 = var8;
            this.field41367 = var10;
            return;
         }

         var5--;
      }
   }

   public int method33540() {
      return this.field41365;
   }

   public double method33541() {
      return this.field41366;
   }

   public double method33542() {
      return this.field41367;
   }
}
