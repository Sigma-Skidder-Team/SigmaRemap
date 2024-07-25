package remapped;

public class class_2495 implements Runnable {
   private static String[] field_12406;

   public class_2495(class_2841 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_12407 = var1;
      this.field_12409 = var2;
      this.field_12411 = var4;
      this.field_12410 = var6;
      this.field_12408 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_12409; var3 < this.field_12411; var3++) {
         long var5 = var3 * class_2841.method_12906(this.field_12407);

         for (long var7 = 0L; var7 < class_2841.method_12912(this.field_12407); var7++) {
            class_2841.method_12923(this.field_12407).method_21129(this.field_12410, var5 + var7 * class_2841.method_12927(this.field_12407), this.field_12408);
         }
      }
   }
}
