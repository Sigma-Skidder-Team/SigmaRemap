package remapped;

public class class_4455 implements Runnable {
   private static String[] field_21705;

   public class_4455(class_84 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_21708 = var1;
      this.field_21707 = var2;
      this.field_21706 = var4;
      this.field_21709 = var6;
      this.field_21704 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_84.method_183(this.field_21708), false);

      for (long var4 = this.field_21707; var4 < this.field_21706; var4++) {
         long var6 = var4 * class_84.method_197(this.field_21708);

         for (long var8 = 0L; var8 < class_84.method_199(this.field_21708); var8++) {
            for (long var10 = 0L; var10 < class_84.method_183(this.field_21708); var10++) {
               long var12 = var10 * class_84.method_182(this.field_21708) + var6 + var8;
               var3.method_36114(var10, this.field_21709.method_36107(var12));
            }

            class_84.method_181(this.field_21708).method_31293(var3, this.field_21704);

            for (long var14 = 0L; var14 < class_84.method_183(this.field_21708); var14++) {
               long var15 = var14 * class_84.method_182(this.field_21708) + var6 + var8;
               this.field_21709.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
