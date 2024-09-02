package mapped;

import net.minecraft.entity.projectile.AbstractArrowEntityPickupStatus;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class Class6248 extends Class6217 {
   private static String[] field27718;

   @Override
   public ProjectileEntity method19191(World var1, Class2955 var2, ItemStack var3) {
      Class887 var6 = new Class887(var1, var2.method11320(), var2.method11321(), var2.method11322());
      var6.method3497(var3);
      var6.pickupStatus = AbstractArrowEntityPickupStatus.ALLOWED;
      return var6;
   }
}
