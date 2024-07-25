package remapped;

public class class_1452 extends Module {
   public class_1452() {
      super(class_5664.field_28710, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
   }

   @class_9148
   private void method_6686(class_139 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null) {
            if (mcInstance.field_9632.field_41697 >= 10) {
               if (mcInstance.field_9632 != null && var1.method_557() instanceof class_509) {
                  class_509 var4 = (class_509)var1.method_557();
                  mcInstance.field_9632.field_41711 = var4.field_3143;
                  mcInstance.field_9632.field_41762 = var4.field_3140;
                  var4.field_3143 = mcInstance.field_9632.field_41701;
                  var4.field_3140 = mcInstance.field_9632.field_41755;
               }
            }
         }
      }
   }
}
