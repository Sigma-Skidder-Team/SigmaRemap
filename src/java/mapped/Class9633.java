package mapped;

public class Class9633 {
   private static String[] field45056;
   private final long[] field45057;
   private int field45058;
   private int field45059;

   public Class9633(int var1) {
      this.field45057 = new long[var1];
   }

   public long method37554(long var1) {
      if (this.field45058 < this.field45057.length) {
         this.field45058++;
      }

      this.field45057[this.field45059] = var1;
      this.field45059 = (this.field45059 + 1) % this.field45057.length;
      long var5 = Long.MAX_VALUE;
      long var7 = Long.MIN_VALUE;
      long var9 = 0L;

      for (int var11 = 0; var11 < this.field45058; var11++) {
         long var12 = this.field45057[var11];
         var9 += var12;
         var5 = Math.min(var5, var12);
         var7 = Math.max(var7, var12);
      }

      if (this.field45058 <= 2) {
         return var9 <= 0L ? 0L : (long)this.field45058 / var9;
      } else {
         var9 -= var5 + var7;
         return var9 / (long)(this.field45058 - 2);
      }
   }
}
