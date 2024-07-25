package remapped;

public class class_493 implements Runnable {
   private static String[] field_3068;

   public class_493(class_6056 var1, long var2, long var4, class_1702 var6) {
      this.field_3070 = var1;
      this.field_3067 = var2;
      this.field_3071 = var4;
      this.field_3069 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_3067; var3 < this.field_3071; var3++) {
         long var5 = var3 * (long)class_6056.method_27649(this.field_3070);

         for (long var7 = 0L; var7 < class_6056.method_27677(this.field_3070); var7++) {
            class_6056.method_27665(this.field_3070).method_31274(this.field_3069, var5 + var7 * (long)class_6056.method_27661(this.field_3070));
         }
      }
   }
}
