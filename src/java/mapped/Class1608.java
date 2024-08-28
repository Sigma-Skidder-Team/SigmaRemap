package mapped;

public class Class1608 implements Runnable {
   private static String[] field8714;
   public final int field8715;
   public final int field8716;
   public final float[][] field8717;
   public final boolean field8718;
   public final Class8682 field8719;

   public Class1608(Class8682 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field8719 = var1;
      this.field8715 = var2;
      this.field8716 = var3;
      this.field8717 = var4;
      this.field8718 = var5;
   }

   @Override
   public void run() {
      float[] var3 = new float[Class8682.method31247(this.field8719)];

      for (int var4 = this.field8715; var4 < this.field8716; var4++) {
         for (int var5 = 0; var5 < Class8682.method31247(this.field8719); var5++) {
            var3[var5] = this.field8717[var5][var4];
         }

         Class8682.method31248(this.field8719).method28928(var3, this.field8718);

         for (int var6 = 0; var6 < Class8682.method31247(this.field8719); var6++) {
            this.field8717[var6][var4] = var3[var6];
         }
      }
   }
}
