package mapped;

import net.minecraft.tileentity.TileEntityType;

public class Class970 extends ChestTileEntity {
   private static String[] field5434;

   public Class970() {
      super(TileEntityType.field21423);
   }

   @Override
   public void onOpenOrClose() {
      super.onOpenOrClose();
      this.world.notifyNeighborsOfStateChange(this.pos.down(), this.getBlockState().getBlock());
   }
}
