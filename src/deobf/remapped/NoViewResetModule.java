package remapped;

public class NoViewResetModule extends Module {
   public NoViewResetModule() {
      super(Category.PLAYER, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
   }

   @EventListen
   private void method_6686(PacketEvent var1) {
      if (this.isEnabled()) {
         if (client.thePlayer != null) {
            if (client.thePlayer.field_41697 >= 10) {
               if (client.thePlayer != null && var1.method_557() instanceof class_509) {
                  class_509 var4 = (class_509)var1.method_557();
                  client.thePlayer.prevRotationYaw = var4.field_3143;
                  client.thePlayer.prevRotationPitch = var4.field_3140;
                  var4.field_3143 = client.thePlayer.rotationYaw;
                  var4.field_3140 = client.thePlayer.rotationPitch;
               }
            }
         }
      }
   }
}
