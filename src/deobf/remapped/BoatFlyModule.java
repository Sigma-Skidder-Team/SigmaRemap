package remapped;

public class BoatFlyModule extends PremiumModule {
   public boolean field_18223 = false;

   public BoatFlyModule() {
      super("BoatFly", "Fly with a boat", Category.MOVEMENT);
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
   }

   @EventListen
   public void method_17260(class_5596 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.method_37243() != null) {
            float var4 = class_8865.method_40785();
            float var5 = this.getFloatValueByName("Speed");
            double var6 = Math.cos(Math.toRadians((double)var4)) * (double)var5;
            double var8 = Math.sin(Math.toRadians((double)var4)) * (double)var5;
            if (!class_8865.method_40772()) {
               var6 = 0.0;
               var8 = 0.0;
            }

            Entity var10 = client.thePlayer.method_37243();
            var10.rotationYaw = client.thePlayer.rotationYaw;
            var10.method_37214(var6, !client.thePlayer.field_29654 ? (!this.field_18223 ? 0.0 : (double)(-var5)) : (double)var5, var8);
         }
      }
   }

   @EventListen
   private void method_17262(class_6435 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.method_37243() != null) {
            if (!client.thePlayer.method_37243().field_41726) {
               if (var1.method_29384() == client.gameOptions.keySneak.field_30027.field_17800) {
                  var1.method_29715(true);
                  this.field_18223 = true;
               }
            }
         }
      }
   }

   @EventListen
   private void method_17261(class_307 var1) {
      if (this.method_42015()) {
         if (this.field_18223 && var1.method_1364() == client.gameOptions.keySneak.field_30027.field_17800) {
            this.field_18223 = false;
         }

         if (client.thePlayer.method_37243() != null) {
            if (!client.thePlayer.method_37243().field_41726) {
               if (var1.method_1364() == client.gameOptions.keySneak.field_30027.field_17800) {
                  var1.method_29715(true);
                  this.field_18223 = false;
               }
            }
         }
      }
   }

   @Override
   public void onEnable() {
      if (!client.gameOptions.keySneak.isKeyDown()) {
         if (!client.gameOptions.keySneak.isKeyDown()) {
            this.field_18223 = false;
         }
      } else {
         client.gameOptions.keySneak.pressed = false;
         this.field_18223 = true;
      }
   }

   @Override
   public void onDisable() {
      client.gameOptions.keySneak.pressed = this.field_18223;
   }
}
