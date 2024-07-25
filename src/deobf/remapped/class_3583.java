package remapped;

public class class_3583 implements Runnable {
   private static String[] field_17591;

   public class_3583(class_6842 var1, int var2, long var3, int var5, class_1702 var6, boolean var7) {
      this.field_17590 = var1;
      this.field_17586 = var2;
      this.field_17587 = var3;
      this.field_17585 = var5;
      this.field_17588 = var6;
      this.field_17589 = var7;
   }

   @Override
   public void run() {
      if (this.field_17586 != -1) {
         for (long var3 = this.field_17587; var3 < (long)class_6842.method_31358(this.field_17590); var3 += (long)this.field_17585) {
            class_6842.method_31356(this.field_17590).method_31286(this.field_17588, var3 * class_6842.method_31357(this.field_17590), this.field_17589);
         }
      } else {
         for (long var5 = this.field_17587; var5 < class_6842.method_31374(this.field_17590); var5 += (long)this.field_17585) {
            class_6842.method_31356(this.field_17590).method_31292(this.field_17588, var5 * class_6842.method_31357(this.field_17590), this.field_17589);
         }
      }
   }
}
