package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;

public class Class3291 extends Item {
   public Class3291(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockState var6 = var4.getBlockState(var5);
      if (!var6.method23448(Blocks.field37061)) {
         return ActionResultType.field14820;
      } else {
         return !Class3354.method11919(var4, var5, var6, var1.method18357()) ? ActionResultType.field14820 : ActionResultType.method9002(var4.isRemote);
      }
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      var2.method2769(var6, var3);
      var2.method2913(Class8876.field40098.method172(this));
      return Class6794.<ItemStack>method20700(var6, var1.isRemote());
   }

   public static boolean method11833(CompoundNBT var0) {
      if (var0 == null) {
         return false;
      } else if (!var0.method119("pages", 9)) {
         return false;
      } else {
         ListNBT var3 = var0.method131("pages", 8);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            String var5 = var3.method160(var4);
            if (var5.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }
}
