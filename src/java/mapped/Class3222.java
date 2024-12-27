package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.RedstoneSide;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Class3222 extends Block {
   private static String[] field18646;
   public static final EnumProperty<RedstoneSide> field18647 = BlockStateProperties.field39731;
   public static final EnumProperty<RedstoneSide> field18648 = BlockStateProperties.field39730;
   public static final EnumProperty<RedstoneSide> field18649 = BlockStateProperties.field39732;
   public static final EnumProperty<RedstoneSide> field18650 = BlockStateProperties.field39733;
   public static final IntegerProperty field18651 = BlockStateProperties.field39759;
   public static final Map<Direction, EnumProperty<RedstoneSide>> field18652 = Maps.newEnumMap(
      ImmutableMap.of(Direction.NORTH, field18647, Direction.EAST, field18648, Direction.SOUTH, field18649, Direction.WEST, field18650)
   );
   private static final VoxelShape field18653 = Block.makeCuboidShape(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<Direction, VoxelShape> field18654 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.makeCuboidShape(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         Direction.SOUTH,
         Block.makeCuboidShape(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         Direction.EAST,
         Block.makeCuboidShape(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         Direction.WEST,
         Block.makeCuboidShape(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<Direction, VoxelShape> field18655 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         VoxelShapes.or(field18654.get(Direction.NORTH), Block.makeCuboidShape(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         Direction.SOUTH,
         VoxelShapes.or(field18654.get(Direction.SOUTH), Block.makeCuboidShape(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         Direction.EAST,
         VoxelShapes.or(field18654.get(Direction.EAST), Block.makeCuboidShape(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         Direction.WEST,
         VoxelShapes.or(field18654.get(Direction.WEST), Block.makeCuboidShape(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private final Map<BlockState, VoxelShape> field18656 = Maps.newHashMap();
   private static final Vector3f[] field18657 = new Vector3f[16];
   private final BlockState field18658;
   private boolean field18659 = true;

   public Class3222(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field18647, RedstoneSide.field267)
            .with(field18648, RedstoneSide.field267)
            .with(field18649, RedstoneSide.field267)
            .with(field18650, RedstoneSide.field267)
            .with(field18651, Integer.valueOf(0))
      );
      this.field18658 = this.getDefaultState()
         .with(field18647, RedstoneSide.field266)
         .with(field18648, RedstoneSide.field266)
         .with(field18649, RedstoneSide.field266)
         .with(field18650, RedstoneSide.field266);
      UnmodifiableIterator var4 = this.getStateContainer().getValidStates().iterator();

      while (var4.hasNext()) {
         BlockState var5 = (BlockState)var4.next();
         if (var5.<Integer>get(field18651) == 0) {
            this.field18656.put(var5, this.method11613(var5));
         }
      }
   }

   private VoxelShape method11613(BlockState var1) {
      VoxelShape var4 = field18653;

      for (Direction var6 : Direction.Plane.HORIZONTAL) {
         RedstoneSide var7 = var1.<RedstoneSide>get(field18652.get(var6));
         if (var7 != RedstoneSide.field266) {
            if (var7 == RedstoneSide.field265) {
               var4 = VoxelShapes.or(var4, field18655.get(var6));
            }
         } else {
            var4 = VoxelShapes.or(var4, field18654.get(var6));
         }
      }

      return var4;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field18656.get(var1.with(field18651, Integer.valueOf(0)));
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.method11614(var1.getWorld(), this.field18658, var1.getPos());
   }

   private BlockState method11614(IBlockReader var1, BlockState var2, BlockPos var3) {
      boolean var6 = method11617(var2);
      var2 = this.method11615(var1, this.getDefaultState().with(field18651, var2.<Integer>get(field18651)), var3);
      if (var6 && method11617(var2)) {
         return var2;
      } else {
         boolean var7 = var2.<RedstoneSide>get(field18647).method279();
         boolean var8 = var2.<RedstoneSide>get(field18649).method279();
         boolean var9 = var2.<RedstoneSide>get(field18648).method279();
         boolean var10 = var2.<RedstoneSide>get(field18650).method279();
         boolean var11 = !var7 && !var8;
         boolean var12 = !var9 && !var10;
         if (!var10 && var11) {
            var2 = var2.with(field18650, RedstoneSide.field266);
         }

         if (!var9 && var11) {
            var2 = var2.with(field18648, RedstoneSide.field266);
         }

         if (!var7 && var12) {
            var2 = var2.with(field18647, RedstoneSide.field266);
         }

         if (!var8 && var12) {
            var2 = var2.with(field18649, RedstoneSide.field266);
         }

         return var2;
      }
   }

   private BlockState method11615(IBlockReader var1, BlockState var2, BlockPos var3) {
      boolean var6 = !var1.getBlockState(var3.up()).method23400(var1, var3);

      for (Direction var8 : Direction.Plane.HORIZONTAL) {
         if (!var2.<RedstoneSide>get(field18652.get(var8)).method279()) {
            RedstoneSide var9 = this.method11620(var1, var3, var8, var6);
            var2 = var2.with(field18652.get(var8), var9);
         }
      }

      return var2;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      if (var2 != Direction.DOWN) {
         if (var2 == Direction.UP) {
            return this.method11614(var4, var1, var5);
         } else {
            RedstoneSide var9 = this.method11619(var4, var5, var2);
            return var9.method279() == var1.<RedstoneSide>get(field18652.get(var2)).method279() && !method11616(var1)
               ? var1.with(field18652.get(var2), var9)
               : this.method11614(
                  var4, this.field18658.with(field18651, var1.<Integer>get(field18651)).with(field18652.get(var2), var9), var5
               );
         }
      } else {
         return var1;
      }
   }

   private static boolean method11616(BlockState var0) {
      return var0.<RedstoneSide>get(field18647).method279()
         && var0.<RedstoneSide>get(field18649).method279()
         && var0.<RedstoneSide>get(field18648).method279()
         && var0.<RedstoneSide>get(field18650).method279();
   }

   private static boolean method11617(BlockState var0) {
      return !var0.<RedstoneSide>get(field18647).method279()
         && !var0.<RedstoneSide>get(field18649).method279()
         && !var0.<RedstoneSide>get(field18648).method279()
         && !var0.<RedstoneSide>get(field18650).method279();
   }

   @Override
   public void method11618(BlockState var1, IWorld var2, BlockPos var3, int var4, int var5) {
      BlockPos.Mutable var8 = new BlockPos.Mutable();

      for (Direction var10 : Direction.Plane.HORIZONTAL) {
         RedstoneSide var11 = var1.<RedstoneSide>get(field18652.get(var10));
         if (var11 != RedstoneSide.field267 && !var2.getBlockState(var8.method8377(var3, var10)).isIn(this)) {
            var8.method8379(Direction.DOWN);
            BlockState var12 = var2.getBlockState(var8);
            if (!var12.isIn(Blocks.OBSERVER)) {
               BlockPos var13 = var8.offset(var10.getOpposite());
               BlockState var14 = var12.method23439(var10.getOpposite(), var2.getBlockState(var13), var2, var8, var13);
               method11544(var12, var14, var2, var8, var4, var5);
            }

            var8.method8377(var3, var10).method8379(Direction.UP);
            BlockState var16 = var2.getBlockState(var8);
            if (!var16.isIn(Blocks.OBSERVER)) {
               BlockPos var17 = var8.offset(var10.getOpposite());
               BlockState var15 = var16.method23439(var10.getOpposite(), var2.getBlockState(var17), var2, var8, var17);
               method11544(var16, var15, var2, var8, var4, var5);
            }
         }
      }
   }

   private RedstoneSide method11619(IBlockReader var1, BlockPos var2, Direction var3) {
      return this.method11620(var1, var2, var3, !var1.getBlockState(var2.up()).method23400(var1, var2));
   }

   private RedstoneSide method11620(IBlockReader var1, BlockPos var2, Direction var3, boolean var4) {
      BlockPos var7 = var2.offset(var3);
      BlockState var8 = var1.getBlockState(var7);
      if (var4) {
         boolean var9 = this.method11621(var1, var7, var8);
         if (var9 && method11627(var1.getBlockState(var7.up()))) {
            if (!var8.method23454(var1, var7, var3.getOpposite())) {
               return RedstoneSide.field266;
            }

            return RedstoneSide.field265;
         }
      }

      return !method11628(var8, var3) && (var8.method23400(var1, var7) || !method11627(var1.getBlockState(var7.down())))
         ? RedstoneSide.field267
         : RedstoneSide.field266;
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      BlockState var7 = var2.getBlockState(var6);
      return this.method11621(var2, var6, var7);
   }

   private boolean method11621(IBlockReader var1, BlockPos var2, BlockState var3) {
      return var3.method23454(var1, var2, Direction.UP) || var3.isIn(Blocks.HOPPER);
   }

   private void method11622(World var1, BlockPos var2, BlockState var3) {
      int var6 = this.method11623(var1, var2);
      if (var3.<Integer>get(field18651) != var6) {
         if (var1.getBlockState(var2) == var3) {
            var1.setBlockState(var2, var3.with(field18651, Integer.valueOf(var6)), 2);
         }

         Set<BlockPos> var7 = Sets.newHashSet();
         var7.add(var2);

         for (Direction var11 : Direction.values()) {
            var7.add(var2.offset(var11));
         }

         for (BlockPos var13 : var7) {
            var1.notifyNeighborsOfStateChange(var13, this);
         }
      }
   }

   private int method11623(World var1, BlockPos var2) {
      this.field18659 = false;
      int var5 = var1.method6781(var2);
      this.field18659 = true;
      int var6 = 0;
      if (var5 < 15) {
         for (Direction var8 : Direction.Plane.HORIZONTAL) {
            BlockPos var9 = var2.offset(var8);
            BlockState var10 = var1.getBlockState(var9);
            var6 = Math.max(var6, this.method11624(var10));
            BlockPos var11 = var2.up();
            if (var10.method23400(var1, var9) && !var1.getBlockState(var11).method23400(var1, var11)) {
               var6 = Math.max(var6, this.method11624(var1.getBlockState(var9.up())));
            } else if (!var10.method23400(var1, var9)) {
               var6 = Math.max(var6, this.method11624(var1.getBlockState(var9.down())));
            }
         }
      }

      return Math.max(var5, var6 - 1);
   }

   private int method11624(BlockState var1) {
      return !var1.isIn(this) ? 0 : var1.<Integer>get(field18651);
   }

   private void method11625(World var1, BlockPos var2) {
      if (var1.getBlockState(var2).isIn(this)) {
         var1.notifyNeighborsOfStateChange(var2, this);

         for (Direction var8 : Direction.values()) {
            var1.notifyNeighborsOfStateChange(var2.offset(var8), this);
         }
      }
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.isIn(var1.getBlock()) && !var2.isRemote) {
         this.method11622(var2, var3, var1);

         for (Direction var9 : Direction.Plane.field162) {
            var2.notifyNeighborsOfStateChange(var3.offset(var9), this);
         }

         this.method11626(var2, var3);
      }
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.isIn(var4.getBlock())) {
         super.onReplaced(var1, var2, var3, var4, var5);
         if (!var2.isRemote) {
            for (Direction var11 : Direction.values()) {
               var2.notifyNeighborsOfStateChange(var3.offset(var11), this);
            }

            this.method11622(var2, var3, var1);
            this.method11626(var2, var3);
         }
      }
   }

   private void method11626(World var1, BlockPos var2) {
      for (Direction var6 : Direction.Plane.HORIZONTAL) {
         this.method11625(var1, var2.offset(var6));
      }

      for (Direction var9 : Direction.Plane.HORIZONTAL) {
         BlockPos var7 = var2.offset(var9);
         if (!var1.getBlockState(var7).method23400(var1, var7)) {
            this.method11625(var1, var7.down());
         } else {
            this.method11625(var1, var7.up());
         }
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         if (!var1.isValidPosition(var2, var3)) {
            method11554(var1, var2, var3);
            var2.removeBlock(var3, false);
         } else {
            this.method11622(var2, var3, var1);
         }
      }
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return this.field18659 ? var1.method23402(var2, var3, var4) : 0;
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      if (this.field18659 && var4 != Direction.DOWN) {
         int var7 = var1.<Integer>get(field18651);
         if (var7 == 0) {
            return 0;
         } else {
            return var4 != Direction.UP && !this.method11614(var2, var1, var3).<RedstoneSide>get(field18652.get(var4.getOpposite())).method279()
               ? 0
               : var7;
         }
      } else {
         return 0;
      }
   }

   public static boolean method11627(BlockState var0) {
      return method11628(var0, (Direction)null);
   }

   public static boolean method11628(BlockState var0, Direction var1) {
      if (var0.isIn(Blocks.REDSTONE_WIRE)) {
         return true;
      } else if (!var0.isIn(Blocks.REPEATER)) {
         return var0.isIn(Blocks.OBSERVER) ? var1 == var0.<Direction>get(Class3434.field19198) : var0.method23401() && var1 != null;
      } else {
         Direction var4 = var0.<Direction>get(Class3248.HORIZONTAL_FACING);
         return var4 == var1 || var4.getOpposite() == var1;
      }
   }

   @Override
   public boolean method11516(BlockState var1) {
      return this.field18659;
   }

   public static int method11629(int var0) {
      Vector3f var3 = field18657[var0];
      return MathHelper.method37805(var3.method25269(), var3.method25270(), var3.method25271());
   }

   private void method11630(World var1, Random var2, BlockPos var3, Vector3f var4, Direction var5, Direction var6, float var7, float var8) {
      float var11 = var8 - var7;
      if (!(var2.nextFloat() >= 0.2F * var11)) {
         float var12 = 0.4375F;
         float var13 = var7 + var11 * var2.nextFloat();
         double var14 = 0.5 + (double)(0.4375F * (float)var5.getXOffset()) + (double)(var13 * (float)var6.getXOffset());
         double var16 = 0.5 + (double)(0.4375F * (float)var5.getYOffset()) + (double)(var13 * (float)var6.getYOffset());
         double var18 = 0.5 + (double)(0.4375F * (float)var5.getZOffset()) + (double)(var13 * (float)var6.getZOffset());
         var1.addParticle(
            new RedstoneParticleData(var4.method25269(), var4.method25270(), var4.method25271(), 1.0F),
            (double)var3.getX() + var14,
            (double)var3.getY() + var16,
            (double)var3.getZ() + var18,
            0.0,
            0.0,
            0.0
         );
      }
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>get(field18651);
      if (var7 != 0) {
         for (Direction var9 : Direction.Plane.HORIZONTAL) {
            RedstoneSide var10 = var1.<RedstoneSide>get(field18652.get(var9));
            switch (Class7339.field31442[var10.ordinal()]) {
               case 1:
                  this.method11630(var2, var4, var3, field18657[var7], var9, Direction.UP, -0.5F, 0.5F);
               case 2:
                  this.method11630(var2, var4, var3, field18657[var7], Direction.DOWN, var9, 0.0F, 0.5F);
                  break;
               case 3:
               default:
                  this.method11630(var2, var4, var3, field18657[var7], Direction.DOWN, var9, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      switch (Class7339.field31443[var2.ordinal()]) {
         case 1:
            return var1.with(field18647, var1.<RedstoneSide>get(field18649))
               .with(field18648, var1.<RedstoneSide>get(field18650))
               .with(field18649, var1.<RedstoneSide>get(field18647))
               .with(field18650, var1.<RedstoneSide>get(field18648));
         case 2:
            return var1.with(field18647, var1.<RedstoneSide>get(field18648))
               .with(field18648, var1.<RedstoneSide>get(field18649))
               .with(field18649, var1.<RedstoneSide>get(field18650))
               .with(field18650, var1.<RedstoneSide>get(field18647));
         case 3:
            return var1.with(field18647, var1.<RedstoneSide>get(field18650))
               .with(field18648, var1.<RedstoneSide>get(field18647))
               .with(field18649, var1.<RedstoneSide>get(field18648))
               .with(field18650, var1.<RedstoneSide>get(field18649));
         default:
            return var1;
      }
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      switch (Class7339.field31444[var2.ordinal()]) {
         case 1:
            return var1.with(field18647, var1.<RedstoneSide>get(field18649)).with(field18649, var1.<RedstoneSide>get(field18647));
         case 2:
            return var1.with(field18648, var1.<RedstoneSide>get(field18650)).with(field18650, var1.<RedstoneSide>get(field18648));
         default:
            return super.mirror(var1, var2);
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18647, field18648, field18649, field18650, field18651);
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var4.abilities.allowEdit) {
         return ActionResultType.field14820;
      } else {
         if (method11616(var1) || method11617(var1)) {
            BlockState var9 = !method11616(var1) ? this.field18658 : this.getDefaultState();
            var9 = var9.with(field18651, var1.<Integer>get(field18651));
            var9 = this.method11614(var2, var9, var3);
            if (var9 != var1) {
               var2.setBlockState(var3, var9, 3);
               this.method11631(var2, var3, var1, var9);
               return ActionResultType.SUCCESS;
            }
         }

         return ActionResultType.field14820;
      }
   }

   private void method11631(World var1, BlockPos var2, BlockState var3, BlockState var4) {
      for (Direction var8 : Direction.Plane.HORIZONTAL) {
         BlockPos var9 = var2.offset(var8);
         if (var3.<RedstoneSide>get(field18652.get(var8)).method279() != var4.<RedstoneSide>get(field18652.get(var8)).method279()
            && var1.getBlockState(var9).method23400(var1, var9)) {
            var1.notifyNeighborsOfStateExcept(var9, var4.getBlock(), var8.getOpposite());
         }
      }
   }

   static {
      for (int var2 = 0; var2 <= 15; var2++) {
         float var3 = (float)var2 / 15.0F;
         float var4 = var3 * 0.6F + (!(var3 > 0.0F) ? 0.3F : 0.4F);
         float var5 = MathHelper.clamp(var3 * var3 * 0.7F - 0.5F, 0.0F, 1.0F);
         float var6 = MathHelper.clamp(var3 * var3 * 0.6F - 0.7F, 0.0F, 1.0F);
         field18657[var2] = new Vector3f(var4, var5, var6);
      }
   }
}
