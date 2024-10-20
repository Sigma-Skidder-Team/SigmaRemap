package mapped;

import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

public class Class3358 extends Class3357 {
   private static String[] field18902;
   private static final IDispenseItemBehavior field18903 = new Class6218();

   public Class3358(Properties var1) {
      super(var1);
   }

   @Override
   public IDispenseItemBehavior method11933(ItemStack var1) {
      return field18903;
   }

   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class972();
   }

   @Override
   public void method11932(ServerWorld var1, BlockPos var2) {
      Class2957 var5 = new Class2957(var1, var2);
      Class971 var6 = var5.<Class971>method11325();
      int var7 = var6.method4022();
      if (var7 >= 0) {
         ItemStack var8 = var6.getStackInSlot(var7);
         if (!var8.isEmpty()) {
            Direction var9 = var1.getBlockState(var2).<Direction>get(field18899);
            IInventory var10 = Class936.method3715(var1, var2.offset(var9));
            ItemStack var12;
            if (var10 != null) {
               var12 = Class936.method3708(var6, var10, var8.copy().split(1), var9.getOpposite());
               if (!var12.isEmpty()) {
                  var12 = var8.copy();
               } else {
                  var12 = var8.copy();
                  var12.shrink(1);
               }
            } else {
               var12 = field18903.method19196(var5, var8);
            }

            var6.setInventorySlotContents(var7, var12);
         }
      } else {
         var1.playEvent(1001, var2, 0);
      }
   }
}
