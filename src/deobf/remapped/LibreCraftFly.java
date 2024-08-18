package remapped;

public class LibreCraftFly extends Module {
   private int field_28095;
   private boolean field_28094;

   public LibreCraftFly() {
      super(Category.MOVEMENT, "LibreCraft", "A fly for LibreCraft");
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.3F, 10.0F, 0.1F));
   }

   @Override
   public void onEnable() {
      this.field_28095 = 0;
      if (!client.gameOptions.keySneak.isKeyDown()) {
         if (!client.gameOptions.keySneak.isKeyDown()) {
            this.field_28094 = false;
         }
      } else {
         client.gameOptions.keySneak.pressed = false;
         this.field_28094 = true;
      }
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.0);
      if (client.thePlayer.method_37098().field_7333 > 0.0) {
         class_314.method_1408(-0.0789);
      }
   }

   @EventListen
   private void method_25014(class_6435 var1) {
      if (this.isEnabled()) {
         if (var1.method_29384() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_28094 = true;
         }
      }
   }

   @EventListen
   private void method_25015(class_307 var1) {
      if (this.isEnabled()) {
         if (var1.method_1364() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_28094 = false;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_25011(class_7767 var1) {
      if (this.isEnabled()) {
         if (this.field_28095 <= 0) {
            if (this.field_28095 != -1) {
               if (this.field_28095 == 0) {
                  var1.method_35235(0.0);
                  class_314.method_1408(var1.method_35236());
                  class_8865.method_40777(var1, 0.35);
               }
            } else {
               var1.method_35235(0.299);
               class_314.method_1408(var1.method_35236());
               class_8865.method_40777(var1, (double)this.getFloatValueByName("Speed"));
            }
         } else {
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   public void method_25012(class_1393 var1) {
      if (this.isEnabled() && var1.method_6449()) {
         this.field_28095++;
         if (this.field_28095 != 2) {
            if (this.field_28095 > 2) {
               if (this.field_28095 >= 20 && this.field_28095 % 20 == 0) {
                  var1.method_6455(0.1);
               } else {
                  var1.method_29715(true);
               }
            }
         } else {
            var1.method_6455(0.1);
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_25013(PacketEvent var1) {
      if (this.isEnabled()) {
         Packet var4 = var1.method_557();
         if (client.thePlayer != null && var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            if (this.field_28095 >= 1) {
               this.field_28095 = -1;
            }

            var5.field_3143 = client.thePlayer.rotationYaw;
            var5.field_3140 = client.thePlayer.rotationPitch;
         }
      }
   }
}
