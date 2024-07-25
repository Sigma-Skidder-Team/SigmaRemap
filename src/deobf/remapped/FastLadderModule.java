package remapped;

public class FastLadderModule extends Module {
   public FastLadderModule() {
      super(Category.MOVEMENT, "FastLadder", "Allows you to climp ladders faster");
      this.addSetting(new FloatSetting<Float>("Motion", "Climbing motion", 0.35F, Float.class, 0.2F, 1.0F, 0.05F));
      this.addSetting(new ModeSetting("Down mode", "The way you will go down on ladders", 0, "None", "OnSneak", "Always"));
   }

   @EventListen
   private void method_24511(class_7767 var1) {
      if (this.method_42015() && mc.field_9632.method_26505()) {
         boolean var4 = class_3347.method_15349() >= class_412.field_1724.method_2055() || mc.method_8530() == null;
         if (!mc.field_9632.field_41744 && (!mc.field_9632.field_29654 || !var4)) {
            if (this.getStringValueByName("Down mode").equals("OnSneak") && mc.gameOptions.keySneak.isKeyDown()
               || this.getStringValueByName("Down mode").equals("Always")) {
               var1.method_35235((double)(-this.getFloatValueByName("Motion")));
            }
         } else {
            var1.method_35235((double)this.getFloatValueByName("Motion"));
         }
      }
   }
}
