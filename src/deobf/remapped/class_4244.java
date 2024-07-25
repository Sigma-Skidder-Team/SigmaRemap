package remapped;

public class class_4244 extends Module {
   public class_4244() {
      super(Category.COMBAT, "Legit", "Increase the knockback you give to players");
   }

   @EventListen
   private void method_19784(class_5596 var1) {
      if (this.method_42015()) {
         mcInstance.gameOptions.keySprint.pressed = true;
         if (mcInstance.field_9632.field_29666 != 1) {
            if (mcInstance.field_9632.field_29666 == 0) {
               mcInstance.gameOptions.keyForward.pressed = class_9732.method_44934(
                  MinecraftClient.getInstance().window.method_43181(), mcInstance.gameOptions.keyForward.field_30027.field_17800
               );
            }
         } else {
            mcInstance.gameOptions.keyForward.pressed = false;
         }
      }
   }
}
