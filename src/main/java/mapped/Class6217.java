package mapped;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public abstract class Class6217 extends Class6218 {
   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      IPosition var6 = DispenserBlock.method11934(var1);
      Direction var7 = var1.method11324().<Direction>get(DispenserBlock.field18899);
      ProjectileEntity var8 = this.method19191(var5, var6, var2);
      var8.shoot((double)var7.getXOffset(), (double)((float)var7.getYOffset() + 0.1F), (double)var7.getZOffset(), this.method19195(), this.method19194());
      var5.addEntity(var8);
      var2.shrink(1);
      return var2;
   }

   @Override
   public void method19193(IBlockSource var1) {
      var1.method11326().playEvent(1002, var1.method11323(), 0);
   }

   public abstract ProjectileEntity method19191(World var1, IPosition var2, ItemStack var3);

   public float method19194() {
      return 6.0F;
   }

   public float method19195() {
      return 1.1F;
   }
}
