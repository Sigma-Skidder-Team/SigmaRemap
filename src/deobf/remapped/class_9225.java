package remapped;

public class class_9225 implements Runnable {
   private static String[] field_47162;

   public class_9225(class_1637 var1, long var2, long var4, long var6, long var8, class_1702 var10, long var11) {
      this.field_47161 = var1;
      this.field_47167 = var2;
      this.field_47168 = var4;
      this.field_47163 = var6;
      this.field_47166 = var8;
      this.field_47165 = var10;
      this.field_47164 = var11;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(this.field_47167);

      for (long var4 = this.field_47168; var4 >= this.field_47163; var4--) {
         long var6 = var4 * class_1637.method_7342(this.field_47161);
         long var8 = var4 * this.field_47166;

         for (long var10 = class_1637.method_7327(this.field_47161) - 1L; var10 >= 0L; var10--) {
            class_3685.method_17115(
               this.field_47165, var6 + var10 * class_1637.method_7303(this.field_47161), var3, 0L, class_1637.method_7343(this.field_47161)
            );
            class_1637.method_7310(this.field_47161).method_14979(var3);
            class_3685.method_17115(var3, 0L, this.field_47165, var8 + var10 * this.field_47164, this.field_47167);
         }
      }
   }
}
