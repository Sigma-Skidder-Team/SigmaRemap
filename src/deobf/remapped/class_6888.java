package remapped;

public class class_6888 implements Runnable {
   private static String[] field_35440;

   public class_6888(class_7963 var1, int var2, int var3, int var4, double[][] var5, boolean var6) {
      this.field_35444 = var1;
      this.field_35439 = var2;
      this.field_35438 = var3;
      this.field_35442 = var4;
      this.field_35441 = var5;
      this.field_35443 = var6;
   }

   @Override
   public void run() {
      if (this.field_35439 != -1) {
         for (int var3 = this.field_35438; var3 < class_7963.method_36040(this.field_35444); var3 += this.field_35442) {
            class_7963.method_36036(this.field_35444).method_44821(this.field_35441[var3], this.field_35443);
         }
      } else {
         for (int var4 = this.field_35438; var4 < class_7963.method_36040(this.field_35444); var4 += this.field_35442) {
            class_7963.method_36036(this.field_35444).method_44816(this.field_35441[var4], this.field_35443);
         }
      }
   }
}
