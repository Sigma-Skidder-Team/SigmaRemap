package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.SkullBlock;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6238 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      Direction var6 = var1.method11324().<Direction>get(DispenserBlock.field18899);
      BlockPos var7 = var1.method11323().offset(var6);
      if (var5.method7007(var7) && Class3344.method11899(var5, var7, var2)) {
         var5.setBlockState(
            var7,
            Blocks.WITHER_SKELETON_SKULL
               .getDefaultState()
               .with(SkullBlock.field18855, Integer.valueOf(var6.getAxis() != Direction.Axis.Y ? var6.getOpposite().getHorizontalIndex() * 4 : 0)),
            3
         );
         TileEntity var8 = var5.getTileEntity(var7);
         if (var8 instanceof SkullTileEntity) {
            Class3344.method11898(var5, var7, (SkullTileEntity)var8);
         }

         var2.shrink(1);
         this.method19204(true);
      } else {
         this.method19204(ArmorItem.func_226626_a_(var1, var2));
      }

      return var2;
   }
}
