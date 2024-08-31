package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public abstract class Class3251 extends Class3241 implements Class3255 {
   private final Class2137 field18725;

   public Class3251(Class2137 var1, AbstractBlock var2) {
      super(var2);
      this.field18725 = var1;
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new SkullTileEntity();
   }

   public Class2137 method11696() {
      return this.field18725;
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
