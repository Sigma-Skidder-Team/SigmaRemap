package remapped;

public class class_7016 implements Runnable {
   private static String[] field_35963;

   public class_7016(class_3381 var1, long var2, long var4, long var6, class_4330 var8, long var9, class_4330 var11, long var12) {
      this.field_35961 = var1;
      this.field_35964 = var2;
      this.field_35962 = var4;
      this.field_35958 = var6;
      this.field_35966 = var8;
      this.field_35960 = var9;
      this.field_35965 = var11;
      this.field_35959 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_35964; var3 < this.field_35962; var3++) {
         long var5 = var3 * this.field_35958;

         for (long var7 = 0L; var7 < class_3381.method_15624(this.field_35961); var7++) {
            class_3685.method_17117(
               this.field_35966,
               var3 * class_3381.method_15624(this.field_35961) * this.field_35960 + var7 * this.field_35960,
               this.field_35965,
               var5 + var7 * this.field_35959,
               this.field_35960
            );
         }
      }
   }
}
