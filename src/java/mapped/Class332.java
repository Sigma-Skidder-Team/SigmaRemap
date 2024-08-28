package mapped;

public class Class332 implements Runnable {
   private static String[] field1439;
   public final int field1440;
   public final int field1441;
   public final double[][] field1442;
   public final boolean field1443;
   public final Class9615 field1444;

   public Class332(Class9615 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field1444 = var1;
      this.field1440 = var2;
      this.field1441 = var3;
      this.field1442 = var4;
      this.field1443 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field1440; var3 < this.field1441; var3++) {
         Class9615.method37423(this.field1444).method27186(this.field1442[var3], 0, this.field1443);
      }
   }
}
