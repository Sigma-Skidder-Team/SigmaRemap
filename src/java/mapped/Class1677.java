package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class1677 implements Class1663 {
   private static String[] field9140;
   public final int field9141;
   public final int field9142;
   public final BlockPos field9143;
   public final int field9144;
   public final int field9145;
   public final int field9146;
   public final Chunk[][] field9147;
   public final BlockState[] field9148;
   public final FluidState[] field9149;
   public final World field9150;

   @Nullable
   public static Class1677 method7171(World var0, BlockPos var1, BlockPos var2, int var3) {
      return method7172(var0, var1, var2, var3, true);
   }

   public static Class1677 method7172(World var0, BlockPos var1, BlockPos var2, int var3, boolean var4) {
      int var7 = var1.getX() - var3 >> 4;
      int var8 = var1.getZ() - var3 >> 4;
      int var9 = var2.getX() + var3 >> 4;
      int var10 = var2.getZ() + var3 >> 4;
      Chunk[][] var11 = new Chunk[var9 - var7 + 1][var10 - var8 + 1];

      for (int var12 = var7; var12 <= var9; var12++) {
         for (int var13 = var8; var13 <= var10; var13++) {
            var11[var12 - var7][var13 - var8] = var0.getChunk(var12, var13);
         }
      }

      if (var4 && method7173(var1, var2, var7, var8, var11)) {
         return null;
      } else {
         boolean var15 = true;
         BlockPos var16 = var1.method8336(-1, -1, -1);
         BlockPos var14 = var2.method8336(1, 1, 1);
         return new Class1677(var0, var7, var8, var11, var16, var14);
      }
   }

   public static boolean method7173(BlockPos var0, BlockPos var1, int var2, int var3, Chunk[][] var4) {
      for (int var7 = var0.getX() >> 4; var7 <= var1.getX() >> 4; var7++) {
         for (int var8 = var0.getZ() >> 4; var8 <= var1.getZ() >> 4; var8++) {
            Chunk var9 = var4[var7 - var2][var8 - var3];
            if (!var9.method7076(var0.getY(), var1.getY())) {
               return false;
            }
         }
      }

      return true;
   }

   public Class1677(World var1, int var2, int var3, Chunk[][] var4, BlockPos var5, BlockPos var6) {
      this.field9150 = var1;
      this.field9141 = var2;
      this.field9142 = var3;
      this.field9147 = var4;
      this.field9143 = var5;
      this.field9144 = var6.getX() - var5.getX() + 1;
      this.field9145 = var6.getY() - var5.getY() + 1;
      this.field9146 = var6.getZ() - var5.getZ() + 1;
      this.field9148 = null;
      this.field9149 = null;
   }

   public final int method7174(BlockPos var1) {
      return this.method7175(var1.getX(), var1.getY(), var1.getZ());
   }

   public int method7175(int var1, int var2, int var3) {
      int var6 = var1 - this.field9143.getX();
      int var7 = var2 - this.field9143.getY();
      int var8 = var3 - this.field9143.getZ();
      return var8 * this.field9144 * this.field9145 + var7 * this.field9144 + var6;
   }

   @Override
   public BlockState getBlockState(BlockPos var1) {
      int var4 = (var1.getX() >> 4) - this.field9141;
      int var5 = (var1.getZ() >> 4) - this.field9142;
      return this.field9147[var4][var5].getBlockState(var1);
   }

   @Override
   public FluidState getFluidState(BlockPos var1) {
      int var4 = (var1.getX() >> 4) - this.field9141;
      int var5 = (var1.getZ() >> 4) - this.field9142;
      return this.field9147[var4][var5].getFluidState(var1);
   }

   @Override
   public float method6877(Direction var1, boolean var2) {
      return this.field9150.method6877(var1, var2);
   }

   @Override
   public Class196 method6737() {
      return this.field9150.method6737();
   }

   @Nullable
   @Override
   public TileEntity getTileEntity(BlockPos var1) {
      return this.method7029(var1, Class2206.field14421);
   }

   @Nullable
   public TileEntity method7029(BlockPos var1, Class2206 var2) {
      int var5 = (var1.getX() >> 4) - this.field9141;
      int var6 = (var1.getZ() >> 4) - this.field9142;
      return this.field9147[var5][var6].method7029(var1, var2);
   }

   @Override
   public int method6878(BlockPos var1, Class8980 var2) {
      return this.field9150.method6878(var1, var2);
   }

   public Biome method7176(BlockPos var1) {
      return this.field9150.getBiome(var1);
   }

   public Chunk method7177(int var1, int var2) {
      return this.field9147[var1][var2];
   }
}
