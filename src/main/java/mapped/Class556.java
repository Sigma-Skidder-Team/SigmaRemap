package mapped;

public class Class556 implements Runnable {
   private static String[] field2677;
   public final int field2678;
   public final int field2679;
   public final float[][] field2680;
   public final Class8543 field2681;

   public Class556(Class8543 var1, int var2, int var3, float[][] var4) {
      this.field2681 = var1;
      this.field2678 = var2;
      this.field2679 = var3;
      this.field2680 = var4;
   }

   @Override
   public void run() {
      for (int var3 = this.field2678; var3 < this.field2679; var3++) {
         Class8543.method30434(this.field2681).method30937(this.field2680[var3]);
      }
   }
}
