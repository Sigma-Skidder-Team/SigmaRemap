package lol;

public final class GLUtils {
   public static void checkGLContext() {
      try {
         Renderer.get().method18413();
      } catch (NullPointerException var3) {
         throw new RuntimeException(
            "OpenGL based resources (images, fonts, sprites etc) must be loaded as part of init() or the game loop. They cannot be loaded before initialisation."
         );
      }
   }
}
