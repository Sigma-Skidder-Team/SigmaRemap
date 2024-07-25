package remapped;

public class FastPlaceModule extends Module {
   public FastPlaceModule() {
      super(Category.WORLD, "FastPlace", "Allows you to place blocks faster");
      this.addSetting(new BooleanSetting("Reduce Delay", "Makes block placement faster, but not too much!", true));
   }

   @EventListen
   private void method_2745(class_5596 var1) {
      if (this.method_42015()) {
         if (mc.field_9632.method_26446() != null) {
            if (mc.field_9632.method_26446().method_27960() instanceof class_6201) {
               if (mc.field_9587 instanceof class_9529) {
                  if (!this.getBooleanValueByName("Reduce Delay")) {
                     mc.field_9570 = 0;
                  } else {
                     mc.field_9570--;
                  }
               }
            }
         }
      }
   }
}
