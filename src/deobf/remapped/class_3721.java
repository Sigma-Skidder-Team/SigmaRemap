package remapped;

public class class_3721 extends PremiumModule {
   public boolean field_18223 = false;

   public class_3721() {
      super("BoatFly", "Fly with a boat", Category.MOVEMENT);
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
   }

   @EventListen
   public void method_17260(class_5596 var1) {
      if (this.method_42015()) {
         if (mc.field_9632.method_37243() != null) {
            float var4 = class_8865.method_40785();
            float var5 = this.getFloatValueByName("Speed");
            double var6 = Math.cos(Math.toRadians((double)var4)) * (double)var5;
            double var8 = Math.sin(Math.toRadians((double)var4)) * (double)var5;
            if (!class_8865.method_40772()) {
               var6 = 0.0;
               var8 = 0.0;
            }

            Entity var10 = mc.field_9632.method_37243();
            var10.field_41701 = mc.field_9632.field_41701;
            var10.method_37214(var6, !mc.field_9632.field_29654 ? (!this.field_18223 ? 0.0 : (double)(-var5)) : (double)var5, var8);
         }
      }
   }

   @EventListen
   private void method_17262(class_6435 var1) {
      if (this.method_42015()) {
         if (mc.field_9632.method_37243() != null) {
            if (!mc.field_9632.method_37243().field_41726) {
               if (var1.method_29384() == mc.gameOptions.keySneak.field_30027.field_17800) {
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
         if (this.field_18223 && var1.method_1364() == mc.gameOptions.keySneak.field_30027.field_17800) {
            this.field_18223 = false;
         }

         if (mc.field_9632.method_37243() != null) {
            if (!mc.field_9632.method_37243().field_41726) {
               if (var1.method_1364() == mc.gameOptions.keySneak.field_30027.field_17800) {
                  var1.method_29715(true);
                  this.field_18223 = false;
               }
            }
         }
      }
   }

   @Override
   public void onEnable() {
      if (!mc.gameOptions.keySneak.isKeyDown()) {
         if (!mc.gameOptions.keySneak.isKeyDown()) {
            this.field_18223 = false;
         }
      } else {
         mc.gameOptions.keySneak.pressed = false;
         this.field_18223 = true;
      }
   }

   @Override
   public void onDisable() {
      mc.gameOptions.keySneak.pressed = this.field_18223;
   }
}
