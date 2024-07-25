package remapped;

public class class_5907 implements Runnable {
   private static String[] field_29982;

   public class_5907(class_1637 var1, int var2, int var3, int var4, int var5, int var6, double[] var7) {
      this.field_29979 = var1;
      this.field_29984 = var2;
      this.field_29978 = var3;
      this.field_29981 = var4;
      this.field_29980 = var5;
      this.field_29985 = var6;
      this.field_29983 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_29984; var3 < this.field_29978; var3++) {
         int var4 = (class_1637.method_7338(this.field_29979) - var3) % class_1637.method_7338(this.field_29979) * this.field_29981;
         int var5 = var3 * this.field_29981;

         for (int var6 = 0; var6 < class_1637.method_7321(this.field_29979); var6++) {
            int var7 = (class_1637.method_7321(this.field_29979) - var6) % class_1637.method_7321(this.field_29979) * this.field_29980;
            int var8 = var6 * this.field_29980;

            for (byte var9 = 1; var9 < class_1637.method_7344(this.field_29979); var9 += 2) {
               int var10 = var4 + var7 + this.field_29985 - var9;
               int var11 = var5 + var8 + var9;
               this.field_29983[var10] = -this.field_29983[var11 + 2];
               this.field_29983[var10 - 1] = this.field_29983[var11 + 1];
            }
         }
      }
   }
}
