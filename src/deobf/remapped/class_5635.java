package remapped;

public class class_5635 implements Runnable {
   private static String[] field_28586;

   public class_5635(class_5519 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field_28587 = var1;
      this.field_28588 = var2;
      this.field_28583 = var3;
      this.field_28585 = var4;
      this.field_28584 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_28588; var3 < this.field_28583; var3++) {
         class_5519.method_24991(this.field_28587).method_19203(this.field_28585, var3 * class_5519.method_24997(this.field_28587), this.field_28584);
      }
   }
}
