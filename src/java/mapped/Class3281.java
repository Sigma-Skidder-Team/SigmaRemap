package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3281 extends Item {
   private static String[] field18789;

   public Class3281(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      PlayerEntity var4 = var1.method18358();
      World var5 = var1.getWorld();
      BlockPos var6 = var1.getPos();
      BlockState var7 = var5.getBlockState(var6);
      if (!Class3244.method11656(var7)) {
         BlockPos var8 = var6.offset(var1.getFace());
         if (!AbstractFireBlock.method12012(var5, var8, var1.getPlacementHorizontalFacing())) {
            return ActionResultType.FAIL;
         } else {
            var5.method6742(var4, var8, SoundEvents.field26587, SoundCategory.field14732, 1.0F, field18735.nextFloat() * 0.4F + 0.8F);
            BlockState var9 = AbstractFireBlock.method12009(var5, var8);
            var5.setBlockState(var8, var9, 11);
            ItemStack var10 = var1.method18357();
            if (var4 instanceof ServerPlayerEntity) {
               CriteriaTriggers.field44489.method15138((ServerPlayerEntity)var4, var8, var10);
               var10.damageItem(1, var4, var1x -> var1x.sendBreakAnimation(var1.method18359()));
            }

            return ActionResultType.method9002(var5.isRemote());
         }
      } else {
         var5.method6742(var4, var6, SoundEvents.field26587, SoundCategory.field14732, 1.0F, field18735.nextFloat() * 0.4F + 0.8F);
         var5.setBlockState(var6, var7.with(BlockStateProperties.field39699, Boolean.valueOf(true)), 11);
         if (var4 != null) {
            var1.method18357().damageItem(1, var4, var1x -> var1x.sendBreakAnimation(var1.method18359()));
         }

         return ActionResultType.method9002(var5.isRemote());
      }
   }
}
