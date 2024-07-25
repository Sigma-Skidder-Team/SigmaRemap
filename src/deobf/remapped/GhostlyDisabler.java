package remapped;

public class GhostlyDisabler extends Module {
   public GhostlyDisabler() {
      super(Category.EXPLOIT, "Ghostly", "Disable ghostly's anticheat.");
   }

   @EventListen
   public void method_39308(class_5596 var1) {
      if (this.method_42015() && client.method_8530() != null) {
         client.method_8614().sendPacket(new CInputPacket(1.0F, 1.0F, false, false));
      }
   }
}
