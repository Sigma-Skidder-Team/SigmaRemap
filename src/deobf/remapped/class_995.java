package remapped;

public class class_995 implements Runnable {
   private static String[] field_5065;

   public class_995(class_84 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_5067 = var1;
      this.field_5068 = var2;
      this.field_5064 = var4;
      this.field_5066 = var6;
      this.field_5069 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_84.method_190(this.field_5067), false);

      for (long var4 = this.field_5068; var4 < this.field_5064; var4++) {
         long var6 = var4 * class_84.method_182(this.field_5067);

         for (long var8 = 0L; var8 < class_84.method_199(this.field_5067); var8++) {
            for (long var10 = 0L; var10 < class_84.method_190(this.field_5067); var10++) {
               long var12 = var6 + var10 * class_84.method_197(this.field_5067) + var8;
               var3.method_36114(var10, this.field_5066.method_36107(var12));
            }

            class_84.method_189(this.field_5067).method_31293(var3, this.field_5069);

            for (long var14 = 0L; var14 < class_84.method_190(this.field_5067); var14++) {
               long var15 = var6 + var14 * class_84.method_197(this.field_5067) + var8;
               this.field_5066.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
