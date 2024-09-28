package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6219 extends Class6218 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().method8349(var1.method11324().<Direction>get(Class3357.field18899));
      Class1004 var7 = new Class1004(var5, (double)var6.getX() + 0.5, (double)var6.getY(), (double)var6.getZ() + 0.5, (LivingEntity)null);
      var5.addEntity(var7);
      var5.method6743((PlayerEntity)null, var7.getPosX(), var7.getPosY(), var7.getPosZ(), SoundEvents.field27146, Class2266.field14732, 1.0F, 1.0F);
      var2.shrink(1);
      return var2;
   }
}
