package mapped;

import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class Class4230 {
   private static String[] field20561;

   @Deprecated
   public static int[] method13022(IResourceManager var0, ResourceLocation var1) throws IOException {
      int[] var8;
      try (
              IResource var4 = var0.getResource(var1);
              NativeImage var6 = NativeImage.method7879(var4.getInputStream());
      ) {
         var8 = var6.method7892();
      }

      return var8;
   }
}
