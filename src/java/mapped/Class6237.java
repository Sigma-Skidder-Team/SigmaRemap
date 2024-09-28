package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public final class Class6237 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      BlockPos var5 = var1.method11323().offset(var1.method11324().<Direction>get(Class3357.field18899));
      List var6 = var1.method11326().<LivingEntity>getEntitiesInAABBexcluding(LivingEntity.class, new AxisAlignedBB(var5), var0 -> {
         if (!(var0 instanceof Class1069)) {
            return false;
         } else {
            Class1069 var3 = (Class1069)var0;
            return !var3.method4943() && var3.method4901();
         }
      });
      if (var6.isEmpty()) {
         return super.dispenseStack(var1, var2);
      } else {
         ((Class1069)var6.get(0)).method4942(Class2266.field14732);
         var2.shrink(1);
         this.method19204(true);
         return var2;
      }
   }
}
