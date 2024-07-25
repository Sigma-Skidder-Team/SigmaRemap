package remapped;

public class class_579 extends Module {
   public class_579() {
      super(class_5664.field_28718, "FastPlace", "Allows you to place blocks faster");
      this.addSetting(new BooleanSetting("Reduce Delay", "Makes block placement faster, but not too much!", true));
   }

   @class_9148
   private void method_2745(class_5596 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.method_26446() != null) {
            if (mcInstance.field_9632.method_26446().method_27960() instanceof class_6201) {
               if (mcInstance.field_9587 instanceof class_9529) {
                  if (!this.method_42007("Reduce Delay")) {
                     mcInstance.field_9570 = 0;
                  } else {
                     mcInstance.field_9570--;
                  }
               }
            }
         }
      }
   }
}
