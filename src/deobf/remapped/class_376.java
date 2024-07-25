package remapped;

public class class_376 extends class_158 {
   public class_376(boolean var1) {
      super("overlay", () -> {
         if (var1) {
            MinecraftClient.getInstance().gameRenderer.method_35936().method_24481();
         }
      }, () -> {
         if (var1) {
            MinecraftClient.getInstance().gameRenderer.method_35936().method_24482();
         }
      }, var1);
   }
}
