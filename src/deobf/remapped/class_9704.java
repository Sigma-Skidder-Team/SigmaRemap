package remapped;

public class class_9704 extends Module {
   private boolean field_49354;

   public class_9704() {
      super(Category.MOVEMENT, "NoSlow", "Stops slowdown when using an item");
      this.addSetting(new ModeSetting("Mode", "NoSlow mode", 0, "Vanilla", "NCP"));
   }

   @EventListen
   private void method_44839(class_3920 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @EventListen
   private void method_44840(class_1393 var1) {
      if (this.method_42015()) {
         boolean var4 = SigmaMainClass.getInstance().getModuleManager().method_847(KillauraModule.class).method_42003();
         boolean var5 = mcInstance.field_9632.method_26446() != null && mcInstance.field_9632.method_26446().method_27960() instanceof class_2235;
         if (!var1.method_6449()) {
            if (var5 && mcInstance.field_9577.field_45559.method_27060() && !this.field_49354 && !var4 && this.getStringValueByName("Mode").equals("NCP")) {
               class_314.method_1396();
               this.field_49354 = true;
            } else if (!var5 && this.field_49354) {
               this.field_49354 = false;
            }
         } else if (!this.getStringValueByName("Mode").equals("NCP")) {
            if (this.field_49354 && !mcInstance.field_9577.field_45559.method_27060()) {
               this.field_49354 = false;
            }
         } else if (this.field_49354 && mcInstance.field_9577.field_45559.method_27060() && !var4) {
            if (var5) {
               class_314.method_1459();
            }

            this.field_49354 = false;
         }
      }
   }
}
