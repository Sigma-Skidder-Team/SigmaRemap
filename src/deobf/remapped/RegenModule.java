package remapped;

public class RegenModule extends Module {
   public RegenModule() {
      super(Category.COMBAT, "Regen", "Regenerates hearts faster than ever (1.8 only)");
      this.addSetting(new FloatSetting<Float>("Packet amount", "Number of packets sent", 50.0F, Float.class, 1.0F, 100.0F, 1.0F));
      this.addSetting(new BooleanSetting("Only OnGround", "Regen only when on ground", false));
   }

   @EventListen
   private void method_19790(class_5596 var1) {
      if (this.method_42015()) {
         if (!client.thePlayer.field_3876.field_4944
            && client.thePlayer.method_3161().method_42238() > 17
            && client.thePlayer.method_26551() < 20.0F
            && client.thePlayer.method_26551() != 0.0F
            && (client.thePlayer.field_41726 || !this.getBooleanValueByName("Only OnGround"))) {
            for (int var4 = 0; (float)var4 < this.getFloatValueByName("Packet amount"); var4++) {
               client.method_8614().method_4813(new class_4609(client.thePlayer.field_41726));
            }
         }
      }
   }
}
