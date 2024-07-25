package remapped;

public class class_2477 implements Runnable {
   private static String[] field_12359;

   public class_2477(class_7380 var1, int var2, long var3, int var5, class_1702 var6, boolean var7) {
      this.field_12361 = var1;
      this.field_12358 = var2;
      this.field_12364 = var3;
      this.field_12362 = var5;
      this.field_12363 = var6;
      this.field_12360 = var7;
   }

   @Override
   public void run() {
      if (this.field_12358 != -1) {
         for (long var3 = this.field_12364; var3 < class_7380.method_33604(this.field_12361); var3 += (long)this.field_12362) {
            class_7380.method_33625(this.field_12361).method_31280(this.field_12363, var3 * class_7380.method_33608(this.field_12361), this.field_12360);
         }
      } else {
         for (long var5 = this.field_12364; var5 < class_7380.method_33604(this.field_12361); var5 += (long)this.field_12362) {
            class_7380.method_33625(this.field_12361).method_31274(this.field_12363, var5 * class_7380.method_33608(this.field_12361));
         }
      }
   }
}
