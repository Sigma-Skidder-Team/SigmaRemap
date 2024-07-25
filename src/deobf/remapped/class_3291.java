package remapped;

public class class_3291 implements Runnable {
   private static String[] field_16298;

   public class_3291(class_4993 var1, long var2, long var4, class_4330 var6, long var7, class_4330 var9, boolean var10) {
      this.field_16296 = var1;
      this.field_16301 = var2;
      this.field_16294 = var4;
      this.field_16295 = var6;
      this.field_16300 = var7;
      this.field_16299 = var9;
      this.field_16297 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_16301; var3 < this.field_16294; var3++) {
         long var5 = 2L * var3;

         for (long var7 = 0L; var7 < class_4993.method_22978(this.field_16296); var7++) {
            long var9 = 2L * var7;
            long var11 = var7 * class_4993.method_23002(this.field_16296) + var5;
            this.field_16295.method_36114(var3 * this.field_16300 + var9, (double)this.field_16299.method_36133(var11));
            this.field_16295.method_36114(var3 * this.field_16300 + var9 + 1L, (double)this.field_16299.method_36133(var11 + 1L));
         }

         class_4993.method_22985(this.field_16296).method_24213(this.field_16295, var3 * this.field_16300, this.field_16297);
      }
   }
}
