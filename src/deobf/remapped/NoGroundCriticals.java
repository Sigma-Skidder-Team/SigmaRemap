package remapped;

public class NoGroundCriticals extends Module {
   private int field_38243;
   private boolean field_38245;
   private boolean field_38244;
   private boolean field_38246;

   public NoGroundCriticals() {
      super(Category.COMBAT, "NoGround", "NoGround criticals");
      this.addSetting(new ModeSetting("Offset", "The way you will fake no ground", 0, "Vanilla", "OldHypixel"));
      this.addSetting(new BooleanSetting("Avoid Fall Damage", "Avoid fall damages.", true));
   }

   @Override
   public void onEnable() {
      if (class_314.method_1413(client.thePlayer, 0.001F)) {
         this.field_38245 = this.getStringValueByName("Offset").equals("OldHypixel");
         this.field_38243 = !this.field_38245 ? 1 : 2;
      }

      this.field_38244 = false;
   }

   @EventListen
   @class_315
   private void method_34126(class_8544 var1) {
      if (this.method_42015() && !(var1.method_39326() < 0.625)) {
         if (this.field_38243 == 0 && this.field_38245) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   private void method_34124(class_2911 var1) {
      if (this.method_42015()) {
         if (this.field_38243 == 1) {
            var1.method_29715(true);
            this.field_38244 = true;
         }
      }
   }

   @EventListen
   @class_315
   private void method_34125(class_1393 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_41726) {
            this.field_38246 = false;
            if (this.field_38244 && this.field_38243 != 1) {
               this.field_38244 = !this.field_38244;
               client.thePlayer.method_26595();
            }

            if (this.getStringValueByName("Offset").equals("OldHypixel") != this.field_38245) {
               this.field_38245 = this.getStringValueByName("Offset").equals("OldHypixel");
               this.field_38243 = 2;
            }

            double var4 = this.field_38245 ? 1.0E-14 : 0.0;
            boolean var6 = false;
            boolean var7 = client.field_9587 != null && client.field_9587.method_33990() == class_1430.field_7717;
            boolean var8 = client.playerController.method_42156() || client.gameOptions.keyAttack.isKeyDown() && var7;
            if (!var8 && !JesusModule.method_32081()) {
               switch (this.field_38243) {
                  case 0:
                     var1.method_6444(true);
                     this.field_38243--;
                     break;
                  case 1:
                     var4 = 0.065;
                     this.field_38243--;
                     break;
                  case 2:
                     var1.method_6444(true);
                     var4 = 0.065;
                     this.field_38243--;
                     if (!this.field_38245) {
                        var4 = 1.0E-14;
                        this.field_38243--;
                     }
                     break;
                  case 3:
                     var1.method_6444(true);
                     var4 = 0.0;
                     var6 = true;
                     this.field_38243--;
               }
            } else {
               this.field_38243 = 2;
               var6 = true;
            }

            var1.method_6455(var1.method_6454() + var4);
            var1.method_6451(var6);
         } else {
            this.field_38243 = this.getBooleanValueByName("Avoid Fall Damage") && !this.field_38245 ? 3 : 0;
            if (this.getBooleanValueByName("Avoid Fall Damage") && this.field_38245 && !this.field_38246 && client.thePlayer.method_37098().field_7333 < -0.1) {
               this.field_38246 = !this.field_38246;
               var1.method_6451(true);
            }
         }
      }
   }
}
