package remapped;

public class class_6603 implements Runnable {
   private static String[] field_34054;

   public class_6603(class_9035 var1, long var2, long var4, class_1702 var6) {
      this.field_34052 = var1;
      this.field_34053 = var2;
      this.field_34050 = var4;
      this.field_34051 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_34053; var3 < this.field_34050; var3++) {
         class_9035.method_41463(this.field_34052).method_15043(this.field_34051, var3 * class_9035.method_41456(this.field_34052));
      }
   }
}
