package remapped;

public class ParkourModule extends Module {
   public ParkourModule() {
      super(Category.PLAYER, "Parkour", "Automatically jumps at the edge of blocks");
   }

   @EventListen
   public void method_14758(class_4868 var1) {
      if (this.method_42015()) {
         if (mc.field_9632.field_41726) {
            if (!class_314.method_1452()) {
               mc.field_9632.method_26595();
            }
         }
      }
   }
}
