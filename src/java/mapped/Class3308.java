package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3308 extends Item {
   private static String[] field18815;

   public Class3308(Properties var1) {
      super(var1);
   }

   public AbstractArrowEntity method11850(World var1, ItemStack var2, LivingEntity var3) {
      Class887 var6 = new Class887(var1, var3);
      var6.method3497(var2);
      return var6;
   }
}
