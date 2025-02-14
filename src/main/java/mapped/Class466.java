package mapped;

public class Class466 implements Runnable {
   private static String[] field2158;
   public final int field2159;
   public final int field2160;
   public final double[] field2161;
   public final boolean field2162;
   public final Class6352 field2163;

   public Class466(Class6352 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field2163 = var1;
      this.field2159 = var2;
      this.field2160 = var3;
      this.field2161 = var4;
      this.field2162 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field2159; var3 < this.field2160; var3++) {
         int var4 = var3 * Class6352.method19327(this.field2163);

         for (int var5 = 0; var5 < Class6352.method19328(this.field2163); var5++) {
            Class6352.method19330(this.field2163).method38582(this.field2161, var4 + var5 * Class6352.method19329(this.field2163), this.field2162);
         }
      }
   }
}
