package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.FoliageColors;

import java.io.IOException;

public class FoliageColorReloadListener extends Class269<int[]> {
   private static final ResourceLocation field1057 = new ResourceLocation("textures/colormap/foliage.png");

   public int[] method970(IResourceManager var1, IProfiler var2) {
      try {
         return Class4230.method13022(var1, field1057);
      } catch (IOException var6) {
         throw new IllegalStateException("Failed to load foliage color texture", var6);
      }
   }

   public void method971(int[] var1, IResourceManager var2, IProfiler var3) {
      FoliageColors.method36291(var1);
   }
}
