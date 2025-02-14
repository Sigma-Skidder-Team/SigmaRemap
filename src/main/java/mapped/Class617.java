package mapped;

public class Class617 implements Runnable {
   private static String[] field3065;
   public final int field3066;
   public final int field3067;
   public final float[][][] field3068;
   public final Class8026 field3069;

   public Class617(Class8026 var1, int var2, int var3, float[][][] var4) {
      this.field3069 = var1;
      this.field3066 = var2;
      this.field3067 = var3;
      this.field3068 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field3066; var3 < this.field3067; var3++) {
         for (int var4 = 0; var4 < Class8026.method27513(this.field3069); var4++) {
            Class8026.method27515(this.field3069).method30929(this.field3068[var3][var4]);
         }
      }
   }
}
