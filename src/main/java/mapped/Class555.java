package mapped;

public class Class555 implements Runnable {
   private static String[] field2668;
   public final int field2669;
   public final int field2670;
   public final int field2671;
   public final float[][][] field2672;
   public final float[] field2673;
   public final int field2674;
   public final int field2675;
   public final Class8026 field2676;

   public Class555(Class8026 var1, int var2, int var3, int var4, float[][][] var5, float[] var6, int var7, int var8) {
      this.field2676 = var1;
      this.field2669 = var2;
      this.field2670 = var3;
      this.field2671 = var4;
      this.field2672 = var5;
      this.field2673 = var6;
      this.field2674 = var7;
      this.field2675 = var8;
   }

   @Override
   public void run() {
      for (int var3 = this.field2669; var3 < this.field2670; var3++) {
         int var4 = var3 * this.field2671;

         for (int var5 = 0; var5 < Class8026.method27513(this.field2676); var5++) {
            System.arraycopy(this.field2672[var3][var5], 0, this.field2673, var4 + var5 * this.field2674, this.field2675);
         }
      }
   }
}
