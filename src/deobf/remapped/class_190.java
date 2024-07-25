package remapped;

public class class_190 implements Runnable {
   private static String[] field_633;

   public class_190(class_3381 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_636 = var1;
      this.field_632 = var2;
      this.field_631 = var3;
      this.field_634 = var4;
      this.field_635 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_632; var3 < this.field_631; var3++) {
         for (int var4 = 0; var4 < class_3381.method_15581(this.field_636); var4++) {
            class_3381.method_15625(this.field_636).method_24216(this.field_634[var3][var4], this.field_635);
         }
      }
   }
}
