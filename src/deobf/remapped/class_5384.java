package remapped;

public class class_5384 implements Runnable {
   private static String[] field_27479;

   public class_5384(class_1637 var1, long var2, long var4, long var6, class_1702 var8, long var9, class_1702 var11, long var12) {
      this.field_27485 = var1;
      this.field_27481 = var2;
      this.field_27483 = var4;
      this.field_27477 = var6;
      this.field_27480 = var8;
      this.field_27478 = var9;
      this.field_27482 = var11;
      this.field_27484 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_27481; var3 < this.field_27483; var3++) {
         long var5 = var3 * this.field_27477;

         for (long var7 = 0L; var7 < class_1637.method_7327(this.field_27485); var7++) {
            class_3685.method_17115(
               this.field_27480,
               var3 * class_1637.method_7327(this.field_27485) * this.field_27478 + var7 * this.field_27478,
               this.field_27482,
               var5 + var7 * this.field_27484,
               this.field_27478
            );
         }
      }
   }
}
