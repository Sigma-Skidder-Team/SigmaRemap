package mapped;

import net.minecraft.util.Util;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class6245 extends Class6217 {
   private static String[] field27736;
   public final Class6227 field27737;

   public Class6245(Class6227 var1) {
      this.field27737 = var1;
   }

   @Override
   public ProjectileEntity method19191(World var1, Class2955 var2, ItemStack var3) {
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
