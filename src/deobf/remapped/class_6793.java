package remapped;

public class class_6793 {
   private static String[] field_35025;
   private final int field_35024;
   private final double field_35023;
   private final double field_35026;

   public class_6793(double var1) {
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
            this.field_35024 = var5;
            this.field_35023 = var8;
            this.field_35026 = var10;
            return;
         }

         var5--;
      }
   }

   public int method_31139() {
      return this.field_35024;
   }

   public double method_31138() {
      return this.field_35023;
   }

   public double method_31136() {
      return this.field_35026;
   }
}
