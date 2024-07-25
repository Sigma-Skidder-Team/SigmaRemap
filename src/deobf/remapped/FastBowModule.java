package remapped;

public class FastBowModule extends Module {
   private int field_29085;

   public FastBowModule() {
      super(Category.COMBAT, "FastBow", "Shoots arrows faster");
   }

   @EventListen
   private void method_25988(class_5596 var1) {
      if (this.method_42015()) {
         if (mc.field_9632.method_26446() != null
            && mc.field_9632.method_26446().method_27960() instanceof class_2100
            && mc.field_9632.field_41726) {
            for (int var4 = 0; var4 < 25; var4++) {
               mc.method_8614().method_4813(new class_4609(true));
            }

            mc.method_8614().method_4813(new class_1586(class_7500.field_38259, class_1331.field_7306, Direction.field_802));
         }
      }
   }
}
