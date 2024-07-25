package remapped;

public class HoverCriticals extends Module {
   private double field_13568;

   public HoverCriticals() {
      super(Category.COMBAT, "Hover", "Hover criticals");
   }

   @Override
   public void onEnable() {
      this.field_13568 = 1.0E-11;
   }

   @EventListen
   public void method_12646(PacketEvent var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            this.field_13568 = 1.0E-11;
         }
      }
   }

   @EventListen
   @class_315
   private void method_12647(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         boolean var4 = mc.field_9587 != null && mc.field_9587.method_33990() == class_1430.field_7717;
         boolean var5 = mc.field_9647.method_42156() || mc.gameOptions.keyAttack.isKeyDown() && var4;
         if (SigmaMainClass.getInstance().method_3310().method_25293() > 0 && !var5) {
            this.field_13568 -= 1.0E-14;
            if (this.field_13568 < 0.0 || StepModule.field_20352 == 0) {
               this.field_13568 = 1.0E-11;
            }

            var1.method_6444(true);
            var1.method_6455(var1.method_6454() + this.field_13568);
            var1.method_6451(false);
         } else {
            this.field_13568 = 1.0E-11;
         }
      }
   }
}
