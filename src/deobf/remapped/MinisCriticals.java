package remapped;

public class MinisCriticals extends Module {
   public MinisCriticals() {
      super(Category.COMBAT, "Minis", "Minis criticals");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel", "Cubecraft"));
      this.addSetting(new BooleanSetting("Avoid Fall Damage", "Avoid fall damages", false));
   }

   @EventListen
   private void method_31154(class_2911 var1) {
      if (this.method_42015()) {
         if (KillauraModule.field_12548) {
            client.method_8614()
               .method_4813(
                  new class_9515(client.thePlayer.method_37302(), client.thePlayer.method_37309(), client.thePlayer.method_37156(), true)
               );
         }
      }
   }

   @EventListen
   private void method_31155(class_8544 var1) {
      if (this.method_42015()) {
         if (KillauraModule.field_12548) {
            var1.method_29715(true);
         }
      }
   }
}
