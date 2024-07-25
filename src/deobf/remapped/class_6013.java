package remapped;

public class class_6013 implements Runnable {
   private static String[] field_30630;

   public class_6013(class_2817 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_30633 = var1;
      this.field_30632 = var2;
      this.field_30635 = var4;
      this.field_30634 = var6;
      this.field_30631 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_2817.method_12835(this.field_30633), false);

      for (long var4 = this.field_30632; var4 < this.field_30635; var4++) {
         for (long var6 = 0L; var6 < class_2817.method_12835(this.field_30633); var6++) {
            var3.method_36123(var6, this.field_30634.method_36133(var6 * class_2817.method_12816(this.field_30633) + var4));
         }

         class_2817.method_12837(this.field_30633).method_17788(var3, this.field_30631);

         for (long var8 = 0L; var8 < class_2817.method_12835(this.field_30633); var8++) {
            this.field_30634.method_36123(var8 * class_2817.method_12816(this.field_30633) + var4, var3.method_36133(var8));
         }
      }
   }
}
