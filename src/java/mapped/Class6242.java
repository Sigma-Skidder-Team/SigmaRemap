package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public final class Class6242 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      BlockPos var5 = var1.method11323().offset(var1.method11324().<Direction>get(DispenserBlock.field18899));

      for (AbstractHorseEntity var7 : var1.method11326().<AbstractHorseEntity>getEntitiesInAABBexcluding(AbstractHorseEntity.class, new AxisAlignedBB(var5), var0 -> var0.isAlive() && var0.method4898())) {
         if (var7.method4900(var2) && !var7.method4899() && var7.method4932()) {
            var7.method2963(401, var2.split(1));
            this.method19204(true);
            return var2;
         }
      }

      return super.dispenseStack(var1, var2);
   }
}
