package mapped;

import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Util;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Map;
import java.util.Random;

public class Class3357 extends BannerBlock {
   private static String[] field18898;
   public static final DirectionProperty field18899 = Class3433.field19198;
   public static final BooleanProperty field18900 = BlockStateProperties.TRIGGERED;
   private static final Map<Item, IDispenseItemBehavior> field18901 = Util.make(
      new Object2ObjectOpenHashMap(), var0 -> var0.defaultReturnValue(new Class6218())
   );

   public static void method11931(IItemProvider var0, IDispenseItemBehavior var1) {
      field18901.put(var0.asItem(), var1);
   }

   public Class3357(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18899, Direction.NORTH).with(field18900, Boolean.valueOf(false)));
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         TileEntity var9 = var2.getTileEntity(var3);
         if (var9 instanceof Class971) {
            var4.method2766((Class971)var9);
            if (!(var9 instanceof Class972)) {
               var4.method2911(Stats.field40151);
            } else {
               var4.method2911(Stats.field40149);
            }
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   public void method11932(ServerWorld var1, BlockPos var2) {
      Class2957 var5 = new Class2957(var1, var2);
      Class971 var6 = var5.<Class971>method11325();
      int var7 = var6.method4022();
      if (var7 >= 0) {
         ItemStack var8 = var6.getStackInSlot(var7);
         IDispenseItemBehavior var9 = this.method11933(var8);
         if (var9 != IDispenseItemBehavior.field27722) {
            var6.setInventorySlotContents(var7, var9.method19196(var5, var8));
         }
      } else {
         var1.playEvent(1001, var2, 0);
      }
   }

   public IDispenseItemBehavior method11933(ItemStack var1) {
      return field18901.get(var1.getItem());
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3) || var2.method6780(var3.up());
      boolean var10 = var1.<Boolean>get(field18900);
      if (var9 && !var10) {
         var2.getBlockTickScheduler().scheduleTick(var3, this, 4);
         var2.setBlockState(var3, var1.with(field18900, Boolean.valueOf(true)), 4);
      } else if (!var9 && var10) {
         var2.setBlockState(var3, var1.with(field18900, Boolean.valueOf(false)), 4);
      }
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.method11932(var2, var3);
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class971();
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field18899, var1.method18348().getOpposite());
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class971) {
            ((Class971)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof Class971) {
            Class7236.method22721(var2, var3, (Class971)var8);
            var2.updateComparatorOutputLevel(var3, this);
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   public static Class2955 method11934(IBlockSource var0) {
      Direction var3 = var0.method11324().<Direction>get(field18899);
      double var4 = var0.getX() + 0.7 * (double)var3.getXOffset();
      double var6 = var0.getY() + 0.7 * (double)var3.getYOffset();
      double var8 = var0.getZ() + 0.7 * (double)var3.getZOffset();
      return new Class2959(var4, var6, var8);
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstone(var2.getTileEntity(var3));
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18899, var2.rotate(var1.<Direction>get(field18899)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18899)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18899, field18900);
   }
}
