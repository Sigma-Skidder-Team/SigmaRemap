package remapped;

public class class_967 implements Runnable {
   private static String[] field_4954;

   public class_967(class_4993 var1, long var2, long var4, long var6, class_4330 var8) {
      this.field_4959 = var1;
      this.field_4955 = var2;
      this.field_4957 = var4;
      this.field_4956 = var6;
      this.field_4958 = var8;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(2L * class_4993.method_22978(this.field_4959), false);

      for (long var4 = this.field_4955; var4 < this.field_4957; var4++) {
         long var6 = 2L * var4;

         for (long var8 = 0L; var8 < class_4993.method_22978(this.field_4959); var8++) {
            long var10 = 2L * var8;
            long var12 = var8 * this.field_4956 + var6;
            var3.method_36114(var10, (double)this.field_4958.method_36133(var12));
            var3.method_36114(var10 + 1L, (double)this.field_4958.method_36133(var12 + 1L));
         }

         class_4993.method_22985(this.field_4959).method_24183(var3);

         for (long var14 = 0L; var14 < class_4993.method_22978(this.field_4959); var14++) {
            long var15 = 2L * var14;
            long var16 = var14 * this.field_4956 + var6;
            this.field_4958.method_36114(var16, (double)var3.method_36133(var15));
            this.field_4958.method_36114(var16 + 1L, (double)var3.method_36133(var15 + 1L));
         }
      }
   }
}
