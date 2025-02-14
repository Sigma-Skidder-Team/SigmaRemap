package mapped;

public class Class559 implements Runnable {
   private static String[] field2696;
   public final int field2697;
   public final int field2698;
   public final float[] field2699;
   public final boolean field2700;
   public final Class8682 field2701;

   public Class559(Class8682 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field2701 = var1;
      this.field2697 = var2;
      this.field2698 = var3;
      this.field2699 = var4;
      this.field2700 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8682.method31247(this.field2701)];

      for (int var4 = this.field2697; var4 < this.field2698; var4++) {
         for (int var5 = 0; var5 < Class8682.method31247(this.field2701); var5++) {
            var3[var5] = this.field2699[var5 * Class8682.method31245(this.field2701) + var4];
         }

         Class8682.method31248(this.field2701).method28928(var3, this.field2700);

         for (int var6 = 0; var6 < Class8682.method31247(this.field2701); var6++) {
            this.field2699[var6 * Class8682.method31245(this.field2701) + var4] = var3[var6];
         }
      }
   }
}
