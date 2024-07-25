package remapped;

public class class_567 implements Runnable {
   private static String[] field_3351;

   public class_567(class_7380 var1, long var2, long var4, class_1702 var6) {
      this.field_3352 = var1;
      this.field_3348 = var2;
      this.field_3349 = var4;
      this.field_3350 = var6;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_7380.method_33604(this.field_3352), false);

      for (long var4 = this.field_3348; var4 < this.field_3349; var4++) {
         for (long var6 = 0L; var6 < class_7380.method_33604(this.field_3352); var6++) {
            var3.method_36114(var6, this.field_3350.method_36107(var6 * class_7380.method_33608(this.field_3352) + var4));
         }

         class_7380.method_33616(this.field_3352).method_31273(var3);

         for (long var8 = 0L; var8 < class_7380.method_33604(this.field_3352); var8++) {
            this.field_3350.method_36114(var8 * class_7380.method_33608(this.field_3352) + var4, var3.method_36107(var8));
         }
      }
   }
}
