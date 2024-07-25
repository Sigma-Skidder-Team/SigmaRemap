package remapped;

public class class_3856 implements Runnable {
   private static String[] field_18803;

   public class_3856(class_3101 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field_18807 = var1;
      this.field_18808 = var2;
      this.field_18805 = var3;
      this.field_18806 = var4;
      this.field_18804 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_18808; var3 < this.field_18805; var3++) {
         for (int var4 = 0; var4 < class_3101.method_14204(this.field_18807); var4++) {
            class_3101.method_14195(this.field_18807).method_19197(this.field_18806[var3][var4], this.field_18804);
         }
      }
   }
}
