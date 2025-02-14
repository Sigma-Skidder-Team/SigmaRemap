package mapped;

public class Class1379 implements Runnable {
   private static String[] field7367;
   public final int field7368;
   public final int field7369;
   public final float[][][] field7370;
   public final Class8026 field7371;

   public Class1379(Class8026 var1, int var2, int var3, float[][][] var4) {
      this.field7371 = var1;
      this.field7368 = var2;
      this.field7369 = var3;
      this.field7370 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field7368; var3 < this.field7369; var3++) {
         for (int var4 = 0; var4 < Class8026.method27513(this.field7371); var4++) {
            Class8026.method27515(this.field7371).method30941(this.field7370[var3][var4]);
         }
      }
   }
}
