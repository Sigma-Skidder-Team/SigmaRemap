package mapped;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3273 extends Item {
   private static String[] field18773;

   public Class3273(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      BlockState var6 = var4.getBlockState(var5);
      boolean var7 = false;
      if (!Class3244.method11656(var6)) {
         var5 = var5.offset(var1.getFace());
         if (AbstractFireBlock.method12012(var4, var5, var1.getPlacementHorizontalFacing())) {
            this.method11796(var4, var5);
            var4.setBlockState(var5, AbstractFireBlock.method12009(var4, var5));
            var7 = true;
         }
      } else {
         this.method11796(var4, var5);
         var4.setBlockState(var5, var6.with(Class3244.field18698, Boolean.valueOf(true)));
         var7 = true;
      }

      if (!var7) {
         return ActionResultType.FAIL;
      } else {
         var1.method18357().shrink(1);
         return ActionResultType.method9002(var4.isRemote);
      }
   }

   private void method11796(World var1, BlockPos var2) {
      var1.playSound((PlayerEntity)null, var2, SoundEvents.field26572, SoundCategory.field14732, 1.0F, (field18735.nextFloat() - field18735.nextFloat()) * 0.2F + 1.0F);
   }
}
