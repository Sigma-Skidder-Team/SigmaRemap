package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Supplier;

public abstract class Class3346<E extends TileEntity> extends BannerBlock {
   public final Supplier<TileEntityType<? extends E>> field18859;

   public Class3346(Properties var1, Supplier<TileEntityType<? extends E>> var2) {
      super(var1);
      this.field18859 = var2;
   }

   public abstract Class7995<? extends ChestTileEntity> method11904(BlockState var1, World var2, BlockPos var3, boolean var4);
}
