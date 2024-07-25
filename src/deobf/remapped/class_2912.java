package remapped;

public class class_2912 implements Runnable {
   private static String[] field_14228;

   public class_2912(class_9035 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_14232 = var1;
      this.field_14231 = var2;
      this.field_14229 = var4;
      this.field_14227 = var6;
      this.field_14230 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_14231; var3 < this.field_14229; var3++) {
         class_9035.method_41463(this.field_14232).method_14990(this.field_14227, var3 * class_9035.method_41456(this.field_14232), this.field_14230);
      }
   }
}
