package remapped;

public class NoClipPhase extends Module {
   public NoClipPhase() {
      super(Category.MOVEMENT, "NoClip", "NoClip phase");
   }

   @EventListen
   private void method_23583(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @EventListen
   public void method_23582(class_5243 var1) {
      if (this.method_42015() && client.theWorld != null) {
         if ((double)var1.method_23989().getY() >= client.thePlayer.method_37309()) {
            var1.method_23986(class_3370.method_15536());
         }
      }
   }

   @EventListen
   public void method_23581(class_5596 var1) {
      if (this.method_42015()) {
         client.thePlayer.field_29600 = 3;
         if (client.thePlayer.field_41697 % 2 == 0) {
            if (client.thePlayer.onGround) {
               if (!client.thePlayer.field_29654) {
                  if (client.thePlayer.isSneaking()) {
                     client.thePlayer
                        .method_37256(client.thePlayer.getPosX(), client.thePlayer.method_37309() - 1.0, client.thePlayer.getPosZ());
                  }
               } else {
                  client.thePlayer
                     .method_37256(client.thePlayer.getPosX(), client.thePlayer.method_37309() + 1.0, client.thePlayer.getPosZ());
               }
            }
         }
      }
   }
}
