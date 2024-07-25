package remapped;

public class class_5577 implements Runnable {
   private static String[] field_28336;

   public class_5577(class_3803 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_28333 = var1;
      this.field_28331 = var2;
      this.field_28332 = var4;
      this.field_28334 = var6;
      this.field_28335 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_3803.method_17686(this.field_28333), false);

      for (long var4 = this.field_28331; var4 < this.field_28332; var4++) {
         long var6 = var4 * class_3803.method_17713(this.field_28333);

         for (long var8 = 0L; var8 < class_3803.method_17712(this.field_28333); var8++) {
            for (long var10 = 0L; var10 < class_3803.method_17686(this.field_28333); var10++) {
               long var12 = var6 + var10 * class_3803.method_17705(this.field_28333) + var8;
               var3.method_36123(var10, this.field_28334.method_36133(var12));
            }

            class_3803.method_17714(this.field_28333).method_17788(var3, this.field_28335);

            for (long var14 = 0L; var14 < class_3803.method_17686(this.field_28333); var14++) {
               long var15 = var6 + var14 * class_3803.method_17705(this.field_28333) + var8;
               this.field_28334.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}
