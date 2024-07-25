package remapped;

public class class_8498 implements Runnable {
   private static String[] field_43522;

   public class_8498(class_3381 var1, int var2, int var3, float[][][] var4) {
      this.field_43518 = var1;
      this.field_43519 = var2;
      this.field_43520 = var3;
      this.field_43521 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_43519; var3 < this.field_43520; var3++) {
         for (int var4 = 0; var4 < class_3381.method_15581(this.field_43518); var4++) {
            class_3381.method_15625(this.field_43518).method_24185(this.field_43521[var3][var4]);
         }
      }
   }
}
