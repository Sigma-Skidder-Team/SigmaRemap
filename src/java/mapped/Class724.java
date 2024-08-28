package mapped;

public class Class724 implements Runnable {
   private static String[] field3731;
   public final int field3732;
   public final int field3733;
   public final double[][][] field3734;
   public final boolean field3735;
   public final Class3612 field3736;

   public Class724(Class3612 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field3736 = var1;
      this.field3732 = var2;
      this.field3733 = var3;
      this.field3734 = var4;
      this.field3735 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field3732; var3 < this.field3733; var3++) {
         for (int var4 = 0; var4 < Class3612.method12221(this.field3736); var4++) {
            Class3612.method12223(this.field3736).method33656(this.field3734[var3][var4], this.field3735);
         }
      }
   }
}
