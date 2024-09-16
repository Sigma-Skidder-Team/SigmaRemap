package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3456 extends Class3194 {
   private static String[] field18470;
   public static final Class8552<Class84> field19276 = Class8820.field39734;

   public Class3456(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19276, Class84.field210));
   }

   @Override
   public BlockState method11491(BlockState var1, net.minecraft.util.Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      Class84 var9 = var1.<Class84>method23463(field19276);
      if (var2.getAxis() != Direction.field414
         || var9 == Class84.field210 != (var2 == net.minecraft.util.Direction.field673)
         || var3.isIn(this) && var3.<Class84>method23463(field19276) != var9) {
         return var9 == Class84.field210 && var2 == net.minecraft.util.Direction.DOWN && !var1.method23443(var4, var5)
            ? Blocks.AIR.method11579()
            : super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.AIR.method11579();
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockPos var4 = var1.method18345();
      return var4.getY() < 255 && var1.method18360().getBlockState(var4.up()).method23441(var1) ? super.method11495(var1) : null;
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      var1.setBlockState(var2.up(), this.method11579().method23465(field19276, Class84.field209), 3);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      if (var1.<Class84>method23463(field19276) != Class84.field209) {
         return super.method11492(var1, var2, var3);
      } else {
         BlockState var6 = var2.getBlockState(var3.down());
         return var6.isIn(this) && var6.<Class84>method23463(field19276) == Class84.field210;
      }
   }

   public void method12129(Class1660 var1, BlockPos var2, int var3) {
      var1.setBlockState(var2, this.method11579().method23465(field19276, Class84.field210), var3);
      var1.setBlockState(var2.up(), this.method11579().method23465(field19276, Class84.field209), var3);
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote) {
         if (!var4.isCreative()) {
            spawnDrops(var3, var1, var2, (TileEntity)null, var4, var4.getHeldItemMainhand());
         } else {
            method12130(var1, var2, var3, var4);
         }
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, Blocks.AIR.method11579(), var5, var6);
   }

   public static void method12130(World var0, BlockPos var1, BlockState var2, PlayerEntity var3) {
      Class84 var6 = var2.<Class84>method23463(field19276);
      if (var6 == Class84.field209) {
         BlockPos var7 = var1.down();
         BlockState var8 = var0.getBlockState(var7);
         if (var8.getBlock() == var2.getBlock() && var8.<Class84>method23463(field19276) == Class84.field210) {
            var0.setBlockState(var7, Blocks.AIR.method11579(), 35);
            var0.method6869(var3, 2001, var7, Block.getStateId(var8));
         }
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19276);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   @Override
   public long method11691(BlockState var1, BlockPos var2) {
      return MathHelper.method37810(var2.getX(), var2.method8340(var1.method23463(field19276) != Class84.field210 ? 1 : 0).getY(), var2.getZ());
   }
}
