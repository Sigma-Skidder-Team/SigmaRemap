package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public final class Class6247 extends Class6217 {
   private static String[] field27738;

   @Override
   public ProjectileEntity method19191(World var1, Class2955 var2, ItemStack var3) {
      return Util.make(new Class891(var1, var2.method11320(), var2.method11321(), var2.method11322()), var1x -> var1x.method3511(var3));
   }

   @Override
   public float method19194() {
      return super.method19194() * 0.5F;
   }

   @Override
   public float method19195() {
      return super.method19195() * 1.25F;
   }
}
