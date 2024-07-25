package remapped;

public class class_1268 extends Module {
   public class_1268() {
      super(Category.COMBAT, "HitSounds", "Changes the player hurting sounds client side.");
   }

   @EventListen
   @class_7664
   private void method_5701(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_295) {
            class_295 var4 = (class_295)var1.method_557();
            if (var4.method_1331(client.theWorld) == null
               || !var4.method_1331(client.theWorld).isAlive()
               || var4.method_1331(client.theWorld).method_37175(client.thePlayer) > 5.0F
               || var4.method_1331(client.theWorld) == client.thePlayer) {
               return;
            }
         }
      }
   }
}
