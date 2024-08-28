package mapped;

public class Class616 implements Runnable {
   private static String[] field3059;
   public final int field3060;
   public final int field3061;
   public final float[][] field3062;
   public final boolean field3063;
   public final Class8682 field3064;

   public Class616(Class8682 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field3064 = var1;
      this.field3060 = var2;
      this.field3061 = var3;
      this.field3062 = var4;
      this.field3063 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8682.method31247(this.field3064)];

      for (int var4 = this.field3060; var4 < this.field3061; var4++) {
         for (int var5 = 0; var5 < Class8682.method31247(this.field3064); var5++) {
            var3[var5] = this.field3062[var5][var4];
         }

         Class8682.method31248(this.field3064).method28924(var3, this.field3063);

         for (int var6 = 0; var6 < Class8682.method31247(this.field3064); var6++) {
            this.field3062[var6][var4] = var3[var6];
         }
      }
   }
}
