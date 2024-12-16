package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class Class3326 extends Class3324 {
   private static String[] field18834;

   public Class3326(Properties var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      var1.playSound(
         (PlayerEntity)null,
         var2.getPosX(),
         var2.getPosY(),
         var2.getPosZ(),
         SoundEvents.field27124,
         SoundCategory.field14735,
         0.5F,
         0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
      );
      return super.method11700(var1, var2, var3);
   }
}
