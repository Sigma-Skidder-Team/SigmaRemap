package mapped;

public class Class588 implements Runnable {
   private static String[] field2882;
   public final int field2883;
   public final int field2884;
   public final double[][][] field2885;
   public final boolean field2886;
   public final Class6352 field2887;

   public Class588(Class6352 var1, int var2, int var3, double[][][] var4, boolean var5) {
      this.field2887 = var1;
      this.field2883 = var2;
      this.field2884 = var3;
      this.field2885 = var4;
      this.field2886 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2883; var3 < this.field2884; var3++) {
         for (int var4 = 0; var4 < Class6352.method19328(this.field2887); var4++) {
            Class6352.method19330(this.field2887).method38580(this.field2885[var3][var4], this.field2886);
         }
      }
   }
}
