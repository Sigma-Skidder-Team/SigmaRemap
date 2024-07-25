package remapped;

public class NoHurtCamModule extends Module {
   public NoHurtCamModule() {
      super(Category.RENDER, "NoHurtCam", "Disables the hurt animation");
   }

   @EventListen
   private void method_17287(class_1711 var1) {
      if (this.method_42015()) {
         client.thePlayer.field_29645 = 0;
      }
   }
}
