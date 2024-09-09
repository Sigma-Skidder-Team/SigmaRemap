package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3239 extends Class3238 {
   private static String[] field18689;
   private final VoxelShape[] field18690;

   public Class3239(AbstractBlock var1) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18680, Boolean.valueOf(false))
            .method23465(field18681, Boolean.valueOf(false))
            .method23465(field18682, Boolean.valueOf(false))
            .method23465(field18683, Boolean.valueOf(false))
            .method23465(field18684, Boolean.valueOf(false))
      );
      this.field18690 = this.method11639(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.field18690[this.method11641(var1)];
   }

   @Override
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method11483(var1, var2, var3, var4);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   public boolean method11644(BlockState var1, boolean var2, Direction var3) {
      Block var6 = var1.getBlock();
      boolean var7 = this.method11645(var6);
      boolean var8 = var6 instanceof Class3199 && Class3199.method11507(var1, var3);
      return !method11545(var6) && var2 || var7 || var8;
   }

   private boolean method11645(Block var1) {
      return var1.isIn(BlockTags.field32771) && var1.isIn(BlockTags.field32743) == this.method11579().method23446(BlockTags.field32743);
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         return Class3329.method11880(var4, var2, var3);
      } else {
         ItemStack var9 = var4.getHeldItem(var5);
         return var9.getItem() != Items.LEAD ? ActionResultType.field14820 : ActionResultType.SUCCESS;
      }
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      FluidState var6 = var1.method18360().getFluidState(var1.method18345());
      BlockPos var7 = var5.north();
      BlockPos var8 = var5.east();
      BlockPos var9 = var5.south();
      BlockPos var10 = var5.west();
      BlockState var11 = var4.getBlockState(var7);
      BlockState var12 = var4.getBlockState(var8);
      BlockState var13 = var4.getBlockState(var9);
      BlockState var14 = var4.getBlockState(var10);
      return super.method11495(var1)
         .method23465(field18680, Boolean.valueOf(this.method11644(var11, var11.method23454(var4, var7, Direction.SOUTH), Direction.SOUTH)))
         .method23465(field18681, Boolean.valueOf(this.method11644(var12, var12.method23454(var4, var8, Direction.WEST), Direction.WEST)))
         .method23465(field18682, Boolean.valueOf(this.method11644(var13, var13.method23454(var4, var9, Direction.NORTH), Direction.NORTH)))
         .method23465(field18683, Boolean.valueOf(this.method11644(var14, var14.method23454(var4, var10, Direction.EAST), Direction.EAST)))
         .method23465(field18684, Boolean.valueOf(var6.method23472() == Class9479.field44066));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18684)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var2.getAxis().method326() != Class76.field161
         ? super.method11491(var1, var2, var3, var4, var5, var6)
         : var1.method23465(field18685.get(var2), Boolean.valueOf(this.method11644(var3, var3.method23454(var4, var6, var2.method536()), var2.method536())));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18680, field18681, field18683, field18682, field18684);
   }
}
