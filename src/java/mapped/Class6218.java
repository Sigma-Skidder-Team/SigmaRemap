package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class6218 implements IDispenseItemBehavior {
   private static String[] field27718;

   @Override
   public final ItemStack method19196(IBlockSource var1, ItemStack var2) {
      ItemStack var5 = this.dispenseStack(var1, var2);
      this.method19193(var1);
      this.method19198(var1, var1.method11324().<Direction>get(Class3357.field18899));
      return var5;
   }

   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>get(Class3357.field18899);
      Class2955 var6 = Class3357.method11934(var1);
      ItemStack var7 = var2.split(1);
      method19197(var1.method11326(), var7, 6, var5, var6);
      return var2;
   }

   public static void method19197(World var0, ItemStack var1, int var2, Direction var3, Class2955 var4) {
      double var7 = var4.getX();
      double var9 = var4.getY();
      double var11 = var4.getZ();
      if (var3.getAxis() != Direction.Axis.Y) {
         var9 -= 0.15625;
      } else {
         var9 -= 0.125;
      }

      ItemEntity var13 = new ItemEntity(var0, var7, var9, var11, var1);
      double var14 = var0.rand.nextDouble() * 0.1 + 0.2;
      var13.setMotion(
         var0.rand.nextGaussian() * 0.0075F * (double)var2 + (double)var3.getXOffset() * var14,
         var0.rand.nextGaussian() * 0.0075F * (double)var2 + 0.2F,
         var0.rand.nextGaussian() * 0.0075F * (double)var2 + (double)var3.getZOffset() * var14
      );
      var0.addEntity(var13);
   }

   public void method19193(IBlockSource var1) {
      var1.method11326().playEvent(1000, var1.method11323(), 0);
   }

   public void method19198(IBlockSource var1, Direction var2) {
      var1.method11326().playEvent(2000, var1.method11323(), var2.getIndex());
   }
}
