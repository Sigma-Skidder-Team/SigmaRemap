package remapped;

public class FullbrightModule extends Module {
   public float field_4691 = 1.0F;

   public FullbrightModule() {
      super(Category.RENDER, "Fullbright", "Makes you see in the dark");
      this.addSetting(new ModeSetting("Type", "Fullbright type", 0, "Normal"));
   }

   @Override
   public void method_42012() {
      if (!this.method_42015()) {
         mc.gameOptions.brightnessGamma = 1.0;
      }
   }

   @Override
   public void onEnable() {
      if (this.getStringValueByName("Type").equals("Normal")) {
         mc.gameOptions.brightnessGamma = 999.0;
      }
   }

   @EventListen
   public void method_3924(class_5596 var1) {
      if (this.method_42015()) {
         mc.gameOptions.brightnessGamma = 999.0;
         if (mc.field_9601 != null) {
            if (!this.getStringValueByName("Type").equals("Normal")) {
               int var4 = 16;
               class_1331 var5 = new class_1331(
                     mc.field_9632.method_37302(), mc.field_9632.method_37309(), mc.field_9632.method_37156()
                  )
                  .method_6081();
               class_5990 var6 = mc.field_9601.method_22556(var5);
               if (var6 != null && var5.method_12165() >= 0 && var5.method_12165() < 256 && !var6.method_27339()) {
                  var4 -= var6.method_28263(var5);
               }

               this.field_4691 = this.field_4691 + ((float)var4 - this.field_4691) * 0.2F;
               if (!(this.field_4691 < 1.5F)) {
                  mc.gameOptions.brightnessGamma = (double)Math.min(Math.max(1.0F, this.field_4691), 10.0F);
               }
            }
         }
      }
   }

   @Override
   public void onDisable() {
      mc.gameOptions.brightnessGamma = 1.0;
   }
}
