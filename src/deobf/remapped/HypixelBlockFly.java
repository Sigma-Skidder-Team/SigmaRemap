package remapped;

public class HypixelBlockFly extends Module {
   private float field_31711;
   private float field_31712;
   private class_2899 field_31718;
   private int field_31713 = -1;
   private int field_31714;
   private int field_31716;
   private Hand field_31708;
   private BlockFlyModule field_31710 = null;
   private boolean field_31719;
   private boolean field_31715 = false;
   private double field_31717;

   public HypixelBlockFly() {
      super(Category.MOVEMENT, "Hypixel", "Places block underneath");
      this.addSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
      this.addSetting(new BooleanSetting("KeepRotations", "Keeps your rotations.", true));
      this.addSetting(new BooleanSetting("Downwards", "Allows you to go down when sneaking.", true));
   }

   @Override
   public void method_42012() {
      this.field_31710 = (BlockFlyModule)this.getModule();
   }

   @Override
   public void onEnable() {
      this.field_31713 = client.thePlayer.inventory.field_36404;
      this.field_31712 = this.field_31711 = 999.0F;
      ((BlockFlyModule)this.getModule()).field_18196 = -1;
      if (client.gameOptions.keySneak.isKeyDown() && this.getBooleanValueByName("Downwards")) {
         client.gameOptions.keySneak.pressed = false;
         this.field_31719 = true;
      }

      if (!client.gameOptions.keySneak.isKeyDown()) {
         this.field_31719 = false;
      }

      this.field_31717 = -1.0;
      this.field_31715 = false;
      if (client.thePlayer.onGround) {
         this.field_31717 = client.thePlayer.method_37309();
      }

      this.field_31716 = -1;
   }

   @Override
   public void onDisable() {
      if (this.field_31713 != -1 && this.getModule().getStringValueByName("ItemSpoof").equals("Switch")) {
         client.thePlayer.inventory.field_36404 = this.field_31713;
      }

      this.field_31713 = -1;
      if (((BlockFlyModule)this.getModule()).field_18196 >= 0) {
         client.method_8614().sendPacket(new class_7371(client.thePlayer.inventory.field_36404));
         ((BlockFlyModule)this.getModule()).field_18196 = -1;
      }

      class_8865.method_40776(class_8865.method_40775() * 0.9);
      client.theTimer.timerSpeed = 1.0F;
      if (this.getStringValueByName("Speed Mode").equals("Cubecraft") && this.field_31716 == 0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   public void method_28401(class_7982 var1) {
      if (this.isEnabled()) {
         if (this.getStringValueByName("Speed Mode").equals("Cubecraft") && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).isEnabled()) {
            if (client.theWorld
                     .method_6680(
                        client.thePlayer,
                        client.thePlayer.boundingBox.method_18928(0.0, -1.5, 0.0).method_18900(0.05, 0.0, 0.05).method_18900(-0.05, 0.0, -0.05)
                     )
                     .count()
                  == 0L
               && client.thePlayer.field_41706 < 1.0F) {
               var1.method_36186(true);
            }
         } else if (client.thePlayer.onGround
            && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SafeWalkModule.class).isEnabled()
            && (!this.field_31719 || !this.getBooleanValueByName("Downwards"))) {
            var1.method_36186(true);
         }
      }
   }

   @EventListen
   private void method_28408(class_6435 var1) {
      if (this.isEnabled() && this.getBooleanValueByName("Downwards")) {
         if (var1.method_29384() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_31719 = true;
         }
      }
   }

   @EventListen
   private void method_28407(class_307 var1) {
      if (this.isEnabled() && this.getBooleanValueByName("Downwards")) {
         if (var1.method_1364() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_31719 = false;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_28409(class_1393 var1) {
      if (this.isEnabled() && this.field_31710.method_17219() != 0) {
         SecondModule var4 = (SecondModule) SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class);
         if (!var4.isEnabled() || !var4.getStringValueByName("Type").equalsIgnoreCase("Hypixel") || !var4.method_16864().getStringValueByName("Bypass").equals("Blink")) {
            if (!var1.method_6449()) {
               this.field_31710.method_17215();
               if (this.field_31718 != null) {
                  class_9529 var20 = new class_9529(
                     method_28403(this.field_31718.field_14163, this.field_31718.field_14162),
                     this.field_31718.field_14162,
                     this.field_31718.field_14163,
                     false
                  );
                  int var21 = client.thePlayer.inventory.field_36404;
                  if (!this.getModule().getStringValueByName("ItemSpoof").equals("None")) {
                     this.field_31710.method_17211();
                  }

                  client.playerController.method_42147(client.thePlayer, client.theWorld, this.field_31708, var20);
                  if (!this.getModule().getBooleanValueByName("NoSwing")) {
                     client.thePlayer.method_26597(this.field_31708);
                  } else {
                     client.method_8614().sendPacket(new class_3195(this.field_31708));
                  }

                  if (this.getModule().getStringValueByName("ItemSpoof").equals("Spoof") || this.getModule().getStringValueByName("ItemSpoof").equals("LiteSpoof")) {
                     client.thePlayer.inventory.field_36404 = var21;
                  }
               }
            } else {
               this.field_31714++;
               var1.method_6444(true);
               this.field_31708 = Hand.MAIN_HAND;
               if (BlockFlyModule.method_17216(client.thePlayer.method_26617(Hand.OFF_HAND).method_27960())
                  && (
                     client.thePlayer.method_26617(this.field_31708).method_28022()
                        || !BlockFlyModule.method_17216(client.thePlayer.method_26617(this.field_31708).method_27960())
                  )) {
                  this.field_31708 = Hand.OFF_HAND;
               }

               double var5 = var1.method_6450();
               double var7 = var1.method_6438();
               double var9 = var1.method_6454();
               if (client.thePlayer.method_37098().field_7333 < 0.0
                  && client.thePlayer.field_41706 > 1.0F
                  && class_7494.method_34079(0.0F, 90.0F, 3.0F).method_33990() == class_1430.field_7721) {
                  var9 += Math.min(client.thePlayer.method_37098().field_7333 * 2.0, 4.0);
               } else if (this.field_31719 && this.getBooleanValueByName("Downwards")) {
                  var9--;
               } else if ((this.getStringValueByName("Speed Mode").equals("Jump") || this.getStringValueByName("Speed Mode").equals("Cubecraft"))
                  && !client.gameOptions.keyJump.isKeyDown()) {
                  var9 = this.field_31717;
               }

               if (!class_7494.method_34090(
                  new BlockPos(
                     client.thePlayer.method_37245().method_61(),
                     client.thePlayer.method_37245().method_60() - 1.0,
                     client.thePlayer.method_37245().method_62()
                  )
               )) {
                  var5 = client.thePlayer.method_37245().method_61();
                  var7 = client.thePlayer.method_37245().method_62();
               }

               BlockPos var11 = new BlockPos(var5, var9 - 1.0, var7);
               if (!class_7494.method_34090(var11) && this.field_31710.method_17224(this.field_31708)) {
                  class_2899 var12 = class_7494.method_34118(var11, !this.field_31719 && this.getBooleanValueByName("Downwards"));
                  this.field_31718 = var12;
                  if (var12 != null) {
                     float[] var13 = class_7494.method_34077(this.field_31718.field_14163, this.field_31718.field_14162);
                     if ((double)var12.field_14163.field_13230 - client.thePlayer.method_37309() < 0.0) {
                        double var14 = client.thePlayer.getPosX()
                           - ((double)var12.field_14163.field_13231 + 0.5 + (double)var12.field_14162.method_1041() / 2.0);
                        double var16 = client.thePlayer.getPosZ()
                           - ((double)var12.field_14163.field_13229 + 0.5 + (double)var12.field_14162.method_1034() / 2.0);
                        double var18 = Math.sqrt(var14 * var14 + var16 * var16);
                        if (var18 < 2.0) {
                           var13[0] = client.thePlayer.rotationYaw + 1.0F;
                           var13[1] = 90.0F;
                        }
                     }

                     this.field_31712 = var13[0];
                     this.field_31711 = var13[1];
                     var1.method_6441(this.field_31712);
                     var1.method_6448(this.field_31711);
                  }
               } else {
                  if (this.getBooleanValueByName("KeepRotations") && this.field_31711 != 999.0F) {
                     var1.method_6441(client.thePlayer.rotationYaw + 1.0F);
                     var1.method_6448(90.0F);
                  }

                  this.field_31718 = null;
               }

               if (client.thePlayer.rotationYaw != var1.method_6442() && client.thePlayer.rotationPitch != var1.method_6439()) {
                  this.field_31714 = 0;
               }
            }
         }
      }
   }

   @EventListen
   @class_315
   public void method_28400(class_7767 var1) {
      if (this.isEnabled() && this.field_31710.method_17219() != 0) {
         if (client.thePlayer.onGround || class_314.method_1413(client.thePlayer, 0.01F)) {
            this.field_31717 = client.thePlayer.method_37309();
         }

         if (this.getModule().getBooleanValueByName("No Sprint")) {
            client.thePlayer.method_37140(false);
         }

         if (client.thePlayer.onGround) {
            this.field_31716 = 0;
         } else if (this.field_31716 >= 0) {
            this.field_31716++;
         }

         if (this.field_31710 == null) {
            this.field_31710 = (BlockFlyModule)this.getModule();
         }

         String var4 = this.getStringValueByName("Speed Mode");
         switch (var4) {
            case "Jump":
               if (client.thePlayer.onGround && class_314.method_1434() && !client.thePlayer.isSneaking() && !this.field_31719) {
                  this.field_31715 = false;
                  client.thePlayer.method_26595();
                  ((SpeedModule) SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SpeedModule.class)).method_31653();
                  this.field_31715 = true;
                  var1.method_35235(client.thePlayer.method_37098().field_7333);
                  var1.method_35232(client.thePlayer.method_37098().field_7336);
                  var1.method_35229(client.thePlayer.method_37098().field_7334);
               }
               break;
            case "AAC":
               if (this.field_31714 == 0 && client.thePlayer.onGround) {
                  class_8865.method_40777(var1, class_8865.method_40775() * 0.82);
               }
               break;
            case "Cubecraft":
               double var6 = 0.2;
               float var8 = this.method_28399(MathHelper.wrapDegrees(client.thePlayer.rotationYaw));
               if (client.gameOptions.keyJump.isKeyDown()) {
                  client.theTimer.timerSpeed = 1.0F;
               } else if (client.thePlayer.onGround) {
                  if (class_314.method_1434() && !client.thePlayer.isSneaking() && !this.field_31719) {
                     var1.method_35235(1.00000000000001);
                  }
               } else if (this.field_31716 == 1) {
                  if (var1.method_35236() <= 0.9) {
                     this.field_31716 = -1;
                  } else {
                     var1.method_35235(0.122);
                     client.theTimer.timerSpeed = 0.7F;
                     var6 = 2.4;
                  }
               } else if (this.field_31716 == 2) {
                  if (var1.method_35236() > 0.05) {
                     this.field_31716 = -1;
                  } else {
                     client.theTimer.timerSpeed = 0.7F;
                     var6 = 0.28;
                  }
               } else if (this.field_31716 == 3) {
                  client.theTimer.timerSpeed = 0.3F;
                  var6 = 2.4;
               } else if (this.field_31716 == 4) {
                  var6 = 0.28;
                  client.theTimer.timerSpeed = 1.0F;
               } else if (this.field_31716 == 6) {
                  var1.method_35235(-1.023456987345906);
               }

               if (!class_314.method_1434()) {
                  var6 = 0.0;
               }

               if (client.thePlayer.field_41706 < 1.0F) {
                  class_8865.method_40780(var1, var6, var8, var8, 360.0F);
               }

               class_314.method_1408(var1.method_35236());
               break;
            case "Slow":
               if (client.thePlayer.onGround) {
                  var1.method_35232(var1.method_35234() * 0.75);
                  var1.method_35229(var1.method_35231() * 0.75);
               } else {
                  var1.method_35232(var1.method_35234() * 0.93);
                  var1.method_35229(var1.method_35231() * 0.93);
               }
               break;
            case "Sneak":
               if (client.thePlayer.onGround) {
                  var1.method_35232(var1.method_35234() * 0.65);
                  var1.method_35229(var1.method_35231() * 0.65);
               } else {
                  var1.method_35232(var1.method_35234() * 0.85);
                  var1.method_35229(var1.method_35231() * 0.85);
               }
         }

         this.field_31710.method_17220(var1);
      }
   }

   @EventListen
   @class_7664
   public void method_28402(class_2157 var1) {
      if (this.isEnabled() && client.thePlayer != null) {
         if (var1.method_10047() instanceof class_7371 && ((BlockFlyModule)this.getModule()).field_18196 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_28406(class_2911 var1) {
      if (this.isEnabled() && this.field_31715) {
         if (this.getModule().getStringValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
            && (!class_314.method_1434() || this.getModule().getBooleanValueByName("Tower while moving"))) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_28404(class_1711 var1) {
      if (this.isEnabled() && this.getStringValueByName("Speed Mode").equals("Cubecraft") && this.field_31716 >= 0) {
         if (!(client.thePlayer.field_41706 > 1.2F)) {
            if (!(client.thePlayer.field_3864 < this.field_31717)) {
               if (!client.thePlayer.field_29654) {
                  client.thePlayer.positionVec.field_7333 = this.field_31717;
                  client.thePlayer.field_41713 = this.field_31717;
                  client.thePlayer.field_3864 = this.field_31717;
                  client.thePlayer.prevPosY = this.field_31717;
                  if (class_8865.method_40772()) {
                     client.thePlayer.field_3859 = 0.099999994F;
                  }
               }
            }
         }
      }
   }

   public static Vector3d method_28403(BlockPos var0, Direction var1) {
      double var4 = (double)var0.getX() + 0.5;
      double var6 = (double)var0.getY() + 0.5;
      double var8 = (double)var0.getZ() + 0.5;
      var4 += (double)var1.method_1041() / 2.0;
      var8 += (double)var1.method_1034() / 2.0;
      var6 += (double)var1.method_1054() / 2.0;
      double var10 = 0.2;
      if (var1 != Direction.field_817 && var1 != Direction.field_802) {
         var6 += method_28405(var10, -var10);
      } else {
         var4 += method_28405(var10, -var10);
         var8 += method_28405(var10, -var10);
      }

      if (var1 == Direction.field_809 || var1 == Direction.field_804) {
         var8 += method_28405(var10, -var10);
      }

      if (var1 == Direction.field_800 || var1 == Direction.field_818) {
         var4 += method_28405(var10, -var10);
      }

      return new Vector3d(var4, var6, var8);
   }

   public static double method_28405(double var0, double var2) {
      return Math.random() * (var0 - var2) + var2;
   }

   public float method_28399(float var1) {
      float var4 = 0.0F;
      float var5 = client.thePlayer.field_29676;
      float var6 = client.thePlayer.field_29673;
      if (!(var5 > 0.0F)) {
         if (var5 < 0.0F) {
            if (!(var6 > 0.0F)) {
               if (!(var6 < 0.0F)) {
                  var1 += 90.0F;
               } else {
                  var1 -= 45.0F;
               }
            } else {
               var1 += 45.0F;
            }
         }
      } else if (!(var6 > 0.0F)) {
         if (!(var6 < 0.0F)) {
            var1 -= 90.0F;
         } else {
            var1 += 45.0F;
         }
      } else {
         var1 -= 45.0F;
      }

      if (var1 >= 45.0F && var1 <= 135.0F) {
         var4 = 90.0F;
      } else if (var1 >= 135.0F || var1 <= -135.0F) {
         var4 = 180.0F;
      } else if (var1 <= -45.0F && var1 >= -135.0F) {
         var4 = -90.0F;
      } else if (var1 >= -45.0F && var1 <= 45.0F) {
         var4 = 0.0F;
      }

      if (var6 < 0.0F) {
         var4 -= 180.0F;
      }

      return var4 + 90.0F;
   }
}
