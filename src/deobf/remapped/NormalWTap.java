package remapped;

public class NormalWTap extends Module {
   public NormalWTap() {
      super(Category.COMBAT, "Normal", "Increase the knockback you give to players");
   }

   @EventListen
   @class_315
   private void method_11810(class_3645 var1) {
      if (this.isEnabled() && var1.method_16971()) {
         client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.STOP_SPRINTING));
      }
   }
}
