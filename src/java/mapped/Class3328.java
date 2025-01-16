package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.world.World;

import java.util.List;

public class Class3328 extends Item {
   private static String[] field18836;

   public Class3328(Properties var1) {
      super(var1);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      List var6 = var1.<AreaEffectCloudEntity>getEntitiesInAABBexcluding(
         AreaEffectCloudEntity.class, var2.getBoundingBox().grow(2.0), var0 -> var0 != null && var0.isAlive() && var0.method4114() instanceof EnderDragonEntity
      );
      ItemStack var7 = var2.getHeldItem(var3);
      if (var6.isEmpty()) {
         BlockRayTraceResult var10 = method11735(var1, var2, RayTraceContext.FluidMode.SOURCE_ONLY);
         if (var10.getType() != RayTraceResult.Type.MISS) {
            if (var10.getType() == RayTraceResult.Type.BLOCK) {
               BlockPos var9 = var10.getPos();
               if (!var1.method6785(var2, var9)) {
                  return Class6794.<ItemStack>method20698(var7);
               }

               if (var1.getFluidState(var9).method23486(FluidTags.field40469)) {
                  var1.playSound(var2, var2.getPosX(), var2.getPosY(), var2.getPosZ(), SoundEvents.field26418, SoundCategory.field14734, 1.0F, 1.0F);
                  return Class6794.<ItemStack>method20700(
                     this.method11878(var7, var2, Class9741.method38187(new ItemStack(Items.field37971), Class8137.field34977)), var1.isRemote()
                  );
               }
            }

            return Class6794.<ItemStack>method20698(var7);
         } else {
            return Class6794.<ItemStack>method20698(var7);
         }
      } else {
         AreaEffectCloudEntity var8 = (AreaEffectCloudEntity)var6.get(0);
         var8.method4097(var8.method4098() - 0.5F);
         var1.playSound((PlayerEntity)null, var2.getPosX(), var2.getPosY(), var2.getPosZ(), SoundEvents.field26419, SoundCategory.field14734, 1.0F, 1.0F);
         return Class6794.<ItemStack>method20700(this.method11878(var7, var2, new ItemStack(Items.field38114)), var1.isRemote());
      }
   }

   public ItemStack method11878(ItemStack var1, PlayerEntity var2, ItemStack var3) {
      var2.addStat(Stats.field40098.method172(this));
      return Class8482.method29979(var1, var2, var3);
   }
}
