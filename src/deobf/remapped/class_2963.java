package remapped;

public class class_2963 implements Runnable {
   private static String[] field_14460;

   public class_2963(class_9035 var1, int var2, int var3, double[][] var4, double[][] var5) {
      this.field_14458 = var1;
      this.field_14459 = var2;
      this.field_14463 = var3;
      this.field_14462 = var4;
      this.field_14461 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_14459; var3 < this.field_14463; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < class_9035.method_41470(this.field_14458); var5++) {
            int var6 = 2 * var5;
            this.field_14462[var3][var6] = this.field_14461[var5][var4];
            this.field_14462[var3][var6 + 1] = this.field_14461[var5][var4 + 1];
         }

         class_9035.method_41455(this.field_14458).method_15028(this.field_14462[var3]);
      }
   }
}
