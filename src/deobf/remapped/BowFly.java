package remapped;

public class BowFly extends Module {
   private int field_8926;
   private Timer field_8927 = new Timer();

   public BowFly() {
      super(Category.MOVEMENT, "Bow", "Fly for Bow");
   }

   @Override
   public void onDisable() {
      if (client.theTimer.timerSpeed == 0.1F) {
         client.theTimer.timerSpeed = 1.0F;
      }
   }

   @Override
   public void method_42012() {
   }

   @EventListen
   public void method_7737(class_4996 var1) {
      if (this.isEnabled()) {
         if (client.thePlayer.method_26617(Hand.MAIN_HAND).method_27960() == class_4897.field_25206 && this.field_8926 >= 1) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_7738(class_7767 var1) {
      if (this.isEnabled()) {
         double var4 = var1.method_35233().field_7333;
         var1.method_35233().field_7333 = 0.0;
         double var6 = var1.method_35233().method_6217();
         var1.method_35233().field_7333 = var4;
         float var8 = class_8865.method_40773()[1];
         float var9 = class_8865.method_40773()[2];
         float var10 = class_8865.method_40773()[0];
         System.out.println(var6);
         if ((var8 != 0.0F || var9 != 0.0F) && !(var1.method_35233().field_7333 < -0.5)) {
            double var11 = Math.cos(Math.toRadians((double)var10));
            double var13 = Math.sin(Math.toRadians((double)var10));
            var1.method_35232((double)var8 * var6 * var11 + (double)var9 * var6 * var13);
            var1.method_35229((double)var8 * var6 * var13 - (double)var9 * var6 * var11);
            client.thePlayer.method_37098().field_7336 = var1.method_35234();
            client.thePlayer.method_37098().field_7333 = var1.method_35236();
         } else {
            var1.method_35232(0.0);
            var1.method_35229(0.0);
         }
      }
   }

   @EventListen
   public void method_7739(class_1393 var1) {
      if (this.isEnabled() && var1.method_6449()) {
         if (!this.field_8927.method_14771()) {
            this.field_8927.method_14776();
         }

         int var4 = this.method_7736();
         if (var4 >= 0 || var4 <= 8) {
            if (client.thePlayer.method_26617(Hand.MAIN_HAND).method_27960() == class_4897.field_25206) {
               if (InvManagerModule.method_23723(class_4897.field_25024) == 0) {
                  if (this.field_8927.method_14772() > 5000L) {
                     SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("BowFly", "You have no arrows"));
                     this.field_8927.method_14773();
                  }

                  if (client.theTimer.timerSpeed == 0.1F) {
                     client.theTimer.timerSpeed = 1.0F;
                  }

                  return;
               }

               float var5 = client.thePlayer.rotationYaw;
               float var6 = -90.0F;
               if (client.thePlayer.field_29673 != 0.0F || client.thePlayer.field_29676 != 0.0F) {
                  var6 = -80.0F;
               }

               if (client.thePlayer.field_29673 < 0.0F) {
                  var5 -= 180.0F;
               }

               if (client.thePlayer.method_37098().field_7333 < -0.1) {
                  var6 = 90.0F;
               }

               var1.method_6448(var6);
               var1.method_6441(var5);
               if (client.thePlayer.onGround && client.thePlayer.collidedVertically) {
                  client.thePlayer.method_26595();
               } else if (!(client.thePlayer.method_37098().field_7333 < 0.0)) {
                  if (client.theTimer.timerSpeed == 0.1F) {
                     client.theTimer.timerSpeed = 1.0F;
                  }
               } else {
                  client.theTimer.timerSpeed = 0.1F;
               }

               this.field_8926++;
               if (this.field_8926 < 4) {
                  if (this.field_8926 == 1) {
                     client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
                  }
               } else {
                  client.method_8614().sendPacket(new class_1586(class_7500.field_38259, BlockPos.field_7306, Direction.field_802));
                  this.field_8926 = 0;
               }
            }
         }
      }
   }

   private int method_7736() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (client.thePlayer.field_3869.method_18878(var3).method_35884()) {
            ItemStack var4 = client.thePlayer.field_3869.method_18878(var3).method_35898();
            if (var4.method_27960() == class_4897.field_25206) {
               return var3 - 36;
            }
         }
      }

      for (int var5 = 9; var5 < 36; var5++) {
         if (client.thePlayer.field_3869.method_18878(var5).method_35884()) {
            ItemStack var6 = client.thePlayer.field_3869.method_18878(var5).method_35898();
            if (var6.method_27960() == class_4897.field_25206) {
               class_2740.method_12312(var5, 7);
               return 7;
            }
         }
      }

      return -1;
   }
}
