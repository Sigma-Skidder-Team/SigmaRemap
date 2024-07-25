package remapped;

public class NoViewResetModule extends Module {
   public NoViewResetModule() {
      super(Category.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
   }

   @EventListen
   private void method_6686(PacketEvent var1) {
      if (this.method_42015()) {
         if (mc.field_9632 != null) {
            if (mc.field_9632.field_41697 >= 10) {
               if (mc.field_9632 != null && var1.method_557() instanceof class_509) {
                  class_509 var4 = (class_509)var1.method_557();
                  mc.field_9632.field_41711 = var4.field_3143;
                  mc.field_9632.field_41762 = var4.field_3140;
                  var4.field_3143 = mc.field_9632.field_41701;
                  var4.field_3140 = mc.field_9632.field_41755;
               }
            }
         }
      }
   }
}
