package remapped;

public class class_6326 implements Runnable {
   private static String[] field_32309;

   public class_6326(class_2841 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_32310 = var1;
      this.field_32308 = var2;
      this.field_32313 = var4;
      this.field_32312 = var6;
      this.field_32311 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_32308; var3 < this.field_32313; var3++) {
         long var5 = var3 * class_2841.method_12906(this.field_32310);

         for (long var7 = 0L; var7 < class_2841.method_12912(this.field_32310); var7++) {
            class_2841.method_12923(this.field_32310).method_21137(this.field_32312, var5 + var7 * class_2841.method_12927(this.field_32310), this.field_32311);
         }
      }
   }
}
