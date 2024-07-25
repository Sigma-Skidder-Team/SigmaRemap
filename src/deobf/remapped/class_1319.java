package remapped;

public class class_1319 extends Module {
   public class_1319() {
      super(Category.MOVEMENT, "Vanilla", "Spider for Vanilla");
      this.addSetting(new FloatSetting<Float>("Motion", "Spider motion", 0.35F, Float.class, 0.2F, 1.0F, 0.05F));
   }

   @EventListen
   private void method_6026(class_7767 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_41744) {
            var1.method_35235((double)this.getFloatValueByName("Motion"));
         }
      }
   }
}
