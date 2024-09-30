package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.lighting.LevelBasedGraph;

public abstract class Class203 extends LevelBasedGraph {
   public Class203(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean isRoot(long var1) {
      return var1 == ChunkPos.SENTINEL;
   }

   @Override
   public void method665(long var1, int var3, boolean var4) {
      ChunkPos var7 = new ChunkPos(var1);
      int var8 = var7.x;
      int var9 = var7.z;

      for (int var10 = -1; var10 <= 1; var10++) {
         for (int var11 = -1; var11 <= 1; var11++) {
            long var12 = ChunkPos.asLong(var8 + var10, var9 + var11);
            if (var12 != var1) {
               this.method674(var1, var12, var3, var4);
            }
         }
      }
   }

   @Override
   public int computeLevel(long var1, long var3, int var5) {
      int var8 = var5;
      ChunkPos var9 = new ChunkPos(var1);
      int var10 = var9.x;
      int var11 = var9.z;

      for (int var12 = -1; var12 <= 1; var12++) {
         for (int var13 = -1; var13 <= 1; var13++) {
            long var14 = ChunkPos.asLong(var10 + var12, var11 + var13);
            if (var14 == var1) {
               var14 = ChunkPos.SENTINEL;
            }

            if (var14 != var3) {
               int var16 = this.getEdgeLevel(var14, var1, this.getLevel(var14));
               if (var8 > var16) {
                  var8 = var16;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         }
      }

      return var8;
   }

   @Override
   public int getEdgeLevel(long var1, long var3, int var5) {
      return var1 != ChunkPos.SENTINEL ? var5 + 1 : this.method679(var3);
   }

   public abstract int method679(long var1);

   public void method680(long var1, int var3, boolean var4) {
      this.method672(ChunkPos.SENTINEL, var1, var3, var4);
   }
}
