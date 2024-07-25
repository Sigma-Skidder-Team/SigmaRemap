package remapped;

public class class_6873 implements Runnable {
   private static String[] field_35403;

   public class_6873(class_9035 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field_35401 = var1;
      this.field_35404 = var2;
      this.field_35405 = var3;
      this.field_35398 = var4;
      this.field_35399 = var5;
      this.field_35400 = var6;
      this.field_35402 = var7;
   }

   @Override
   public void run() {
      if (this.field_35404 != 0) {
         if (this.field_35405 != 1) {
            for (int var3 = this.field_35398; var3 < class_9035.method_41470(this.field_35401); var3 += this.field_35399) {
               class_9035.method_41463(this.field_35401).method_14991(this.field_35400[var3], 0, this.field_35402);
            }
         } else {
            for (int var4 = this.field_35398; var4 < class_9035.method_41470(this.field_35401); var4 += this.field_35399) {
               class_9035.method_41463(this.field_35401).method_15044(this.field_35400[var4]);
            }
         }
      } else if (this.field_35405 != -1) {
         for (int var5 = this.field_35398; var5 < class_9035.method_41470(this.field_35401); var5 += this.field_35399) {
            class_9035.method_41463(this.field_35401).method_15036(this.field_35400[var5], this.field_35402);
         }
      } else {
         for (int var6 = this.field_35398; var6 < class_9035.method_41470(this.field_35401); var6 += this.field_35399) {
            class_9035.method_41463(this.field_35401).method_15028(this.field_35400[var6]);
         }
      }
   }
}
