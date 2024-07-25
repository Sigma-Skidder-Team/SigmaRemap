package remapped;

public class class_1454 implements Runnable {
   private static String[] field_7828;

   public class_1454(class_3281 var1, int var2, long var3, long var5, long var7, class_1702 var9, class_1702 var10) {
      this.field_7830 = var1;
      this.field_7835 = var2;
      this.field_7831 = var3;
      this.field_7834 = var5;
      this.field_7829 = var7;
      this.field_7833 = var9;
      this.field_7832 = var10;
   }

   @Override
   public void run() {
      if (this.field_7835 <= 0) {
         for (long var3 = this.field_7831; var3 < this.field_7834; var3++) {
            long var5 = 2L * var3;
            long var7 = var5 + 1L;
            long var9 = this.field_7829 + var5;
            long var11 = this.field_7829 + var7;
            this.field_7833
               .method_36114(
                  var5,
                  this.field_7832.method_36107(var9) * class_3281.method_15000(this.field_7830).method_36107(var5)
                     + this.field_7832.method_36107(var11) * class_3281.method_15000(this.field_7830).method_36107(var7)
               );
            this.field_7833
               .method_36114(
                  var7,
                  -this.field_7832.method_36107(var9) * class_3281.method_15000(this.field_7830).method_36107(var7)
                     + this.field_7832.method_36107(var11) * class_3281.method_15000(this.field_7830).method_36107(var5)
               );
         }
      } else {
         for (long var13 = this.field_7831; var13 < this.field_7834; var13++) {
            long var14 = 2L * var13;
            long var15 = var14 + 1L;
            long var16 = this.field_7829 + var14;
            long var17 = this.field_7829 + var15;
            this.field_7833
               .method_36114(
                  var14,
                  this.field_7832.method_36107(var16) * class_3281.method_15000(this.field_7830).method_36107(var14)
                     - this.field_7832.method_36107(var17) * class_3281.method_15000(this.field_7830).method_36107(var15)
               );
            this.field_7833
               .method_36114(
                  var15,
                  this.field_7832.method_36107(var16) * class_3281.method_15000(this.field_7830).method_36107(var15)
                     + this.field_7832.method_36107(var17) * class_3281.method_15000(this.field_7830).method_36107(var14)
               );
         }
      }
   }
}
