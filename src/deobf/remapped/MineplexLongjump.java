package remapped;

public class MineplexLongjump extends Module {
   private double field_21693;
   private double field_21694;
   private int field_21695;
   private int field_21691;
   private int field_21690;
   private boolean field_21696;

   public MineplexLongjump() {
      super(Category.MOVEMENT, "Mineplex", "Mineplex longjump.");
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(class_8865.method_40775() * 0.7);
   }

   @Override
   public void onEnable() {
      this.field_21696 = true;
      this.field_21695 = -1;
      this.field_21691 = 0;
      this.field_21690 = 0;
   }

   @EventListen
   public void method_20637(class_1393 var1) {
      if (this.method_42015() && var1.method_6449() && this.field_21695 >= 0) {
         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_20638(class_7767 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!client.thePlayer.field_41726) {
            if (this.field_21695 >= 0) {
               if (this.field_21696 && !class_314.method_1434()) {
                  this.field_21696 = !this.field_21696;
                  this.field_21693 = 0.5;
                  this.field_21691 = 1;
               }

               this.field_21695++;
               this.field_21694 -= 0.04000000000001;
               if (this.field_21695 <= 22) {
                  if (this.field_21695 == 10 && this.field_21696) {
                     this.field_21694 = -0.005;
                  }
               } else {
                  this.field_21694 -= 0.02;
               }

               if (this.field_21695 > 6 && !class_314.method_1434()) {
                  this.field_21694 -= 0.05;
               }

               if (client.thePlayer.field_41744) {
                  this.field_21693 = 0.35;
                  this.field_21691 = 1;
               }

               if (client.thePlayer.field_41774) {
                  this.field_21694 = -0.078;
                  this.field_21695 = 23;
               }

               this.field_21693 -= 0.01;
               if (this.field_21693 < 0.3) {
                  this.field_21693 = 0.3;
               }

               class_8865.method_40777(var1, this.field_21693);
               var1.method_35235(this.field_21694);
            }
         } else {
            if (this.field_21690 > 1) {
               this.field_21691 = 0;
            } else {
               this.field_21690++;
            }

            if (this.field_21695 > 0) {
               this.field_21695 = -1;
               if (this.method_42017().getBooleanValueByName("Auto Disable")) {
                  this.method_42017().method_41999();
                  return;
               }
            }

            this.field_21696 = class_314.method_1434();
            class_1331 var4 = new class_1331(
               client.thePlayer.method_37302(), client.thePlayer.method_37309() - 0.4, client.thePlayer.method_37156()
            );
            if (class_314.method_1434()
               && (this.method_42017().getBooleanValueByName("BorderJump") && !class_7494.method_34090(var4) || this.method_42017().getBooleanValueByName("Auto Jump"))) {
               client.thePlayer.method_26595();
               var1.method_35235(client.thePlayer.method_37098().field_7333);
               class_8865.method_40777(var1, 0.0);
            }
         }
      }
   }

   @EventListen
   public void method_20636(class_2911 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         this.field_21693 = 0.81 + (double)this.field_21691 * 0.095;
         if (client.thePlayer.method_37309() != (double)((int) client.thePlayer.method_37309())) {
            this.field_21693 = 0.52;
            this.field_21691 = 1;
         }

         this.field_21690 = 0;
         this.field_21694 = 0.4299999;
         if (this.field_21691 < 2) {
            this.field_21691++;
         }

         this.field_21695 = 0;
         var1.method_13315(0.0);
         var1.method_13313(this.field_21694);
      }
   }

   @EventListen
   public void method_20635(PacketEvent var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (var1.method_557() instanceof class_509) {
            this.field_21695 = -1;
            this.field_21691 = 0;
         }
      }
   }
}
