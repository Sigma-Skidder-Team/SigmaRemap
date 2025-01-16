package mapped;

import net.minecraft.util.Util;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public final class Class6222 extends Class6218 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>get(Class3357.field18899);
      Class2955 var6 = Class3357.method11934(var1);
      double var7 = var6.getX() + (double)((float)var5.getXOffset() * 0.3F);
      double var9 = var6.getY() + (double)((float)var5.getYOffset() * 0.3F);
      double var11 = var6.getZ() + (double)((float)var5.getZOffset() * 0.3F);
      ServerWorld var13 = var1.method11326();
      Random var14 = var13.rand;
      double var15 = var14.nextGaussian() * 0.05 + (double)var5.getXOffset();
      double var17 = var14.nextGaussian() * 0.05 + (double)var5.getYOffset();
      double var19 = var14.nextGaussian() * 0.05 + (double)var5.getZOffset();
      var13.addEntity(Util.make(new SmallFireballEntity(var13, var7, var9, var11, var15, var17, var19), var1x -> var1x.method3526(var2)));
      var2.shrink(1);
      return var2;
   }

   @Override
   public void method19193(IBlockSource var1) {
      var1.method11326().playEvent(1018, var1.method11323(), 0);
   }
}
