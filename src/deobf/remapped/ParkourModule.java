package remapped;

public class ParkourModule extends Module {
   public ParkourModule() {
      super(Category.PLAYER, "Parkour", "Automatically jumps at the edge of blocks");
   }

   @EventListen
   public void method_14758(class_4868 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_41726) {
            if (!class_314.method_1452()) {
               client.thePlayer.method_26595();
            }
         }
      }
   }
}
