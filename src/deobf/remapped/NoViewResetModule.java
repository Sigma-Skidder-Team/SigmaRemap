package remapped;

public class NoViewResetModule extends Module {
   public NoViewResetModule() {
      super(Category.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
   }

   @EventListen
   private void method_6686(PacketEvent var1) {
      if (this.method_42015()) {
         if (client.thePlayer != null) {
            if (client.thePlayer.field_41697 >= 10) {
               if (client.thePlayer != null && var1.method_557() instanceof class_509) {
                  class_509 var4 = (class_509)var1.method_557();
                  client.thePlayer.field_41711 = var4.field_3143;
                  client.thePlayer.field_41762 = var4.field_3140;
                  var4.field_3143 = client.thePlayer.field_41701;
                  var4.field_3140 = client.thePlayer.field_41755;
               }
            }
         }
      }
   }
}
