package remapped;

public class class_1671 implements Runnable {
   private static String[] field_8646;

   public class_1671(class_9035 var1, long var2, long var4, class_1702 var6, long var7) {
      this.field_8645 = var1;
      this.field_8648 = var2;
      this.field_8643 = var4;
      this.field_8647 = var6;
      this.field_8644 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_8648; var3 < this.field_8643; var3++) {
         class_9035.method_41463(this.field_8645).method_15027(this.field_8647, var3 * this.field_8644);
      }
   }
}
