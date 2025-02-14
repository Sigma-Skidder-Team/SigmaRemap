package mapped;

public class Class1417 implements Runnable {
   private static String[] field7591;
   public final int field7592;
   public final int field7593;
   public final float[][][] field7594;
   public final boolean field7595;
   public final Class7824 field7596;

   public Class1417(Class7824 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field7596 = var1;
      this.field7592 = var2;
      this.field7593 = var3;
      this.field7594 = var4;
      this.field7595 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class7824.method26180(this.field7596)];

      for (int var4 = this.field7592; var4 < this.field7593; var4++) {
         for (int var5 = 0; var5 < Class7824.method26183(this.field7596); var5++) {
            for (int var6 = 0; var6 < Class7824.method26180(this.field7596); var6++) {
               var3[var6] = this.field7594[var4][var6][var5];
            }

            Class7824.method26184(this.field7596).method29627(var3, this.field7595);

            for (int var7 = 0; var7 < Class7824.method26180(this.field7596); var7++) {
               this.field7594[var4][var7][var5] = var3[var7];
            }
         }
      }
   }
}
