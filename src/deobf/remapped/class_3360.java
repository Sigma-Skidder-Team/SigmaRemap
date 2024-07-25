package remapped;

public class class_3360 implements Runnable {
   private static String[] field_16553;

   public class_3360(class_4993 var1, long var2, long var4, long var6, long var8, class_4330 var10, class_4330 var11, long var12) {
      this.field_16547 = var1;
      this.field_16546 = var2;
      this.field_16549 = var4;
      this.field_16548 = var6;
      this.field_16552 = var8;
      this.field_16551 = var10;
      this.field_16550 = var11;
      this.field_16554 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_16546; var3 < this.field_16549; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < this.field_16548; var7++) {
            long var9 = 2L * var7;
            long var11 = var3 * this.field_16552 + var9;
            this.field_16551.method_36114(var11, (double)this.field_16550.method_36133(var7 * this.field_16554 + var5));
            this.field_16551.method_36114(var11 + 1L, (double)this.field_16550.method_36133(var7 * this.field_16554 + var5 + 1L));
         }
      }
   }
}
