package remapped;

public class class_6780 implements Runnable {
   private static String[] field_34977;

   public class_6780(class_2817 var1, long var2, long var4, class_4330 var6) {
      this.field_34975 = var1;
      this.field_34973 = var2;
      this.field_34976 = var4;
      this.field_34974 = var6;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_2817.method_12835(this.field_34975), false);

      for (long var4 = this.field_34973; var4 < this.field_34976; var4++) {
         for (long var6 = 0L; var6 < class_2817.method_12835(this.field_34975); var6++) {
            var3.method_36123(var6, this.field_34974.method_36133(var6 * class_2817.method_12816(this.field_34975) + var4));
         }

         class_2817.method_12837(this.field_34975).method_17783(var3);

         for (long var8 = 0L; var8 < class_2817.method_12835(this.field_34975); var8++) {
            this.field_34974.method_36123(var8 * class_2817.method_12816(this.field_34975) + var4, var3.method_36133(var8));
         }
      }
   }
}
