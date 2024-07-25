package remapped;

public class class_6022 implements Runnable {
   private static String[] field_30662;

   public class_6022(class_573 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_30664 = var1;
      this.field_30665 = var2;
      this.field_30666 = var3;
      this.field_30663 = var4;
      this.field_30667 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_30665; var3 < this.field_30666; var3++) {
         for (int var4 = 0; var4 < class_573.method_2721(this.field_30664); var4++) {
            class_573.method_2736(this.field_30664).method_44821(this.field_30663[var3][var4], this.field_30667);
         }
      }
   }
}
