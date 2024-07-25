package remapped;

public class class_6002 implements Runnable {
   private static String[] field_30571;

   public class_6002(class_3381 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_30573 = var1;
      this.field_30574 = var2;
      this.field_30570 = var3;
      this.field_30569 = var4;
      this.field_30572 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_30574; var3 < this.field_30570; var3++) {
         int var4 = var3 * class_3381.method_15637(this.field_30573);

         for (int var5 = 0; var5 < class_3381.method_15581(this.field_30573); var5++) {
            class_3381.method_15625(this.field_30573).method_24215(this.field_30569, var4 + var5 * class_3381.method_15616(this.field_30573), this.field_30572);
         }
      }
   }
}
