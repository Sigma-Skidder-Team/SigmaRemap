package mapped;

import net.minecraft.block.ContainerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public abstract class Class3359 extends ContainerBlock {
   private final DyeColor field18904;

   public Class3359(DyeColor var1, Properties var2) {
      super(var2);
      this.field18904 = var1;
   }

   @Override
   public boolean method11564() {
      return true;
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new BannerTileEntity(this.field18904);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof BannerTileEntity) {
            ((BannerTileEntity)var8).method3888(var5.method32149());
         }
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      TileEntity var6 = var1.getTileEntity(var2);
      return !(var6 instanceof BannerTileEntity) ? super.getItem(var1, var2, var3) : ((BannerTileEntity)var6).method3893(var3);
   }

   public DyeColor method11936() {
      return this.field18904;
   }
}
