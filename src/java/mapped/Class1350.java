package mapped;

public class Class1350 implements Runnable {
   private static String[] field7193;
   public final int field7194;
   public final int field7195;
   public final int field7196;
   public final float[][][] field7197;
   public final Class8026 field7198;

   public Class1350(Class8026 var1, int var2, int var3, int var4, float[][][] var5) {
      this.field7198 = var1;
      this.field7194 = var2;
      this.field7195 = var3;
      this.field7196 = var4;
      this.field7197 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7194; var3 < this.field7195; var3++) {
         int var4 = (Class8026.method27518(this.field7198) - var3) % Class8026.method27518(this.field7198);

         for (int var5 = 1; var5 < this.field7196; var5++) {
            int var6 = Class8026.method27513(this.field7198) - var5;
            this.field7197[var4][var5][Class8026.method27516(this.field7198)] = this.field7197[var3][var6][1];
            this.field7197[var3][var6][Class8026.method27516(this.field7198)] = this.field7197[var3][var6][1];
            this.field7197[var4][var5][Class8026.method27516(this.field7198) + 1] = -this.field7197[var3][var6][0];
            this.field7197[var3][var6][Class8026.method27516(this.field7198) + 1] = this.field7197[var3][var6][0];
         }
      }
   }
}
