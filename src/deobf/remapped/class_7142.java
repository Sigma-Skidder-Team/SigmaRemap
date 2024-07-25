package remapped;

public class class_7142 implements Runnable {
   private static String[] field_36790;

   public class_7142(class_2817 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_36792 = var1;
      this.field_36791 = var2;
      this.field_36794 = var3;
      this.field_36793 = var4;
      this.field_36789 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_36791; var3 < this.field_36794; var3++) {
         class_2817.method_12831(this.field_36792).method_17790(this.field_36793[var3], this.field_36789);
      }
   }
}
