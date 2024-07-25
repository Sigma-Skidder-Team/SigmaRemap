package remapped;

public class class_8450 implements Runnable {
   private static String[] field_43208;

   public class_8450(class_84 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_43206 = var1;
      this.field_43211 = var2;
      this.field_43209 = var4;
      this.field_43207 = var6;
      this.field_43210 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_84.method_183(this.field_43206), false);

      for (long var4 = this.field_43211; var4 < this.field_43209; var4++) {
         long var6 = var4 * (long)class_84.method_188(this.field_43206);

         for (long var8 = 0L; var8 < class_84.method_199(this.field_43206); var8++) {
            for (long var10 = 0L; var10 < class_84.method_183(this.field_43206); var10++) {
               long var12 = var10 * (long)class_84.method_180(this.field_43206) + var6 + var8;
               var3.method_36114(var10, this.field_43207.method_36107(var12));
            }

            class_84.method_181(this.field_43206).method_31287(var3, this.field_43210);

            for (long var14 = 0L; var14 < class_84.method_183(this.field_43206); var14++) {
               long var15 = var14 * (long)class_84.method_180(this.field_43206) + var6 + var8;
               this.field_43207.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
