package remapped;

public class class_3329 implements Runnable {
   private static String[] field_16431;

   public class_3329(class_3381 var1, long var2, long var4, long var6, long var8, long var10, class_4330 var12) {
      this.field_16432 = var1;
      this.field_16430 = var2;
      this.field_16428 = var4;
      this.field_16425 = var6;
      this.field_16426 = var8;
      this.field_16427 = var10;
      this.field_16429 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_16430; var3 < this.field_16428; var3++) {
         long var5 = (class_3381.method_15636(this.field_16432) - var3) % class_3381.method_15636(this.field_16432) * this.field_16425;
         long var7 = var3 * this.field_16425;

         for (long var9 = 1L; var9 < this.field_16426; var9++) {
            long var11 = var5 + (class_3381.method_15624(this.field_16432) - var9) * this.field_16427;
            long var13 = var7 + var9 * this.field_16427;
            this.field_16429.method_36123(var11, this.field_16429.method_36133(var13));
            this.field_16429.method_36123(var11 + 1L, -this.field_16429.method_36133(var13 + 1L));
         }
      }
   }
}
