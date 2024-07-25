package remapped;

public class class_1901 implements Runnable {
   private static String[] field_9705;

   public class_1901(class_5298 var1, int var2, int var3, float[] var4) {
      this.field_9704 = var1;
      this.field_9708 = var2;
      this.field_9706 = var3;
      this.field_9707 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_9708; var3 < this.field_9706; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         float var6 = -this.field_9707[var4] * class_5298.method_24208(this.field_9704)[var5]
            + this.field_9707[var5] * class_5298.method_24208(this.field_9704)[var4];
         this.field_9707[var4] = this.field_9707[var4] * class_5298.method_24208(this.field_9704)[var4]
            + this.field_9707[var5] * class_5298.method_24208(this.field_9704)[var5];
         this.field_9707[var5] = var6;
      }
   }
}
