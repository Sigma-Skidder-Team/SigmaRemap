package remapped;

public class class_4248 extends Module {
   public class_4248() {
      super(class_5664.field_28714, "Regen", "Regenerates hearts faster than ever (1.8 only)");
      this.method_42010(new class_2748<Float>("Packet amount", "Number of packets sent", 50.0F, Float.class, 1.0F, 100.0F, 1.0F));
      this.method_42010(new class_8563("Only OnGround", "Regen only when on ground", false));
   }

   @class_9148
   private void method_19790(class_5596 var1) {
      if (this.method_42015()) {
         if (!mcInstance.field_9632.field_3876.field_4944
            && mcInstance.field_9632.method_3161().method_42238() > 17
            && mcInstance.field_9632.method_26551() < 20.0F
            && mcInstance.field_9632.method_26551() != 0.0F
            && (mcInstance.field_9632.field_41726 || !this.method_42007("Only OnGround"))) {
            for (int var4 = 0; (float)var4 < this.method_42002("Packet amount"); var4++) {
               mcInstance.method_8614().method_4813(new class_4609(mcInstance.field_9632.field_41726));
            }
         }
      }
   }
}
