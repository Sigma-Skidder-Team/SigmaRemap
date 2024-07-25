package remapped;

public class JetpackFlyModule extends Module {
   public JetpackFlyModule() {
      super(Category.MOVEMENT, "Jetpack", "A jetpack type fly");
   }

   @EventListen
   public void method_5589(class_5596 var1) {
      if (this.method_42015()) {
         if (mc.field_9632.field_29654) {
            mc.field_9632.method_26595();
         }
      }
   }
}
