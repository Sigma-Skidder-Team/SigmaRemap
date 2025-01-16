package mapped;

import net.minecraft.entity.projectile.AbstractArrowEntityPickupStatus;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class Class6216 extends Class6217 {
   private static String[] field27717;

   @Override
   public ProjectileEntity method19191(World var1, Class2955 var2, ItemStack var3) {
      SpectralArrowEntity var6 = new SpectralArrowEntity(var1, var2.getX(), var2.getY(), var2.getZ());
      var6.pickupStatus = AbstractArrowEntityPickupStatus.ALLOWED;
      return var6;
   }
}
