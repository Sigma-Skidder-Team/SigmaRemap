package mapped;

import net.minecraft.entity.projectile.AbstractArrowEntityPickupStatus;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class Class6248 extends Class6217 {
   private static String[] field27718;

   @Override
   public ProjectileEntity method19191(World var1, IPosition var2, ItemStack var3) {
      ArrowEntity var6 = new ArrowEntity(var1, var2.getX(), var2.getY(), var2.getZ());
      var6.method3497(var3);
      var6.pickupStatus = AbstractArrowEntityPickupStatus.ALLOWED;
      return var6;
   }
}
