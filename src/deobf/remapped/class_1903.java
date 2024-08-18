package remapped;

public class class_1903 extends Module {
   private int field_9716;
   private boolean field_9713;
   private double field_9715;

   public class_1903() {
      super(Category.MOVEMENT, "Hypixel", "Highjump for Hypixel");
      this.addSetting(new FloatSetting<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
   }

   @Override
   public void onEnable() {
      this.field_9716 = -1;
      this.field_9713 = false;
      this.field_9715 = 999.0;
   }

   @EventListen
   public void method_8648(class_7767 var1) {
      if (this.isEnabled() && client.thePlayer != null) {
         if (client.thePlayer.field_41706 > 3.0F + this.getFloatValueByName("Motion") * 4.0F && var1.method_35236() < -0.3) {
            if (this.field_9713) {
               if (client.thePlayer.method_37309() + var1.method_35236() < this.field_9715) {
                  var1.method_35235(this.field_9715 - client.thePlayer.method_37309());
                  this.field_9713 = false;
               }
            } else {
               this.field_9716 = 0;
            }
         }

         if (this.field_9716 >= 0) {
            this.field_9716++;
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
            var1.method_35235((double)this.getFloatValueByName("Motion"));
            this.field_9713 = true;
            this.field_9715 = client.thePlayer.method_37309();
            this.field_9716 = -1;
         }

         if (this.field_9713 && class_314.method_1413(client.thePlayer, 0.001F)) {
            this.field_9713 = !this.field_9713;
         }

         class_314.method_1408(var1.method_35236());
      }
   }

   @EventListen
   public void method_8649(class_1393 var1) {
      if (this.isEnabled()) {
         if (this.field_9716 >= 0) {
            var1.method_6444(true);
         }
      }
   }
}
