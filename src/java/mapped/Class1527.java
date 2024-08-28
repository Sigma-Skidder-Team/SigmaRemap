package mapped;

public class Class1527 implements Runnable {
   private static String[] field8276;
   public final int field8277;
   public final int field8278;
   public final double[] field8279;
   public final boolean field8280;
   public final Class6352 field8281;

   public Class1527(Class6352 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field8281 = var1;
      this.field8277 = var2;
      this.field8278 = var3;
      this.field8279 = var4;
      this.field8280 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field8277; var3 < this.field8278; var3++) {
         int var4 = var3 * Class6352.method19327(this.field8281);

         for (int var5 = 0; var5 < Class6352.method19328(this.field8281); var5++) {
            Class6352.method19330(this.field8281).method38578(this.field8279, var4 + var5 * Class6352.method19329(this.field8281), this.field8280);
         }
      }
   }
}
