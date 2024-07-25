package remapped;

public class class_1287 extends class_9128 {
   public class_1287() {
      super(class_5664.field_28718, "AutoFish", "Automatically catches fish for you");
   }

   @class_9148
   public void method_5738(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_3740 || var1.method_557() instanceof class_8283) {
            if (field_46692.field_9632.method_26446() != null) {
               if (field_46692.field_9632.method_26446().method_27960() instanceof class_8411) {
                  if (!(var1.method_557() instanceof class_3740)) {
                     if (var1.method_557() instanceof class_8283 && !((class_8283)var1.method_557()).field_42460.equals("entity.bobber.splash")) {
                        return;
                     }
                  } else if (!((class_3740)var1.method_557()).method_17341().equals(class_463.field_2403)) {
                     return;
                  }

                  field_46692.method_8614().method_4813(new class_1022(class_2584.field_12791));
                  field_46692.method_8614().method_4813(new class_1022(class_2584.field_12791));
                  SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("AutoFish", "We catched something!", class_2209.field_11004));
               }
            }
         }
      }
   }
}
