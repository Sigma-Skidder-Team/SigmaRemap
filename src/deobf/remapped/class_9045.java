package remapped;

public class class_9045 implements Runnable {
   private static String[] field_46306;

   public class_9045(class_3281 var1, long var2, long var4, class_1702 var6) {
      this.field_46308 = var1;
      this.field_46304 = var2;
      this.field_46307 = var4;
      this.field_46305 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_46304; var3 < this.field_46307; var3++) {
         long var5 = 2L * var3;
         long var7 = var5 + 1L;
         double var9 = -this.field_46305.method_36107(var5) * class_3281.method_14989(this.field_46308).method_36107(var7)
            + this.field_46305.method_36107(var7) * class_3281.method_14989(this.field_46308).method_36107(var5);
         this.field_46305
            .method_36114(
               var5,
               this.field_46305.method_36107(var5) * class_3281.method_14989(this.field_46308).method_36107(var5)
                  + this.field_46305.method_36107(var7) * class_3281.method_14989(this.field_46308).method_36107(var7)
            );
         this.field_46305.method_36114(var7, var9);
      }
   }
}
