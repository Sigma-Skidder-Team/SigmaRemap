package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class Class2638 extends Class2628 {
   private static String[] field16960;
   private final StriderEntity field16961;

   public Class2638(StriderEntity var1, double var2) {
      super(var1, var2, 8, 2);
      this.field16961 = var1;
   }

   @Override
   public BlockPos method10836() {
      return this.field16933;
   }

   @Override
   public boolean method10806() {
      return !this.field16961.isInLava() && this.method10840(this.field16961.world, this.field16933);
   }

   @Override
   public boolean method10803() {
      return !this.field16961.isInLava() && super.method10803();
   }

   @Override
   public boolean method10837() {
      return this.field16931 % 20 == 0;
   }

   @Override
   public boolean method10840(IWorldReader var1, BlockPos var2) {
      return var1.getBlockState(var2).isIn(Blocks.LAVA) && var1.getBlockState(var2.up()).method23440(var1, var2, PathType.field12614);
   }
}
