package mapped;

public class Class400 implements Runnable {
   private static String[] field1717;
   public final int field1718;
   public final int field1719;
   public final double[] field1720;
   public final int field1721;
   public final Class9615 field1722;

   public Class400(Class9615 var1, int var2, int var3, double[] var4, int var5) {
      this.field1722 = var1;
      this.field1718 = var2;
      this.field1719 = var3;
      this.field1720 = var4;
      this.field1721 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field1718; var3 < this.field1719; var3++) {
         Class9615.method37423(this.field1722).method27164(this.field1720, var3 * this.field1721);
      }
   }
}
