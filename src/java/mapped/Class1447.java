package mapped;

public class Class1447 implements Runnable {
   private static String[] field7777;
   public final int field7778;
   public final int field7779;
   public final float[][][] field7780;
   public final boolean field7781;
   public final Class8162 field7782;

   public Class1447(Class8162 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field7782 = var1;
      this.field7778 = var2;
      this.field7779 = var3;
      this.field7780 = var4;
      this.field7781 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28393(this.field7782)];

      for (int var4 = this.field7778; var4 < this.field7779; var4++) {
         for (int var5 = 0; var5 < Class8162.method28396(this.field7782); var5++) {
            for (int var6 = 0; var6 < Class8162.method28393(this.field7782); var6++) {
               var3[var6] = this.field7780[var4][var6][var5];
            }

            Class8162.method28397(this.field7782).method28459(var3, this.field7781);

            for (int var7 = 0; var7 < Class8162.method28393(this.field7782); var7++) {
               this.field7780[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
