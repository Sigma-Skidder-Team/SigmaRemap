package mapped;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class Class6240 extends Class6230 {
   private static String[] field27731;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      this.method19204(false);
      Item var5 = var2.getItem();
      if (var5 instanceof BlockItem) {
         Direction var6 = var1.method11324().<Direction>get(DispenserBlock.field18899);
         BlockPos var7 = var1.method11323().offset(var6);
         Direction var8 = !var1.method11326().method7007(var7.down()) ? Direction.UP : var6;
         this.method19204(((BlockItem)var5).method11834(new Class5910(var1.method11326(), var7, var6, var2, var8)).isSuccessOrConsume());
      }

      return var2;
   }
}
