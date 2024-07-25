package remapped;

public class NoHurtCamModule extends Module {
   public NoHurtCamModule() {
      super(Category.RENDER, "NoHurtCam", "Disables the hurt animation");
   }

   @class_9148
   private void method_17287(class_1711 var1) {
      if (this.method_42015()) {
         mcInstance.field_9632.field_29645 = 0;
      }
   }
}
