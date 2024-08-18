package remapped;

public class AutoRespawnModule extends Module {
   public int field_48266 = 30;

   public AutoRespawnModule() {
      super(Category.PLAYER, "AutoRespawn", "Respawns for you");
   }

   @EventListen
   public void method_43730(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         if (!client.thePlayer.isAlive()) {
            client.thePlayer.method_3205();
         }
      }
   }
}
