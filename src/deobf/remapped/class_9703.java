package remapped;

public class class_9703 {
   private static String[] field_49350;
   private final long[] field_49351 = new long[240];
   private int field_49352;
   private int field_49349;
   private int field_49348;

   public void method_44836(long var1) {
      this.field_49351[this.field_49348] = var1;
      this.field_49348++;
      if (this.field_49348 == 240) {
         this.field_49348 = 0;
      }

      if (this.field_49349 >= 240) {
         this.field_49352 = this.method_44835(this.field_49348 + 1);
      } else {
         this.field_49352 = 0;
         this.field_49349++;
      }
   }

   public int method_44833(long var1, int var3, int var4) {
      double var7 = (double)var1 / (double)(1000000000L / (long)var4);
      return (int)(var7 * (double)var3);
   }

   public int method_44834() {
      return this.field_49352;
   }

   public int method_44832() {
      return this.field_49348;
   }

   public int method_44835(int var1) {
      return var1 % 240;
   }

   public long[] method_44838() {
      return this.field_49351;
   }
}
