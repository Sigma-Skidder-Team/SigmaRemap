package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GrassColors;

import java.io.IOException;

public class GrassColorReloadListener extends Class269<int[]> {
   private static final ResourceLocation field1050 = new ResourceLocation("textures/colormap/grass.png");

   public int[] method970(IResourceManager var1, IProfiler var2) {
      try {
         return Class4230.method13022(var1, field1050);
      } catch (IOException var6) {
         throw new IllegalStateException("Failed to load grass color texture", var6);
      }
   }

   public void method971(int[] var1, IResourceManager var2, IProfiler var3) {
      GrassColors.method19508(var1);
   }
}
