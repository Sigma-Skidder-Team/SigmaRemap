package remapped;

public class class_2347 implements Runnable {
   private static String[] field_11721;

   public class_2347(class_9035 var1, int var2, int var3, double[][] var4, double[] var5) {
      this.field_11716 = var1;
      this.field_11717 = var2;
      this.field_11720 = var3;
      this.field_11718 = var4;
      this.field_11719 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_11717; var3 < this.field_11720; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_9035.method_41470(this.field_11716); var5++) {
            int var6 = 2 * var5;
            int var7 = var5 * class_9035.method_41431(this.field_11716) + var4;
            this.field_11718[var3][var6] = this.field_11719[var7];
            this.field_11718[var3][var6 + 1] = this.field_11719[var7 + 1];
         }

         class_9035.method_41455(this.field_11716).method_15028(this.field_11718[var3]);
      }
   }
}
