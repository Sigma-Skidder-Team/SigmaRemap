package mapped;

public class Class1413 implements Runnable {
   private static String[] field7569;
   public final int field7570;
   public final int field7571;
   public final float[] field7572;
   public final float[][][] field7573;
   public final Class8026 field7574;

   public Class1413(Class8026 var1, int var2, int var3, float[] var4, float[][][] var5) {
      this.field7574 = var1;
      this.field7570 = var2;
      this.field7571 = var3;
      this.field7572 = var4;
      this.field7573 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7570; var3 < this.field7571; var3++) {
         int var4 = var3 * Class8026.method27512(this.field7574);

         for (int var5 = 0; var5 < Class8026.method27513(this.field7574); var5++) {
            System.arraycopy(
               this.field7572, var4 + var5 * Class8026.method27514(this.field7574), this.field7573[var3][var5], 0, Class8026.method27516(this.field7574)
            );
            Class8026.method27515(this.field7574).method30941(this.field7573[var3][var5]);
         }
      }
   }
}
