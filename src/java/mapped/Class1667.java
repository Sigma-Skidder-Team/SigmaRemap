package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ICollisionReader;
import net.minecraft.world.World;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.chunk.EmptyChunk;
import net.minecraft.world.chunk.IChunk;

import javax.annotation.Nullable;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class1667 implements IBlockReader, ICollisionReader {
   private static String[] field9080;
   public final int field9081;
   public final int field9082;
   public final IChunk[][] field9083;
   public boolean field9084;
   public final World field9085;

   public Class1667(World var1, BlockPos var2, BlockPos var3) {
      this.field9085 = var1;
      this.field9081 = var2.getX() >> 4;
      this.field9082 = var2.getZ() >> 4;
      int var6 = var3.getX() >> 4;
      int var7 = var3.getZ() >> 4;
      this.field9083 = new IChunk[var6 - this.field9081 + 1][var7 - this.field9082 + 1];
      AbstractChunkProvider var8 = var1.getChunkProvider();
      this.field9084 = true;

      for (int var9 = this.field9081; var9 <= var6; var9++) {
         for (int var10 = this.field9082; var10 <= var7; var10++) {
            this.field9083[var9 - this.field9081][var10 - this.field9082] = var8.method7343(var9, var10);
         }
      }

      for (int var12 = var2.getX() >> 4; var12 <= var3.getX() >> 4; var12++) {
         for (int var13 = var2.getZ() >> 4; var13 <= var3.getZ() >> 4; var13++) {
            IChunk var11 = this.field9083[var12 - this.field9081][var13 - this.field9082];
            if (var11 != null && !var11.isEmptyBetween(var2.getY(), var3.getY())) {
               this.field9084 = false;
               return;
            }
         }
      }
   }

   private IChunk method7044(BlockPos var1) {
      return this.method7045(var1.getX() >> 4, var1.getZ() >> 4);
   }

   private IChunk method7045(int var1, int var2) {
      int var5 = var1 - this.field9081;
      int var6 = var2 - this.field9082;
      if (var5 >= 0 && var5 < this.field9083.length && var6 >= 0 && var6 < this.field9083[var5].length) {
         IChunk var7 = this.field9083[var5][var6];
         return (IChunk)(var7 == null ? new EmptyChunk(this.field9085, new ChunkPos(var1, var2)) : var7);
      } else {
         return new EmptyChunk(this.field9085, new ChunkPos(var1, var2));
      }
   }

   @Override
   public WorldBorder getWorldBorder() {
      return this.field9085.getWorldBorder();
   }

   @Override
   public IBlockReader getBlockReader(int var1, int var2) {
      return this.method7045(var1, var2);
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      IChunk var4 = this.method7044(var1);
      return var4.getTileEntity(var1);
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      if (!World.isOutsideBuildHeight(var1)) {
         IChunk var4 = this.method7044(var1);
         return var4.getBlockState(var1);
      } else {
         return Blocks.AIR.getDefaultState();
      }
   }

   @Override
   public Stream<VoxelShape> func_230318_c_(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return Stream.<VoxelShape>empty();
   }

   @Override
   public Stream<VoxelShape> func_234867_d_(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return this.getCollisionShapes(var1, var2);
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      if (!World.isOutsideBuildHeight(var1)) {
         IChunk var4 = this.method7044(var1);
         return var4.getFluidState(var1);
      } else {
         return Fluids.EMPTY.method25049();
      }
   }
}
