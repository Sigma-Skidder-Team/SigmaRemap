package remapped;

public class class_745 implements Runnable {
   private static String[] field_4053;

   public class_745(class_3281 var1, long var2, long var4, long var6, long var8, class_1702 var10, class_1702 var11) {
      this.field_4051 = var1;
      this.field_4055 = var2;
      this.field_4050 = var4;
      this.field_4049 = var6;
      this.field_4052 = var8;
      this.field_4054 = var10;
      this.field_4048 = var11;
   }

   @Override
   public void run() {
      if (this.field_4055 <= 0L) {
         for (long var3 = this.field_4050; var3 < this.field_4049; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field_4052 + var3;
            this.field_4054.method_36114(var5, this.field_4048.method_36107(var9) * class_3281.method_15000(this.field_4051).method_36107(var5));
            this.field_4054.method_36114(var7, -this.field_4048.method_36107(var9) * class_3281.method_15000(this.field_4051).method_36107(var7));
         }
      } else {
         for (long var11 = this.field_4050; var11 < this.field_4049; var11++) {
            long var12 = 2L * var11;
            long var13 = var12 + 1L;
            long var14 = this.field_4052 + var11;
            this.field_4054.method_36114(var12, this.field_4048.method_36107(var14) * class_3281.method_15000(this.field_4051).method_36107(var12));
            this.field_4054.method_36114(var13, this.field_4048.method_36107(var14) * class_3281.method_15000(this.field_4051).method_36107(var13));
         }
      }
   }
}
