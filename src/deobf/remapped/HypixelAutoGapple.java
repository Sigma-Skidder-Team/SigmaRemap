package remapped;

public class HypixelAutoGapple extends PremiumModule {
   private int field_3479;
   private int field_3482;
   private int field_3483;
   private int field_3481;

   public HypixelAutoGapple() {
      super("Hypixel", "Hypixel bypass", Category.PLAYER);
      this.addSetting(new BooleanSetting("Fire resistance potions", "Automatically drink fire pots", true));
      this.field_3479 = -1;
      this.field_3481 = -1;
   }

   @Override
   public void onEnable() {
      this.field_3479 = -1;
      this.field_3483 = 20;
      this.field_3481 = -1;
   }

   @EventListen
   public void method_2870(class_1393 var1) {
      if (this.method_42015() && var1.method_6449() && !(client.screen instanceof class_2141)) {
         if (this.field_3483 < 20) {
            this.field_3483++;
         }

         if (this.field_3481 == -1 && this.field_3483 >= 20 && this.field_3479 == -1) {
            if (client.thePlayer.method_26551() <= this.getModule().getFloatValueByName("Health") * 2.0F && client.thePlayer.method_26493() == 0.0F) {
               this.field_3481 = ((AutoGapple)this.getModule()).method_29349(false);
               if (this.field_3481 >= 0) {
                  this.field_3479 = 0;
                  this.field_3483 = 0;
               }
            }

            if (this.field_3479 == -1 && this.getBooleanValueByName("Fire resistance potions") && !client.thePlayer.isPotionActive(class_1425.method_6538(12))) {
               this.field_3481 = ((AutoGapple)this.getModule()).method_29349(true);
               if (this.field_3481 >= 0) {
                  this.field_3479 = 0;
                  this.field_3483 = 0;
               }
            }
         }

         if (this.field_3481 >= 0 && this.field_3479 >= 0) {
            this.field_3479++;
            if (this.field_3479 == 2) {
               var1.method_6448(var1.method_6439() + 1.0F);
            }

            if (this.field_3479 != 1) {
               if (this.field_3479 >= 3) {
                  client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
                  client.method_8614().sendPacket(new class_7371(this.field_3481 + (this.field_3481 != 8 ? 1 : -1)));
                  client.method_8614().sendPacket(new class_7371(this.field_3481));
                  client.thePlayer.inventory.field_36404 = this.field_3482;
                  this.field_3482 = -1;
                  this.field_3479 = -1;
                  this.field_3481 = -1;
               }
            } else {
               this.field_3482 = client.thePlayer.inventory.field_36404;
               client.thePlayer.inventory.field_36404 = this.field_3481;
            }
         }
      }
   }
}
