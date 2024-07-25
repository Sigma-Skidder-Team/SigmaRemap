package remapped;

import org.lwjgl.glfw.GLFW;

public class class_9604 extends Module {
   public class_9604() {
      super(Category.MISC, "GameIdler", "Lowers your fps when the game is idle to increase performance");
   }

   @EventListen
   private void method_44358(class_3278 var1) {
      if (this.method_42015()) {
         boolean var4 = GLFW.glfwGetWindowAttrib(mcInstance.window.method_43181(), 131073) == 1;
         if (var4) {
            MinecraftClient.getInstance().window.method_43194(mcInstance.field_9577.field_45439);
         } else {
            MinecraftClient.getInstance().window.method_43194(5);
         }
      }
   }

   @Override
   public void method_42020() {
      MinecraftClient.getInstance().window.method_43194(mcInstance.field_9577.field_45439);
   }
}
