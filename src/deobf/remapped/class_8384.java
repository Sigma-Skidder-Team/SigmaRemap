package remapped;

public class class_8384 extends class_158 {
   public class_8384(boolean var1) {
      super("lightmap", () -> {
         if (var1) {
            MinecraftClient.getInstance().gameRenderer.method_35953().method_26126();
         }
      }, () -> {
         if (var1) {
            MinecraftClient.getInstance().gameRenderer.method_35953().method_26122();
         }
      }, var1);
   }
}
