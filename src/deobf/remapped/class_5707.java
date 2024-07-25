package remapped;

public class class_5707 implements Runnable {
   private static String[] field_28879;

   public class_5707(class_3381 var1, int var2, int var3, int var4, int var5, float[][][] var6) {
      this.field_28881 = var1;
      this.field_28877 = var2;
      this.field_28878 = var3;
      this.field_28880 = var4;
      this.field_28876 = var5;
      this.field_28875 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_28877; var3 < this.field_28878; var3++) {
         int var4 = (class_3381.method_15623(this.field_28881) - var3) % class_3381.method_15623(this.field_28881);

         for (int var5 = 1; var5 < this.field_28880; var5++) {
            int var6 = class_3381.method_15581(this.field_28881) - var5;

            for (int var7 = 0; var7 < class_3381.method_15629(this.field_28881); var7++) {
               int var8 = 2 * var7;
               int var9 = this.field_28876 - var8;
               this.field_28875[var4][var6][var9 % this.field_28876] = this.field_28875[var3][var5][var8];
               this.field_28875[var4][var6][(var9 + 1) % this.field_28876] = -this.field_28875[var3][var5][var8 + 1];
            }
         }
      }
   }
}
