package mapped;

public class Class1454 implements Runnable {
   private static String[] field7816;
   public final int field7817;
   public final int field7818;
   public final float[][] field7819;
   public final boolean field7820;
   public final Class9533 field7821;

   public Class1454(Class9533 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field7821 = var1;
      this.field7817 = var2;
      this.field7818 = var3;
      this.field7819 = var4;
      this.field7820 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class9533.method36858(this.field7821)];

      for (int var4 = this.field7817; var4 < this.field7818; var4++) {
         for (int var5 = 0; var5 < Class9533.method36858(this.field7821); var5++) {
            var3[var5] = this.field7819[var5][var4];
         }

         Class9533.method36859(this.field7821).method29627(var3, this.field7820);

         for (int var6 = 0; var6 < Class9533.method36858(this.field7821); var6++) {
            this.field7819[var6][var4] = var3[var6];
         }
      }
   }
}
