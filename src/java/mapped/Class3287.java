package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Class3287 extends Item {
   private static String[] field18797;
   private final Fluid field18798;

   public Class3287(Fluid var1, Properties var2) {
      super(var2);
      this.field18798 = var1;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      BlockRayTraceResult var7 = method11735(var1, var2, this.field18798 != Fluids.EMPTY ? RayTraceContext.FluidMode.NONE : RayTraceContext.FluidMode.SOURCE_ONLY);
      if (var7.getType() != RayTraceResult.Type.MISS) {
         if (var7.getType() != RayTraceResult.Type.BLOCK) {
            return Class6794.<ItemStack>method20698(var6);
         } else {
            BlockRayTraceResult var8 = var7;
            BlockPos var9 = var8.getPos();
            Direction var10 = var8.getFace();
            BlockPos var11 = var9.offset(var10);
            if (!var1.method6785(var2, var9) || !var2.method2936(var11, var10, var6)) {
               return Class6794.<ItemStack>method20699(var6);
            } else if (this.field18798 == Fluids.EMPTY) {
               BlockState var15 = var1.getBlockState(var9);
               if (var15.getBlock() instanceof Class3405) {
                  Fluid var16 = ((Class3405)var15.getBlock()).method11533(var1, var9, var15);
                  if (var16 != Fluids.EMPTY) {
                     var2.addStat(Stats.field40098.method172(this));
                     var2.playSound(!var16.method25067(FluidTags.field40470) ? SoundEvents.field26429 : SoundEvents.field26431, 1.0F, 1.0F);
                     ItemStack var14 = Class8482.method29979(var6, var2, new ItemStack(var16.method25050()));
                     if (!var1.isRemote) {
                        CriteriaTriggers.field44474.method15152((ServerPlayerEntity)var2, new ItemStack(var16.method25050()));
                     }

                     return Class6794.<ItemStack>method20700(var14, var1.isRemote());
                  }
               }

               return Class6794.<ItemStack>method20699(var6);
            } else {
               BlockState var12 = var1.getBlockState(var9);
               BlockPos var13 = var12.getBlock() instanceof Class3449 && this.field18798 == Fluids.WATER ? var9 : var11;
               if (!this.method11825(var2, var1, var13, var8)) {
                  return Class6794.<ItemStack>method20699(var6);
               } else {
                  this.method11824(var1, var6, var13);
                  if (var2 instanceof ServerPlayerEntity) {
                     CriteriaTriggers.field44489.method15138((ServerPlayerEntity)var2, var13, var6);
                  }

                  var2.addStat(Stats.field40098.method172(this));
                  return Class6794.<ItemStack>method20700(this.method11823(var6, var2), var1.isRemote());
               }
            }
         }
      } else {
         return Class6794.<ItemStack>method20698(var6);
      }
   }

   public ItemStack method11823(ItemStack var1, PlayerEntity var2) {
      return var2.abilities.isCreativeMode ? var1 : new ItemStack(Items.BUCKET);
   }

   public void method11824(World var1, ItemStack var2, BlockPos var3) {
   }

   public boolean method11825(PlayerEntity var1, World var2, BlockPos var3, BlockRayTraceResult var4) {
      if (!(this.field18798 instanceof FlowingFluid)) {
         return false;
      } else {
         BlockState var7 = var2.getBlockState(var3);
         Block var8 = var7.getBlock();
         Material var9 = var7.getMaterial();
         boolean var10 = var7.method23442(this.field18798);
         boolean var11 = var7.isAir() || var10 || var8 instanceof Class3449 && ((Class3449)var8).method11531(var2, var3, var7, this.field18798);
         if (var11) {
            if (var2.getDimensionType().isUltrawarm() && this.field18798.method25067(FluidTags.field40469)) {
               int var12 = var3.getX();
               int var13 = var3.getY();
               int var14 = var3.getZ();
               var2.method6742(
                  var1, var3, SoundEvents.field26582, Class2266.field14732, 0.5F, 2.6F + (var2.rand.nextFloat() - var2.rand.nextFloat()) * 0.8F
               );

               for (int var15 = 0; var15 < 8; var15++) {
                  var2.addParticle(
                     ParticleTypes.field34085, (double)var12 + Math.random(), (double)var13 + Math.random(), (double)var14 + Math.random(), 0.0, 0.0, 0.0
                  );
               }

               return true;
            } else if (var8 instanceof Class3449 && this.field18798 == Fluids.WATER) {
               ((Class3449)var8).method11532(var2, var3, var7, ((FlowingFluid)this.field18798).getStillFluidState(false));
               this.method11826(var1, var2, var3);
               return true;
            } else {
               if (!var2.isRemote && var10 && !var9.isLiquid()) {
                  var2.method7179(var3, true);
               }

               if (!var2.setBlockState(var3, this.field18798.method25049().getBlockState(), 11) && !var7.getFluidState().isSource()) {
                  return false;
               } else {
                  this.method11826(var1, var2, var3);
                  return true;
               }
            }
         } else {
            return var4 != null && this.method11825(var1, var2, var4.getPos().offset(var4.getFace()), (BlockRayTraceResult)null);
         }
      }
   }

   public void method11826(PlayerEntity var1, IWorld var2, BlockPos var3) {
      SoundEvent var6 = !this.field18798.method25067(FluidTags.field40470) ? SoundEvents.field26426 : SoundEvents.field26428;
      var2.method6742(var1, var3, var6, Class2266.field14732, 1.0F, 1.0F);
   }
}
