package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class902 extends Class901 {
   private static String[] field5144;
   private static final DataParameter<Boolean> field5145 = EntityDataManager.<Boolean>createKey(Class902.class, DataSerializers.field33398);

   public Class902(EntityType<? extends Class902> var1, World var2) {
      super(var1, var2);
   }

   public Class902(World var1, LivingEntity var2, double var3, double var5, double var7) {
      super(EntityType.field41104, var2, var3, var5, var7, var1);
   }

   public Class902(World var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(EntityType.field41104, var2, var4, var6, var8, var10, var12, var1);
   }

   @Override
   public float method3531() {
      return !this.method3532() ? super.method3531() : 0.73F;
   }

   @Override
   public boolean isBurning() {
      return false;
   }

   @Override
   public float getExplosionResistance(Explosion var1, IBlockReader var2, BlockPos var3, BlockState var4, FluidState var5, float var6) {
      return this.method3532() && WitherEntity.method5002(var4) ? Math.min(0.8F, var6) : var6;
   }

   @Override
   public void method3465(EntityRayTraceResult var1) {
      super.method3465(var1);
      if (!this.world.isRemote) {
         Entity var4 = var1.getEntity();
         Entity var5 = this.method3460();
         boolean var6;
         if (!(var5 instanceof LivingEntity)) {
            var6 = var4.attackEntityFrom(DamageSource.field39006, 5.0F);
         } else {
            LivingEntity var7 = (LivingEntity)var5;
            var6 = var4.attackEntityFrom(DamageSource.method31122(this, var7), 8.0F);
            if (var6) {
               if (!var4.isAlive()) {
                  var7.heal(5.0F);
               } else {
                  this.applyEnchantments(var7, var4);
               }
            }
         }

         if (var6 && var4 instanceof LivingEntity) {
            byte var8 = 0;
            if (this.world.method6997() != Difficulty.field14353) {
               if (this.world.method6997() == Difficulty.field14354) {
                  var8 = 40;
               }
            } else {
               var8 = 10;
            }

            if (var8 > 0) {
               ((LivingEntity)var4).addPotionEffect(new EffectInstance(Effects.WITHER, 20 * var8, 1));
            }
         }
      }
   }

   @Override
   public void method3464(RayTraceResult var1) {
      super.method3464(var1);
      if (!this.world.isRemote) {
         Class2141 var4 = !this.world.getGameRules().getBoolean(Class5462.field24224) ? Class2141.field14014 : Class2141.field14016;
         this.world.method6756(this, this.getPosX(), this.getPosY(), this.getPosZ(), 1.0F, false, var4);
         this.remove();
      }
   }

   @Override
   public boolean canBeCollidedWith() {
      return false;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return false;
   }

   @Override
   public void registerData() {
      this.dataManager.register(field5145, false);
   }

   public boolean method3532() {
      return this.dataManager.<Boolean>method35445(field5145);
   }

   public void method3533(boolean var1) {
      this.dataManager.method35446(field5145, var1);
   }

   @Override
   public boolean method3529() {
      return false;
   }
}
