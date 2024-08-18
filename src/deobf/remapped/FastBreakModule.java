package remapped;

public class FastBreakModule extends Module {
   public FastBreakModule() {
      super(Category.WORLD, "FastBreak", "Break blocks faster");
   }

   @EventListen
   private void method_4769(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         if (client.playerController.field_46832 > 0.7F) {
            client.playerController.field_46832 = 1.0F;
         }

         client.playerController.field_46831 = 0;
      }
   }
}
