package remapped;

public class SneakModule extends Module {
   public SneakModule() {
      super(Category.PLAYER, "Sneak", "Always sneaks");
   }

   @Override
   public void onDisable() {
      client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.PRESS_SHIFT_KEY));
   }

   @EventListen
   public void method_44822(class_1393 var1) {
      if (this.method_42015()) {
         if (!var1.method_6449()) {
            client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.PRESS_SHIFT_KEY));
            client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.RELEASE_SHIFT_KEY));
         } else {
            client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.RELEASE_SHIFT_KEY));
            client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.PRESS_SHIFT_KEY));
         }
      }
   }
}
