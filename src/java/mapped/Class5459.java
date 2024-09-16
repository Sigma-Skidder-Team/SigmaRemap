package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.structure.StructureStart;

public class Class5459 extends StructureStart<Class4712> {
   private static String[] field24218;

   public Class5459(Structure<Class4712> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, TemplateManager var3, int var4, int var5, Biome var6, Class4712 var7) {
      int var10 = var4 * 16;
      int var11 = var5 * 16;
      BlockPos var12 = new BlockPos(var10, 90, var11);
      Class80 var13 = Class80.method254(this.field24201);
      Class3191.method11407(var3, var12, var13, this.field24196, this.field24201);
      this.method17113();
   }
}
