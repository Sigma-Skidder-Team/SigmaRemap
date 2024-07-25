package remapped;

public class class_8322 implements Runnable {
   private static String[] field_42625;

   public class_8322(class_3381 var1, int var2, int var3, int var4, float[][][] var5) {
      this.field_42627 = var1;
      this.field_42626 = var2;
      this.field_42624 = var3;
      this.field_42628 = var4;
      this.field_42629 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_42626; var3 < this.field_42624; var3++) {
         int var4 = (class_3381.method_15623(this.field_42627) - var3) % class_3381.method_15623(this.field_42627);

         for (int var5 = 0; var5 < class_3381.method_15581(this.field_42627); var5++) {
            int var6 = (class_3381.method_15581(this.field_42627) - var5) % class_3381.method_15581(this.field_42627);

            for (byte var7 = 1; var7 < class_3381.method_15629(this.field_42627); var7 += 2) {
               int var8 = this.field_42628 - var7;
               this.field_42629[var4][var6][var8] = -this.field_42629[var3][var5][var7 + 2];
               this.field_42629[var4][var6][var8 - 1] = this.field_42629[var3][var5][var7 + 1];
            }
         }
      }
   }
}
