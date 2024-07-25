package remapped;

public class class_6735 implements Runnable {
   private static String[] field_34778;

   public class_6735(class_5519 var1, int var2, int var3, int var4, float[] var5, boolean var6) {
      this.field_34775 = var1;
      this.field_34777 = var2;
      this.field_34773 = var3;
      this.field_34779 = var4;
      this.field_34774 = var5;
      this.field_34776 = var6;
   }

   @Override
   public void run() {
      if (this.field_34777 != -1) {
         for (int var3 = this.field_34773; var3 < class_5519.method_24995(this.field_34775); var3 += this.field_34779) {
            class_5519.method_24991(this.field_34775).method_19203(this.field_34774, var3 * class_5519.method_24997(this.field_34775), this.field_34776);
         }
      } else {
         for (int var4 = this.field_34773; var4 < class_5519.method_24995(this.field_34775); var4 += this.field_34779) {
            class_5519.method_24991(this.field_34775).method_19196(this.field_34774, var4 * class_5519.method_24997(this.field_34775), this.field_34776);
         }
      }
   }
}
