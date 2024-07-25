package remapped;

public class class_4275 implements Runnable {
   private static String[] field_20701;

   public class_4275(class_5298 var1, long var2, long var4, long var6, long var8, class_4330 var10, class_4330 var11) {
      this.field_20703 = var1;
      this.field_20706 = var2;
      this.field_20705 = var4;
      this.field_20708 = var6;
      this.field_20707 = var8;
      this.field_20704 = var10;
      this.field_20702 = var11;
   }

   @Override
   public void run() {
      if (this.field_20706 <= 0L) {
         for (long var3 = this.field_20705; var3 < this.field_20708; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field_20707 + var3;
            this.field_20704.method_36123(var5, this.field_20702.method_36133(var9) * class_5298.method_24218(this.field_20703).method_36133(var5));
            this.field_20704.method_36123(var7, -this.field_20702.method_36133(var9) * class_5298.method_24218(this.field_20703).method_36133(var7));
         }
      } else {
         for (long var11 = this.field_20705; var11 < this.field_20708; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            long var14 = this.field_20707 + var11;
            this.field_20704.method_36123(var12, this.field_20702.method_36133(var14) * class_5298.method_24218(this.field_20703).method_36133(var12));
            this.field_20704.method_36123(var13, this.field_20702.method_36133(var14) * class_5298.method_24218(this.field_20703).method_36133(var13));
         }
      }
   }
}
