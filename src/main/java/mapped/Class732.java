package mapped;

public class Class732 implements Runnable {
   private static String[] field3786;
   public final int field3787;
   public final int field3788;
   public final float[][][] field3789;
   public final boolean field3790;
   public final Class8162 field3791;

   public Class732(Class8162 var1, int var2, int var3, float[][][] var4, boolean var5) {
      this.field3791 = var1;
      this.field3787 = var2;
      this.field3788 = var3;
      this.field3789 = var4;
      this.field3790 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3787; var3 < this.field3788; var3++) {
         for (int var4 = 0; var4 < Class8162.method28393(this.field3791); var4++) {
            Class8162.method28395(this.field3791).method28459(this.field3789[var3][var4], this.field3790);
         }
      }
   }
}
