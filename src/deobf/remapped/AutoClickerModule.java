package remapped;

import java.util.Random;

public class AutoClickerModule extends Module {
   private int field_34164;

   public AutoClickerModule() {
      super(Category.COMBAT, "AutoClicker", "Longpress your attack keybind to hit entities automaticly");
   }

   @EventListen
   private void method_30401(class_5596 var1) {
      if (this.method_42015()) {
         this.field_34164++;
         Random var4 = new Random();
         byte var5 = 2;
         byte var6 = 4;
         int var7 = var4.nextInt(var6 - var5) + var5;
         if (client.gameOptions.keyAttack.isKeyDown() && this.field_34164 >= var7) {
            client.thePlayer.method_26597(Hand.MAIN_HAND);
            this.field_34164 = 0;
            if (class_314.method_1458(client.thePlayer.rotationYaw, client.thePlayer.rotationPitch, 4.6F, 0.0) != null) {
               client.method_8614()
                  .sendPacket(
                     new class_3398(
                        class_314.method_1458(client.thePlayer.rotationYaw, client.thePlayer.rotationPitch, 4.6F, 0.0),
                        client.thePlayer.isSneaking()
                     )
                  );
               client.thePlayer.method_26597(Hand.MAIN_HAND);
            }
         }
      }
   }
}
