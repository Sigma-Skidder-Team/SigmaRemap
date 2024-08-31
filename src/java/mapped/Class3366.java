package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class Class3366 extends Class3241 {
   private static final Direction[] field18934 = new Direction[]{Direction.WEST, Direction.EAST, Direction.SOUTH};
   public static final Class8553 field18935 = Class3198.field18484;
   public static final Class8554 field18936 = Class8820.field39754;

   public Class3366(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18936, Integer.valueOf(0)).method23465(field18935, Direction.NORTH));
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return var1.<Integer>method23463(field18936);
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, var4, var5, var6);
      if (!var1.isRemote && var5 instanceof Class962) {
         Class962 var9 = (Class962)var5;
         if (Class7858.method26311(Class8122.field34916, var6) == 0) {
            var9.method3915(var2, var4, Class2084.field13573);
            var1.updateComparatorOutputLevel(var3, this);
            this.method11943(var1, var3);
         }

         CriteriaTriggers.field44501.method15076((ServerPlayerEntity)var2, var4.getBlock(), var6, var9.method3918());
      }
   }

   private void method11943(World var1, BlockPos var2) {
      List<Class1017> var5 = var1.method7182(Class1017.class, new AxisAlignedBB(var2).method19663(8.0, 6.0, 8.0));
      if (!var5.isEmpty()) {
         List var6 = var1.<PlayerEntity>method7182(PlayerEntity.class, new AxisAlignedBB(var2).method19663(8.0, 6.0, 8.0));
         int var7 = var6.size();

         for (Class1017 var9 : var5) {
            if (var9.method4232() == null) {
               var9.method4233((LivingEntity)var6.get(var1.rand.nextInt(var7)));
            }
         }
      }
   }

   public static void method11944(World var0, BlockPos var1) {
      method11557(var0, var1, new ItemStack(Items.field38174, 3));
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      int var10 = var1.<Integer>method23463(field18936);
      boolean var11 = false;
      if (var10 >= 5) {
         if (var9.getItem() != Items.field37956) {
            if (var9.getItem() == Items.field37972) {
               var9.method32182(1);
               var2.method6743(var4, var4.getPosX(), var4.getPosY(), var4.getPosZ(), Sounds.field26418, Class2266.field14734, 1.0F, 1.0F);
               if (!var9.isEmpty()) {
                  if (!var4.inventory.method4045(new ItemStack(Items.field38177))) {
                     var4.method2882(new ItemStack(Items.field38177), false);
                  }
               } else {
                  var4.method3095(var5, new ItemStack(Items.field38177));
               }

               var11 = true;
            }
         } else {
            var2.method6743(var4, var4.getPosX(), var4.getPosY(), var4.getPosZ(), Sounds.field26398, Class2266.field14734, 1.0F, 1.0F);
            method11944(var2, var3);
            var9.method32121(1, var4, var1x -> var1x.method3185(var5));
            var11 = true;
         }
      }

      if (!var11) {
         return super.method11505(var1, var2, var3, var4, var5, var6);
      } else {
         if (Class3244.method11654(var2, var3)) {
            this.method11947(var2, var1, var3);
         } else {
            if (this.method11945(var2, var3)) {
               this.method11943(var2, var3);
            }

            this.method11946(var2, var1, var3, var4, Class2084.field13573);
         }

         return ActionResultType.method9002(var2.isRemote);
      }
   }

   private boolean method11945(World var1, BlockPos var2) {
      TileEntity var5 = var1.getTileEntity(var2);
      if (!(var5 instanceof Class962)) {
         return false;
      } else {
         Class962 var6 = (Class962)var5;
         return !var6.method3913();
      }
   }

   public void method11946(World var1, BlockState var2, BlockPos var3, PlayerEntity var4, Class2084 var5) {
      this.method11947(var1, var2, var3);
      TileEntity var8 = var1.getTileEntity(var3);
      if (var8 instanceof Class962) {
         Class962 var9 = (Class962)var8;
         var9.method3915(var4, var2, var5);
      }
   }

   public void method11947(World var1, BlockState var2, BlockPos var3) {
      var1.setBlockState(var3, var2.method23465(field18936, Integer.valueOf(0)), 3);
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method23463(field18936) >= 5) {
         for (int var7 = 0; var7 < var4.nextInt(1) + 1; var7++) {
            this.method11948(var2, var3, var1);
         }
      }
   }

   private void method11948(World var1, BlockPos var2, BlockState var3) {
      if (var3.method23449().method23474() && !(var1.rand.nextFloat() < 0.3F)) {
         VoxelShape var6 = var3.method23414(var1, var2);
         double var7 = var6.method19513(Class113.field414);
         if (var7 >= 1.0 && !var3.method23446(BlockTags.field32781)) {
            double var9 = var6.method19512(Class113.field414);
            if (!(var9 > 0.0)) {
               BlockPos var11 = var2.down();
               BlockState var12 = var1.getBlockState(var11);
               VoxelShape var13 = var12.method23414(var1, var11);
               double var14 = var13.method19513(Class113.field414);
               if ((var14 < 1.0 || !var12.method23456(var1, var11)) && var12.method23449().method23474()) {
                  this.method11949(var1, var2, var6, (double)var2.getY() - 0.05);
               }
            } else {
               this.method11949(var1, var2, var6, (double)var2.getY() + var9 - 0.05);
            }
         }
      }
   }

   private void method11949(World var1, BlockPos var2, VoxelShape var3, double var4) {
      this.method11950(
         var1,
         (double)var2.getX() + var3.method19512(Class113.field413),
         (double)var2.getX() + var3.method19513(Class113.field413),
         (double)var2.getZ() + var3.method19512(Class113.field415),
         (double)var2.getZ() + var3.method19513(Class113.field415),
         var4
      );
   }

   private void method11950(World var1, double var2, double var4, double var6, double var8, double var10) {
      var1.method6746(
         Class7940.field34108,
         MathHelper.method37822(var1.rand.nextDouble(), var2, var4),
         var10,
         MathHelper.method37822(var1.rand.nextDouble(), var6, var8),
         0.0,
         0.0,
         0.0
      );
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18935, var1.method18350().method536());
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18936, field18935);
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Nullable
   @Override
   public TileEntity method11646(Class1665 var1) {
      return new Class962();
   }

   @Override
   public void method11574(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote && var4.isCreative() && var1.method6789().method17135(Class5462.field24228)) {
         TileEntity var7 = var1.getTileEntity(var2);
         if (var7 instanceof Class962) {
            Class962 var8 = (Class962)var7;
            ItemStack var9 = new ItemStack(this);
            int var10 = var3.<Integer>method23463(field18936);
            boolean var11 = !var8.method3913();
            if (!var11 && var10 == 0) {
               return;
            }

            if (var11) {
               CompoundNBT var12 = new CompoundNBT();
               var12.put("Bees", var8.method3927());
               var9.setTagInfo("BlockEntityTag", var12);
            }

            CompoundNBT var14 = new CompoundNBT();
            var14.method102("honey_level", var10);
            var9.setTagInfo("BlockStateTag", var14);
            ItemEntity var13 = new ItemEntity(var1, (double)var2.getX(), (double)var2.getY(), (double)var2.getZ(), var9);
            var13.method4131();
            var1.method6916(var13);
         }
      }

      super.method11574(var1, var2, var3, var4);
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      Entity var5 = var2.<Entity>method36459(Class9525.field44330);
      if (var5 instanceof Class1004 || var5 instanceof Class1081 || var5 instanceof Class902 || var5 instanceof Class1079 || var5 instanceof Class993) {
         TileEntity var6 = var2.<TileEntity>method36459(Class9525.field44337);
         if (var6 instanceof Class962) {
            Class962 var7 = (Class962)var6;
            var7.method3915((PlayerEntity)null, var1, Class2084.field13573);
         }
      }

      return super.method11697(var1, var2);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var4.getBlockState(var6).getBlock() instanceof Class3399) {
         TileEntity var9 = var4.getTileEntity(var5);
         if (var9 instanceof Class962) {
            Class962 var10 = (Class962)var9;
            var10.method3915((PlayerEntity)null, var1, Class2084.field13573);
         }
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   public static Direction method11951(Random var0) {
      return Util.<Direction>method38518(field18934, var0);
   }
}
