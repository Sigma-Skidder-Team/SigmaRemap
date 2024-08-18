package remapped;

public class PortalGUIModule extends Module {
   public PortalGUIModule() {
      super(Category.MISC, "PortalGui", "Allows GUIs while in nether portal");
   }

   @EventListen
   private void method_12031(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         client.thePlayer.field_41772 = false;
      }
   }
}
