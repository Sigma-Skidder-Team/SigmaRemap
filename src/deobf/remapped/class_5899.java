package remapped;

public class class_5899 implements Runnable {
   private static String[] field_29948;

   public class_5899(class_3803 var1, long var2, long var4, class_4330 var6) {
      this.field_29949 = var1;
      this.field_29946 = var2;
      this.field_29947 = var4;
      this.field_29950 = var6;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_3803.method_17703(this.field_29949), false);

      for (long var4 = this.field_29946; var4 < this.field_29947; var4++) {
         long var6 = var4 * (long)class_3803.method_17685(this.field_29949);

         for (long var8 = 0L; var8 < class_3803.method_17712(this.field_29949); var8++) {
            for (long var10 = 0L; var10 < class_3803.method_17703(this.field_29949); var10++) {
               long var12 = var10 * (long)class_3803.method_17689(this.field_29949) + var6 + var8;
               var3.method_36123(var10, this.field_29950.method_36133(var12));
            }

            class_3803.method_17699(this.field_29949).method_17783(var3);

            for (long var14 = 0L; var14 < class_3803.method_17703(this.field_29949); var14++) {
               long var15 = var14 * (long)class_3803.method_17689(this.field_29949) + var6 + var8;
               this.field_29950.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}
