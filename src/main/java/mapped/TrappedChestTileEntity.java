package mapped;

import net.minecraft.tileentity.TileEntityType;

public class TrappedChestTileEntity extends ChestTileEntity {

   public TrappedChestTileEntity() {
      super(TileEntityType.field21423);
   }

   @Override
   public void onOpenOrClose() {
      super.onOpenOrClose();
      this.world.notifyNeighborsOfStateChange(this.pos.down(), this.getBlockState().getBlock());
   }
}
