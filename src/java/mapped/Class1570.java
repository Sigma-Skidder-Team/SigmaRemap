package mapped;

public class Class1570 implements Runnable {
   private static String[] field8491;
   public final int field8492;
   public final int field8493;
   public final int field8494;
   public final double[] field8495;
   public final Class9050 field8496;

   public Class1570(Class9050 var1, int var2, int var3, int var4, double[] var5) {
      this.field8496 = var1;
      this.field8492 = var2;
      this.field8493 = var3;
      this.field8494 = var4;
      this.field8495 = var5;
   }

   @Override
   public void run() {
      int var3 = this.field8492 + Class9050.method33664(this.field8496) - 1;

      for (int var4 = this.field8493; var4 < this.field8494; var4++) {
         int var5 = this.field8492 + var4;
         double var6 = this.field8495[var5];
         int var8 = var3 - var4;
         this.field8495[var5] = this.field8495[var8];
         this.field8495[var8] = var6;
      }
   }
}
