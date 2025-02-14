package mapped;

public class Class409 implements Runnable {
   private static String[] field1780;
   public final int field1781;
   public final int field1782;
   public final int field1783;
   public final double[] field1784;
   public final boolean field1785;
   public final Class9186 field1786;

   public Class409(Class9186 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field1786 = var1;
      this.field1781 = var2;
      this.field1782 = var3;
      this.field1783 = var4;
      this.field1784 = var5;
      this.field1785 = var6;
   }

   @Override
   public void run() {
      if (this.field1781 != -1) {
         for (int var3 = this.field1782; var3 < Class9186.method34383(this.field1786); var3 += this.field1783) {
            Class9186.method34382(this.field1786).method33652(this.field1784, var3 * Class9186.method34381(this.field1786), this.field1785);
         }
      } else {
         for (int var4 = this.field1782; var4 < Class9186.method34383(this.field1786); var4 += this.field1783) {
            Class9186.method34382(this.field1786).method33648(this.field1784, var4 * Class9186.method34381(this.field1786));
         }
      }
   }
}
