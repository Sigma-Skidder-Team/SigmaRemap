package remapped;

import org.lwjgl.glfw.GLFW;

public class class_1958 extends Module {
   public class_1958() {
      super(Category.PLAYER, "AutoWalk", "Automatically walks forward");
   }

   @EventListen
   private void method_9058(class_5596 var1) {
      if (this.method_42015()) {
         mc.gameOptions.keyForward.pressed = true;
      }
   }

   @Override
   public void onDisable() {
      int var3 = GLFW.glfwGetKey(mc.window.method_43181(), mc.gameOptions.keyForward.field_30027.field_17800);
      mc.gameOptions.keyForward.pressed = var3 == 1;
   }
}
