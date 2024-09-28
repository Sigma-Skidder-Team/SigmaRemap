package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.DirectionProperty;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Map;

public class Class3252 extends Class3251 {
   private static String[] field18726;
   public static final DirectionProperty field18727 = HorizontalBlock.HORIZONTAL_FACING;
   private static final Map<Direction, VoxelShape> field18728 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.makeCuboidShape(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         Direction.SOUTH,
         Block.makeCuboidShape(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         Direction.EAST,
         Block.makeCuboidShape(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         Direction.WEST,
         Block.makeCuboidShape(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   public Class3252(Class2137 var1, Properties var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().with(field18727, Direction.NORTH));
   }

   @Override
   public String getTranslationKey() {
      return this.method11581().getTranslationKey();
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18728.get(var1.<Direction>get(field18727));
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = this.method11579();
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.getAxis().method324()) {
            Direction var12 = var11.getOpposite();
            var4 = var4.with(field18727, var12);
            if (!var5.getBlockState(var6.method8349(var11)).method23441(var1)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18727, var2.rotate(var1.<Direction>get(field18727)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18727)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18727);
   }
}
