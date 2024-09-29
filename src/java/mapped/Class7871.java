package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

import java.util.List;

public class Class7871 {
   private static String[] field33729;
   public int field33730;
   public int field33731;
   public List<BlockPos> field33732;

   public Class7871(int var1, int var2, List<BlockPos> var3) {
      this.field33730 = var1;
      this.field33731 = var2;
      this.field33732 = var3;
   }

   public boolean method26390(ChunkPos var1) {
      return var1.x == this.field33730 && var1.z == this.field33731;
   }

   public int method26391(ChunkPos var1) {
      return (int)Math.sqrt(
         (double)(
            (var1.x - this.field33730) * (var1.x - this.field33730)
               + (var1.z - this.field33731) * (var1.z - this.field33731)
         )
      );
   }

   public ChunkPos method26392() {
      return new ChunkPos(this.field33730, this.field33731);
   }
}
