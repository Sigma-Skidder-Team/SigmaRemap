package remapped;

public class class_3150 implements Runnable {
   private static String[] field_15666;

   public class_3150(class_1637 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_15663 = var1;
      this.field_15668 = var2;
      this.field_15664 = var4;
      this.field_15665 = var6;
      this.field_15667 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_15668; var3 < this.field_15664; var3++) {
         long var5 = var3 * class_1637.method_7342(this.field_15663);

         for (long var7 = 0L; var7 < class_1637.method_7327(this.field_15663); var7++) {
            class_1637.method_7310(this.field_15663).method_15033(this.field_15665, var5 + var7 * class_1637.method_7303(this.field_15663), this.field_15667);
         }
      }
   }
}
