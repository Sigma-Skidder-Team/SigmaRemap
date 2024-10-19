package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class Class896 extends Class890 implements Class889 {
   public static final Predicate<LivingEntity> field5131 = LivingEntity::method3124;

   public Class896(EntityType<? extends Class896> var1, World var2) {
      super(var1, var2);
   }

   public Class896(World var1, LivingEntity var2) {
      super(EntityType.POTION, var2, var1);
   }

   public Class896(World var1, double var2, double var4, double var6) {
      super(EntityType.POTION, var2, var4, var6, var1);
   }

   @Override
   public Item method3512() {
      return Items.field38115;
   }

   @Override
   public float method3515() {
      return 0.05F;
   }

   @Override
   public void method3466(BlockRayTraceResult var1) {
      super.method3466(var1);
      if (!this.world.isRemote) {
         ItemStack var4 = this.method3509();
         Class8812 var5 = Class9741.method38185(var4);
         List var6 = Class9741.method38176(var4);
         boolean var7 = var5 == Class8137.field34977 && var6.isEmpty();
         Direction var8 = var1.getFace();
         BlockPos var9 = var1.getPos();
         BlockPos var10 = var9.offset(var8);
         if (var7) {
            this.method3521(var10, var8);
            this.method3521(var10.offset(var8.getOpposite()), var8);

            for (Direction var12 : Direction.Plane.HORIZONTAL) {
               this.method3521(var10.offset(var12), var12);
            }
         }
      }
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         ItemStack var4 = this.method3509();
         Class8812 var5 = Class9741.method38185(var4);
         List var6 = Class9741.method38176(var4);
         boolean var7 = var5 == Class8137.field34977 && var6.isEmpty();
         if (!var7) {
            if (!var6.isEmpty()) {
               if (!this.method3520()) {
                  this.method3518(var6, var1.getType() != RayTraceResult.Type.ENTITY ? null : ((EntityRayTraceResult)var1).getEntity());
               } else {
                  this.method3519(var4, var5);
               }
            }
         } else {
            this.method3517();
         }

         int var8 = !var5.method31817() ? 2002 : 2007;
         this.world.playEvent(var8, this.getPosition(), Class9741.method38182(var4));
         this.remove();
      }
   }

   private void method3517() {
      AxisAlignedBB var3 = this.getBoundingBox().grow(4.0, 2.0, 4.0);
      List<LivingEntity> var4 = this.world.getEntitiesInAABBexcluding(LivingEntity.class, var3, field5131);
      if (!var4.isEmpty()) {
         for (LivingEntity var6 : var4) {
            double var7 = this.getDistanceSq(var6);
            if (var7 < 16.0 && var6.method3124()) {
               var6.attackEntityFrom(DamageSource.method31124(var6, this.method3460()), 1.0F);
            }
         }
      }
   }

   private void method3518(List<EffectInstance> var1, Entity var2) {
      AxisAlignedBB var5 = this.getBoundingBox().grow(4.0, 2.0, 4.0);
      List<LivingEntity> var6 = this.world.getEntitiesWithinAABB(LivingEntity.class, var5);
      if (!var6.isEmpty()) {
         for (LivingEntity var8 : var6) {
            if (var8.canBeHitWithPotion()) {
               double var9 = this.getDistanceSq(var8);
               if (var9 < 16.0) {
                  double var11 = 1.0 - Math.sqrt(var9) / 4.0;
                  if (var8 == var2) {
                     var11 = 1.0;
                  }

                  for (EffectInstance var14 : var1) {
                     Effect var15 = var14.getPotion();
                     if (!var15.isInstant()) {
                        int var16 = (int)(var11 * (double)var14.method8628() + 0.5);
                        if (var16 > 20) {
                           var8.addPotionEffect(new EffectInstance(var15, var16, var14.method8629(), var14.isAmbient(), var14.method8631()));
                        }
                     } else {
                        var15.affectEntity(this, this.method3460(), var8, var14.method8629(), var11);
                     }
                  }
               }
            }
         }
      }
   }

   private void method3519(ItemStack var1, Class8812 var2) {
      Class999 var5 = new Class999(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
      Entity var6 = this.method3460();
      if (var6 instanceof LivingEntity) {
         var5.method4113((LivingEntity)var6);
      }

      var5.method4097(3.0F);
      var5.method4110(-0.5F);
      var5.method4112(10);
      var5.method4111(-var5.method4098() / (float)var5.method4108());
      var5.method4099(var2);

      for (EffectInstance var8 : Class9741.method38179(var1)) {
         var5.method4101(new EffectInstance(var8));
      }

      CompoundNBT var9 = var1.getTag();
      if (var9 != null && var9.contains("CustomPotionColor", 99)) {
         var5.method4103(var9.getInt("CustomPotionColor"));
      }

      this.world.addEntity(var5);
   }

   private boolean method3520() {
      return this.method3509().getItem() == Items.field38118;
   }

   private void method3521(BlockPos var1, Direction var2) {
      BlockState var5 = this.world.getBlockState(var1);
      if (!var5.isIn(BlockTags.field32798)) {
         if (Class3244.method11655(var5)) {
            this.world.method6869((PlayerEntity)null, 1009, var1, 0);
            Class3244.method11652(this.world, var1, var5);
            this.world.setBlockState(var1, var5.with(Class3244.field18698, Boolean.valueOf(false)));
         }
      } else {
         this.world.removeBlock(var1, false);
      }
   }
}
