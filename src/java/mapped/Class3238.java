package mapped;

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.util.Util;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.Map;

public class Class3238 extends Block implements IWaterLoggable {
   private static String[] field18679;
   public static final BooleanProperty field18680 = Class3392.field19019;
   public static final BooleanProperty field18681 = Class3392.field19020;
   public static final BooleanProperty field18682 = Class3392.field19021;
   public static final BooleanProperty field18683 = Class3392.field19022;
   public static final BooleanProperty field18684 = BlockStateProperties.WATERLOGGED;
   public static final Map<Direction, BooleanProperty> field18685 = Class3392.field19025
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey().getAxis().isHorizontal())
      .collect(Util.<Direction, BooleanProperty>toMapCollector());
   public final VoxelShape[] field18686;
   public final VoxelShape[] field18687;
   private final Object2IntMap<BlockState> field18688 = new Object2IntOpenHashMap();

   public Class3238(float var1, float var2, float var3, float var4, float var5, Properties var6) {
      super(var6);
      this.field18686 = this.method11639(var1, var2, var5, 0.0F, var5);
      this.field18687 = this.method11639(var1, var2, var3, 0.0F, var4);
      UnmodifiableIterator var9 = this.stateContainer.getValidStates().iterator();

      while (var9.hasNext()) {
         BlockState var10 = (BlockState)var9.next();
         this.method11641(var10);
      }
   }

   public VoxelShape[] method11639(float var1, float var2, float var3, float var4, float var5) {
      float var8 = 8.0F - var1;
      float var9 = 8.0F + var1;
      float var10 = 8.0F - var2;
      float var11 = 8.0F + var2;
      VoxelShape var12 = Block.makeCuboidShape((double)var8, 0.0, (double)var8, (double)var9, (double)var3, (double)var9);
      VoxelShape var13 = Block.makeCuboidShape((double)var10, (double)var4, 0.0, (double)var11, (double)var5, (double)var11);
      VoxelShape var14 = Block.makeCuboidShape((double)var10, (double)var4, (double)var10, (double)var11, (double)var5, 16.0);
      VoxelShape var15 = Block.makeCuboidShape(0.0, (double)var4, (double)var10, (double)var11, (double)var5, (double)var11);
      VoxelShape var16 = Block.makeCuboidShape((double)var10, (double)var4, (double)var10, 16.0, (double)var5, (double)var11);
      VoxelShape var17 = VoxelShapes.or(var13, var16);
      VoxelShape var18 = VoxelShapes.or(var14, var15);
      VoxelShape[] var19 = new VoxelShape[]{
         VoxelShapes.empty(),
         var14,
         var15,
         var18,
         var13,
         VoxelShapes.or(var14, var13),
         VoxelShapes.or(var15, var13),
         VoxelShapes.or(var18, var13),
         var16,
         VoxelShapes.or(var14, var16),
         VoxelShapes.or(var15, var16),
         VoxelShapes.or(var18, var16),
         var17,
         VoxelShapes.or(var14, var17),
         VoxelShapes.or(var15, var17),
         VoxelShapes.or(var18, var17)
      };

      for (int var20 = 0; var20 < 16; var20++) {
         var19[var20] = VoxelShapes.or(var12, var19[var20]);
      }

      return var19;
   }

   @Override
   public boolean propagatesSkylightDown(BlockState var1, IBlockReader var2, BlockPos var3) {
      return !var1.<Boolean>get(field18684);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field18687[this.method11641(var1)];
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.field18686[this.method11641(var1)];
   }

   private static int method11640(Direction var0) {
      return 1 << var0.getHorizontalIndex();
   }

   public int method11641(BlockState var1) {
      return this.field18688.computeIntIfAbsent(var1, var0 -> {
         int var3 = 0;
         if (var0.<Boolean>get(field18680)) {
            var3 |= method11640(Direction.NORTH);
         }

         if (var0.<Boolean>get(field18681)) {
            var3 |= method11640(Direction.EAST);
         }

         if (var0.<Boolean>get(field18682)) {
            var3 |= method11640(Direction.SOUTH);
         }

         if (var0.<Boolean>get(field18683)) {
            var3 |= method11640(Direction.WEST);
         }

         return var3;
      });
   }

   @Override
   public FluidState getFluidState(BlockState var1) {
      return !var1.<Boolean>get(field18684) ? super.getFluidState(var1) : Fluids.WATER.getStillFluidState(false);
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      switch (Class8947.field40455[var2.ordinal()]) {
         case 1:
            return var1.with(field18680, var1.<Boolean>get(field18682))
               .with(field18681, var1.<Boolean>get(field18683))
               .with(field18682, var1.<Boolean>get(field18680))
               .with(field18683, var1.<Boolean>get(field18681));
         case 2:
            return var1.with(field18680, var1.<Boolean>get(field18681))
               .with(field18681, var1.<Boolean>get(field18682))
               .with(field18682, var1.<Boolean>get(field18683))
               .with(field18683, var1.<Boolean>get(field18680));
         case 3:
            return var1.with(field18680, var1.<Boolean>get(field18683))
               .with(field18681, var1.<Boolean>get(field18680))
               .with(field18682, var1.<Boolean>get(field18681))
               .with(field18683, var1.<Boolean>get(field18682));
         default:
            return var1;
      }
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      switch (Class8947.field40456[var2.ordinal()]) {
         case 1:
            return var1.with(field18680, var1.<Boolean>get(field18682)).with(field18682, var1.<Boolean>get(field18680));
         case 2:
            return var1.with(field18681, var1.<Boolean>get(field18683)).with(field18683, var1.<Boolean>get(field18681));
         default:
            return super.mirror(var1, var2);
      }
   }
}
