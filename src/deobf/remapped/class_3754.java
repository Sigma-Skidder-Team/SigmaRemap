package remapped;

public class class_3754 extends class_158 {
   public class_3754(boolean var1) {
      super("cull", () -> {
         if (!var1) {
            RenderSystem.disableCull();
         }
      }, () -> {
         if (!var1) {
            RenderSystem.enableCull();
         }
      }, var1);
   }
}
