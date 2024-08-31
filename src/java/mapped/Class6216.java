package mapped;

import net.minecraft.entity.projectile.AbstractArrowEntityPickupStatus;
import net.minecraft.entity.projectile.ProjectileEntity;

public final class Class6216 extends Class6217 {
   private static String[] field27717;

   @Override
   public ProjectileEntity method19191(World var1, Class2955 var2, ItemStack var3) {
      Class885 var6 = new Class885(var1, var2.method11320(), var2.method11321(), var2.method11322());
      var6.pickupStatus = AbstractArrowEntityPickupStatus.ALLOWED;
      return var6;
   }
}
