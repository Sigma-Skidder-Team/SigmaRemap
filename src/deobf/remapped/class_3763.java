package remapped;

public class class_3763 implements Runnable {
   private static String[] field_18397;

   public class_3763(class_2817 var1, int var2, int var3, int var4, float[][] var5, boolean var6) {
      this.field_18401 = var1;
      this.field_18398 = var2;
      this.field_18403 = var3;
      this.field_18400 = var4;
      this.field_18399 = var5;
      this.field_18402 = var6;
   }

   @Override
   public void run() {
      if (this.field_18398 != -1) {
         for (int var3 = this.field_18403; var3 < class_2817.method_12821(this.field_18401); var3 += this.field_18400) {
            class_2817.method_12831(this.field_18401).method_17790(this.field_18399[var3], this.field_18402);
         }
      } else {
         for (int var4 = this.field_18403; var4 < class_2817.method_12821(this.field_18401); var4 += this.field_18400) {
            class_2817.method_12831(this.field_18401).method_17785(this.field_18399[var4]);
         }
      }
   }
}
