package remapped;

import javax.annotation.Nullable;

public class class_1537 extends class_3429 {
   private static String[] field_8140;

   public class_1537(EntityType<? extends class_1537> var1, World var2) {
      super(var1, var2);
   }

   public class_1537(World var1, LivingEntity var2) {
      super(EntityType.field_34259, var2, var1);
   }

   public class_1537(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34259, var2, var4, var6, var1);
   }

   @Override
   public class_2451 method_15854() {
      return class_4897.field_24664;
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      var1.method_25524().attackEntityFrom(DamageSource.method_28355(this, this.method_26166()), 0.0F);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      Entity var4 = this.method_26166();

      for (int var5 = 0; var5 < 32; var5++) {
         this.world
            .method_43361(
               class_3090.field_15356,
               this.getPosX(),
               this.method_37309() + this.field_41717.nextDouble() * 2.0,
               this.getPosZ(),
               this.field_41717.nextGaussian(),
               0.0,
               this.field_41717.nextGaussian()
            );
      }

      if (!this.world.field_33055 && !this.removed) {
         if (!(var4 instanceof class_9359)) {
            if (var4 != null) {
               var4.method_37254(this.getPosX(), this.method_37309(), this.getPosZ());
               var4.field_41706 = 0.0F;
            }
         } else {
            class_9359 var7 = (class_9359)var4;
            if (var7.field_47794.method_9091().method_23493() && var7.world == this.world && !var7.method_26507()) {
               if (this.field_41717.nextFloat() < 0.05F && this.world.getGameRules().getBoolean(GameRules.DO_MOB_SPAWNING)) {
                  class_2667 var6 = EntityType.field_34264.method_30484(this.world);
                  var6.method_12025(true);
                  var6.method_37144(var4.getPosX(), var4.method_37309(), var4.getPosZ(), var4.rotationYaw, var4.rotationPitch);
                  this.world.method_7509(var6);
               }

               if (var4.isPassenger()) {
                  var4.method_37390();
               }

               var4.method_37254(this.getPosX(), this.method_37309(), this.getPosZ());
               var4.field_41706 = 0.0F;
               var4.attackEntityFrom(DamageSource.field_31684, 5.0F);
            }
         }

         this.method_37204();
      }
   }

   @Override
   public void method_37123() {
      Entity var3 = this.method_26166();
      if (var3 instanceof PlayerEntity && !var3.isAlive()) {
         this.method_37204();
      } else {
         super.method_37123();
      }
   }

   @Nullable
   @Override
   public Entity method_37326(class_6331 var1) {
      Entity var4 = this.method_26166();
      if (var4 != null && var4.world.method_29545() != var1.method_29545()) {
         this.method_26159((Entity)null);
      }

      return super.method_37326(var1);
   }
}
