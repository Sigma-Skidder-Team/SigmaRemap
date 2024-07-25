package remapped;

public class class_9277 implements Runnable {
   private static String[] field_47313;

   public class_9277(class_9697 var1, int var2, int var3, int var4, double[] var5, double[] var6) {
      this.field_47318 = var1;
      this.field_47315 = var2;
      this.field_47317 = var3;
      this.field_47314 = var4;
      this.field_47319 = var5;
      this.field_47316 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_47315; var3 < this.field_47317; var3++) {
         int var4 = 2 * var3;
         int var5 = this.field_47314 + var3;
         this.field_47319[var5] = class_9697.method_44817(this.field_47318)[var4] * this.field_47316[var4]
            - class_9697.method_44817(this.field_47318)[var4 + 1] * this.field_47316[var4 + 1];
      }
   }
}
