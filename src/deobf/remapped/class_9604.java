package remapped;

import org.lwjgl.glfw.GLFW;

public class class_9604 extends class_9128 {
   public class_9604() {
      super(class_5664.field_28711, "GameIdler", "Lowers your fps when the game is idle to increase performance");
   }

   @class_9148
   private void method_44358(class_3278 var1) {
      if (this.method_42015()) {
         boolean var4 = GLFW.glfwGetWindowAttrib(field_46692.field_9602.method_43181(), 131073) == 1;
         if (var4) {
            MinecraftClient.method_8510().field_9602.method_43194(field_46692.field_9577.field_45439);
         } else {
            MinecraftClient.method_8510().field_9602.method_43194(5);
         }
      }
   }

   @Override
   public void method_42020() {
      MinecraftClient.method_8510().field_9602.method_43194(field_46692.field_9577.field_45439);
   }
}
