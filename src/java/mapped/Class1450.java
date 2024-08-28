package mapped;

public class Class1450 implements Runnable {
   private static String[] field7792;
   public final int field7793;
   public final int field7794;
   public final float[][] field7795;
   public final boolean field7796;
   public final Class9533 field7797;

   public Class1450(Class9533 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field7797 = var1;
      this.field7793 = var2;
      this.field7794 = var3;
      this.field7795 = var4;
      this.field7796 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class9533.method36858(this.field7797)];

      for (int var4 = this.field7793; var4 < this.field7794; var4++) {
         for (int var5 = 0; var5 < Class9533.method36858(this.field7797); var5++) {
            var3[var5] = this.field7795[var5][var4];
         }

         Class9533.method36859(this.field7797).method29631(var3, this.field7796);

         for (int var6 = 0; var6 < Class9533.method36858(this.field7797); var6++) {
            this.field7795[var6][var4] = var3[var6];
         }
      }
   }
}
