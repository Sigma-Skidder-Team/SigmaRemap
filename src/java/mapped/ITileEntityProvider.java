package mapped;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public interface ITileEntityProvider {
   @Nullable
   TileEntity method11646(IBlockReader var1);
}
