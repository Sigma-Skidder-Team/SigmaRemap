package remapped;

public class class_4375 implements Runnable {
   private static String[] field_21471;

   public class_4375(class_3101 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_21474 = var1;
      this.field_21476 = var2;
      this.field_21472 = var4;
      this.field_21473 = var6;
      this.field_21475 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_3101.method_14212(this.field_21474), false);

      for (long var4 = this.field_21476; var4 < this.field_21472; var4++) {
         long var6 = var4 * class_3101.method_14194(this.field_21474);

         for (long var8 = 0L; var8 < class_3101.method_14197(this.field_21474); var8++) {
            for (long var10 = 0L; var10 < class_3101.method_14212(this.field_21474); var10++) {
               long var12 = var10 * class_3101.method_14193(this.field_21474) + var6 + var8;
               var3.method_36123(var10, this.field_21473.method_36133(var12));
            }

            class_3101.method_14200(this.field_21474).method_19195(var3, this.field_21475);

            for (long var14 = 0L; var14 < class_3101.method_14212(this.field_21474); var14++) {
               long var15 = var14 * class_3101.method_14193(this.field_21474) + var6 + var8;
               this.field_21473.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}
