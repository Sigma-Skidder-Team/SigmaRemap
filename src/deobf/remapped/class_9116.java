package remapped;

public class class_9116 implements Runnable {
   private static String[] field_46665;

   public class_9116(class_3803 var1, long var2, long var4, class_4330 var6) {
      this.field_46664 = var1;
      this.field_46668 = var2;
      this.field_46666 = var4;
      this.field_46667 = var6;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_3803.method_17686(this.field_46664), false);

      for (long var4 = this.field_46668; var4 < this.field_46666; var4++) {
         long var6 = var4 * (long)class_3803.method_17689(this.field_46664);

         for (long var8 = 0L; var8 < class_3803.method_17712(this.field_46664); var8++) {
            for (long var10 = 0L; var10 < class_3803.method_17686(this.field_46664); var10++) {
               long var12 = var6 + var10 * (long)class_3803.method_17685(this.field_46664) + var8;
               var3.method_36123(var10, this.field_46667.method_36133(var12));
            }

            class_3803.method_17714(this.field_46664).method_17783(var3);

            for (long var14 = 0L; var14 < class_3803.method_17686(this.field_46664); var14++) {
               long var15 = var6 + var14 * (long)class_3803.method_17685(this.field_46664) + var8;
               this.field_46667.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}
