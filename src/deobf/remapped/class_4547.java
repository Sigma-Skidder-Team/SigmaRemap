package remapped;

public class class_4547 implements Runnable {
   private static String[] field_22166;

   public class_4547(class_6056 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_22164 = var1;
      this.field_22165 = var2;
      this.field_22161 = var4;
      this.field_22162 = var6;
      this.field_22163 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_6056.method_27678(this.field_22164), false);

      for (long var4 = this.field_22165; var4 < this.field_22161; var4++) {
         long var6 = var4 * class_6056.method_27672(this.field_22164);

         for (long var8 = 0L; var8 < class_6056.method_27670(this.field_22164); var8++) {
            for (long var10 = 0L; var10 < class_6056.method_27678(this.field_22164); var10++) {
               long var12 = var10 * class_6056.method_27679(this.field_22164) + var6 + var8;
               var3.method_36114(var10, this.field_22162.method_36107(var12));
            }

            class_6056.method_27659(this.field_22164).method_31281(var3, this.field_22163);

            for (long var14 = 0L; var14 < class_6056.method_27678(this.field_22164); var14++) {
               long var15 = var14 * class_6056.method_27679(this.field_22164) + var6 + var8;
               this.field_22162.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
