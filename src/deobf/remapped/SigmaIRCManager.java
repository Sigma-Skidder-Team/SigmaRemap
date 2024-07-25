package remapped;

public class SigmaIRCManager implements class_6224 {
   public SigmaIRCManager(SigmaIRC var1) {
      this.field_7315 = var1;
   }

   @Override
   public void method_28452(Object... var1) {
      class_1293 var4 = (class_1293)var1[0];
      if (var4.method_5850("messageId")) {
         class_1293 var5 = new class_1293();
         var5.method_5820("messageId", var4.method_5861("messageId"));
         this.field_7315.field_21933.method_19325("message-received", var5);
         this.field_7315.field_21936.method_29367(var4.method_5861("senderId"), var4.method_5861("message"), var4.method_5840("timestamp"));
      }
   }
}
