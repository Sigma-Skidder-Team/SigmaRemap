package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3480 extends Class3194 implements Class3196 {
   private static String[] field19333;
   public static final Class8554 field19334 = Class8820.field39742;
   private static final VoxelShape[] field19335 = new VoxelShape[]{
      Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public Class3480(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(this.method12175(), Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19335[var1.<Integer>method23463(this.method12175())];
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.isIn(Blocks.FARMLAND);
   }

   public Class8554 method12175() {
      return field19334;
   }

   public int method12176() {
      return 7;
   }

   public int method12177(BlockState var1) {
      return var1.<Integer>method23463(this.method12175());
   }

   public BlockState method12178(int var1) {
      return this.method11579().method23465(this.method12175(), Integer.valueOf(var1));
   }

   public boolean method12179(BlockState var1) {
      return var1.<Integer>method23463(this.method12175()) >= this.method12176();
   }

   @Override
   public boolean method11499(BlockState var1) {
      return !this.method12179(var1);
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method7021(var3, 0) >= 9) {
         int var7 = this.method12177(var1);
         if (var7 < this.method12176()) {
            float var8 = method12182(this, var2, var3);
            if (var4.nextInt((int)(25.0F / var8) + 1) == 0) {
               var2.setBlockState(var3, this.method12178(var7 + 1), 2);
            }
         }
      }
   }

   public void method12180(World var1, BlockPos var2, BlockState var3) {
      int var6 = this.method12177(var3) + this.method12181(var1);
      int var7 = this.method12176();
      if (var6 > var7) {
         var6 = var7;
      }

      var1.setBlockState(var2, this.method12178(var6), 2);
   }

   public int method12181(World var1) {
      return MathHelper.method37782(var1.rand, 2, 5);
   }

   public static float method12182(Block var0, IBlockReader var1, BlockPos var2) {
      float var5 = 1.0F;
      BlockPos var6 = var2.down();

      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            float var9 = 0.0F;
            BlockState var10 = var1.getBlockState(var6.method8336(var7, 0, var8));
            if (var10.isIn(Blocks.FARMLAND)) {
               var9 = 1.0F;
               if (var10.<Integer>method23463(Class3221.field18644) > 0) {
                  var9 = 3.0F;
               }
            }

            if (var7 != 0 || var8 != 0) {
               var9 /= 4.0F;
            }

            var5 += var9;
         }
      }

      BlockPos var14 = var2.north();
      BlockPos var15 = var2.south();
      BlockPos var16 = var2.west();
      BlockPos var17 = var2.east();
      boolean var11 = var0 == var1.getBlockState(var16).getBlock() || var0 == var1.getBlockState(var17).getBlock();
      boolean var12 = var0 == var1.getBlockState(var14).getBlock() || var0 == var1.getBlockState(var15).getBlock();
      if (var11 && var12) {
         var5 /= 2.0F;
      } else {
         boolean var13 = var0 == var1.getBlockState(var16.north()).getBlock()
            || var0 == var1.getBlockState(var17.north()).getBlock()
            || var0 == var1.getBlockState(var17.south()).getBlock()
            || var0 == var1.getBlockState(var16.south()).getBlock();
         if (var13) {
            var5 /= 2.0F;
         }
      }

      return var5;
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return (var2.method7021(var3, 0) >= 8 || var2.method7022(var3)) && super.method11492(var1, var2, var3);
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (var4 instanceof Class1029 && var2.getGameRules().getBoolean(Class5462.field24224)) {
         var2.method7180(var3, true, var4);
      }

      super.method11523(var1, var2, var3, var4);
   }

   public IItemProvider method12183() {
      return Items.field37841;
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(this.method12183());
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return !this.method12179(var3);
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      this.method12180(var1, var3, var4);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19334);
   }
}
