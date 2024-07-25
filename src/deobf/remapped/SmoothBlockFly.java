package remapped;

public class SmoothBlockFly extends Module {
   private float field_41376;
   private float field_41370;
   private class_2899 field_41372;
   private int field_41378 = -1;
   private int field_41380;
   private int field_41381;
   private class_2584 field_41379;
   private BlockFlyModule field_41373 = null;
   private boolean field_41374;
   private boolean field_41377 = false;
   private double field_41371;
   private int field_41375 = 0;

   public SmoothBlockFly() {
      super(Category.MOVEMENT, "Smooth", "Places block underneath");
      this.addSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
   }

   @Override
   public void method_42012() {
      this.field_41373 = (BlockFlyModule)this.method_42017();
   }

   @Override
   public void onEnable() {
      this.field_41378 = client.thePlayer.inventory.field_36404;
      this.field_41370 = this.field_41376 = 999.0F;
      ((BlockFlyModule)this.method_42017()).field_18196 = -1;
      this.field_41371 = -1.0;
      this.field_41377 = false;
      if (client.thePlayer.field_41726) {
         this.field_41371 = client.thePlayer.method_37309();
      }

      this.field_41381 = -1;
   }

   @Override
   public void onDisable() {
      if (this.field_41378 != -1 && this.method_42017().getStringValueByName("ItemSpoof").equals("Switch")) {
         client.thePlayer.inventory.field_36404 = this.field_41378;
      }

      this.field_41378 = -1;
      if (((BlockFlyModule)this.method_42017()).field_18196 >= 0) {
         client.method_8614().method_4813(new class_7371(client.thePlayer.inventory.field_36404));
         ((BlockFlyModule)this.method_42017()).field_18196 = -1;
      }

      class_8865.method_40776(class_8865.method_40775() * 0.9);
      client.theTimer.timerSpeed = 1.0F;
      if (this.getStringValueByName("Speed Mode").equals("Cubecraft") && this.field_41381 == 0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   public void method_36707(class_7982 var1) {
      if (this.method_42015()) {
         if (this.getStringValueByName("Speed Mode").equals("Cubecraft") && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).method_42015()) {
            if (client.field_9601
                     .method_6680(
                        client.thePlayer,
                        client.thePlayer.field_41712.method_18928(0.0, -1.5, 0.0).method_18900(0.05, 0.0, 0.05).method_18900(-0.05, 0.0, -0.05)
                     )
                     .count()
                  == 0L
               && client.thePlayer.field_41706 < 1.0F) {
               var1.method_36186(true);
            }
         } else if (client.thePlayer.field_41726 && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SafeWalkModule.class).method_42015()) {
            var1.method_36186(true);
         }
      }
   }

   @EventListen
   @class_7664
   public void method_36714(class_1393 var1) {
      if (this.method_42015() && this.field_41373.method_17219() != 0) {
         if (!var1.method_6449()) {
            if (this.field_41370 != 999.0F) {
               this.field_41373.method_17215();
               if (this.field_41372 != null) {
                  class_9529 var13 = class_7494.method_34080(this.field_41370, this.field_41376, 5.0F, var1);
                  if (var13.method_33990() == class_1430.field_7721) {
                     return;
                  }

                  if (var13.method_43956() == Direction.field_817
                     && (double)var13.method_43955().method_12165() <= client.thePlayer.method_37309() - 1.0
                     && client.thePlayer.field_41726) {
                     return;
                  }

                  int var14 = client.thePlayer.inventory.field_36404;
                  if (!this.method_42017().getStringValueByName("ItemSpoof").equals("None")) {
                     this.field_41373.method_17211();
                  }

                  ItemStack var15 = client.thePlayer.method_26617(class_2584.field_12791);
                  new class_4734(client.thePlayer, class_2584.field_12791, var13);
                  int var17 = var15.method_27997();
                  client.playerController.method_42147(client.thePlayer, client.field_9601, this.field_41379, var13);
                  this.field_41372 = null;
                  if (!this.method_42017().method_42007("NoSwing")) {
                     client.thePlayer.method_26597(this.field_41379);
                  } else {
                     client.method_8614().method_4813(new class_3195(this.field_41379));
                  }

                  if (this.method_42017().getStringValueByName("ItemSpoof").equals("Spoof") || this.method_42017().getStringValueByName("ItemSpoof").equals("LiteSpoof")) {
                     client.thePlayer.inventory.field_36404 = var14;
                  }
               }
            }
         } else {
            this.field_41380++;
            this.field_41375--;
            var1.method_6444(true);
            this.field_41379 = class_2584.field_12791;
            if (BlockFlyModule.method_17216(client.thePlayer.method_26617(class_2584.field_12794).method_27960())
               && (
                  client.thePlayer.method_26617(this.field_41379).method_28022()
                     || !BlockFlyModule.method_17216(client.thePlayer.method_26617(this.field_41379).method_27960())
               )) {
               this.field_41379 = class_2584.field_12794;
            }

            double var4 = var1.method_6450();
            double var6 = var1.method_6438();
            double var8 = var1.method_6454();
            if (!client.thePlayer.field_41744 && !client.gameOptions.keyJump.pressed) {
               double[] var10 = this.method_36710();
               var4 = var10[0];
               var6 = var10[1];
            }

            if (client.thePlayer.method_37098().field_7333 < 0.0
               && client.thePlayer.field_41706 > 1.0F
               && class_7494.method_34079(0.0F, 90.0F, 3.0F).method_33990() == class_1430.field_7721) {
               var8 += Math.min(client.thePlayer.method_37098().field_7333 * 2.0, 4.0);
            } else if ((this.getStringValueByName("Speed Mode").equals("Jump") || this.getStringValueByName("Speed Mode").equals("Cubecraft"))
               && !client.gameOptions.keyJump.isKeyDown()) {
               var8 = this.field_41371;
            }

            if (!class_7494.method_34090(
               new class_1331(
                  client.thePlayer.method_37245().method_61(),
                  client.thePlayer.method_37245().method_60() - 1.0,
                  client.thePlayer.method_37245().method_62()
               )
            )) {
               var4 = client.thePlayer.method_37245().method_61();
               var6 = client.thePlayer.method_37245().method_62();
            }

            class_1331 var18 = new class_1331(var4, var8 - 1.0, var6);
            if (!class_7494.method_34090(var18) && this.field_41373.method_17224(this.field_41379) && this.field_41375 <= 0) {
               class_2899 var11 = class_7494.method_34118(var18, false);
               this.field_41372 = var11;
               float[] var12 = class_7494.method_34112();
               if (var11 != null && var12 != null) {
                  this.field_41370 = var12[0];
                  this.field_41376 = var12[1];
               }
            } else {
               this.field_41372 = null;
            }

            if (this.field_41370 != 999.0F) {
               var1.method_6441(this.field_41370);
               var1.method_6448(this.field_41376);
            }

            if (client.thePlayer.field_41701 != var1.method_6442() && client.thePlayer.field_41755 != var1.method_6439()) {
               this.field_41380 = 0;
            }
         }
      }
   }

   @EventListen
   @class_315
   public void method_36705(class_7767 var1) {
      if (this.method_42015() && this.field_41373.method_17219() != 0) {
         if (client.thePlayer.field_41726 || class_314.method_1413(client.thePlayer, 0.01F)) {
            this.field_41371 = client.thePlayer.method_37309();
         }

         if (this.method_42017().method_42007("No Sprint")) {
            client.thePlayer.method_37140(false);
         }

         if (client.thePlayer.field_41726) {
            this.field_41381 = 0;
         } else if (this.field_41381 >= 0) {
            this.field_41381++;
         }

         if (this.field_41373 == null) {
            this.field_41373 = (BlockFlyModule)this.method_42017();
         }

         String var4 = this.getStringValueByName("Speed Mode");
         switch (var4) {
            case "Jump":
               if (client.thePlayer.field_41726 && class_314.method_1434() && !client.thePlayer.method_37252() && !this.field_41374) {
                  this.field_41377 = false;
                  client.thePlayer.method_26595();
                  ((SpeedModule) SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SpeedModule.class)).method_31653();
                  this.field_41377 = true;
                  var1.method_35235(client.thePlayer.method_37098().field_7333);
                  var1.method_35232(client.thePlayer.method_37098().field_7336);
                  var1.method_35229(client.thePlayer.method_37098().field_7334);
               }
               break;
            case "AAC":
               if (this.field_41380 == 0 && client.thePlayer.field_41726) {
                  class_8865.method_40777(var1, class_8865.method_40775() * 0.82);
               }
               break;
            case "Cubecraft":
               double var6 = 0.2;
               float var8 = this.method_36706(class_9299.method_42810(client.thePlayer.field_41701));
               if (client.gameOptions.keyJump.isKeyDown()) {
                  client.theTimer.timerSpeed = 1.0F;
               } else if (client.thePlayer.field_41726) {
                  if (class_314.method_1434() && !client.thePlayer.method_37252() && !this.field_41374) {
                     var1.method_35235(1.00000000000001);
                  }
               } else if (this.field_41381 == 1) {
                  if (var1.method_35236() <= 0.9) {
                     this.field_41381 = -1;
                  } else {
                     var1.method_35235(0.122);
                     client.theTimer.timerSpeed = 0.7F;
                     var6 = 2.4;
                  }
               } else if (this.field_41381 == 2) {
                  if (var1.method_35236() > 0.05) {
                     this.field_41381 = -1;
                  } else {
                     client.theTimer.timerSpeed = 0.7F;
                     var6 = 0.28;
                  }
               } else if (this.field_41381 == 3) {
                  client.theTimer.timerSpeed = 0.3F;
                  var6 = 2.4;
               } else if (this.field_41381 == 4) {
                  var6 = 0.28;
                  client.theTimer.timerSpeed = 1.0F;
               } else if (this.field_41381 == 6) {
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
               if (client.thePlayer.field_41726) {
                  var1.method_35232(var1.method_35234() * 0.75);
                  var1.method_35229(var1.method_35231() * 0.75);
               } else {
                  var1.method_35232(var1.method_35234() * 0.93);
                  var1.method_35229(var1.method_35231() * 0.93);
               }
               break;
            case "Sneak":
               if (client.thePlayer.field_41726) {
                  var1.method_35232(var1.method_35234() * 0.65);
                  var1.method_35229(var1.method_35231() * 0.65);
               } else {
                  var1.method_35232(var1.method_35234() * 0.85);
                  var1.method_35229(var1.method_35231() * 0.85);
               }
         }

         this.field_41373.method_17220(var1);
      }
   }

   @EventListen
   @class_7664
   public void method_36713(class_2157 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (var1.method_10047() instanceof class_7371 && ((BlockFlyModule)this.method_42017()).field_18196 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_36709(class_2911 var1) {
      if (this.method_42015() && this.field_41377) {
         if (this.method_42017().getStringValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
            && (!class_314.method_1434() || this.method_42017().method_42007("Tower while moving"))) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_36708(class_1711 var1) {
      if (this.method_42015() && this.getStringValueByName("Speed Mode").equals("Cubecraft") && this.field_41381 >= 0) {
         if (!(client.thePlayer.field_41706 > 1.2F)) {
            if (!(client.thePlayer.field_3864 < this.field_41371)) {
               if (!client.thePlayer.field_29654) {
                  client.thePlayer.field_41736.field_7333 = this.field_41371;
                  client.thePlayer.field_41713 = this.field_41371;
                  client.thePlayer.field_3864 = this.field_41371;
                  client.thePlayer.field_41698 = this.field_41371;
                  if (class_8865.method_40772()) {
                     client.thePlayer.field_3859 = 0.099999994F;
                  }
               }
            }
         }
      }
   }

   public double[] method_36710() {
      double var3 = client.thePlayer.method_37302();
      double var5 = client.thePlayer.method_37156();
      double var7 = (double) client.thePlayer.field_30533.field_45287;
      double var9 = (double) client.thePlayer.field_30533.field_45282;
      float var11 = client.thePlayer.field_41701;
      class_1331 var12 = new class_1331(var3, client.thePlayer.method_37309() - 1.0, var5);
      double var13 = var3;
      double var15 = var5;
      double var17 = 0.0;

      for (double var19 = (double)(this.getFloatValueByName("Extend") * 2.0F);
           class_7494.method_34090(var12);
           var12 = new class_1331(var13, client.thePlayer.method_37309() - 1.0, var15)
      ) {
         if (++var17 > var19) {
            var17 = var19;
         }

         var13 = var3
            + (var7 * 0.45 * Math.cos(Math.toRadians((double)(var11 + 90.0F))) + var9 * 0.45 * Math.sin(Math.toRadians((double)(var11 + 90.0F)))) * var17;
         var15 = var5
            + (var7 * 0.45 * Math.sin(Math.toRadians((double)(var11 + 90.0F))) - var9 * 0.45 * Math.cos(Math.toRadians((double)(var11 + 90.0F)))) * var17;
         if (var17 == var19) {
            break;
         }
      }

      return new double[]{var13, var15};
   }

   public static class_1343 method_36711(class_1331 var0, Direction var1) {
      double var4 = (double)var0.method_12173() + 0.5;
      double var6 = (double)var0.method_12165() + 0.5;
      double var8 = (double)var0.method_12185() + 0.5;
      var4 += (double)var1.method_1041() / 2.0;
      var8 += (double)var1.method_1034() / 2.0;
      var6 += (double)var1.method_1054() / 2.0;
      double var10 = 0.2;
      if (var1 != Direction.field_817 && var1 != Direction.field_802) {
         var6 += method_36712(var10, -var10);
      } else {
         var4 += method_36712(var10, -var10);
         var8 += method_36712(var10, -var10);
      }

      if (var1 == Direction.field_809 || var1 == Direction.field_804) {
         var8 += method_36712(var10, -var10);
      }

      if (var1 == Direction.field_800 || var1 == Direction.field_818) {
         var4 += method_36712(var10, -var10);
      }

      return new class_1343(var4, var6, var8);
   }

   public static double method_36712(double var0, double var2) {
      return Math.random() * (var0 - var2) + var2;
   }

   public float method_36706(float var1) {
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
