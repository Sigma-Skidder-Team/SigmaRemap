package mapped;

public class Class638 implements Runnable {
   private static String[] field3186;
   public final int field3187;
   public final int field3188;
   public final double[][] field3189;
   public final boolean field3190;
   public final Class9186 field3191;

   public Class638(Class9186 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field3191 = var1;
      this.field3187 = var2;
      this.field3188 = var3;
      this.field3189 = var4;
      this.field3190 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3187; var3 < this.field3188; var3++) {
         Class9186.method34382(this.field3191).method33650(this.field3189[var3], this.field3190);
      }
   }
}
