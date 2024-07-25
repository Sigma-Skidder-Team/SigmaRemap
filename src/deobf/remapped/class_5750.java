package remapped;

public final class class_5750 {
   public static void method_26030() {
      try {
         class_3980.method_18363().method_5894();
      } catch (NullPointerException var3) {
         throw new RuntimeException(
            "OpenGL based resources (images, fonts, sprites etc) must be loaded as part of init() or the game loop. They cannot be loaded before initialisation."
         );
      }
   }
}
