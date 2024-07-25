package remapped;

public class class_9119 {
   private static String[] field_46674;
   private final long[] field_46673;
   private int field_46672;
   private int field_46671;

   public class_9119(int var1) {
      this.field_46673 = new long[var1];
   }

   public long method_41974(long var1) {
      if (this.field_46672 < this.field_46673.length) {
         this.field_46672++;
      }

      this.field_46673[this.field_46671] = var1;
      this.field_46671 = (this.field_46671 + 1) % this.field_46673.length;
      long var5 = Long.MAX_VALUE;
      long var7 = Long.MIN_VALUE;
      long var9 = 0L;

      for (int var11 = 0; var11 < this.field_46672; var11++) {
         long var12 = this.field_46673[var11];
         var9 += var12;
         var5 = Math.min(var5, var12);
         var7 = Math.max(var7, var12);
      }

      if (this.field_46672 <= 2) {
         return var9 <= 0L ? 0L : (long)this.field_46672 / var9;
      } else {
         var9 -= var5 + var7;
         return var9 / (long)(this.field_46672 - 2);
      }
   }
}
