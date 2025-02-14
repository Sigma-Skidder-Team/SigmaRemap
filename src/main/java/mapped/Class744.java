package mapped;

public class Class744 implements Runnable {
   private static String[] field3857;
   public final int field3858;
   public final int field3859;
   public final float[] field3860;
   public final boolean field3861;
   public final Class9533 field3862;

   public Class744(Class9533 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field3862 = var1;
      this.field3858 = var2;
      this.field3859 = var3;
      this.field3860 = var4;
      this.field3861 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3858; var3 < this.field3859; var3++) {
         Class9533.method36857(this.field3862).method29629(this.field3860, var3 * Class9533.method36856(this.field3862), this.field3861);
      }
   }
}
