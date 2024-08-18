package remapped;

public class AntiLevitationModule extends Module {
   public AntiLevitationModule() {
      super(Category.MISC, "AntiLevitation", "Removes levitation effects");
   }

   @EventListen
   public void method_33472(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         client.thePlayer.removeEffect(Effects.LevitationEffect);
      }
   }
}
