package remapped;

public class WeatherModule extends Module {
   private float field_47767;
   private boolean field_47768;

   public WeatherModule() {
      super(Category.WORLD, "Weather", "Removes rain and changes the world's time");
      this.addSetting(new BooleanSetting("Custom time", "Set the world time", true));
      this.addSetting(new FloatSetting<Float>("Time", "Time to set the world to", 12000.0F, Float.class, 0.0F, 24000.0F, 1.0F).setModeClass(var1 -> {
         if (this.getBooleanValueByName("Custom time") && this.method_42015()) {
            client.theWorld.method_719(-((long)this.getFloatValueByName("Time")));
         }
      }));
      this.addSetting(new BooleanSetting("Disable rain", "Disable rain", true));
   }

   @Override
   public void onEnable() {
      this.field_47767 = client.theWorld.method_29578(1.0F);
      if (client.theWorld.method_29578(1.0F) != 1.0F) {
         if (client.theWorld.method_29578(1.0F) == 0.0F) {
            this.field_47768 = false;
         }
      } else {
         this.field_47768 = true;
      }

      client.theWorld.method_719((long)this.getFloatValueByName("Time"));
   }

   @EventListen
   private void method_43220(class_5596 var1) {
      if (this.method_42015()) {
         if (!this.getBooleanValueByName("Disable rain")) {
            if (this.field_47768) {
               if (!(this.field_47767 < 1.0F)) {
                  if (this.field_47767 > 1.0F) {
                     this.field_47767 = 1.0F;
                  }
               } else {
                  this.field_47767 = (float)((double)this.field_47767 + 0.05);
               }
            }
         } else if (!(this.field_47767 > 0.0F)) {
            if (this.field_47767 < 0.0F) {
               this.field_47767 = 0.0F;
            }
         } else {
            this.field_47767 = (float)((double)this.field_47767 - 0.05);
         }

         client.theWorld.method_29582(this.field_47767);
         client.theWorld.method_29560(this.field_47767);
      }
   }

   @EventListen
   private void method_43219(PacketEvent var1) {
      if (this.method_42015()) {
         if (!(var1.method_557() instanceof class_8508)) {
            if (var1.method_557() instanceof class_2161) {
               class_2161 var4 = (class_2161)var1.method_557();
               if (var4.method_10056().field_41885 == 7) {
                  if (var4.method_10055() != 1.0F) {
                     if (var4.method_10055() == 0.0F) {
                        this.field_47768 = false;
                     }
                  } else {
                     this.field_47768 = true;
                  }

                  if (!this.getBooleanValueByName("Disable rain")) {
                     this.field_47767 = var4.method_10055();
                  } else {
                     var1.method_556(new class_2161(var4.method_10056(), 0.0F));
                     this.field_47767 = 0.0F;
                  }
               }
            }
         } else if (this.getBooleanValueByName("Custom time")) {
            var1.method_556(new class_8508(-((long)this.getFloatValueByName("Time")), -((long)this.getFloatValueByName("Time")), true));
         }
      }
   }
}
