package remapped;

public class class_3637 implements Runnable {
   private static String[] field_17750;

   public class_3637(class_84 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_17745 = var1;
      this.field_17748 = var2;
      this.field_17747 = var4;
      this.field_17746 = var6;
      this.field_17749 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_84.method_190(this.field_17745), false);

      for (long var4 = this.field_17748; var4 < this.field_17747; var4++) {
         long var6 = var4 * (long)class_84.method_180(this.field_17745);

         for (long var8 = 0L; var8 < class_84.method_199(this.field_17745); var8++) {
            for (long var10 = 0L; var10 < class_84.method_190(this.field_17745); var10++) {
               long var12 = var6 + var10 * (long)class_84.method_188(this.field_17745) + var8;
               var3.method_36114(var10, this.field_17746.method_36107(var12));
            }

            class_84.method_189(this.field_17745).method_31287(var3, this.field_17749);

            for (long var14 = 0L; var14 < class_84.method_190(this.field_17745); var14++) {
               long var15 = var6 + var14 * (long)class_84.method_188(this.field_17745) + var8;
               this.field_17746.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
