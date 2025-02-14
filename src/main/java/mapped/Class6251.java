package mapped;

import net.minecraft.util.Util;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class6251 extends Class6217 {
   private static String[] field27739;
   public final Class6228 field27740;

   public Class6251(Class6228 var1) {
      this.field27740 = var1;
   }

   @Override
   public ProjectileEntity method19191(World var1, IPosition var2, ItemStack var3) {
      return Util.make(new PotionEntity(var1, var2.getX(), var2.getY(), var2.getZ()), var1x -> var1x.method3511(var3));
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
