package remapped;

public class class_443 implements Runnable {
   private static String[] field_1859;

   public class_443(class_4993 var1, long var2, long var4, class_4330 var6, long var7, class_4330 var9) {
      this.field_1855 = var1;
      this.field_1857 = var2;
      this.field_1860 = var4;
      this.field_1856 = var6;
      this.field_1858 = var7;
      this.field_1854 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_1857; var3 < this.field_1860; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < class_4993.method_22978(this.field_1855); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * class_4993.method_23002(this.field_1855) + var5;
            this.field_1856.method_36114(var3 * this.field_1858 + var9, (double)this.field_1854.method_36133(var11));
            this.field_1856.method_36114(var3 * this.field_1858 + var9 + 1L, (double)this.field_1854.method_36133(var11 + 1L));
         }

         class_4993.method_22985(this.field_1855).method_24184(this.field_1856, var3 * this.field_1858);
      }
   }
}
