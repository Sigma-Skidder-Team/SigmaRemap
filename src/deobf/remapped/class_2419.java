package remapped;

import java.util.ArrayList;

public class class_2419 extends Module {
   private int field_12048;
   private ArrayList<class_6287> field_12047 = new ArrayList<class_6287>();

   public class_2419() {
      super(Category.EXPLOIT, "Viper", "Disabler for ViperMC");
   }

   @Override
   public void onEnable() {
      this.field_12048 = 0;
   }

   @EventListen
   public void method_11038(class_1393 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         this.field_12048++;
         boolean var4 = var1.method_6454() > client.thePlayer.method_37309() - 1.0E-6
            && var1.method_6454() < client.thePlayer.method_37309() + 1.0E-6;
         if (var4) {
            var1.method_6455(client.thePlayer.method_37309() + 0.4);
            var1.method_6451(false);
         }

         if (this.field_12048 > 60) {
            var1.method_6455(client.thePlayer.method_37309() + 0.4);
            var1.method_6451(false);
         } else {
            for (int var5 = 0; var5 < 10; var5++) {
               boolean var6 = var5 > 2 && var5 < 8;
               double var7 = !var6 ? -0.2 : 0.2;
               class_9515 var9 = new class_9515(
                  client.thePlayer.method_37302(), client.thePlayer.method_37309() + var7, client.thePlayer.method_37156(), true
               );
               client.method_8614().method_4813(var9);
            }

            client.thePlayer.lastReportedPosY = 0.0;
            if (client.thePlayer.field_41697 <= 1) {
               this.field_12047.clear();
            }

            if (!this.field_12047.isEmpty()) {
               for (int var10 = 0; var10 < this.field_12047.size(); var10++) {
                  class_6287 var11 = this.field_12047.get(var10);
                  if (var11.method_28689()) {
                     client.method_8614().method_4813(var11.method_28687());
                     this.field_12047.remove(var10);
                  }
               }
            }
         }
      }
   }

   @EventListen
   public void method_11039(PacketEvent var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_7573) {
            class_7573 var5 = (class_7573)var4;
            var1.method_29715(true);
         }

         if (var4 instanceof class_8913) {
            class_8913 var6 = (class_8913)var4;
            var1.method_29715(true);
         }
      }
   }
}
