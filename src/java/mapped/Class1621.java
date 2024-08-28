package mapped;

public class Class1621 implements Runnable {
   private static String[] field8780;
   public final int field8781;
   public final int field8782;
   public final int field8783;
   public final int field8784;
   public final float[][][] field8785;
   public final Class8026 field8786;

   public Class1621(Class8026 var1, int var2, int var3, int var4, int var5, float[][][] var6) {
      this.field8786 = var1;
      this.field8781 = var2;
      this.field8782 = var3;
      this.field8783 = var4;
      this.field8784 = var5;
      this.field8785 = var6;
   }

   @Override
   public void run() {
      for (int var3 = this.field8781; var3 < this.field8782; var3++) {
         int var4 = (Class8026.method27518(this.field8786) - var3) % Class8026.method27518(this.field8786);

         for (int var5 = 1; var5 < this.field8783; var5++) {
            int var6 = Class8026.method27513(this.field8786) - var5;

            for (int var7 = 0; var7 < Class8026.method27516(this.field8786); var7++) {
               int var8 = 2 * var7;
               int var9 = this.field8784 - var8;
               this.field8785[var4][var6][var9 % this.field8784] = this.field8785[var3][var5][var8];
               this.field8785[var4][var6][(var9 + 1) % this.field8784] = -this.field8785[var3][var5][var8 + 1];
            }
         }
      }
   }
}
