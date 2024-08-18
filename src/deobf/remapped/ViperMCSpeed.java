package remapped;

public class ViperMCSpeed extends Module {
   private int field_28624;

   public ViperMCSpeed() {
      super(Category.MOVEMENT, "ViperMC", "ViperMC speed");
   }

   @Override
   public void onEnable() {
      this.field_28624 = 1;
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.28F);
      client.theTimer.timerSpeed = 1.0F;
   }

   @EventListen
   public void method_25561(class_7767 var1) {
      if (this.isEnabled()) {
         this.field_28624++;
         float var4 = 0.28F + (float)class_8865.method_40770() * 0.05F;
         if (this.field_28624 >= 4) {
            this.field_28624 = 0;
            var4 = 1.15F + (float)class_8865.method_40770() * 0.04F;
         }

         if (client.gameOptions.keyBack.pressed) {
            var4 /= 1.3F;
         }

         class_8865.method_40777(var1, (double)var4);
      }
   }
}
