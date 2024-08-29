package mapped;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8692 {
   private static final Logger field39234 = LogManager.getLogger();

   public static void method31315(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      Class7414.method23728(var0);
   }

   public static void method31316(Class1809 var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.method7943().method28248();
      var0.method7942().method28248();
      Class7414.method23730(var0.method7944());
   }

   public static int method31317() throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      int var2 = Class7414.method23729();
      if (var2 > 0) {
         return var2;
      } else {
         throw new IOException("Could not create shader program (returned program ID " + var2 + ")");
      }
   }

   public static void method31318(Class1809 var0) throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.method7943().method28247(var0);
      var0.method7942().method28247(var0);
      Class7414.method23731(var0.method7944());
      int var3 = Class7414.method23721(var0.method7944(), 35714);
      if (var3 == 0) {
         field39234.warn(
            "Error encountered when linking program containing VS {} and FS {}. Log output:", var0.method7942().method28249(), var0.method7943().method28249()
         );
         field39234.warn(Class7414.method23764(var0.method7944(), 32768));
      }
   }
}
