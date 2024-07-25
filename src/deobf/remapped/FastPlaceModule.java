package remapped;

public class FastPlaceModule extends Module {
   public FastPlaceModule() {
      super(Category.WORLD, "FastPlace", "Allows you to place blocks faster");
      this.addSetting(new BooleanSetting("Reduce Delay", "Makes block placement faster, but not too much!", true));
   }

   @EventListen
   private void method_2745(class_5596 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.method_26446() != null) {
            if (client.thePlayer.method_26446().method_27960() instanceof class_6201) {
               if (client.field_9587 instanceof class_9529) {
                  if (!this.getBooleanValueByName("Reduce Delay")) {
                     client.field_9570 = 0;
                  } else {
                     client.field_9570--;
                  }
               }
            }
         }
      }
   }
}
