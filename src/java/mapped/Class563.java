package mapped;

public final class Class563 implements Runnable {
   private static String[] field2724;
   public final long field2725;
   public final long field2726;
   public final float[] field2727;
   public final int field2728;
   public final Class2380 field2729;
   public final long field2730;

   public Class563(long var1, long var3, float[] var5, int var6, Class2380 var7, long var8) {
      this.field2725 = var1;
      this.field2726 = var3;
      this.field2727 = var5;
      this.field2728 = var6;
      this.field2729 = var7;
      this.field2730 = var8;
   }

   @Override
   public void run() {
      float[] var3 = new float[2];

      for (long var4 = this.field2725; var4 < this.field2726; var4++) {
         var3[0] = this.field2727[2 * (this.field2728 + (int)var4)];
         var3[1] = this.field2727[2 * (this.field2728 + (int)var4) + 1];
         this.field2729.method9714(this.field2730 + var4, var3);
      }
   }
}
