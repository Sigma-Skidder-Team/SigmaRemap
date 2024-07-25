package remapped;

public class class_8304 implements Runnable {
   private static String[] field_42543;

   public class_8304(class_3381 var1, int var2, int var3, float[][][] var4) {
      this.field_42541 = var1;
      this.field_42542 = var2;
      this.field_42545 = var3;
      this.field_42544 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_42542; var3 < this.field_42545; var3++) {
         for (int var4 = 0; var4 < class_3381.method_15581(this.field_42541); var4++) {
            class_3381.method_15625(this.field_42541).method_24160(this.field_42544[var3][var4]);
         }
      }
   }
}
