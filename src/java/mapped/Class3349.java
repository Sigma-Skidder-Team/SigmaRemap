package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

public class Class3349 extends Class3348 {
   private static String[] field18864;

   public Class3349(AbstractBlock var1) {
      super(var1, () -> TileEntityType.field21423);
   }

   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class970();
   }

   @Override
   public Class9007<ResourceLocation> method11910() {
      return Class8876.field40104.method172(Class8876.field40155);
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public int method11514(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return MathHelper.method37775(Class941.method3763(var2, var3), 0, 15);
   }

   @Override
   public int method11515(BlockState var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var4 != Direction.field673 ? 0 : var1.method23402(var2, var3, var4);
   }
}
