package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;

public final class Class6223 extends Class6218 {

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>get(Class3357.field18899);
      FireworkRocketEntity var6 = new FireworkRocketEntity(var1.method11326(), var2, var1.getX(), var1.getY(), var1.getX(), true);
      IDispenseItemBehavior.method19201(var1, var6, var5);
      var6.shoot((double)var5.getXOffset(), (double)var5.getYOffset(), (double)var5.getZOffset(), 0.5F, 1.0F);
      var1.method11326().addEntity(var6);
      var2.shrink(1);
      return var2;
   }

   @Override
   public void method19193(IBlockSource var1) {
      var1.method11326().playEvent(1004, var1.method11323(), 0);
   }
}
