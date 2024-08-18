package remapped;

public class GhostlyDisabler extends Module {
   public GhostlyDisabler() {
      super(Category.EXPLOIT, "Ghostly", "Disable ghostly's anticheat.");
   }

   @EventListen
   public void method_39308(PlayerTickEvent var1) {
      if (this.isEnabled() && client.method_8530() != null) {
         client.method_8614().sendPacket(new CInputPacket(1.0F, 1.0F, false, false));
      }
   }
}
