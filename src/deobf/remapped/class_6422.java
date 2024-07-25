package remapped;

public class class_6422 implements Runnable {
   private static String[] field_32821;

   public class_6422(class_1637 var1, int var2, int var3, int var4, double[][][] var5, double[] var6, int var7, int var8) {
      this.field_32819 = var1;
      this.field_32822 = var2;
      this.field_32818 = var3;
      this.field_32824 = var4;
      this.field_32817 = var5;
      this.field_32820 = var6;
      this.field_32823 = var7;
      this.field_32825 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field_32822; var3 < this.field_32818; var3++) {
         int var4 = var3 * this.field_32824;

         for (int var5 = 0; var5 < class_1637.method_7321(this.field_32819); var5++) {
            System.arraycopy(this.field_32817[var3][var5], 0, this.field_32820, var4 + var5 * this.field_32823, this.field_32825);
         }
      }
   }
}
