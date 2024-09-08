package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3418 extends Block implements Class3196 {
   private static String[] field19121;
   public static final VoxelShape field19122 = Block.method11539(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   public static final VoxelShape field19123 = Block.method11539(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   public static final VoxelShape field19124 = Block.method11539(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final Class8554 field19125 = Class8820.field39738;
   public static final Class8552<Class181> field19126 = Class8820.field39773;
   public static final Class8554 field19127 = Class8820.field39760;

   public Class3418(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19125, Integer.valueOf(0))
            .method23465(field19126, Class181.field642)
            .method23465(field19127, Integer.valueOf(0))
      );
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19125, field19126, field19127);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   @Override
   public boolean method11493(BlockState var1, IBlockReader var2, BlockPos var3) {
      return true;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      VoxelShape var7 = var1.method23463(field19126) != Class181.field644 ? field19122 : field19123;
      Vector3d var8 = var1.method23421(var2, var3);
      return var7.withOffset(var8.x, var8.y, var8.z);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Vector3d var7 = var1.method23421(var2, var3);
      return field19124.withOffset(var7.x, var7.y, var7.z);
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      FluidState var4 = var1.method18360().getFluidState(var1.method18345());
      if (var4.method23474()) {
         BlockState var5 = var1.method18360().getBlockState(var1.method18345().down());
         if (!var5.method23446(BlockTags.field32787)) {
            return null;
         } else if (!var5.method23448(Blocks.field37008)) {
            if (var5.method23448(Blocks.field37009)) {
               int var7 = var5.<Integer>method23463(field19125) <= 0 ? 0 : 1;
               return this.method11579().method23465(field19125, Integer.valueOf(var7));
            } else {
               BlockState var6 = var1.method18360().getBlockState(var1.method18345().up());
               return !var6.method23448(Blocks.field37009) && !var6.method23448(Blocks.field37008)
                  ? Blocks.field37008.method11579()
                  : this.method11579().method23465(field19125, var6.<Integer>method23463(field19125));
            }
         } else {
            return this.method11579().method23465(field19125, Integer.valueOf(0));
         }
      } else {
         return null;
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>method23463(field19127) == 0;
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method23463(field19127) == 0
         && var4.nextInt(3) == 0
         && var2.method7007(var3.up())
         && var2.method7021(var3.up(), 0) >= 9) {
         int var7 = this.method12067(var2, var3) + 1;
         if (var7 < 16) {
            this.method12065(var1, var2, var3, var4, var7);
         }
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).method23446(BlockTags.field32787);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      if (var2 == Direction.field673 && var3.method23448(Blocks.field37009) && var3.<Integer>method23463(field19125) > var1.<Integer>method23463(field19125)) {
         var4.setBlockState(var5, var1.method23459(field19125), 2);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      int var7 = this.method12066(var1, var2);
      int var8 = this.method12067(var1, var2);
      return var7 + var8 + 1 < 16 && var1.getBlockState(var2.method8339(var7)).<Integer>method23463(field19127) != 1;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      int var7 = this.method12066(var1, var3);
      int var8 = this.method12067(var1, var3);
      int var9 = var7 + var8 + 1;
      int var10 = 1 + var2.nextInt(2);

      for (int var11 = 0; var11 < var10; var11++) {
         BlockPos var12 = var3.method8339(var7);
         BlockState var13 = var1.getBlockState(var12);
         if (var9 >= 16 || var13.<Integer>method23463(field19127) == 1 || !var1.method7007(var12.up())) {
            return;
         }

         this.method12065(var13, var1, var12, var2, var9);
         var7++;
         var9++;
      }
   }

   @Override
   public float method11997(BlockState var1, PlayerEntity var2, IBlockReader var3, BlockPos var4) {
      return !(var2.getHeldItemMainhand().getItem() instanceof ItemSword) ? super.method11997(var1, var2, var3, var4) : 1.0F;
   }

   public void method12065(BlockState var1, World var2, BlockPos var3, Random var4, int var5) {
      BlockState var8 = var2.getBlockState(var3.down());
      BlockPos var9 = var3.method8340(2);
      BlockState var10 = var2.getBlockState(var9);
      Class181 var11 = Class181.field642;
      if (var5 >= 1) {
         if (!var8.method23448(Blocks.field37009) || var8.<Class181>method23463(field19126) == Class181.field642) {
            var11 = Class181.field643;
         } else if (var8.method23448(Blocks.field37009) && var8.<Class181>method23463(field19126) != Class181.field642) {
            var11 = Class181.field644;
            if (var10.method23448(Blocks.field37009)) {
               var2.setBlockState(var3.down(), var8.method23465(field19126, Class181.field643), 3);
               var2.setBlockState(var9, var10.method23465(field19126, Class181.field642), 3);
            }
         }
      }

      int var12 = var1.<Integer>method23463(field19125) != 1 && !var10.method23448(Blocks.field37009) ? 0 : 1;
      int var13 = (var5 < 11 || !(var4.nextFloat() < 0.25F)) && var5 != 15 ? 0 : 1;
      var2.setBlockState(
         var3.up(),
         this.method11579().method23465(field19125, Integer.valueOf(var12)).method23465(field19126, var11).method23465(field19127, Integer.valueOf(var13)),
         3
      );
   }

   public int method12066(IBlockReader var1, BlockPos var2) {
      int var5 = 0;

      while (var5 < 16 && var1.getBlockState(var2.method8339(var5 + 1)).method23448(Blocks.field37009)) {
         var5++;
      }

      return var5;
   }

   public int method12067(IBlockReader var1, BlockPos var2) {
      int var5 = 0;

      while (var5 < 16 && var1.getBlockState(var2.method8340(var5 + 1)).method23448(Blocks.field37009)) {
         var5++;
      }

      return var5;
   }
}
