package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;

public class Class961 extends TileEntity implements ITickableTileEntity {
   private static String[] field5391;

   public Class961() {
      super(TileEntityType.field21436);
   }

   @Override
   public void tick() {
      if (this.world != null && !this.world.isRemote && this.world.getGameTime() % 20L == 0L) {
         BlockState var3 = this.getBlockState();
         Block var4 = var3.getBlock();
         if (var4 instanceof Class3372) {
            Class3372.method11966(var3, this.world, this.pos);
         }
      }
   }
}
