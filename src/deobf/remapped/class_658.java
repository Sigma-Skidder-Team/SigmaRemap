package remapped;

public class class_658 implements Runnable {
   private static String[] field_3656;

   public class_658(class_84 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field_3654 = var1;
      this.field_3655 = var2;
      this.field_3652 = var3;
      this.field_3653 = var4;
      this.field_3651 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_3655; var3 < this.field_3652; var3++) {
         for (int var4 = 0; var4 < class_84.method_200(this.field_3654); var4++) {
            class_84.method_187(this.field_3654).method_31289(this.field_3653[var3][var4], this.field_3651);
         }
      }
   }
}
