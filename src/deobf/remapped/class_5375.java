package remapped;

public class class_5375 implements Runnable {
   private static String[] field_27452;

   public class_5375(class_9035 var1, long var2, long var4, long var6, class_1702 var8, boolean var9) {
      this.field_27446 = var1;
      this.field_27450 = var2;
      this.field_27448 = var4;
      this.field_27449 = var6;
      this.field_27451 = var8;
      this.field_27447 = var9;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(2L * class_9035.method_41453(this.field_27446), false);

      for (long var4 = this.field_27450; var4 < this.field_27448; var4++) {
         long var6 = 2L * var4;

         for (long var8 = 0L; var8 < class_9035.method_41453(this.field_27446); var8++) {
            long var10 = 2L * var8;
            long var12 = var8 * this.field_27449 + var6;
            var3.method_36114(var10, this.field_27451.method_36107(var12));
            var3.method_36114(var10 + 1L, this.field_27451.method_36107(var12 + 1L));
         }

         class_9035.method_41455(this.field_27446).method_15034(var3, this.field_27447);

         for (long var14 = 0L; var14 < class_9035.method_41453(this.field_27446); var14++) {
            long var15 = 2L * var14;
            long var16 = var14 * this.field_27449 + var6;
            this.field_27451.method_36114(var16, var3.method_36107(var15));
            this.field_27451.method_36114(var16 + 1L, var3.method_36107(var15 + 1L));
         }
      }
   }
}
