package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

public class Class2957 implements Class2956 {
   private static String[] field18044;
   private final ServerWorld field18045;
   private final BlockPos field18046;

   public Class2957(ServerWorld var1, BlockPos var2) {
      this.field18045 = var1;
      this.field18046 = var2;
   }

   @Override
   public ServerWorld method11326() {
      return this.field18045;
   }

   @Override
   public double method11320() {
      return (double)this.field18046.getX() + 0.5;
   }

   @Override
   public double method11321() {
      return (double)this.field18046.getY() + 0.5;
   }

   @Override
   public double method11322() {
      return (double)this.field18046.getZ() + 0.5;
   }

   @Override
   public BlockPos method11323() {
      return this.field18046;
   }

   @Override
   public BlockState method11324() {
      return this.field18045.getBlockState(this.field18046);
   }

   @Override
   public <T extends TileEntity> T method11325() {
      return (T)this.field18045.getTileEntity(this.field18046);
   }
}
