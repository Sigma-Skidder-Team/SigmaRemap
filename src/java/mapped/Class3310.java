package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class3310 extends Class3308 {
   private static String[] field18816;

   public Class3310(Properties var1) {
      super(var1);
   }

   @Override
   public AbstractArrowEntity method11850(World var1, ItemStack var2, LivingEntity var3) {
      return new SpectralArrowEntity(var1, var3);
   }
}
