package remapped;

import org.lwjgl.glfw.GLFW;

public class AutoWalkModule extends Module {
   public AutoWalkModule() {
      super(Category.PLAYER, "AutoWalk", "Automatically walks forward");
   }

   @EventListen
   private void method_9058(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         client.gameOptions.keyForward.pressed = true;
      }
   }

   @Override
   public void onDisable() {
      int var3 = GLFW.glfwGetKey(client.window.getHandle(), client.gameOptions.keyForward.field_30027.field_17800);
      client.gameOptions.keyForward.pressed = var3 == 1;
   }
}
