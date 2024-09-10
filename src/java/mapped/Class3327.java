package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;

public class Class3327 extends Item {
   private static String[] field18835;

   public Class3327(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, LivingEntity var3, Hand var4) {
      if (var1.method32152() && !(var3 instanceof PlayerEntity)) {
         if (!var2.world.isRemote && var3.isAlive()) {
            var3.method3379(var1.method32149());
            if (var3 instanceof MobEntity) {
               ((MobEntity)var3).method4278();
            }

            var1.method32182(1);
         }

         return ActionResultType.method9002(var2.world.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }
}
