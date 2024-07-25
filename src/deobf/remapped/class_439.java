package remapped;

public class class_439 implements Runnable {
   private static String[] field_1839;

   public class_439(class_9035 var1, int var2, int var3, double[][] var4, int var5, int var6, int var7) {
      this.field_1837 = var1;
      this.field_1834 = var2;
      this.field_1836 = var3;
      this.field_1838 = var4;
      this.field_1832 = var5;
      this.field_1835 = var6;
      this.field_1833 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field_1834; var3 < this.field_1836; var3++) {
         int var4 = class_9035.method_41470(this.field_1837) - var3;
         this.field_1838[var3][class_9035.method_41431(this.field_1837)] = this.field_1838[var4][1];
         this.field_1838[var3][class_9035.method_41431(this.field_1837) + 1] = -this.field_1838[var4][0];
      }

      for (int var7 = this.field_1834; var7 < this.field_1836; var7++) {
         int var9 = class_9035.method_41470(this.field_1837) - var7;

         for (int var5 = class_9035.method_41431(this.field_1837) + 2; var5 < this.field_1832; var5 += 2) {
            int var6 = this.field_1832 - var5;
            this.field_1838[var7][var5] = this.field_1838[var9][var6];
            this.field_1838[var7][var5 + 1] = -this.field_1838[var9][var6 + 1];
         }
      }

      for (int var8 = this.field_1835; var8 < this.field_1833; var8++) {
         int var10 = (class_9035.method_41470(this.field_1837) - var8) % class_9035.method_41470(this.field_1837);

         for (byte var11 = 0; var11 < this.field_1832; var11 += 2) {
            int var12 = (this.field_1832 - var11) % this.field_1832;
            this.field_1838[var10][var12] = this.field_1838[var8][var11];
            this.field_1838[var10][var12 + 1] = -this.field_1838[var8][var11 + 1];
         }
      }
   }
}
