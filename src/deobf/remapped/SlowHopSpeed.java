package remapped;

public class SlowHopSpeed extends Module {
   private int field_15607;
   private double field_15606;
   private boolean field_15609;

   public SlowHopSpeed() {
      super(Category.MOVEMENT, "SlowHop", "SlowHop speed");
      this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
   }

   @Override
   public void onEnable() {
      this.field_15606 = class_8865.method_40775();
      this.field_15607 = 2;
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(class_8865.method_40775());
   }

   @EventListen
   public void method_14501(class_7767 var1) {
      if (this.isEnabled()) {
         boolean var4 = this.getBooleanValueByName("AutoJump");
         double var5 = class_8865.method_40775();
         boolean var7 = class_314.method_1434();
         if (!client.thePlayer.onGround) {
            this.field_15607++;
            this.field_15606 = 0.36 - (double)this.field_15607 / 250.0;
            if (this.field_15606 < var5) {
               this.field_15606 = var5;
            }

            class_8865.method_40777(var1, this.field_15606);
         } else {
            this.field_15607 = 0;
            client.thePlayer.method_26595();
            var1.method_35235(client.thePlayer.method_37098().field_7333);
         }
      }
   }

   @EventListen
   public void method_14500(class_2911 var1) {
      if (this.isEnabled()) {
         var1.method_13313(0.407 + 0.1 * (double)class_8865.method_40769());
         this.field_15607 = 0;
         var1.method_13315(1.8);
      }
   }
}
