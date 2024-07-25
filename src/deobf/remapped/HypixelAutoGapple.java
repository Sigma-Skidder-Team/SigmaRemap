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
      if (this.method_42015() && var1.method_6449() && !(mc.field_9623 instanceof class_2141)) {
         if (this.field_3483 < 20) {
            this.field_3483++;
         }

         if (this.field_3481 == -1 && this.field_3483 >= 20 && this.field_3479 == -1) {
            if (mc.field_9632.method_26551() <= this.method_42017().getFloatValueByName("Health") * 2.0F && mc.field_9632.method_26493() == 0.0F) {
               this.field_3481 = ((AutoGapple)this.method_42017()).method_29349(false);
               if (this.field_3481 >= 0) {
                  this.field_3479 = 0;
                  this.field_3483 = 0;
               }
            }

            if (this.field_3479 == -1 && this.getBooleanValueByName("Fire resistance potions") && !mc.field_9632.method_26480(class_1425.method_6538(12))) {
               this.field_3481 = ((AutoGapple)this.method_42017()).method_29349(true);
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
                  mc.method_8614().method_4813(new class_1022(class_2584.field_12791));
                  mc.method_8614().method_4813(new class_7371(this.field_3481 + (this.field_3481 != 8 ? 1 : -1)));
                  mc.method_8614().method_4813(new class_7371(this.field_3481));
                  mc.field_9632.field_3853.field_36404 = this.field_3482;
                  this.field_3482 = -1;
                  this.field_3479 = -1;
                  this.field_3481 = -1;
               }
            } else {
               this.field_3482 = mc.field_9632.field_3853.field_36404;
               mc.field_9632.field_3853.field_36404 = this.field_3481;
            }
         }
      }
   }
}
