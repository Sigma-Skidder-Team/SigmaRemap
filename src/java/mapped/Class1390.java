package mapped;

public class Class1390 implements Runnable {
   private static String[] field7426;
   public final int field7427;
   public final int field7428;
   public final float[][][] field7429;
   public final Class8162 field7430;

   public Class1390(Class8162 var1, int var2, int var3, float[][][] var4) {
      this.field7430 = var1;
      this.field7427 = var2;
      this.field7428 = var3;
      this.field7429 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field7427; var3 < this.field7428; var3++) {
         for (int var4 = 0; var4 < Class8162.method28393(this.field7430); var4++) {
            Class8162.method28395(this.field7430).method28455(this.field7429[var3][var4]);
         }
      }
   }
}
