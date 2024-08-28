package mapped;

public class Class641 implements Runnable {
   private static String[] field3205;
   public final int field3206;
   public final int field3207;
   public final float[] field3208;
   public final boolean field3209;
   public final Class7821 field3210;

   public Class641(Class7821 var1, int var2, int var3, float[] var4, boolean var5) {
      this.field3210 = var1;
      this.field3206 = var2;
      this.field3207 = var3;
      this.field3208 = var4;
      this.field3209 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7821.method26151(this.field3210)];

      for (int var4 = this.field3206; var4 < this.field3207; var4++) {
         for (int var5 = 0; var5 < Class7821.method26151(this.field3210); var5++) {
            var3[var5] = this.field3208[var5 * Class7821.method26149(this.field3210) + var4];
         }

         Class7821.method26152(this.field3210).method28459(var3, this.field3209);

         for (int var6 = 0; var6 < Class7821.method26151(this.field3210); var6++) {
            this.field3208[var6 * Class7821.method26149(this.field3210) + var4] = var3[var6];
         }
      }
   }
}
