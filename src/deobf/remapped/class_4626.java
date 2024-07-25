package remapped;

public class class_4626 implements Runnable {
   private static String[] field_22505;

   public class_4626(class_6056 var1, long var2, long var4, class_1702 var6) {
      this.field_22506 = var1;
      this.field_22503 = var2;
      this.field_22504 = var4;
      this.field_22507 = var6;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_6056.method_27677(this.field_22506), false);

      for (long var4 = this.field_22503; var4 < this.field_22504; var4++) {
         long var6 = var4 * (long)class_6056.method_27649(this.field_22506);

         for (long var8 = 0L; var8 < class_6056.method_27670(this.field_22506); var8++) {
            for (long var10 = 0L; var10 < class_6056.method_27677(this.field_22506); var10++) {
               long var12 = var6 + var10 * (long)class_6056.method_27661(this.field_22506) + var8;
               var3.method_36114(var10, this.field_22507.method_36107(var12));
            }

            class_6056.method_27680(this.field_22506).method_31273(var3);

            for (long var14 = 0L; var14 < class_6056.method_27677(this.field_22506); var14++) {
               long var15 = var6 + var14 * (long)class_6056.method_27661(this.field_22506) + var8;
               this.field_22507.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
