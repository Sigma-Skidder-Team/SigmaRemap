package remapped;

public class class_1939 implements Runnable {
   public class_1939(class_5172 var1) {
      this.field_9904 = var1;
   }

   @Override
   public void run() {
      if (!class_1289.method_5784(this.field_9904.field_26627)) {
         class_1289.method_5741().fine("attempting reconnect");
         int var3 = class_1289.method_5768(this.field_9904.field_26627).method_37504();
         class_1289.method_5767(this.field_9904.field_26627, "reconnect_attempt", new Object[]{var3});
         class_1289.method_5767(this.field_9904.field_26627, "reconnecting", new Object[]{var3});
         if (!class_1289.method_5784(this.field_9904.field_26627)) {
            this.field_9904.field_26627.method_5745(new class_2688(this));
         }
      }
   }
}
