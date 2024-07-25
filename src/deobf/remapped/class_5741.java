package remapped;

public class class_5741 extends Module {
   private int field_29085;

   public class_5741() {
      super(Category.COMBAT, "FastBow", "Shoots arrows faster");
   }

   @class_9148
   private void method_25988(class_5596 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.method_26446() != null
            && mcInstance.field_9632.method_26446().method_27960() instanceof class_2100
            && mcInstance.field_9632.field_41726) {
            for (int var4 = 0; var4 < 25; var4++) {
               mcInstance.method_8614().method_4813(new class_4609(true));
            }

            mcInstance.method_8614().method_4813(new class_1586(class_7500.field_38259, class_1331.field_7306, Direction.field_802));
         }
      }
   }
}
