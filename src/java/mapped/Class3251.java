package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.pathfinding.PathType;
import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public abstract class Class3251 extends BannerBlock implements Class3255 {
   private final Class2137 field18725;

   public Class3251(Class2137 var1, Properties var2) {
      super(var2);
      this.field18725 = var1;
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new SkullTileEntity();
   }

   public Class2137 method11696() {
      return this.field18725;
   }

   @Override
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      return false;
   }
}
