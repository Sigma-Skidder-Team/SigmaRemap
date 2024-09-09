package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class3341 extends Item {
   private static String[] field18847;

   public Class3341(Class5643 var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      BlockState var6 = var4.getBlockState(var5);
      if (!var6.isIn(Blocks.field36650) || var6.<Boolean>method23463(Class3400.field19054)) {
         return ActionResultType.field14820;
      } else if (var4.isRemote) {
         return ActionResultType.SUCCESS;
      } else {
         BlockState var7 = var6.method23465(Class3400.field19054, Boolean.valueOf(true));
         Block.method11538(var6, var7, var4, var5);
         var4.setBlockState(var5, var7, 2);
         var4.updateComparatorOutputLevel(var5, Blocks.field36650);
         var1.method18357().method32182(1);
         var4.playEvent(1503, var5, 0);
         Class9086 var8 = Class3400.method12029().method38656(var4, var5);
         if (var8 != null) {
            BlockPos var9 = var8.method33878().method8336(-3, 0, -3);

            for (int var10 = 0; var10 < 3; var10++) {
               for (int var11 = 0; var11 < 3; var11++) {
                  var4.setBlockState(var9.method8336(var10, 0, var11), Blocks.field36649.method11579(), 2);
               }
            }

            var4.method6801(1038, var9.method8336(1, 0, 1), 0);
         }

         return ActionResultType.field14819;
      }
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      BlockRayTraceResult var7 = method11735(var1, var2, Class1985.field12962);
      if (var7.getType() == RayTraceResult.Type.BLOCK && var1.getBlockState(var7.getPos()).isIn(Blocks.field36650)) {
         return Class6794.<ItemStack>method20698(var6);
      } else {
         var2.setActiveHand(var3);
         if (var1 instanceof ServerWorld) {
            BlockPos var8 = ((ServerWorld)var1).getChunkProvider().method7370().method17820((ServerWorld)var1, Structure.field18067, var2.getPosition(), 100, false);
            if (var8 != null) {
               Class897 var9 = new Class897(var1, var2.getPosX(), var2.getPosYHeight(0.5), var2.getPosZ());
               var9.method3522(var6);
               var9.method3524(var8);
               var1.addEntity(var9);
               if (var2 instanceof ServerPlayerEntity) {
                  CriteriaTriggers.field44477.method15065((ServerPlayerEntity)var2, var8);
               }

               var1.method6743(
                  (PlayerEntity)null,
                  var2.getPosX(),
                  var2.getPosY(),
                  var2.getPosZ(),
                  SoundEvents.field26544,
                  Class2266.field14734,
                  0.5F,
                  0.4F / (field18735.nextFloat() * 0.4F + 0.8F)
               );
               var1.method6869((PlayerEntity)null, 1003, var2.getPosition(), 0);
               if (!var2.abilities.isCreativeMode) {
                  var6.method32182(1);
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
