package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class Class3306 extends Item {
   private static String[] field18813;

   public Class3306(Properties var1) {
      super(var1);
   }

   @Override
   public ItemStack onItemUseFinish(ItemStack var1, World var2, LivingEntity var3) {
      ItemStack var6 = super.onItemUseFinish(var1, var2, var3);
      return var3 instanceof PlayerEntity && ((PlayerEntity)var3).abilities.isCreativeMode ? var6 : new ItemStack(Items.field37836);
   }
}
