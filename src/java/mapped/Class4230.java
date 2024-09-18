package mapped;

import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class Class4230 {
   private static String[] field20561;

   @Deprecated
   public static int[] method13022(IResourceManager var0, ResourceLocation var1) throws IOException {
      int[] var8;
      try (
              JSonShader var4 = var0.getShader(var1);
              Class1806 var6 = Class1806.method7879(var4.getFile());
      ) {
         var8 = var6.method7892();
      }

      return var8;
   }
}
