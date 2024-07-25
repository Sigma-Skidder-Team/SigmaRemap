package remapped;

public class class_1764 implements Runnable {
   private static String[] field_9047;

   public class_1764(class_2817 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_9046 = var1;
      this.field_9048 = var2;
      this.field_9045 = var4;
      this.field_9044 = var6;
      this.field_9049 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_9048; var3 < this.field_9045; var3++) {
         class_2817.method_12831(this.field_9046).method_17787(this.field_9044, var3 * class_2817.method_12816(this.field_9046), this.field_9049);
      }
   }
}
