package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class Class3458 extends Block {
   private static String[] field19278;
   public static final Class8551 field19279 = Class8820.field39709;

   public Class3458(AbstractBlock var1) {
      super(var1);
      this.method11578(this.method11579().method23465(field19279, Boolean.valueOf(false)));
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.isIn(var1.getBlock()) && var2.method6780(var3)) {
         method12131(var2, var3);
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (var2.method6780(var3)) {
         method12131(var2, var3);
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote() && !var4.isCreative() && var3.<Boolean>method23463(field19279)) {
         method12131(var1, var2);
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public void method11560(World var1, BlockPos var2, Explosion var3) {
      if (!var1.isRemote) {
         Class1004 var6 = new Class1004(var1, (double)var2.getX() + 0.5, (double)var2.getY(), (double)var2.getZ() + 0.5, var3.method25789());
         var6.method4182((short)(var1.rand.nextInt(var6.method4184() / 4) + var6.method4184() / 8));
         var1.addEntity(var6);
      }
   }

   public static void method12131(World var0, BlockPos var1) {
      method12132(var0, var1, (LivingEntity)null);
   }

   private static void method12132(World var0, BlockPos var1, LivingEntity var2) {
      if (!var0.isRemote) {
         Class1004 var5 = new Class1004(var0, (double)var1.getX() + 0.5, (double)var1.getY(), (double)var1.getZ() + 0.5, var2);
         var0.addEntity(var5);
         var0.method6743((PlayerEntity)null, var5.getPosX(), var5.getPosY(), var5.getPosZ(), SoundEvents.field27146, Class2266.field14732, 1.0F, 1.0F);
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      Item var10 = var9.getItem();
      if (var10 != Items.field37794 && var10 != Items.field38046) {
         return super.method11505(var1, var2, var3, var4, var5, var6);
      } else {
         method12132(var2, var3, var4);
         var2.setBlockState(var3, Blocks.AIR.method11579(), 11);
         if (!var4.isCreative()) {
            if (var10 != Items.field37794) {
               var9.method32182(1);
            } else {
               var9.method32121(1, var4, var1x -> var1x.sendBreakAnimation(var5));
            }
         }

         return ActionResultType.method9002(var2.isRemote);
      }
   }

   @Override
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
      if (!var1.isRemote) {
         Entity var7 = var4.method3460();
         if (var4.isBurning()) {
            BlockPos var8 = var3.getPos();
            method12132(var1, var8, !(var7 instanceof LivingEntity) ? null : (LivingEntity)var7);
            var1.removeBlock(var8, false);
         }
      }
   }

   @Override
   public boolean method11576(Explosion var1) {
      return false;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19279);
   }
}
