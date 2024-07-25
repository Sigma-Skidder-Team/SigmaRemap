package remapped;

public class class_2079 implements Runnable {
   private static String[] field_10465;

   public class_2079(class_84 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_10463 = var1;
      this.field_10467 = var2;
      this.field_10468 = var3;
      this.field_10466 = var4;
      this.field_10464 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_10467; var3 < this.field_10468; var3++) {
         for (int var4 = 0; var4 < class_84.method_200(this.field_10463); var4++) {
            class_84.method_187(this.field_10463).method_31295(this.field_10466[var3][var4], this.field_10464);
         }
      }
   }
}
