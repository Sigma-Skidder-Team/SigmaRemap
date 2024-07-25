package remapped;

public class class_6892 implements Runnable {
   private static String[] field_35450;

   public class_6892(class_5298 var1, int var2, int var3, float[] var4) {
      this.field_35453 = var1;
      this.field_35449 = var2;
      this.field_35452 = var3;
      this.field_35451 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_35449; var3 < this.field_35452; var3++) {
         int var4 = 2 * var3;
         int var5 = var4 + 1;
         float var6 = this.field_35451[var4] * class_5298.method_24208(this.field_35453)[var5]
            + this.field_35451[var5] * class_5298.method_24208(this.field_35453)[var4];
         this.field_35451[var4] = this.field_35451[var4] * class_5298.method_24208(this.field_35453)[var4]
            - this.field_35451[var5] * class_5298.method_24208(this.field_35453)[var5];
         this.field_35451[var5] = var6;
      }
   }
}
