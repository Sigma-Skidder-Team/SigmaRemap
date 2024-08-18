package remapped;

public class FastBowModule extends Module {
   private int field_29085;

   public FastBowModule() {
      super(Category.COMBAT, "FastBow", "Shoots arrows faster");
   }

   @EventListen
   private void method_25988(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         if (client.thePlayer.method_26446() != null
            && client.thePlayer.method_26446().method_27960() instanceof class_2100
            && client.thePlayer.onGround) {
            for (int var4 = 0; var4 < 25; var4++) {
               client.method_8614().sendPacket(new class_4609(true));
            }

            client.method_8614().sendPacket(new class_1586(class_7500.field_38259, BlockPos.field_7306, Direction.field_802));
         }
      }
   }
}
