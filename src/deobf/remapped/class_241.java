package remapped;

public class class_241 implements Runnable {
   private static String[] field_820;

   public class_241(class_3101 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_821 = var1;
      this.field_823 = var2;
      this.field_824 = var3;
      this.field_822 = var4;
      this.field_819 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_823; var3 < this.field_824; var3++) {
         int var4 = var3 * class_3101.method_14211(this.field_821);

         for (int var5 = 0; var5 < class_3101.method_14204(this.field_821); var5++) {
            class_3101.method_14195(this.field_821).method_19196(this.field_822, var4 + var5 * class_3101.method_14196(this.field_821), this.field_819);
         }
      }
   }
}
