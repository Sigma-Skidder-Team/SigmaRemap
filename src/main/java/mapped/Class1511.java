package mapped;

public class Class1511 implements Runnable {
   private static String[] field8169;
   public final int field8170;
   public final int field8171;
   public final double[] field8172;
   public final boolean field8173;
   public final Class9186 field8174;

   public Class1511(Class9186 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field8174 = var1;
      this.field8170 = var2;
      this.field8171 = var3;
      this.field8172 = var4;
      this.field8173 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8170; var3 < this.field8171; var3++) {
         Class9186.method34382(this.field8174).method33652(this.field8172, var3 * Class9186.method34381(this.field8174), this.field8173);
      }
   }
}
