package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class Class2635 extends Class2628 {
   private static String[] field16953;
   private final Class1088 field16954;

   public Class2635(Class1088 var1, double var2) {
      super(var1, !var1.isChild() ? var2 : 2.0, 24);
      this.field16954 = var1;
      this.field16937 = -1;
   }

   @Override
   public boolean method10806() {
      return !this.field16954.isInWater() && this.field16931 <= 1200 && this.method10840(this.field16954.world, this.field16933);
   }

   @Override
   public boolean method10803() {
      if (this.field16954.isChild() && !this.field16954.isInWater()) {
         return super.method10803();
      } else {
         return !Class1088.method5058(this.field16954) && !this.field16954.isInWater() && !this.field16954.method5045() ? super.method10803() : false;
      }
   }

   @Override
   public boolean method10837() {
      return this.field16931 % 160 == 0;
   }

   @Override
   public boolean method10840(IWorldReader var1, BlockPos var2) {
      return var1.getBlockState(var2).isIn(Blocks.WATER);
   }
}
