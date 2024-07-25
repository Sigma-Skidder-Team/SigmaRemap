package remapped;

import java.util.List;

public class AACBlockFly extends Module {
   private float field_12315;
   private float field_12313;
   private int field_12316 = 0;
   private int field_12311 = 0;
   private int field_12318;
   private int field_12312;
   private double field_12314;

   public AACBlockFly() {
      super(Category.MOVEMENT, "AAC", "Places block underneath if it is in hand");
      this.addSetting(new BooleanSetting("Haphe (AACAP)", "Never let's you touch the ground.", false));
   }

   @Override
   public void onEnable() {
      this.field_12311 = client.thePlayer.inventory.field_36404;
      this.field_12315 = client.thePlayer.rotationYaw;
      this.field_12313 = client.thePlayer.rotationPitch;
      this.field_12316 = (int) client.thePlayer.method_37309();
      this.field_12312 = -1;
      ((BlockFlyModule)this.getModule()).field_18196 = -1;
   }

   @Override
   public void onDisable() {
      if (this.field_12311 != -1 && this.getModule().getStringValueByName("ItemSpoof").equals("Switch")) {
         client.thePlayer.inventory.field_36404 = this.field_12311;
      }

      this.field_12311 = -1;
      if (((BlockFlyModule)this.getModule()).field_18196 >= 0) {
         client.method_8614().sendPacket(new class_7371(client.thePlayer.inventory.field_36404));
         ((BlockFlyModule)this.getModule()).field_18196 = -1;
      }

      client.theTimer.timerSpeed = 1.0F;
   }

   @EventListen
   @class_7664
   public void method_11335(class_2157 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (var1.method_10047() instanceof class_7371 && ((BlockFlyModule)this.getModule()).field_18196 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_11338(PacketEvent var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            this.field_12312 = 0;
         }
      }
   }

   @EventListen
   public void method_11342(class_7982 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.onGround && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SafeWalkModule.class).method_42015()) {
            var1.method_36186(true);
         }
      }
   }

   @EventListen
   public void method_11337(class_7767 var1) {
      if (this.method_42015()) {
         if (this.getModule().getBooleanValueByName("No Sprint")) {
            client.thePlayer.method_37140(false);
         }

         if (!this.getBooleanValueByName("Haphe (AACAP)")) {
            client.gameOptions.keySprint.pressed = false;
            client.thePlayer.method_37140(false);
         }

         ((BlockFlyModule)this.getModule()).method_17220(var1);
         if (this.getBooleanValueByName("Haphe (AACAP)")) {
            if (!client.thePlayer.onGround || client.thePlayer.field_29673 == 0.0F && client.thePlayer.field_29676 == 0.0F) {
               if (this.field_12318 >= 0) {
                  this.field_12318++;
               }
            } else {
               this.field_12318 = 0;
               client.thePlayer.method_26595();
               var1.method_35235(0.419998 + (double)class_8865.method_40769() * 0.1);
               if (this.field_12312 < 3) {
                  this.field_12312++;
               }
            }

            if (client.thePlayer.field_29673 == 0.0F && client.thePlayer.field_29676 == 0.0F || client.thePlayer.collidedHorizontally) {
               this.field_12312 = 0;
            }

            this.field_12314 = AACSpeed.method_27638(this.field_12318, this.field_12312, () -> this.field_12312 = 0);
            if (this.field_12318 >= 0) {
               class_8865.method_40777(var1, this.field_12314);
            }
         }
      }
   }

   @EventListen
   private void method_11341(class_8128 var1) {
      if (this.method_42015() && client.theWorld != null && client.thePlayer != null) {
         if (this.getBooleanValueByName("Haphe (AACAP)") && class_8865.method_40772() && !client.thePlayer.method_37321()) {
            var1.field_41637 *= 1.14F;
         }
      }
   }

   private boolean method_11333() {
      class_9529 var3 = (class_9529)class_7494.method_34115(
         client.thePlayer.lastReportedYaw, client.thePlayer.lastReportedPitch, class_7494.method_34074(), 0.0F
      );
      boolean var4 = false;
      if (var3 != null && var3.method_33990() == class_1430.field_7717) {
         if (this.getModule().getStringValueByName("ItemSpoof").equals("None")) {
            BlockFlyModule var10000 = (BlockFlyModule)this.getModule();
            if (!BlockFlyModule.method_17216(client.thePlayer.method_26617(Hand.MAIN_HAND).method_27960())) {
               return false;
            }
         }

         if (this.getBooleanValueByName("Haphe (AACAP)") && !client.thePlayer.field_29654 && !client.thePlayer.onGround) {
            if (var3.method_43956() == Direction.field_817) {
               return false;
            }

            if (var3.method_43955().getY() != this.field_12316 - 1) {
               return false;
            }
         }

         if (var3.method_43956() == Direction.field_817
            && (double)(var3.method_43955().getY() + 2) > client.thePlayer.method_37309()
            && class_7494.method_34090(var3.method_43955())) {
            return false;
         }

         if ((double)var3.method_43955().getY() == client.thePlayer.method_37309()) {
            return false;
         }

         ((BlockFlyModule)this.getModule()).method_17215();
         int var5 = client.thePlayer.inventory.field_36404;
         if (!this.getModule().getStringValueByName("ItemSpoof").equals("None")) {
            ((BlockFlyModule)this.getModule()).method_17211();
         }

         class_6910 var6 = client.playerController.method_42147(client.thePlayer, client.theWorld, Hand.MAIN_HAND, var3);
         if (this.getModule().getStringValueByName("ItemSpoof").equals("Spoof") || this.getModule().getStringValueByName("ItemSpoof").equals("LiteSpoof")) {
            client.thePlayer.inventory.field_36404 = var5;
         }

         if (var6 == class_6910.field_35520) {
            if (!this.getModule().getBooleanValueByName("NoSwing")) {
               client.thePlayer.method_26597(Hand.MAIN_HAND);
            } else {
               client.method_8614().sendPacket(new class_3195(Hand.MAIN_HAND));
            }

            if (var3.method_43956() == Direction.field_817) {
               this.field_12316 = var3.method_43955().getY() + 2;
            }

            var4 = true;
         }
      }

      return var4;
   }

   public List<class_7606> method_11334(class_6414 var1, BlockPos var2) {
      return class_7829.method_35452(var1, var2, (int) client.playerController.method_42146());
   }

   @EventListen
   public void method_11339(class_1711 var1) {
      if (this.method_42015()) {
         if (!this.getBooleanValueByName("Haphe (AACAP)")) {
            ;
         }
      }
   }

   @EventListen
   @class_4249
   private void method_11336(class_1393 var1) {
      if (this.method_42015()) {
         if (!var1.method_6449()) {
            if (class_8865.method_40772() && client.thePlayer.onGround && this.getBooleanValueByName("Haphe (AACAP)") && !client.thePlayer.field_29654) {
               client.thePlayer.method_26595();
            }

            if (!this.getBooleanValueByName("Haphe (AACAP)")) {
               if (!this.method_11333()) {
                  float var11 = 0.0F;

                  while (var11 < 0.7F && !this.method_11333()) {
                     var11 += 0.1F;
                  }
               }
            } else {
               this.method_11333();
            }
         } else {
            double var4 = client.thePlayer.method_37309();
            if (!client.thePlayer.field_29654 && this.getBooleanValueByName("Haphe (AACAP)")) {
               var4 = (double)this.field_12316;
            }

            BlockPos var6 = new BlockPos(client.thePlayer.getPosX(), (double)Math.round(var4 - 1.0), client.thePlayer.getPosZ());
            List var7 = this.method_11334(class_4783.field_23644, var6);
            if (!var7.isEmpty()) {
               class_7606 var8 = (class_7606)var7.get(var7.size() - 1);
               class_9529 var9 = class_7494.method_34079(this.field_12315, this.field_12313, 5.0F);
               if (!var9.method_43955().equals(var8.field_38725) || !var9.method_43956().equals(var8.field_38724)) {
                  float[] var10 = class_7494.method_34097(var8.field_38725, var8.field_38724);
                  this.field_12315 = class_7494.method_34097(var8.field_38725, var8.field_38724)[0];
                  this.field_12313 = class_7494.method_34097(var8.field_38725, var8.field_38724)[1];
               }
            }

            var1.method_6448(this.field_12313);
            var1.method_6441(this.field_12315);
         }
      }
   }

   @EventListen
   public void method_11340(class_2911 var1) {
      if (this.method_42015()) {
         if (this.getModule().getStringValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
            && (!class_314.method_1434() || this.getModule().getBooleanValueByName("Tower while moving"))) {
            var1.method_29715(true);
         }
      }
   }
}
