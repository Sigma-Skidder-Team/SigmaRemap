package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;

public class Class3330 extends Item {
   private static String[] field18838;

   public Class3330(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, LivingEntity var3, Hand var4) {
      if (var3 instanceof Class1069 && var3.isAlive()) {
         Class1069 var7 = (Class1069)var3;
         if (!var7.method4943() && var7.method4901()) {
            if (!var2.world.isRemote) {
               var7.method4942(SoundCategory.field14734);
               var1.shrink(1);
            }

            return ActionResultType.method9002(var2.world.isRemote);
         }
      }

      return ActionResultType.field14820;
   }
}
