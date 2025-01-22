package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6236 extends Class6230 {
   private static String[] field27718;
   private final Class6218 field27730 = new Class6218();

   private ItemStack method19208(IBlockSource var1, ItemStack var2, ItemStack var3) {
      var2.shrink(1);
      if (!var2.isEmpty()) {
         if (var1.<Class971>method11325().method4023(var3.copy()) < 0) {
            this.field27730.method19196(var1, var3.copy());
         }

         return var2;
      } else {
         return var3.copy();
      }
   }

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      this.method19204(false);
      ServerWorld var5 = var1.method11326();
      BlockPos var6 = var1.method11323().offset(var1.method11324().<Direction>get(DispenserBlock.field18899));
      BlockState var7 = var5.getBlockState(var6);
      if (var7.method23447(BlockTags.field32794, var0 -> var0.method23462(Class3366.field18936)) && var7.<Integer>get(Class3366.field18936) >= 5) {
         ((Class3366)var7.getBlock()).method11946(var5, var7, var6, (PlayerEntity)null, Class2084.field13572);
         this.method19204(true);
         return this.method19208(var1, var2, new ItemStack(Items.field38177));
      } else if (!var5.getFluidState(var6).method23486(FluidTags.WATER)) {
         return super.dispenseStack(var1, var2);
      } else {
         this.method19204(true);
         return this.method19208(var1, var2, PotionUtils.method38187(new ItemStack(Items.field37971), Potions.WATER));
      }
   }
}
