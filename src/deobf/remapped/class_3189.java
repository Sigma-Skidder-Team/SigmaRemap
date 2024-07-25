package remapped;

public class class_3189 implements Runnable {
   private static String[] field_15923;

   public class_3189(class_3281 var1, int var2, int var3, double[] var4, int var5, double[] var6) {
      this.field_15926 = var1;
      this.field_15924 = var2;
      this.field_15928 = var3;
      this.field_15929 = var4;
      this.field_15927 = var5;
      this.field_15925 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_15924; var3 < this.field_15928; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field_15929[this.field_15927 + var3] = class_3281.method_15032(this.field_15926)[var4] * this.field_15925[var4]
            - class_3281.method_15032(this.field_15926)[var5] * this.field_15925[var5];
      }
   }
}
