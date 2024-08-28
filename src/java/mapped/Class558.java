package mapped;

public class Class558 implements Runnable {
   private static String[] field2688;
   public final int field2689;
   public final int field2690;
   public final int field2691;
   public final int field2692;
   public final float[] field2693;
   public final float[][] field2694;
   public final Class8543 field2695;

   public Class558(Class8543 var1, int var2, int var3, int var4, int var5, float[] var6, float[][] var7) {
      this.field2695 = var1;
      this.field2689 = var2;
      this.field2690 = var3;
      this.field2691 = var4;
      this.field2692 = var5;
      this.field2693 = var6;
      this.field2694 = var7;
   }

   @Override
   public void run() {
      for (int var3 = this.field2689; var3 < this.field2690; var3++) {
         int var4 = 2 * var3;

         for (int var5 = 0; var5 < this.field2691; var5++) {
            int var6 = 2 * var5;
            int var7 = var3 * this.field2692 + var6;
            this.field2693[var7] = this.field2694[var5][var4];
            this.field2693[var7 + 1] = this.field2694[var5][var4 + 1];
         }
      }
   }
}
