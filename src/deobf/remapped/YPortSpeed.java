package remapped;

public class YPortSpeed extends Module {
   private boolean field_13515;
   private double field_13513;
   private double field_13511;
   private double field_13514;
   private int field_13516;

   public YPortSpeed() {
      super(Category.MOVEMENT, "YPort", "YPort speed");
      this.addSetting(new ModeSetting("Mode", "YPort mode", 0, "NCP", "OldNCP"));
      this.addSetting(new BooleanSetting("OnGround", "See yourself on ground", true));
   }

   @EventListen
   public void method_12600(class_1393 var1) {
      if (this.method_42015() && client.thePlayer != null && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).method_42015()) {
         if (client.thePlayer.field_41726 && var1.method_6449() && class_314.method_1387()) {
            var1.method_6455(var1.method_6454() + 1.0E-14);
         }
      }
   }

   @Override
   public void onEnable() {
      this.field_13515 = false;
      this.field_13516 = 0;
      this.field_13511 = client.thePlayer != null ? class_8865.method_40775() : 0.2873;
      this.field_13513 = client.thePlayer.method_37309();
   }

   @Override
   public void onDisable() {
      this.field_13515 = false;
      if (client.thePlayer.method_37098().field_7333 > 0.33) {
         class_314.method_1408(-0.43 + (double)class_8865.method_40769() * 0.1);
         class_8865.method_40776(class_8865.method_40775());
      }
   }

   @EventListen
   public void method_12598(class_7767 var1) {
      if (this.method_42015() && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).method_42015()) {
         if (!client.thePlayer.field_29654) {
            String var4 = this.getStringValueByName("Mode");
            switch (var4) {
               case "NCP":
                  if (class_8865.method_40772() && client.thePlayer.field_41726) {
                     client.thePlayer.method_26595();
                     var1.method_35235(client.thePlayer.method_37098().field_7333);
                     class_8865.method_40777(var1, 0.461);
                     this.field_13515 = true;
                     client.thePlayer.field_41733 = 0.5F;
                  } else if (this.field_13515
                     && class_314.method_1413(client.thePlayer, (float)(class_8865.method_40786() + (double)class_8865.method_40769() * 0.1 + 0.001F))) {
                     this.field_13515 = !this.field_13515;
                     class_8865.method_40777(var1, 0.312);
                     var1.method_35235(-0.43 + (double)class_8865.method_40769() * 0.1);
                     class_314.method_1408(var1.method_35236());
                     client.thePlayer.field_41733 = 0.0F;
                  } else if (this.field_13515) {
                     var1.method_35235(-0.1);
                     this.field_13515 = !this.field_13515;
                  }
                  break;
               case "OldNCP":
                  if (client.thePlayer.field_41726 && class_314.method_1434()) {
                     this.field_13516 = 2;
                  }

                  if (this.field_13516 == 1 && class_314.method_1434()) {
                     this.field_13516 = 2;
                     this.field_13511 = 1.38 * class_8865.method_40775() - 0.01;
                  } else if (this.field_13516 == 2) {
                     this.field_13516 = 3;
                     double var8 = 0.401448482 + 0.002 * Math.random();
                     var8 *= 1.0 + Math.sqrt((double)((float)class_8865.method_40769() / 2.0F)) / 2.0;
                     var1.method_35235(var8);
                     this.field_13511 *= 2.149;
                  } else if (this.field_13516 == 3) {
                     this.field_13516 = 4;
                     double var6 = 0.66 * (this.field_13514 - class_8865.method_40775());
                     this.field_13511 = this.field_13514 - var6;
                  } else {
                     if (client.theWorld
                              .method_6680(
                                 client.thePlayer,
                                 client.thePlayer.field_41712.method_18918(0.0, client.thePlayer.method_37098().field_7333, 0.0)
                              )
                              .count()
                           > 0L
                        || client.thePlayer.field_41774) {
                        this.field_13516 = 1;
                     }

                     this.field_13511 = this.field_13514 - this.field_13514 / 159.0;
                  }

                  this.field_13511 = Math.max(this.field_13511, class_8865.method_40775());
                  class_8865.method_40777(var1, this.field_13511);
                  client.thePlayer.field_41733 = 0.6F;
                  class_314.method_1408(var1.method_35236());
            }
         }
      }
   }

   @EventListen
   private void method_12602(class_4868 var1) {
      if (this.method_42015()
         && !this.getStringValueByName("Mode").equalsIgnoreCase("NCP")
         && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).method_42015()) {
         if (!client.thePlayer.method_37285() && !client.thePlayer.method_37370() && !client.thePlayer.method_26505()) {
            if (!client.gameOptions.keyJump.pressed
               && !client.thePlayer.method_26505()
               && !class_8865.method_40771()
               && !client.thePlayer.method_37285()
               && class_314.method_1413(client.thePlayer, 1.0F)
               && !client.thePlayer.field_41726
               && this.field_13516 == 3) {
               class_314.method_1408(-0.3994);
            }

            double var4 = client.thePlayer.method_37302() - client.thePlayer.field_41767;
            double var6 = client.thePlayer.method_37156() - client.thePlayer.field_41725;
            this.field_13514 = Math.sqrt(var4 * var4 + var6 * var6);
         }
      }
   }

   @EventListen
   public void method_12599(class_1711 var1) {
      if (this.method_42015()
         && class_314.method_1413(client.thePlayer, 0.43F)
         && !((double) client.thePlayer.field_41706 > 0.09)
         && this.getBooleanValueByName("OnGround")
         && !client.gameOptions.keyJump.pressed
         && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).method_42015()) {
         if (client.thePlayer.field_41726 && class_314.method_1413(client.thePlayer, 0.001F)) {
            this.field_13513 = client.thePlayer.method_37309();
         }

         client.thePlayer.field_41736.field_7333 = this.field_13513;
         client.thePlayer.field_41713 = this.field_13513;
         client.thePlayer.field_3864 = this.field_13513;
         client.thePlayer.field_41698 = this.field_13513;
         if (class_8865.method_40772()) {
            client.thePlayer.field_3859 = 0.099999994F;
         }
      }
   }

   @EventListen
   private void method_12601(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            this.field_13514 = 0.0;
         }
      }
   }
}
