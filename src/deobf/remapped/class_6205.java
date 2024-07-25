package remapped;

public class class_6205 extends Module {
   private float field_31711;
   private float field_31712;
   private class_2899 field_31718;
   private int field_31713 = -1;
   private int field_31714;
   private int field_31716;
   private class_2584 field_31708;
   private BlockFlyModule field_31710 = null;
   private boolean field_31719;
   private boolean field_31715 = false;
   private double field_31717;

   public class_6205() {
      super(Category.MOVEMENT, "Hypixel", "Places block underneath");
      this.addSetting(new ModeSetting("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
      this.addSetting(new BooleanSetting("KeepRotations", "Keeps your rotations.", true));
      this.addSetting(new BooleanSetting("Downwards", "Allows you to go down when sneaking.", true));
   }

   @Override
   public void method_42012() {
      this.field_31710 = (BlockFlyModule)this.method_42017();
   }

   @Override
   public void onEnable() {
      this.field_31713 = mcInstance.field_9632.field_3853.field_36404;
      this.field_31712 = this.field_31711 = 999.0F;
      ((BlockFlyModule)this.method_42017()).field_18196 = -1;
      if (mcInstance.field_9577.field_45560.method_27060() && this.getBooleanValueByName("Downwards")) {
         mcInstance.field_9577.field_45560.field_30024 = false;
         this.field_31719 = true;
      }

      if (!mcInstance.field_9577.field_45560.method_27060()) {
         this.field_31719 = false;
      }

      this.field_31717 = -1.0;
      this.field_31715 = false;
      if (mcInstance.field_9632.field_41726) {
         this.field_31717 = mcInstance.field_9632.method_37309();
      }

      this.field_31716 = -1;
   }

   @Override
   public void onDisable() {
      if (this.field_31713 != -1 && this.method_42017().getStringValueByName("ItemSpoof").equals("Switch")) {
         mcInstance.field_9632.field_3853.field_36404 = this.field_31713;
      }

      this.field_31713 = -1;
      if (((BlockFlyModule)this.method_42017()).field_18196 >= 0) {
         mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
         ((BlockFlyModule)this.method_42017()).field_18196 = -1;
      }

      class_8865.method_40776(class_8865.method_40775() * 0.9);
      mcInstance.field_9616.field_32603 = 1.0F;
      if (this.getStringValueByName("Speed Mode").equals("Cubecraft") && this.field_31716 == 0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   public void method_28401(class_7982 var1) {
      if (this.method_42015()) {
         if (this.getStringValueByName("Speed Mode").equals("Cubecraft") && !SigmaMainClass.getInstance().getModuleManager().method_847(FlyModule.class).method_42015()) {
            if (mcInstance.field_9601
                     .method_6680(
                        mcInstance.field_9632,
                        mcInstance.field_9632.field_41712.method_18928(0.0, -1.5, 0.0).method_18900(0.05, 0.0, 0.05).method_18900(-0.05, 0.0, -0.05)
                     )
                     .count()
                  == 0L
               && mcInstance.field_9632.field_41706 < 1.0F) {
               var1.method_36186(true);
            }
         } else if (mcInstance.field_9632.field_41726
            && SigmaMainClass.getInstance().getModuleManager().method_847(class_1396.class).method_42015()
            && (!this.field_31719 || !this.getBooleanValueByName("Downwards"))) {
            var1.method_36186(true);
         }
      }
   }

   @EventListen
   private void method_28408(class_6435 var1) {
      if (this.method_42015() && this.getBooleanValueByName("Downwards")) {
         if (var1.method_29384() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_31719 = true;
         }
      }
   }

   @EventListen
   private void method_28407(class_307 var1) {
      if (this.method_42015() && this.getBooleanValueByName("Downwards")) {
         if (var1.method_1364() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_31719 = false;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_28409(class_1393 var1) {
      if (this.method_42015() && this.field_31710.method_17219() != 0) {
         SecondModule var4 = (SecondModule) SigmaMainClass.getInstance().getModuleManager().method_847(FlyModule.class);
         if (!var4.method_42015() || !var4.getStringValueByName("Type").equalsIgnoreCase("Hypixel") || !var4.method_16864().getStringValueByName("Bypass").equals("Blink")) {
            if (!var1.method_6449()) {
               this.field_31710.method_17215();
               if (this.field_31718 != null) {
                  class_9529 var20 = new class_9529(
                     method_28403(this.field_31718.field_14163, this.field_31718.field_14162),
                     this.field_31718.field_14162,
                     this.field_31718.field_14163,
                     false
                  );
                  int var21 = mcInstance.field_9632.field_3853.field_36404;
                  if (!this.method_42017().getStringValueByName("ItemSpoof").equals("None")) {
                     this.field_31710.method_17211();
                  }

                  mcInstance.field_9647.method_42147(mcInstance.field_9632, mcInstance.field_9601, this.field_31708, var20);
                  if (!this.method_42017().getBooleanValueByName("NoSwing")) {
                     mcInstance.field_9632.method_26597(this.field_31708);
                  } else {
                     mcInstance.method_8614().method_4813(new class_3195(this.field_31708));
                  }

                  if (this.method_42017().getStringValueByName("ItemSpoof").equals("Spoof") || this.method_42017().getStringValueByName("ItemSpoof").equals("LiteSpoof")) {
                     mcInstance.field_9632.field_3853.field_36404 = var21;
                  }
               }
            } else {
               this.field_31714++;
               var1.method_6444(true);
               this.field_31708 = class_2584.field_12791;
               if (BlockFlyModule.method_17216(mcInstance.field_9632.method_26617(class_2584.field_12794).method_27960())
                  && (
                     mcInstance.field_9632.method_26617(this.field_31708).method_28022()
                        || !BlockFlyModule.method_17216(mcInstance.field_9632.method_26617(this.field_31708).method_27960())
                  )) {
                  this.field_31708 = class_2584.field_12794;
               }

               double var5 = var1.method_6450();
               double var7 = var1.method_6438();
               double var9 = var1.method_6454();
               if (mcInstance.field_9632.method_37098().field_7333 < 0.0
                  && mcInstance.field_9632.field_41706 > 1.0F
                  && class_7494.method_34079(0.0F, 90.0F, 3.0F).method_33990() == class_1430.field_7721) {
                  var9 += Math.min(mcInstance.field_9632.method_37098().field_7333 * 2.0, 4.0);
               } else if (this.field_31719 && this.getBooleanValueByName("Downwards")) {
                  var9--;
               } else if ((this.getStringValueByName("Speed Mode").equals("Jump") || this.getStringValueByName("Speed Mode").equals("Cubecraft"))
                  && !mcInstance.field_9577.field_45450.method_27060()) {
                  var9 = this.field_31717;
               }

               if (!class_7494.method_34090(
                  new class_1331(
                     mcInstance.field_9632.method_37245().method_61(),
                     mcInstance.field_9632.method_37245().method_60() - 1.0,
                     mcInstance.field_9632.method_37245().method_62()
                  )
               )) {
                  var5 = mcInstance.field_9632.method_37245().method_61();
                  var7 = mcInstance.field_9632.method_37245().method_62();
               }

               class_1331 var11 = new class_1331(var5, var9 - 1.0, var7);
               if (!class_7494.method_34090(var11) && this.field_31710.method_17224(this.field_31708)) {
                  class_2899 var12 = class_7494.method_34118(var11, !this.field_31719 && this.getBooleanValueByName("Downwards"));
                  this.field_31718 = var12;
                  if (var12 != null) {
                     float[] var13 = class_7494.method_34077(this.field_31718.field_14163, this.field_31718.field_14162);
                     if ((double)var12.field_14163.field_13230 - mcInstance.field_9632.method_37309() < 0.0) {
                        double var14 = mcInstance.field_9632.method_37302()
                           - ((double)var12.field_14163.field_13231 + 0.5 + (double)var12.field_14162.method_1041() / 2.0);
                        double var16 = mcInstance.field_9632.method_37156()
                           - ((double)var12.field_14163.field_13229 + 0.5 + (double)var12.field_14162.method_1034() / 2.0);
                        double var18 = Math.sqrt(var14 * var14 + var16 * var16);
                        if (var18 < 2.0) {
                           var13[0] = mcInstance.field_9632.field_41701 + 1.0F;
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
                     var1.method_6441(mcInstance.field_9632.field_41701 + 1.0F);
                     var1.method_6448(90.0F);
                  }

                  this.field_31718 = null;
               }

               if (mcInstance.field_9632.field_41701 != var1.method_6442() && mcInstance.field_9632.field_41755 != var1.method_6439()) {
                  this.field_31714 = 0;
               }
            }
         }
      }
   }

   @EventListen
   @class_315
   public void method_28400(class_7767 var1) {
      if (this.method_42015() && this.field_31710.method_17219() != 0) {
         if (mcInstance.field_9632.field_41726 || class_314.method_1413(mcInstance.field_9632, 0.01F)) {
            this.field_31717 = mcInstance.field_9632.method_37309();
         }

         if (this.method_42017().getBooleanValueByName("No Sprint")) {
            mcInstance.field_9632.method_37140(false);
         }

         if (mcInstance.field_9632.field_41726) {
            this.field_31716 = 0;
         } else if (this.field_31716 >= 0) {
            this.field_31716++;
         }

         if (this.field_31710 == null) {
            this.field_31710 = (BlockFlyModule)this.method_42017();
         }

         String var4 = this.getStringValueByName("Speed Mode");
         switch (var4) {
            case "Jump":
               if (mcInstance.field_9632.field_41726 && class_314.method_1434() && !mcInstance.field_9632.method_37252() && !this.field_31719) {
                  this.field_31715 = false;
                  mcInstance.field_9632.method_26595();
                  ((class_6908) SigmaMainClass.getInstance().getModuleManager().method_847(class_6908.class)).method_31653();
                  this.field_31715 = true;
                  var1.method_35235(mcInstance.field_9632.method_37098().field_7333);
                  var1.method_35232(mcInstance.field_9632.method_37098().field_7336);
                  var1.method_35229(mcInstance.field_9632.method_37098().field_7334);
               }
               break;
            case "AAC":
               if (this.field_31714 == 0 && mcInstance.field_9632.field_41726) {
                  class_8865.method_40777(var1, class_8865.method_40775() * 0.82);
               }
               break;
            case "Cubecraft":
               double var6 = 0.2;
               float var8 = this.method_28399(class_9299.method_42810(mcInstance.field_9632.field_41701));
               if (mcInstance.field_9577.field_45450.method_27060()) {
                  mcInstance.field_9616.field_32603 = 1.0F;
               } else if (mcInstance.field_9632.field_41726) {
                  if (class_314.method_1434() && !mcInstance.field_9632.method_37252() && !this.field_31719) {
                     var1.method_35235(1.00000000000001);
                  }
               } else if (this.field_31716 == 1) {
                  if (var1.method_35236() <= 0.9) {
                     this.field_31716 = -1;
                  } else {
                     var1.method_35235(0.122);
                     mcInstance.field_9616.field_32603 = 0.7F;
                     var6 = 2.4;
                  }
               } else if (this.field_31716 == 2) {
                  if (var1.method_35236() > 0.05) {
                     this.field_31716 = -1;
                  } else {
                     mcInstance.field_9616.field_32603 = 0.7F;
                     var6 = 0.28;
                  }
               } else if (this.field_31716 == 3) {
                  mcInstance.field_9616.field_32603 = 0.3F;
                  var6 = 2.4;
               } else if (this.field_31716 == 4) {
                  var6 = 0.28;
                  mcInstance.field_9616.field_32603 = 1.0F;
               } else if (this.field_31716 == 6) {
                  var1.method_35235(-1.023456987345906);
               }

               if (!class_314.method_1434()) {
                  var6 = 0.0;
               }

               if (mcInstance.field_9632.field_41706 < 1.0F) {
                  class_8865.method_40780(var1, var6, var8, var8, 360.0F);
               }

               class_314.method_1408(var1.method_35236());
               break;
            case "Slow":
               if (mcInstance.field_9632.field_41726) {
                  var1.method_35232(var1.method_35234() * 0.75);
                  var1.method_35229(var1.method_35231() * 0.75);
               } else {
                  var1.method_35232(var1.method_35234() * 0.93);
                  var1.method_35229(var1.method_35231() * 0.93);
               }
               break;
            case "Sneak":
               if (mcInstance.field_9632.field_41726) {
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
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (var1.method_10047() instanceof class_7371 && ((BlockFlyModule)this.method_42017()).field_18196 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_28406(class_2911 var1) {
      if (this.method_42015() && this.field_31715) {
         if (this.method_42017().getStringValueByName("Tower Mode").equalsIgnoreCase("Vanilla")
            && (!class_314.method_1434() || this.method_42017().getBooleanValueByName("Tower while moving"))) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_28404(class_1711 var1) {
      if (this.method_42015() && this.getStringValueByName("Speed Mode").equals("Cubecraft") && this.field_31716 >= 0) {
         if (!(mcInstance.field_9632.field_41706 > 1.2F)) {
            if (!(mcInstance.field_9632.field_3864 < this.field_31717)) {
               if (!mcInstance.field_9632.field_29654) {
                  mcInstance.field_9632.field_41736.field_7333 = this.field_31717;
                  mcInstance.field_9632.field_41713 = this.field_31717;
                  mcInstance.field_9632.field_3864 = this.field_31717;
                  mcInstance.field_9632.field_41698 = this.field_31717;
                  if (class_8865.method_40772()) {
                     mcInstance.field_9632.field_3859 = 0.099999994F;
                  }
               }
            }
         }
      }
   }

   public static class_1343 method_28403(class_1331 var0, Direction var1) {
      double var4 = (double)var0.method_12173() + 0.5;
      double var6 = (double)var0.method_12165() + 0.5;
      double var8 = (double)var0.method_12185() + 0.5;
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

      return new class_1343(var4, var6, var8);
   }

   public static double method_28405(double var0, double var2) {
      return Math.random() * (var0 - var2) + var2;
   }

   public float method_28399(float var1) {
      float var4 = 0.0F;
      float var5 = mcInstance.field_9632.field_29676;
      float var6 = mcInstance.field_9632.field_29673;
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
