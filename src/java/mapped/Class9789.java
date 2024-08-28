package mapped;

public class Class9789 {
   private static String[] field45774;
   private final long[] field45775 = new long[240];
   private int field45776;
   private int field45777;
   private int field45778;

   public void method38592(long var1) {
      this.field45775[this.field45778] = var1;
      this.field45778++;
      if (this.field45778 == 240) {
         this.field45778 = 0;
      }

      if (this.field45777 >= 240) {
         this.field45776 = this.method38596(this.field45778 + 1);
      } else {
         this.field45776 = 0;
         this.field45777++;
      }
   }

   public int method38593(long var1, int var3, int var4) {
      double var7 = (double)var1 / (double)(1000000000L / (long)var4);
      return (int)(var7 * (double)var3);
   }

   public int method38594() {
      return this.field45776;
   }

   public int method38595() {
      return this.field45778;
   }

   public int method38596(int var1) {
      return var1 % 240;
   }

   public long[] method38597() {
      return this.field45775;
   }
}
