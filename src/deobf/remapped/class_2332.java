package remapped;

public class class_2332 implements Runnable {
   private static String[] field_11643;

   public class_2332(class_5298 var1, int var2, int var3, float[] var4, int var5, float[] var6) {
      this.field_11647 = var1;
      this.field_11648 = var2;
      this.field_11645 = var3;
      this.field_11649 = var4;
      this.field_11646 = var5;
      this.field_11644 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field_11648; var3 < this.field_11645; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         this.field_11649[this.field_11646 + var3] = class_5298.method_24225(this.field_11647)[var4] * this.field_11644[var4]
            - class_5298.method_24225(this.field_11647)[var5] * this.field_11644[var5];
      }
   }
}
