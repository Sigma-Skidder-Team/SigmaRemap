package remapped;

public class JetpackFly extends Module {
   public JetpackFly() {
      super(Category.MOVEMENT, "Jetpack", "A jetpack type fly");
   }

   @EventListen
   public void method_5589(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         if (client.thePlayer.field_29654) {
            client.thePlayer.method_26595();
         }
      }
   }
}
