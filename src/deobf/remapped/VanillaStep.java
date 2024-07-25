package remapped;

public class VanillaStep extends Module {
   public VanillaStep() {
      super(Category.MOVEMENT, "Vanilla", "Step for Vanilla");
      this.addSetting(new FloatSetting<Float>("Maximum heigh", "Maximum heigh", 2.0F, Float.class, 1.0F, 10.0F, 0.5F));
   }

   @EventListen
   private void method_30574(class_7982 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!var1.method_36184()) {
            client.thePlayer.field_41733 = this.getFloatValueByName("Maximum heigh");
         } else {
            client.thePlayer.field_41733 = 0.5F;
         }
      }
   }
}
