package remapped;

public class AutoSoupModule extends Module {
   private int field_29805;
   private int field_29807;
   private int field_29806;
   private int field_29804;
   private boolean field_29808;
   private boolean field_29810;

   public AutoSoupModule() {
      super(Category.ITEM, "AutoSoup", "Automatically eats soup when low life");
      this.addSetting(new FloatSetting<Float>("Health", "Minimum health before eating soup", 13.0F, Float.class, 1.0F, 19.0F, 1.0F));
      this.addSetting(new FloatSetting<Float>("Refill delay", "Refill delay", 4.0F, Float.class, 0.0F, 8.0F, 1.0F));
      this.addSetting(new FloatSetting<Float>("Refill accuracy", "Refill accuracy", 100.0F, Float.class, 30.0F, 100.0F, 1.0F));
      this.addSetting(new ModeSetting("Refill mode", "Refill mode", 0, "Basic", "FakeInv", "OpenInv"));
      this.addSetting(new ModeSetting("Soup mode", "Soup Mode", 0, "Instant", "Legit"));
      this.addSetting(new ModeSetting("Bowls", "Bowls managing", 0, "Drop", "Stack"));
   }

   @Override
   public void onEnable() {
      this.field_29805 = (int)this.getFloatValueByName("Refill delay");
      this.field_29804 = (int)this.getFloatValueByName("Refill delay");
      this.field_29808 = false;
      this.field_29810 = false;
      this.field_29806 = -1;
   }

   @EventListen
   private void method_26741(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_29805++;
         this.field_29804++;
         String var4 = this.getStringValueByName("Refill mode");
         if (!this.field_29808) {
            if (this.method_26734(class_4897.field_24719) == 0) {
               if (var4.equals("OpenInv") && !(client.screen instanceof class_3431)) {
                  return;
               }

               if (this.method_26737(class_4897.field_24719) > 0 && this.field_29805 > 3) {
                  this.method_26736();
               }

               return;
            }
         } else if (var4.equals("OpenInv") && !(client.screen instanceof class_3431)) {
            this.field_29808 = false;
         } else if (this.method_26734(class_4897.field_25302) != 0) {
            this.method_26739();
         } else {
            this.field_29808 = false;
            this.field_29810 = false;
         }

         this.method_26738();
      }
   }

   @EventListen
   private void method_26740(class_2157 var1) {
      if (this.method_42015()) {
         if (this.field_29810 && var1.method_10047() instanceof class_8559) {
            class_8559 var4 = (class_8559)var1.method_10047();
            if (var4.method_39391() == class_2105.field_10551) {
               var1.method_29715(true);
            }
         }
      }
   }

   private void method_26736() {
      this.field_29808 = true;
      if (this.getStringValueByName("Refill mode").equals("FakeInv")
         && !(client.screen instanceof class_3431)
         && class_3347.method_15349() <= class_412.field_1752.method_2055()) {
         client.method_8614().sendPacket(new class_8559(class_2105.field_10551));
         this.field_29810 = true;
      }

      if (this.getStringValueByName("Bowls").equals("Stack")) {
         int var3 = this.method_26734(class_4897.field_24454);
         if (var3 > 0) {
            int var4 = this.method_26735(var3);
            if (var4 > 0) {
               class_2740.method_12356(client.thePlayer.field_3869.field_19925, var4, 0, class_6269.field_32027, client.thePlayer, true);
               class_2740.method_12356(client.thePlayer.field_3869.field_19925, var4, 0, class_6269.field_32023, client.thePlayer, true);
               class_2740.method_12356(client.thePlayer.field_3869.field_19925, var4, 0, class_6269.field_32027, client.thePlayer, true);
               this.field_29804 = -5;
            }
         }
      }

      this.field_29807 = 9;
   }

   private void method_26739() {
      int var3 = (int)this.getFloatValueByName("Refill delay");
      if (this.field_29804 >= var3 && SigmaMainClass.getInstance().method_3310().method_25303() >= var3) {
         while (this.field_29807 < 36) {
            boolean var4 = false;
            if (class_2740.method_12311(this.field_29807).method_27960() == class_4897.field_24719
               && Math.random() * 100.0 > (double)this.getFloatValueByName("Refill accuracy")) {
               class_2740.method_12356(client.thePlayer.field_3869.field_19925, this.field_29807, 0, class_6269.field_32019, client.thePlayer, true);
               this.field_29804 = 0;
               var4 = true;
            }

            this.field_29807++;
            if (this.method_26734(class_4897.field_25302) != 0) {
               if (!var4 || var3 <= 0) {
                  continue;
               }
               break;
            }

            this.field_29808 = false;
            this.field_29810 = false;
            break;
         }

         if (this.field_29807 > 35) {
            this.field_29808 = false;
         }
      }
   }

   private void method_26738() {
      int var3 = -1;

      for (int var4 = 36; var4 < 45; var4++) {
         if (client.thePlayer.field_3869.method_18878(var4).method_35898().method_27960() == class_4897.field_24719
            && SigmaMainClass.getInstance().method_3319().method_30523(var4) > 100L) {
            var3 = var4 - 36;
            break;
         }
      }

      boolean var5 = this.getStringValueByName("Bowls").equals("Drop");
      if (!this.getStringValueByName("Soup mode").equals("Instant")) {
         if (this.field_29806 >= 0) {
            if (var5) {
               client.method_8614().sendPacket(new class_1586(class_7500.field_38266, BlockPos.field_7306, Direction.field_802));
            }

            client.thePlayer.inventory.field_36404 = this.field_29806;
            client.playerController.method_42129();
            this.field_29805 = 0;
            this.field_29806 = -1;
         } else {
            if (var3 < 0 || this.field_29805 <= 3 || client.thePlayer.method_26551() > this.getFloatValueByName("Health")) {
               return;
            }

            this.field_29806 = client.thePlayer.inventory.field_36404;
            client.thePlayer.inventory.field_36404 = var3;
            client.playerController.method_42129();
            client.method_8614().sendPacket(new class_1022(Hand.OFF_HAND));
            client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
         }
      } else {
         if (var3 < 0 || this.field_29805 <= 3 || client.thePlayer.method_26551() > this.getFloatValueByName("Health")) {
            return;
         }

         client.method_8614().sendPacket(new class_7371(var3));
         client.method_8614().sendPacket(new class_1022(Hand.OFF_HAND));
         client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
         if (var5) {
            client.method_8614().sendPacket(new class_1586(class_7500.field_38266, BlockPos.field_7306, Direction.field_802));
         }

         client.method_8614().sendPacket(new class_7371(client.thePlayer.inventory.field_36404));
         this.field_29805 = 0;
      }
   }

   private int method_26735(int var1) {
      ItemStack var4 = class_2740.method_12311(13);
      if (var4.method_27960() == class_4897.field_24454 && var4.method_27997() <= 64 - var1) {
         return 13;
      } else {
         for (int var5 = 9; var5 < 36; var5++) {
            var4 = class_2740.method_12311(var5);
            if (var4.method_27960() == class_4897.field_24454 && var4.method_27997() <= 64 - var1) {
               return var5;
            }
         }

         var4 = class_2740.method_12311(13);
         if (var4.method_27960() == class_4897.field_24454 && var4.method_27997() < 64) {
            return 13;
         } else {
            for (int var12 = 9; var12 < 36; var12++) {
               var4 = class_2740.method_12311(var12);
               if (var4.method_27960() == class_4897.field_24454 && var4.method_27997() < 64) {
                  return var12;
               }
            }

            var4 = class_2740.method_12311(13);
            if (var4.method_27960() == class_4897.field_25302) {
               for (int var13 = 36; var13 < 45; var13++) {
                  if (client.thePlayer.field_3869.method_18878(var13).method_35898().method_27960() == class_4897.field_24454) {
                     class_2740.method_12312(13, var13 - 36);
                     return 13;
                  }
               }
            }

            for (int var14 = 9; var14 < 36; var14++) {
               var4 = class_2740.method_12311(var14);
               if (var4.method_27960() == class_4897.field_25302) {
                  for (int var6 = 36; var6 < 45; var6++) {
                     if (client.thePlayer.field_3869.method_18878(var6).method_35898().method_27960() == class_4897.field_24454) {
                        class_2740.method_12312(var14, var6 - 36);
                        return -1;
                     }
                  }
               }
            }

            for (int var15 = 36; var15 < 45; var15++) {
               if (client.thePlayer.field_3869.method_18878(var15).method_35898().method_27960() == class_4897.field_24454) {
                  class_2740.method_12312(13, var15 - 36);
                  return -1;
               }
            }

            return -1;
         }
      }
   }

   private int method_26734(class_2451 var1) {
      int var4 = 0;

      for (int var5 = 36; var5 < 45; var5++) {
         if (client.thePlayer.field_3869.method_18878(var5).method_35898().method_27960() == var1) {
            var4++;
         }
      }

      return var4;
   }

   private int method_26737(class_2451 var1) {
      int var4 = 0;

      for (int var5 = 9; var5 < 36; var5++) {
         if (client.thePlayer.field_3869.method_18878(var5).method_35898().method_27960() == var1) {
            var4++;
         }
      }

      return var4;
   }
}
