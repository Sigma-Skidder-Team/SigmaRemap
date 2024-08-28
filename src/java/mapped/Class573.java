package mapped;

public class Class573 implements Runnable {
   private static String[] field2794;
   public final int field2795;
   public final int field2796;
   public final float[][] field2797;
   public final boolean field2798;
   public final Class8682 field2799;

   public Class573(Class8682 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field2799 = var1;
      this.field2795 = var2;
      this.field2796 = var3;
      this.field2797 = var4;
      this.field2798 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2795; var3 < this.field2796; var3++) {
         Class8682.method31246(this.field2799).method28924(this.field2797[var3], this.field2798);
      }
   }
}
