package mapped;

public class Class1486 implements Runnable {
   private static String[] field7998;
   public final int field7999;
   public final int field8000;
   public final double[] field8001;
   public final boolean field8002;
   public final Class9055 field8003;

   public Class1486(Class9055 var1, int var2, int var3, double[] var4, boolean var5) {
      this.field8003 = var1;
      this.field7999 = var2;
      this.field8000 = var3;
      this.field8001 = var4;
      this.field8002 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field7999; var3 < this.field8000; var3++) {
         Class9055.method33698(this.field8003).method33658(this.field8001, var3 * Class9055.method33697(this.field8003), this.field8002);
      }
   }
}
