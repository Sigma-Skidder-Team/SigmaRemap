package remapped;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5564 {
   private static final Logger field_28286 = LogManager.getLogger();

   public static void method_25269(int var0) {
      RenderSystem.method_16431(RenderSystem::method_16366);
      GlStateManager.method_8808(var0);
   }

   public static void method_25272(class_2072 var0) {
      RenderSystem.method_16431(RenderSystem::method_16366);
      var0.method_9673().method_17227();
      var0.method_9674().method_17227();
      GlStateManager.method_8853(var0.method_9672());
   }

   public static int method_25273() throws IOException {
      RenderSystem.method_16431(RenderSystem::method_16366);
      int var2 = GlStateManager.method_8933();
      if (var2 > 0) {
         return var2;
      } else {
         throw new IOException("Could not create shader program (returned program ID " + var2 + ")");
      }
   }

   public static void method_25270(class_2072 var0) throws IOException {
      RenderSystem.method_16431(RenderSystem::method_16366);
      var0.method_9673().method_17228(var0);
      var0.method_9674().method_17228(var0);
      GlStateManager.method_8759(var0.method_9672());
      int var3 = GlStateManager.method_8844(var0.method_9672(), 35714);
      if (var3 == 0) {
         field_28286.warn(
            "Error encountered when linking program containing VS {} and FS {}. Log output:",
            var0.method_9674().method_17229(),
            var0.method_9673().method_17229()
         );
         field_28286.warn(GlStateManager.method_8810(var0.method_9672(), 32768));
      }
   }
}
