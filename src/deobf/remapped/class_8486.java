package remapped;

public class class_8486 implements Runnable {
   private static String[] field_43485;

   public class_8486(class_3381 var1, int var2, int var3, int var4, int var5, float[] var6, int var7) {
      this.field_43488 = var1;
      this.field_43484 = var2;
      this.field_43481 = var3;
      this.field_43486 = var4;
      this.field_43483 = var5;
      this.field_43482 = var6;
      this.field_43487 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_43484];

      for (int var4 = this.field_43481; var4 >= this.field_43486; var4--) {
         int var5 = var4 * class_3381.method_15637(this.field_43488);
         int var6 = var4 * this.field_43483;

         for (int var7 = class_3381.method_15581(this.field_43488) - 1; var7 >= 0; var7--) {
            System.arraycopy(this.field_43482, var5 + var7 * class_3381.method_15616(this.field_43488), var3, 0, class_3381.method_15629(this.field_43488));
            class_3381.method_15625(this.field_43488).method_24160(var3);
            System.arraycopy(var3, 0, this.field_43482, var6 + var7 * this.field_43487, this.field_43484);
         }
      }
   }
}
