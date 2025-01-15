package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Class3364 extends Class3241 {
   public static final BooleanProperty field18931 = BlockStateProperties.HAS_RECORD;

   public Class3364(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18931, Boolean.valueOf(false)));
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      super.method11563(var1, var2, var3, var4, var5);
      CompoundNBT var8 = var5.getOrCreateTag();
      if (var8.contains("BlockEntityTag")) {
         CompoundNBT var9 = var8.getCompound("BlockEntityTag");
         if (var9.contains("RecordItem")) {
            var1.setBlockState(var2, var3.with(field18931, Boolean.valueOf(true)), 2);
         }
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var1.<Boolean>get(field18931)) {
         return ActionResultType.field14820;
      } else {
         this.method11942(var2, var3);
         var1 = var1.with(field18931, Boolean.valueOf(false));
         var2.setBlockState(var3, var1, 2);
         return ActionResultType.method9002(var2.isRemote);
      }
   }

   public void method11941(IWorld var1, BlockPos var2, BlockState var3, ItemStack var4) {
      TileEntity var7 = var1.getTileEntity(var2);
      if (var7 instanceof Class947) {
         ((Class947)var7).method3804(var4.copy());
         var1.setBlockState(var2, var3.with(field18931, Boolean.valueOf(true)), 2);
      }
   }

   private void method11942(World var1, BlockPos var2) {
      if (!var1.isRemote) {
         TileEntity var5 = var1.getTileEntity(var2);
         if (var5 instanceof Class947) {
            Class947 var6 = (Class947)var5;
            ItemStack var7 = var6.method3803();
            if (!var7.isEmpty()) {
               var1.playEvent(1010, var2, 0);
               var6.method3625();
               float var8 = 0.7F;
               double var9 = (double)(var1.rand.nextFloat() * 0.7F) + 0.15F;
               double var11 = (double)(var1.rand.nextFloat() * 0.7F) + 0.060000002F + 0.6;
               double var13 = (double)(var1.rand.nextFloat() * 0.7F) + 0.15F;
               ItemStack var15 = var7.copy();
               ItemEntity var16 = new ItemEntity(
                  var1, (double)var2.getX() + var9, (double)var2.getY() + var11, (double)var2.getZ() + var13, var15
               );
               var16.setDefaultPickupDelay();
               var1.addEntity(var16);
            }
         }
      }
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         this.method11942(var2, var3);
         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class947();
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      TileEntity var6 = var2.getTileEntity(var3);
      if (var6 instanceof Class947) {
         Item var7 = ((Class947)var6).method3803().getItem();
         if (var7 instanceof Class3283) {
            return ((Class3283)var7).method11812();
         }
      }

      return 0;
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18931);
   }
}
