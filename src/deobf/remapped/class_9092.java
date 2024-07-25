package remapped;

public class class_9092 implements Runnable {
   private static String[] field_46562;

   public class_9092(class_573 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_46563 = var1;
      this.field_46566 = var2;
      this.field_46565 = var4;
      this.field_46564 = var6;
      this.field_46567 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_573.method_2725(this.field_46563), false);

      for (long var4 = this.field_46566; var4 < this.field_46565; var4++) {
         long var6 = var4 * class_573.method_2726(this.field_46563);

         for (long var8 = 0L; var8 < class_573.method_2735(this.field_46563); var8++) {
            for (long var10 = 0L; var10 < class_573.method_2725(this.field_46563); var10++) {
               long var12 = var10 * class_573.method_2731(this.field_46563) + var6 + var8;
               var3.method_36114(var10, this.field_46564.method_36107(var12));
            }

            class_573.method_2710(this.field_46563).method_44814(var3, this.field_46567);

            for (long var14 = 0L; var14 < class_573.method_2725(this.field_46563); var14++) {
               long var15 = var14 * class_573.method_2731(this.field_46563) + var6 + var8;
               this.field_46564.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
