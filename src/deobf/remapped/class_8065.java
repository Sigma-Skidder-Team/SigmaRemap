package remapped;

public class class_8065 implements Runnable {
   private static String[] field_41273;

   public class_8065(class_2817 var1, long var2, long var4, class_4330 var6) {
      this.field_41274 = var1;
      this.field_41272 = var2;
      this.field_41271 = var4;
      this.field_41270 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_41272; var3 < this.field_41271; var3++) {
         class_2817.method_12831(this.field_41274).method_17784(this.field_41270, var3 * class_2817.method_12816(this.field_41274));
      }
   }
}
