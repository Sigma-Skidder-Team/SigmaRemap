package mapped;

public class Class352 implements Runnable {
   private static String[] field1567;
   public final int field1568;
   public final int field1569;
   public final int field1570;
   public final int field1571;
   public final float[][] field1572;
   public final boolean field1573;
   public final Class8543 field1574;

   public Class352(Class8543 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field1574 = var1;
      this.field1568 = var2;
      this.field1569 = var3;
      this.field1570 = var4;
      this.field1571 = var5;
      this.field1572 = var6;
      this.field1573 = var7;
   }

   @Override
   public void run() {
      if (this.field1568 != 0) {
         if (this.field1569 != 1) {
            for (int var3 = this.field1570; var3 < Class8543.method30435(this.field1574); var3 += this.field1571) {
               Class8543.method30434(this.field1574).method30953(this.field1572[var3], 0, this.field1573);
            }
         } else {
            for (int var4 = this.field1570; var4 < Class8543.method30435(this.field1574); var4 += this.field1571) {
               Class8543.method30434(this.field1574).method30937(this.field1572[var4]);
            }
         }
      } else if (this.field1569 != -1) {
         for (int var5 = this.field1570; var5 < Class8543.method30435(this.field1574); var5 += this.field1571) {
            Class8543.method30434(this.field1574).method30933(this.field1572[var5], this.field1573);
         }
      } else {
         for (int var6 = this.field1570; var6 < Class8543.method30435(this.field1574); var6 += this.field1571) {
            Class8543.method30434(this.field1574).method30929(this.field1572[var6]);
         }
      }
   }
}
