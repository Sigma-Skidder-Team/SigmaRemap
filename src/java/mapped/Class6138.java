package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.tileentity.TileEntity;

public class Class6138<S extends TileEntity> implements Class6139<S, Int2IntFunction> {
   private static String[] field27536;

   public Int2IntFunction method19043(S var1, S var2) {
      return var2x -> {
         if (! EmissiveTextures.method30596()) {
            int var5 = WorldRenderer.method944(var1.method3734(), var1.getPos());
            int var6 = WorldRenderer.method944(var2.method3734(), var2.getPos());
            int var7 = Class1699.method7322(var5);
            int var8 = Class1699.method7322(var6);
            int var9 = Class1699.method7323(var5);
            int var10 = Class1699.method7323(var6);
            return Class1699.method7321(Math.max(var7, var8), Math.max(var9, var10));
         } else {
            return Class1699.field9258;
         }
      };
   }

   public Int2IntFunction method19042(S var1) {
      return var0 -> var0;
   }

   public Int2IntFunction method19041() {
      return var0 -> var0;
   }
}
