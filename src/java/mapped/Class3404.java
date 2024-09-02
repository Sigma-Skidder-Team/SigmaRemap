package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Class3404 extends Block implements Class3405 {
   private static String[] field19078;
   public static final Class8554 field19079 = Class8820.field39755;
   public final Class7633 field19080;
   private final List<FluidState> field19081;
   public static final VoxelShape field19082 = Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

   public Class3404(Class7633 var1, AbstractBlock var2) {
      super(var2);
      this.field19080 = var1;
      this.field19081 = Lists.newArrayList();
      this.field19081.add(var1.method25078(false));

      for (int var5 = 1; var5 < 8; var5++) {
         this.field19081.add(var1.method25076(8 - var5, false));
      }

      this.field19081.add(var1.method25076(8, true));
      this.method11578(this.field18612.method35393().method23465(field19079, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11502(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return var4.method14950(field19082, var3, true)
            && var1.<Integer>method23463(field19079) == 0
            && var4.method14952(var2.getFluidState(var3.up()), this.field19080)
         ? field19082
         : VoxelShapes.method27425();
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.method23449().method23481();
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      var1.method23449().method23482(var2, var3, var4);
   }

   @Override
   public boolean method11493(BlockState var1, Class1665 var2, BlockPos var3) {
      return false;
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return !this.field19080.method25067(Class8953.field40470);
   }

   @Override
   public FluidState method11498(BlockState var1) {
      int var4 = var1.<Integer>method23463(field19079);
      return this.field19081.get(Math.min(var4, 8));
   }

   @Override
   public boolean method11634(BlockState var1, BlockState var2, Direction var3) {
      return var2.method23449().method23472().method25066(this.field19080);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.field9885;
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      return Collections.<ItemStack>emptyList();
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27425();
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (this.method12043(var2, var3, var1)) {
         var2.method6861().method20726(var3, var1.method23449().method23472(), this.field19080.method25057(var2));
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.method23449().method23473() || var3.method23449().method23473()) {
         var4.method6861().method20726(var5, var1.method23449().method23472(), this.field19080.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (this.method12043(var2, var3, var1)) {
         var2.method6861().method20726(var3, var1.method23449().method23472(), this.field19080.method25057(var2));
      }
   }

   private boolean method12043(World var1, BlockPos var2, BlockState var3) {
      if (this.field19080.method25067(Class8953.field40470)) {
         boolean var6 = var1.getBlockState(var2.down()).method23448(Blocks.SOUL_SOIL);

         for (Direction var10 : Direction.values()) {
            if (var10 != Direction.DOWN) {
               BlockPos var11 = var2.method8349(var10);
               if (var1.getFluidState(var11).method23486(Class8953.field40469)) {
                  Block var12 = !var1.getFluidState(var2).method23473() ? Blocks.field36399 : Blocks.field36527;
                  var1.setBlockState(var2, var12.method11579());
                  this.method12044(var1, var2);
                  return false;
               }

               if (var6 && var1.getBlockState(var11).method23448(Blocks.field37006)) {
                  var1.setBlockState(var2, Blocks.BASALT.method11579());
                  this.method12044(var1, var2);
                  return false;
               }
            }
         }
      }

      return true;
   }

   private void method12044(Class1660 var1, BlockPos var2) {
      var1.playEvent(1501, var2, 0);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19079);
   }

   @Override
   public Fluid method11533(Class1660 var1, BlockPos var2, BlockState var3) {
      if (var3.<Integer>method23463(field19079) != 0) {
         return Class9479.field44064;
      } else {
         var1.setBlockState(var2, Blocks.AIR.method11579(), 11);
         return this.field19080;
      }
   }
}
