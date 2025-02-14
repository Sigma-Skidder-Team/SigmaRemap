package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.EnumSet;

public class LookAtGoal extends Class2595 {
   private static String[] field16880;
   public final MobEntity field16881;
   public Entity field16882;
   public final float field16883;
   private int field16884;
   public final float field16885;
   public final Class<? extends LivingEntity> field16886;
   public final EntityPredicate field16887;

   public LookAtGoal(MobEntity var1, Class<? extends LivingEntity> var2, float var3) {
      this(var1, var2, var3, 0.02F);
   }

   public LookAtGoal(MobEntity var1, Class<? extends LivingEntity> var2, float var3, float var4) {
      this.field16881 = var1;
      this.field16886 = var2;
      this.field16883 = var3;
      this.field16885 = var4;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658));
      if (var2 != PlayerEntity.class) {
         this.field16887 = new EntityPredicate().method30203((double)var3).method30205().method30204().method30207();
      } else {
         this.field16887 = new EntityPredicate()
            .method30203((double)var3)
            .method30205()
            .method30204()
            .method30207()
            .method30209(var1x -> EntityPredicates.method27982(var1).test(var1x));
      }
   }

   @Override
   public boolean method10803() {
      if (!(this.field16881.getRNG().nextFloat() >= this.field16885)) {
         if (this.field16881.getAttackTarget() != null) {
            this.field16882 = this.field16881.getAttackTarget();
         }

         if (this.field16886 != PlayerEntity.class) {
            this.field16882 = this.field16881
               .world
               .<LivingEntity>method7192(
                  this.field16886,
                  this.field16887,
                  this.field16881,
                  this.field16881.getPosX(),
                  this.field16881.getPosYEye(),
                  this.field16881.getPosZ(),
                  this.field16881.getBoundingBox().grow((double)this.field16883, 3.0, (double)this.field16883)
               );
         } else {
            this.field16882 = this.field16881
               .world
               .method7189(this.field16887, this.field16881, this.field16881.getPosX(), this.field16881.getPosYEye(), this.field16881.getPosZ());
         }

         return this.field16882 != null;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (this.field16882.isAlive()) {
         return !(this.field16881.getDistanceSq(this.field16882) > (double)(this.field16883 * this.field16883)) ? this.field16884 > 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void startExecuting() {
      this.field16884 = 40 + this.field16881.getRNG().nextInt(40);
   }

   @Override
   public void method10807() {
      this.field16882 = null;
   }

   @Override
   public void method10805() {
      this.field16881.method4227().method28041(this.field16882.getPosX(), this.field16882.getPosYEye(), this.field16882.getPosZ());
      this.field16884--;
   }
}
