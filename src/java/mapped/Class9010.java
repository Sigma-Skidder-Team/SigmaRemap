package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ISeedReader;

import java.util.BitSet;

public class Class9010 {
   private static String[] field41214;
   private final ISeedReader field41215;
   private final ChunkGenerator field41216;

   public Class9010(ISeedReader var1, ChunkGenerator var2) {
      this.field41215 = var1;
      this.field41216 = var2;
   }

   public int method33296(Heightmap.Type var1, int var2, int var3) {
      return this.field41215.method6736(var1, var2, var3);
   }

   public int method33297() {
      return this.field41216.method17806();
   }

   public int method33298() {
      return this.field41216.method17807();
   }

   public BitSet method33299(ChunkPos var1, Class97 var2) {
      return ((Class1672)this.field41215.getChunk(var1.x, var1.z)).method7117(var2);
   }

   public BlockState method33300(BlockPos var1) {
      return this.field41215.getBlockState(var1);
   }
}
