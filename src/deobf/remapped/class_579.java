package remapped;

public class class_579 extends class_9128 {
   public class_579() {
      super(class_5664.field_28718, "FastPlace", "Allows you to place blocks faster");
      this.method_42010(new class_8563("Reduce Delay", "Makes block placement faster, but not too much!", true));
   }

   @class_9148
   private void method_2745(class_5596 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.method_26446() != null) {
            if (field_46692.field_9632.method_26446().method_27960() instanceof class_6201) {
               if (field_46692.field_9587 instanceof class_9529) {
                  if (!this.method_42007("Reduce Delay")) {
                     field_46692.field_9570 = 0;
                  } else {
                     field_46692.field_9570--;
                  }
               }
            }
         }
      }
   }
}
