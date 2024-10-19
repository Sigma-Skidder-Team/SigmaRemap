package mapped;

import net.minecraft.util.Util;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class Class6249 extends Class6217 {
   private static String[] field27718;

   @Override
   public ProjectileEntity method19191(World var1, Class2955 var2, ItemStack var3) {
      return Util.make(new Class894(var1, var2.getX(), var2.getY(), var2.getZ()), var1x -> var1x.method3511(var3));
   }
}
