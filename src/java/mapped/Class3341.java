package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Class3400;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class3341 extends Item {
   private static String[] field18847;

   public Class3341(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      World var4 = var1.getWorld();
      BlockPos var5 = var1.getPos();
      BlockState var6 = var4.getBlockState(var5);
      if (!var6.isIn(Blocks.END_PORTAL_FRAME) || var6.<Boolean>get(Class3400.field19054)) {
         return ActionResultType.field14820;
      } else if (var4.isRemote) {
         return ActionResultType.SUCCESS;
      } else {
         BlockState var7 = var6.with(Class3400.field19054, Boolean.valueOf(true));
         Block.method11538(var6, var7, var4, var5);
         var4.setBlockState(var5, var7, 2);
         var4.updateComparatorOutputLevel(var5, Blocks.END_PORTAL_FRAME);
         var1.method18357().shrink(1);
         var4.playEvent(1503, var5, 0);
         Class9086 var8 = Class3400.method12029().method38656(var4, var5);
         if (var8 != null) {
            BlockPos var9 = var8.method33878().add(-3, 0, -3);

            for (int var10 = 0; var10 < 3; var10++) {
               for (int var11 = 0; var11 < 3; var11++) {
                  var4.setBlockState(var9.add(var10, 0, var11), Blocks.END_PORTAL.getDefaultState(), 2);
               }
            }

            var4.method6801(1038, var9.add(1, 0, 1), 0);
         }

         return ActionResultType.field14819;
      }
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      BlockRayTraceResult var7 = method11735(var1, var2, RayTraceContext.FluidMode.NONE);
      if (var7.getType() == RayTraceResult.Type.BLOCK && var1.getBlockState(var7.getPos()).isIn(Blocks.END_PORTAL_FRAME)) {
         return Class6794.<ItemStack>method20698(var6);
      } else {
         var2.setActiveHand(var3);
         if (var1 instanceof ServerWorld) {
            BlockPos var8 = ((ServerWorld)var1).getChunkProvider().getChunkGenerator().func_235956_a_((ServerWorld)var1, Structure.STRONGHOLD, var2.getPosition(), 100, false);
            if (var8 != null) {
               EyeOfEnderEntity var9 = new EyeOfEnderEntity(var1, var2.getPosX(), var2.getPosYHeight(0.5), var2.getPosZ());
               var9.method3522(var6);
               var9.method3524(var8);
               var1.addEntity(var9);
               if (var2 instanceof ServerPlayerEntity) {
                  CriteriaTriggers.field44477.method15065((ServerPlayerEntity)var2, var8);
               }

               var1.playSound(
                  (PlayerEntity)null,
                  var2.getPosX(),
                  var2.getPosY(),
                  var2.getPosZ(),
                  SoundEvents.field26544,
                  SoundCategory.field14734,
                  0.5F,
                  0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
               );
               var1.method6869((PlayerEntity)null, 1003, var2.getPosition(), 0);
               if (!var2.abilities.isCreativeMode) {
                  var6.shrink(1);
               }

               var2.addStat(Stats.field40098.method172(this));
               var2.swing(var3, true);
               return Class6794.<ItemStack>method20696(var6);
            }
         }

         return Class6794.<ItemStack>method20697(var6);
      }
   }
}
