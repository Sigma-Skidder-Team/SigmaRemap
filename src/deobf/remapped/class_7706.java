package remapped;

public class class_7706 implements Runnable {
   private static String[] field_39103;

   public class_7706(class_8751 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_39102 = var1;
      this.field_39101 = var2;
      this.field_39098 = var4;
      this.field_39099 = var6;
      this.field_39100 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_39101; var3 < this.field_39098; var3++) {
         class_8751.method_40165(this.field_39102).method_21137(this.field_39099, var3 * class_8751.method_40171(this.field_39102), this.field_39100);
      }
   }
}
