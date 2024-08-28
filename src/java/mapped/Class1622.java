package mapped;

public class Class1622 implements Runnable {
   private static String[] field8787;
   public final int field8788;
   public final int field8789;
   public final float[][][] field8790;
   public final boolean field8791;
   public final Class8026 field8792;

   public Class1622(Class8026 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field8792 = var1;
      this.field8788 = var2;
      this.field8789 = var3;
      this.field8790 = var4;
      this.field8791 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[2 * Class8026.method27513(this.field8792)];

      for (int var4 = this.field8788; var4 < this.field8789; var4++) {
         for (int var5 = 0; var5 < Class8026.method27516(this.field8792); var5++) {
            int var6 = 2 * var5;

            for (int var7 = 0; var7 < Class8026.method27513(this.field8792); var7++) {
               int var8 = 2 * var7;
               var3[var8] = this.field8790[var4][var7][var6];
               var3[var8 + 1] = this.field8790[var4][var7][var6 + 1];
            }

            Class8026.method27517(this.field8792).method30933(var3, this.field8791);

            for (int var9 = 0; var9 < Class8026.method27513(this.field8792); var9++) {
               int var10 = 2 * var9;
               this.field8790[var4][var9][var6] = var3[var10];
               this.field8790[var4][var9][var6 + 1] = var3[var10 + 1];
            }
         }
      }
   }
}
