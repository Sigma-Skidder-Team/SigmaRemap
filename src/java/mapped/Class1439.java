package mapped;

public class Class1439 implements Runnable {
   private static String[] field7728;
   public final int field7729;
   public final int field7730;
   public final int field7731;
   public final float[][][] field7732;
   public final Class8026 field7733;

   public Class1439(Class8026 var1, int var2, int var3, int var4, float[][][] var5) {
      this.field7733 = var1;
      this.field7729 = var2;
      this.field7730 = var3;
      this.field7731 = var4;
      this.field7732 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7729; var3 < this.field7730; var3++) {
         int var4 = (Class8026.method27518(this.field7733) - var3) % Class8026.method27518(this.field7733);

         for (int var5 = 0; var5 < Class8026.method27513(this.field7733); var5++) {
            int var6 = (Class8026.method27513(this.field7733) - var5) % Class8026.method27513(this.field7733);

            for (int var7 = 1; var7 < Class8026.method27516(this.field7733); var7 += 2) {
               int var8 = this.field7731 - var7;
               this.field7732[var4][var6][var8] = -this.field7732[var3][var5][var7 + 2];
               this.field7732[var4][var6][var8 - 1] = this.field7732[var3][var5][var7 + 1];
            }
         }
      }
   }
}
