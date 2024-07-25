package remapped;

import java.util.ArrayList;

public class class_9782 {
   public Timer field_49649;
   public int field_49646;
   public Entity field_49648;
   public MinecraftClient field_49645 = MinecraftClient.getInstance();

   public class_9782() {
      this.field_49649 = new Timer();
      SigmaMainClass.getInstance().getEventManager().subscribe2(this);
   }

   @EventListen
   @class_3932
   public void method_45154(class_1393 var1) {
      if (this.field_49648 != null) {
         if (this.field_49646 != 1) {
            if (this.field_49646 == 2) {
               boolean var4 = class_314.method_1387();
               if (var4) {
                  PlayerAbilities var5 = new PlayerAbilities();
                  var5.isFlying = true;
                  Entity var6 = null;

                  for (Entity var8 : class_314.method_1440()) {
                     if (var8 instanceof class_704
                        && var8 != this.field_49645.thePlayer
                        && (var6 == null || var6.method_37175(this.field_49645.thePlayer) > var8.method_37175(this.field_49645.thePlayer))) {
                        var6 = var8;
                     }
                  }

                  this.field_49645.method_8614().sendPacket(new class_3835(0, (short)-1, false));
                  this.field_49645.method_8614().sendPacket(new class_9808(var5));
                  if (var6 != null) {
                     this.field_49645.method_8614().sendPacket(new class_6404(var6.method_37328()));
                  }

                  this.field_49645.method_8614().sendPacket(new CInputPacket(0.98F, 0.98F, false, false));
               }

               Thread var9 = new Thread(
                  () -> {
                     try {
                        class_4714 var4x = new class_4714(this.field_49648.getPosX(), this.field_49648.method_37309(), this.field_49648.getPosZ());
                        class_4714 var5x = new class_4714(
                           this.field_49645.thePlayer.getPosX(), this.field_49645.thePlayer.method_37309(), this.field_49645.thePlayer.getPosZ()
                        );
                        ArrayList var6x = class_6306.method_28770(var5x, var4x);
                        SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Teleport", "Successfully teleported !"));
                        Entity var7 = this.field_49645.thePlayer.method_37243();

                        for (class_4714 var9x : var6x) {
                           if (var7 != null) {
                              var7.field_41736.field_7336 = var9x.method_21803() + 0.5;
                              var7.field_41736.field_7333 = var9x.method_21801();
                              var7.field_41736.field_7334 = var9x.method_21799() + 0.5;
                              this.field_49645.method_8614().sendPacket(new class_8125(false, false));
                              this.field_49645
                                 .method_8614()
                                 .sendPacket(new RotationPacket(this.field_49645.thePlayer.rotationYaw, this.field_49645.thePlayer.rotationPitch, false));
                              this.field_49645.method_8614().sendPacket(new CInputPacket(0.0F, 1.0F, false, false));
                              BoatEntity var10 = new BoatEntity(
                                 this.field_49645.theWorld, var9x.method_21803() + 0.5, var9x.method_21801(), var9x.method_21799() + 0.5
                              );
                              var10.rotationYaw = var7.rotationYaw;
                              var10.rotationPitch = var7.rotationPitch;
                              this.field_49645.method_8614().sendPacket(new CMoveVehiclePacket(var10));
                           } else if (var4) {
                              this.field_49645
                                 .method_8614()
                                 .sendPacket(new class_9515(var9x.method_21803(), var9x.method_21801(), var9x.method_21799(), false));
                           } else {
                              this.field_49645
                                 .method_8614()
                                 .sendPacket(new class_9515(var9x.method_21803(), var9x.method_21801(), var9x.method_21799(), true));
                           }
                        }

                        if (var4) {
                           this.field_49645.method_8614().sendPacket(new class_9515(var4x.field_22878, var4x.field_22880, var4x.field_22879, false));
                        }

                        this.field_49645.thePlayer.method_37256(var4x.field_22878, var4x.field_22880, var4x.field_22879);
                        this.field_49648 = null;
                        if (var4) {
                           PlayerAbilities var12 = new PlayerAbilities();
                           var12.isFlying = false;
                           this.field_49645.method_8614().sendPacket(new class_9808(var12));
                        }
                     } catch (Exception var11) {
                        var11.printStackTrace();
                     }
                  }
               );
               var9.start();
               this.field_49646 = 0;
            }
         } else {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   @class_3932
   public void method_45152(class_7767 var1) {
      if (this.field_49646 == 1) {
         var1.method_35232(0.0);
         var1.method_35235(0.0);
         var1.method_35229(0.0);
         if (this.field_49648 == null || !this.field_49648.isAlive() || !class_314.method_1440().contains(this.field_49648)) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Teleport", "Target lost"));
            this.field_49646 = 0;
            this.field_49648 = null;
         } else if (!this.field_49645.thePlayer.isSneaking()) {
            double var4 = this.field_49648.method_37309() - this.field_49648.field_41713;
            if (var4 < -2.0 && class_314.method_1432(this.field_49648) && this.field_49648.method_37309() - this.field_49645.thePlayer.method_37309() < -10.0) {
               this.field_49646 = 0;
               this.field_49648 = null;
               SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Teleport", "Target seems to be falling in void"));
            }
         } else {
            this.field_49646 = 0;
            this.field_49648 = null;
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Teleport", "Teleport canceled"));
         }

         if (this.field_49649.method_14772() > 7000L) {
            this.field_49646 = 0;
            this.field_49648 = null;
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Teleport", "Failed teleport !"));
         }
      }
   }

   @EventListen
   @class_3932
   public void method_45155(PacketEvent var1) {
      if (this.field_49646 == 1) {
         if (var1.method_557() instanceof class_509) {
            this.field_49646 = 2;
         }
      }
   }
}
