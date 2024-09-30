package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunkLightProvider;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.LightEngine;
import org.apache.commons.lang3.mutable.MutableInt;

public final class Class201 extends LightEngine<Class7585, Class209> {
   private static String[] field753;
   private static final Direction[] field745 = Direction.values();
   private final BlockPos.Mutable field750 = new BlockPos.Mutable();

   public Class201(IChunkLightProvider var1) {
      super(var1, LightType.BLOCK, new Class209(var1));
   }

   private int method664(long var1) {
      int var5 = BlockPos.unpackX(var1);
      int var6 = BlockPos.unpackY(var1);
      int var7 = BlockPos.unpackZ(var1);
      IBlockReader var8 = this.chunkProvider.getChunkForLight(var5 >> 4, var7 >> 4);
      return var8 == null ? 0 : var8.getLightValue(this.field750.method8372(var5, var6, var7));
   }

   @Override
   public int getEdgeLevel(long var1, long var3, int var5) {
      if (var3 != Long.MAX_VALUE) {
         if (var1 != Long.MAX_VALUE) {
            if (var5 < 15) {
               int var8 = Integer.signum(BlockPos.unpackX(var3) - BlockPos.unpackX(var1));
               int var9 = Integer.signum(BlockPos.unpackY(var3) - BlockPos.unpackY(var1));
               int var10 = Integer.signum(BlockPos.unpackZ(var3) - BlockPos.unpackZ(var1));
               Direction var11 = Direction.byLong(var8, var9, var10);
               if (var11 != null) {
                  MutableInt var12 = new MutableInt();
                  BlockState var13 = this.getBlockAndOpacity(var3, var12);
                  if (var12.getValue() < 15) {
                     BlockState var14 = this.getBlockAndOpacity(var1, (MutableInt)null);
                     VoxelShape var15 = this.getVoxelShape(var14, var1, var11);
                     VoxelShape var16 = this.getVoxelShape(var13, var3, var11.getOpposite());
                     return ! VoxelShapes.method27444(var15, var16) ? var5 + Math.max(1, var12.getValue()) : 15;
                  } else {
                     return 15;
                  }
               } else {
                  return 15;
               }
            } else {
               return var5;
            }
         } else {
            return var5 + 15 - this.method664(var3);
         }
      } else {
         return 15;
      }
   }

   @Override
   public void method665(long var1, int var3, boolean var4) {
      long var7 = SectionPos.worldToSection(var1);

      for (Direction var12 : field745) {
         long var13 = BlockPos.method8314(var1, var12);
         long var15 = SectionPos.worldToSection(var13);
         if (var7 == var15 || this.storage.hasSection(var15)) {
            this.method674(var1, var13, var3, var4);
         }
      }
   }

   @Override
   public int computeLevel(long var1, long var3, int var5) {
      int var8 = var5;
      if (Long.MAX_VALUE != var3) {
         int var15 = this.getEdgeLevel(Long.MAX_VALUE, var1, 0);
         if (var5 > var15) {
            var8 = var15;
         }

         if (var8 == 0) {
            return var8;
         }
      }

      long var9 = SectionPos.worldToSection(var1);
      NibbleArray var11 = this.storage.method699(var9, true);

      for (Direction var16 : field745) {
         long var17 = BlockPos.method8314(var1, var16);
         if (var17 != var3) {
            long var19 = SectionPos.worldToSection(var17);
            NibbleArray var21;
            if (var9 != var19) {
               var21 = this.storage.method699(var19, true);
            } else {
               var21 = var11;
            }

            if (var21 != null) {
               int var22 = this.getEdgeLevel(var17, var1, this.getLevelFromArray(var21, var17));
               if (var8 > var22) {
                  var8 = var22;
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
   public void func_215623_a(BlockPos var1, int var2) {
      this.storage.processAllLevelUpdates();
      this.method672(Long.MAX_VALUE, var1.method8332(), 15 - var2, true);
   }
}
