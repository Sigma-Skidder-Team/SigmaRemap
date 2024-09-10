package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;

public class Class961 extends TileEntity implements ITickableTileEntity {
   private static String[] field5391;

   public Class961() {
      super(TileEntityType.field21436);
   }

   @Override
   public void method3647() {
      if (this.field5324 != null && !this.field5324.isRemote && this.field5324.getGameTime() % 20L == 0L) {
         BlockState var3 = this.method3775();
         Block var4 = var3.getBlock();
         if (var4 instanceof Class3372) {
            Class3372.method11966(var3, this.field5324, this.field5325);
         }
      }
   }
}
