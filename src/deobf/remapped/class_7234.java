package remapped;

public class class_7234 implements Runnable {
   private static String[] field_37119;

   public class_7234(class_2841 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_37117 = var1;
      this.field_37116 = var2;
      this.field_37120 = var4;
      this.field_37115 = var6;
      this.field_37118 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_2841.method_12907(this.field_37117), false);

      for (long var4 = this.field_37116; var4 < this.field_37120; var4++) {
         long var6 = var4 * class_2841.method_12927(this.field_37117);

         for (long var8 = 0L; var8 < class_2841.method_12932(this.field_37117); var8++) {
            for (long var10 = 0L; var10 < class_2841.method_12907(this.field_37117); var10++) {
               long var12 = var10 * class_2841.method_12906(this.field_37117) + var6 + var8;
               var3.method_36123(var10, this.field_37115.method_36133(var12));
            }

            class_2841.method_12933(this.field_37117).method_21130(var3, this.field_37118);

            for (long var14 = 0L; var14 < class_2841.method_12907(this.field_37117); var14++) {
               long var15 = var14 * class_2841.method_12906(this.field_37117) + var6 + var8;
               this.field_37115.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}
