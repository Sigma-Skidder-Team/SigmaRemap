package mapped;

public class Class1493 implements Runnable {
   private static String[] field8045;
   public final int field8046;
   public final int field8047;
   public final int field8048;
   public final double[] field8049;
   public final boolean field8050;
   public final Class9330 field8051;

   public Class1493(Class9330 var1, int var2, int var3, int var4, double[] var5, boolean var6) {
      this.field8051 = var1;
      this.field8046 = var2;
      this.field8047 = var3;
      this.field8048 = var4;
      this.field8049 = var5;
      this.field8050 = var6;
   }

   @Override
   public void run() {
      if (this.field8046 != -1) {
         for (int var3 = this.field8047; var3 < Class9330.method35279(this.field8051); var3 += this.field8048) {
            Class9330.method35278(this.field8051).method38582(this.field8049, var3 * Class9330.method35277(this.field8051), this.field8050);
         }
      } else {
         for (int var4 = this.field8047; var4 < Class9330.method35279(this.field8051); var4 += this.field8048) {
            Class9330.method35278(this.field8051).method38578(this.field8049, var4 * Class9330.method35277(this.field8051), this.field8050);
         }
      }
   }
}
