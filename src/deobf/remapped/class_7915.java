package remapped;

public class class_7915 implements Runnable {
   private static String[] field_40460;

   public class_7915(class_3101 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_40458 = var1;
      this.field_40459 = var2;
      this.field_40457 = var4;
      this.field_40462 = var6;
      this.field_40461 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_3101.method_14212(this.field_40458), false);

      for (long var4 = this.field_40459; var4 < this.field_40457; var4++) {
         long var6 = var4 * (long)class_3101.method_14196(this.field_40458);

         for (long var8 = 0L; var8 < class_3101.method_14197(this.field_40458); var8++) {
            for (long var10 = 0L; var10 < class_3101.method_14212(this.field_40458); var10++) {
               long var12 = var10 * (long)class_3101.method_14211(this.field_40458) + var6 + var8;
               var3.method_36123(var10, this.field_40462.method_36133(var12));
            }

            class_3101.method_14200(this.field_40458).method_19202(var3, this.field_40461);

            for (long var14 = 0L; var14 < class_3101.method_14212(this.field_40458); var14++) {
               long var15 = var14 * (long)class_3101.method_14211(this.field_40458) + var6 + var8;
               this.field_40462.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}
