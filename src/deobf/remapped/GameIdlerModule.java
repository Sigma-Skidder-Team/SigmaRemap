package remapped;

import org.lwjgl.glfw.GLFW;

public class GameIdlerModule extends Module {
   public GameIdlerModule() {
      super(Category.MISC, "GameIdler", "Lowers your fps when the game is idle to increase performance");
   }

   @EventListen
   private void method_44358(class_3278 var1) {
      if (this.isEnabled()) {
         boolean var4 = GLFW.glfwGetWindowAttrib(client.window.getHandle(), 131073) == 1;
         if (var4) {
            MinecraftClient.getInstance().window.setFramerateLimit(client.gameOptions.field_45439);
         } else {
            MinecraftClient.getInstance().window.setFramerateLimit(5);
         }
      }
   }

   @Override
   public void onDisable() {
      MinecraftClient.getInstance().window.setFramerateLimit(client.gameOptions.field_45439);
   }
}
