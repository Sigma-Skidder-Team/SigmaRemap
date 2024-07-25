package remapped;

public class class_9723 implements Runnable {
   private static String[] field_49428;

   public class_9723(class_9035 var1, int var2, int var3, int var4, int var5, double[][] var6, boolean var7) {
      this.field_49426 = var1;
      this.field_49430 = var2;
      this.field_49433 = var3;
      this.field_49432 = var4;
      this.field_49431 = var5;
      this.field_49427 = var6;
      this.field_49429 = var7;
   }

   @Override
   public void run() {
      if (this.field_49430 != 0) {
         if (this.field_49433 != 1) {
            for (int var3 = this.field_49432; var3 < class_9035.method_41470(this.field_49426); var3 += this.field_49431) {
               class_9035.method_41463(this.field_49426).method_15023(this.field_49427[var3], this.field_49429);
            }
         } else {
            for (int var4 = this.field_49432; var4 < class_9035.method_41470(this.field_49426); var4 += this.field_49431) {
               class_9035.method_41463(this.field_49426).method_15044(this.field_49427[var4]);
            }
         }
      } else if (this.field_49433 != -1) {
         for (int var5 = this.field_49432; var5 < class_9035.method_41470(this.field_49426); var5 += this.field_49431) {
            class_9035.method_41463(this.field_49426).method_15036(this.field_49427[var5], this.field_49429);
         }
      } else {
         for (int var6 = this.field_49432; var6 < class_9035.method_41470(this.field_49426); var6 += this.field_49431) {
            class_9035.method_41463(this.field_49426).method_15028(this.field_49427[var6]);
         }
      }
   }
}
