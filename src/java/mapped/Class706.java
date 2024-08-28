package mapped;

public class Class706 implements Runnable {
   private static String[] field3615;
   public final int field3616;
   public final int field3617;
   public final float[][] field3618;
   public final boolean field3619;
   public final Class9533 field3620;

   public Class706(Class9533 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field3620 = var1;
      this.field3616 = var2;
      this.field3617 = var3;
      this.field3618 = var4;
      this.field3619 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3616; var3 < this.field3617; var3++) {
         Class9533.method36857(this.field3620).method29627(this.field3618[var3], this.field3619);
      }
   }
}
