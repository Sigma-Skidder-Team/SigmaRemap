package remapped;

public class class_4837 implements Runnable {
   private static String[] field_24142;

   public class_4837(class_4993 var1, int var2, int var3, float[] var4) {
      this.field_24141 = var1;
      this.field_24140 = var2;
      this.field_24143 = var3;
      this.field_24139 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_24140; var3 < this.field_24143; var3++) {
         class_4993.method_22998(this.field_24141).method_24205(this.field_24139, var3 * class_4993.method_22972(this.field_24141));
      }
   }
}
