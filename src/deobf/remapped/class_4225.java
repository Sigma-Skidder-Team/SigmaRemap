package remapped;

public class class_4225 implements Runnable {
   private static String[] field_20499;

   public class_4225(class_4993 var1, int var2, int var3, float[][] var4) {
      this.field_20500 = var1;
      this.field_20498 = var2;
      this.field_20501 = var3;
      this.field_20502 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field_20498; var3 < this.field_20501; var3++) {
         class_4993.method_22998(this.field_20500).method_24185(this.field_20502[var3]);
      }
   }
}
