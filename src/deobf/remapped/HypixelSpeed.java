package remapped;

public class HypixelSpeed extends Module {
   private int field_12323;
   private double field_12322;
   private double field_12324;
   private double field_12319;
   private class_8988 field_12321 = class_8988.field_46028;

   public HypixelSpeed() {
      super(Category.MOVEMENT, "Hypixel", "Speed for Hypixel");
      this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
      this.addSetting(new BooleanSetting("Timer", "Use timer", true));
      this.addSetting(new BooleanSetting("GroundSpeed", "Move faster on ground", true));
      this.addSetting(new BooleanSetting("BorderJump", "Automatically jumps off edges with speed", true));
   }

   @Override
   public void onEnable() {
      this.field_12322 = class_8865.method_40767();
      this.field_12323 = 6;
      this.field_12321 = class_8988.field_46028;
      this.field_12324 = -1.0;
      this.field_12319 = 0.0;
   }

   @Override
   public void onDisable() {
      if (this.field_12321 == class_8988.field_46026 && client.thePlayer.method_37098().field_7333 > 0.0 && this.field_12323 == 0) {
         class_314.method_1408(-class_8865.method_40786() - 1.0E-5 - 0.0625);
      }

      if (Math.abs((double) client.theTimer.timerSpeed - 1.4123) < 0.001
         && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TimerModule.class).method_42015()) {
         client.theTimer.timerSpeed = 1.0F;
      }
   }

   @EventListen
   @class_7664
   public void method_11348(class_1393 var1) {
      if (client.thePlayer.field_41726) {
         if (!SigmaMainClass.getInstance().getModuleManager().getModuleByClass(CriticalsModule.class).method_42003()
            || KillauraModule.field_12558 == null && KillauraModule.field_12556 == null
            || this.field_12321 != class_8988.field_46026) {
            this.field_12319 = 0.0;
         } else if (var1.method_6449()) {
            if (this.field_12319 > 3.0) {
               this.field_12319 = 0.0;
               client.method_8614().method_4813(new class_4609(true));
            }

            var1.method_6451(false);
         }
      }
   }

   @EventListen
   @class_3932
   @class_315
   public void method_11349(class_7767 var1) {
      if (!this.method_42015()) {
         if (client.thePlayer.field_41726
            || class_314.method_1413(client.thePlayer, 0.001F)
            || client.thePlayer.method_37309() < this.field_12324) {
            this.field_12324 = -1.0;
         }
      } else {
         client.thePlayer.field_29600 = 0;
         if (client.thePlayer.field_41726) {
            this.field_12324 = client.thePlayer.method_37309();
            if (!SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TimerModule.class).method_42015()) {
               client.theTimer.timerSpeed = 1.0F;
            }

            if (this.field_12323 >= 0 && StepModule.field_20352 >= 2) {
               if ((var1.method_35236() > 0.0 || this.getBooleanValueByName("AutoJump") && class_314.method_1434()) && !class_314.method_1437(client.thePlayer)) {
                  client.thePlayer.method_26595();
                  var1.method_35235(class_8865.method_40786());
                  class_8865.method_40777(var1, 0.644348756324588 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.13);
                  if (this.getBooleanValueByName("Timer") && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TimerModule.class).method_42015()) {
                     client.theTimer.timerSpeed = 1.4123F;
                  }

                  this.field_12323 = 0;
                  this.field_12321 = class_8988.field_46028;
               } else if (class_314.method_1434() && this.getBooleanValueByName("GroundSpeed") && !class_314.method_1437(client.thePlayer)) {
                  client.thePlayer.field_41733 = 0.5F;
                  client.thePlayer.method_26595();
                  var1.method_35235(0.399 + (double)class_8865.method_40769() * 0.1 + 1.0E-14);
                  class_8865.method_40777(var1, 0.51 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.098);
                  this.field_12323 = 0;
                  if (this.getBooleanValueByName("Timer") && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TimerModule.class).method_42015()) {
                     client.theTimer.timerSpeed = 1.1123F;
                  }

                  this.field_12321 = class_8988.field_46026;
               } else {
                  this.field_12319 = 0.0;
               }
            } else {
               class_8865.method_40777(var1, 0.25);
               if (this.field_12323 < 0) {
                  this.field_12323++;
               }
            }
         } else if (this.field_12323 >= 0) {
            double var4 = class_8865.method_40775();
            if (!SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TimerModule.class).method_42015()) {
               client.theTimer.timerSpeed = 1.0F;
            }

            switch (this.field_12321) {
               case field_46028:
                  if (this.field_12323 == 0) {
                     this.field_12322 = 0.3893478969348657 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.077;
                  } else {
                     double var8 = 0.99375 - (double)this.field_12323 * 1.0E-13;
                     this.field_12322 *= var8;
                  }

                  if (class_8865.method_40769() == 0 && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(BlockFlyModule.class).method_42015()) {
                     this.method_11344(var1, this.field_12323);
                  }

                  if (this.field_12319 > 3.0) {
                     this.field_12319 = 0.0;
                     client.method_8614().method_4813(new class_4609(true));
                  }
                  break;
               case field_46026:
                  if (this.field_12323 == 0) {
                     double var6 = 0.399 + (double)class_8865.method_40769() * 0.1 + 1.0E-5;
                     if (this.getBooleanValueByName("BorderJump")
                        && client.theWorld
                              .method_6680(client.thePlayer, client.thePlayer.field_41712.method_18928(0.0, -var6 - 0.0625, 0.0))
                              .count()
                           == 0L) {
                        this.field_12322 = 0.4103345672948576 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.085;
                        this.field_12324 = -1.0;
                     } else {
                        var1.method_35235(-var6 - 0.0625);
                        this.field_12319 = this.field_12319 - var1.method_35236();
                        this.field_12322 = 0.3 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.067;
                     }
                  } else if (this.field_12323 == 1 && var1.method_35236() < 0.0) {
                     this.field_12322 *= 0.7;
                  } else {
                     this.field_12322 *= 0.981;
                  }
            }

            if (this.field_12322 < var4 || client.thePlayer.field_41744 || !class_314.method_1434() || class_314.method_1437(client.thePlayer)) {
               this.field_12322 = var4;
            }

            class_8865.method_40777(var1, this.field_12322);
            this.field_12323++;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_11346(class_2911 var1) {
      if (!JesusModule.method_32081() && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(FlyModule.class).method_42015()) {
         if (this.getBooleanValueByName("Auto Jump") || client.thePlayer.field_29654) {
            if (this.field_12323 < 0) {
               var1.method_29715(true);
            }
         }
      }
   }

   @EventListen
   public void method_11343(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            this.field_12323 = -2;
         }
      }
   }

   @EventListen
   public void method_11350(class_717 var1) {
      this.field_12324 = -1.0;
   }

   @EventListen
   @class_3932
   public void method_11345(class_1711 var1) {
      if (!client.thePlayer.field_41726
         && !class_314.method_1413(client.thePlayer, 1.0E-4F)
         && class_314.method_1413(client.thePlayer, (float)(class_8865.method_40786() + 1.0E-5 + 0.0625))
         && StepModule.field_20352 >= 2
         && !(this.field_12324 < 0.0)
         && this.field_12321 == class_8988.field_46026
         && !(client.thePlayer.method_37309() < this.field_12324)) {
         client.thePlayer.field_41736.field_7333 = this.field_12324;
         client.thePlayer.field_41713 = this.field_12324;
         client.thePlayer.field_3864 = this.field_12324;
         client.thePlayer.field_41698 = this.field_12324;
         if (class_8865.method_40772()) {
            client.thePlayer.field_3859 = 0.099999994F;
         }
      }
   }

   @Override
   public boolean method_42003() {
      return this.method_42015()
         && (
            !client.thePlayer.field_41726
               || client.thePlayer.field_29654
               || this.getBooleanValueByName("AutoJump")
               || this.field_12321 == class_8988.field_46026
         );
   }

   private void method_11344(class_7767 var1, int var2) {
      if (var2 != 0) {
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 == 3 && Math.abs(var1.method_35236()) < 0.1 && class_3347.method_15349() == class_412.field_1747.method_2055()) {
                  var1.method_35235(0.0300011120129438);
               }
            } else {
               var1.method_35235(var1.method_35236() * 0.967);
            }
         } else {
            var1.method_35235(var1.method_35236() * 0.98);
         }
      } else {
         var1.method_35235(var1.method_35236() * 0.985);
      }
   }

   public void method_11347() {
      this.field_12323 = 0;
   }
}
