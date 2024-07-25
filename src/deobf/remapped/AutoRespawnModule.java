package remapped;

public class AutoRespawnModule extends Module {
   public int field_48266 = 30;

   public AutoRespawnModule() {
      super(Category.PLAYER, "AutoRespawn", "Respawns for you");
   }

   @EventListen
   public void method_43730(class_5596 var1) {
      if (this.method_42015()) {
         if (!client.thePlayer.method_37330()) {
            client.thePlayer.method_3205();
         }
      }
   }
}
