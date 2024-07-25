package remapped;

public class PortalGodModeModule extends Module {
   public PortalGodModeModule() {
      super(Category.MISC, "PortalGodMode", "Makes you invulnerable when you go through a portal and stay in it");
   }

   @EventListen
   private void method_2116(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_2492) {
            var1.method_29715(true);
         }
      }
   }
}
