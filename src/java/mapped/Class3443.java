package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Map;

public class Class3443 extends Block {
   private static String[] field19248;
   public static final BooleanProperty field19249 = Class3392.field19019;
   public static final BooleanProperty field19250 = Class3392.field19020;
   public static final BooleanProperty field19251 = Class3392.field19021;
   public static final BooleanProperty field19252 = Class3392.field19022;
   public static final BooleanProperty field19253 = Class3392.field19023;
   public static final BooleanProperty field19254 = Class3392.field19024;
   private static final Map<Direction, BooleanProperty> field19255 = Class3392.field19025;

   public Class3443(Properties var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .with(field19249, Boolean.valueOf(true))
            .with(field19250, Boolean.valueOf(true))
            .with(field19251, Boolean.valueOf(true))
            .with(field19252, Boolean.valueOf(true))
            .with(field19253, Boolean.valueOf(true))
            .with(field19254, Boolean.valueOf(true))
      );
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      return this.method11579()
         .with(field19254, Boolean.valueOf(this != var4.getBlockState(var5.down()).getBlock()))
         .with(field19253, Boolean.valueOf(this != var4.getBlockState(var5.up()).getBlock()))
         .with(field19249, Boolean.valueOf(this != var4.getBlockState(var5.north()).getBlock()))
         .with(field19250, Boolean.valueOf(this != var4.getBlockState(var5.east()).getBlock()))
         .with(field19251, Boolean.valueOf(this != var4.getBlockState(var5.south()).getBlock()))
         .with(field19252, Boolean.valueOf(this != var4.getBlockState(var5.west()).getBlock()));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !var3.isIn(this) ? super.method11491(var1, var2, var3, var4, var5, var6) : var1.with(field19255.get(var2), Boolean.valueOf(false));
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19255.get(var2.rotate(Direction.NORTH)), var1.<Boolean>get(field19249))
         .with(field19255.get(var2.rotate(Direction.SOUTH)), var1.<Boolean>get(field19251))
         .with(field19255.get(var2.rotate(Direction.EAST)), var1.<Boolean>get(field19250))
         .with(field19255.get(var2.rotate(Direction.WEST)), var1.<Boolean>get(field19252))
         .with(field19255.get(var2.rotate(Direction.UP)), var1.<Boolean>get(field19253))
         .with(field19255.get(var2.rotate(Direction.DOWN)), var1.<Boolean>get(field19254));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.with(field19255.get(var2.method8750(Direction.NORTH)), var1.<Boolean>get(field19249))
         .with(field19255.get(var2.method8750(Direction.SOUTH)), var1.<Boolean>get(field19251))
         .with(field19255.get(var2.method8750(Direction.EAST)), var1.<Boolean>get(field19250))
         .with(field19255.get(var2.method8750(Direction.WEST)), var1.<Boolean>get(field19252))
         .with(field19255.get(var2.method8750(Direction.UP)), var1.<Boolean>get(field19253))
         .with(field19255.get(var2.method8750(Direction.DOWN)), var1.<Boolean>get(field19254));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19253, field19254, field19249, field19250, field19251, field19252);
   }
}
