package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Class1667 implements Class1665, Class1668 {
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
      Class1702 var8 = var1.getChunkProvider();
      this.field9084 = true;

      for (int var9 = this.field9081; var9 <= var6; var9++) {
         for (int var10 = this.field9082; var10 <= var7; var10++) {
            this.field9083[var9 - this.field9081][var10 - this.field9082] = var8.method7343(var9, var10);
         }
      }

      for (int var12 = var2.getX() >> 4; var12 <= var3.getX() >> 4; var12++) {
         for (int var13 = var2.getZ() >> 4; var13 <= var3.getZ() >> 4; var13++) {
            IChunk var11 = this.field9083[var12 - this.field9081][var13 - this.field9082];
            if (var11 != null && !var11.method7076(var2.getY(), var3.getY())) {
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
         return (IChunk)(var7 == null ? new Class1675(this.field9085, new Class7481(var1, var2)) : var7);
      } else {
         return new Class1675(this.field9085, new Class7481(var1, var2));
      }
   }

   @Override
   public WorldBorder method6810() {
      return this.field9085.method6810();
   }

   @Override
   public Class1665 method6769(int var1, int var2) {
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
         return Blocks.AIR.method11579();
      }
   }

   @Override
   public Stream<VoxelShape> method7046(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return Stream.<VoxelShape>empty();
   }

   @Override
   public Stream<VoxelShape> method7047(Entity var1, AxisAlignedBB var2, Predicate<Entity> var3) {
      return this.method7055(var1, var2);
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      if (!World.isOutsideBuildHeight(var1)) {
         IChunk var4 = this.method7044(var1);
         return var4.getFluidState(var1);
      } else {
         return Class9479.field44064.method25049();
      }
   }
}
