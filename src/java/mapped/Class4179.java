package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;

public class Class4179 extends Class4178 {
   private static String[] field20451;

   public Class4179(BlockPos var1) {
      super(Class7792.field33477, 0);
      this.field20444 = new MutableBoundingBox(var1.getX(), var1.getY(), var1.getZ(), var1.getX(), var1.getY(), var1.getZ());
   }

   public Class4179(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33477, var2);
   }

   @Override
   public void method12897(CompoundNBT var1) {
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      int var10 = var1.method6736(Heightmap.Type.OCEAN_FLOOR_WG, this.field20444.field45678, this.field20444.field45680);
      BlockPos.Mutable var11 = new BlockPos.Mutable(this.field20444.field45678, var10, this.field20444.field45680);

      while (var11.getY() > 0) {
         BlockState var12 = var1.getBlockState(var11);
         BlockState var13 = var1.getBlockState(var11.down());
         if (var13 == Blocks.SANDSTONE.getDefaultState()
            || var13 == Blocks.STONE.getDefaultState()
            || var13 == Blocks.ANDESITE.getDefaultState()
            || var13 == Blocks.GRANITE.getDefaultState()
            || var13 == Blocks.DIORITE.getDefaultState()) {
            BlockState var14 = !var12.isAir() && !this.method12942(var12) ? var12 : Blocks.SAND.getDefaultState();

            for (Direction var18 : Direction.values()) {
               BlockPos var19 = var11.offset(var18);
               BlockState var20 = var1.getBlockState(var19);
               if (var20.isAir() || this.method12942(var20)) {
                  BlockPos var21 = var19.down();
                  BlockState var22 = var1.getBlockState(var21);
                  if ((var22.isAir() || this.method12942(var22)) && var18 != Direction.UP) {
                     var1.setBlockState(var19, var13, 3);
                  } else {
                     var1.setBlockState(var19, var14, 3);
                  }
               }
            }

            this.field20444 = new MutableBoundingBox(
               var11.getX(), var11.getY(), var11.getZ(), var11.getX(), var11.getY(), var11.getZ()
            );
            return this.method12935(var1, var5, var4, var11, Class8793.field39565, (BlockState)null);
         }

         var11.method8381(0, -1, 0);
      }

      return false;
   }

   private boolean method12942(BlockState var1) {
      return var1 == Blocks.WATER.getDefaultState() || var1 == Blocks.LAVA.getDefaultState();
   }
}
