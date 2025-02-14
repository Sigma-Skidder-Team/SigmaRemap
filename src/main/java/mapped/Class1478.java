package mapped;

public class Class1478 implements Runnable {
   private static String[] field7954;
   public final int field7955;
   public final int field7956;
   public final float[][][] field7957;
   public final Class8162 field7958;

   public Class1478(Class8162 var1, int var2, int var3, float[][][] var4) {
      this.field7958 = var1;
      this.field7955 = var2;
      this.field7956 = var3;
      this.field7957 = var4;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8162.method28398(this.field7958)];

      for (int var4 = this.field7955; var4 < this.field7956; var4++) {
         for (int var5 = 0; var5 < Class8162.method28396(this.field7958); var5++) {
            for (int var6 = 0; var6 < Class8162.method28398(this.field7958); var6++) {
               var3[var6] = this.field7957[var6][var4][var5];
            }

            Class8162.method28399(this.field7958).method28455(var3);

            for (int var7 = 0; var7 < Class8162.method28398(this.field7958); var7++) {
               this.field7957[var7][var4][var5] = var3[var7];
            }
         }
      }
   }
}
