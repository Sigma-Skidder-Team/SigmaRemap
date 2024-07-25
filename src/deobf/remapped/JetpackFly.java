package remapped;

public class JetpackFly extends Module {
   public JetpackFly() {
      super(Category.MOVEMENT, "Jetpack", "A jetpack type fly");
   }

   @EventListen
   public void method_5589(class_5596 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_29654) {
            client.thePlayer.method_26595();
         }
      }
   }
}
