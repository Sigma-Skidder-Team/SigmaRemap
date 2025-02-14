package mapped;

public class Class1440 implements Runnable {
   private static String[] field7734;
   public final int field7735;
   public final int field7736;
   public final double[][][] field7737;
   public final Class8832 field7738;

   public Class1440(Class8832 var1, int var2, int var3, double[][][] var4) {
      this.field7738 = var1;
      this.field7735 = var2;
      this.field7736 = var3;
      this.field7737 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field7735; var3 < this.field7736; var3++) {
         for (int var4 = 0; var4 < Class8832.method31956(this.field7738); var4++) {
            Class8832.method31958(this.field7738).method33646(this.field7737[var3][var4]);
         }
      }
   }
}
