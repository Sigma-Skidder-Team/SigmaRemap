package remapped;

public class class_8158 implements Runnable {
   private static String[] field_41802;

   public class_8158(class_7380 var1, int var2, int var3, double[] var4) {
      this.field_41800 = var1;
      this.field_41803 = var2;
      this.field_41804 = var3;
      this.field_41801 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_41803; var3 < this.field_41804; var3++) {
         class_7380.method_33625(this.field_41800).method_31276(this.field_41801, var3 * class_7380.method_33621(this.field_41800));
      }
   }
}
