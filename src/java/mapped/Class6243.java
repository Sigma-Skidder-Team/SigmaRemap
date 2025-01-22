package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6243 extends Class6218 {
   private static String[] field27718;
   private final Class6218 field27733 = new Class6218();

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().offset(var1.method11324().<Direction>get(DispenserBlock.field18899));
      BlockState var7 = var5.getBlockState(var6);
      Block var8 = var7.getBlock();
      if (!(var8 instanceof Class3405)) {
         return super.dispenseStack(var1, var2);
      } else {
         Fluid var9 = ((Class3405)var8).method11533(var5, var6, var7);
         if (var9 instanceof FlowingFluid) {
            Item var10 = var9.method25050();
            var2.shrink(1);
            if (!var2.isEmpty()) {
               if (var1.<Class971>method11325().method4023(new ItemStack(var10)) < 0) {
                  this.field27733.method19196(var1, new ItemStack(var10));
               }

               return var2;
            } else {
               return new ItemStack(var10);
            }
         } else {
            return super.dispenseStack(var1, var2);
         }
      }
   }
}
