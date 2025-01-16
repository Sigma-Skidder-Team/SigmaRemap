package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;

import java.util.List;

public class Class2607 extends Class2605 {
   private static String[] field16857;
   public final PhantomEntity field16858;

   public Class2607(PhantomEntity var1) {
      super(var1);
      this.field16858 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16858.method4232() != null && PhantomEntity.method5340(this.field16858) == Class2143.field14029;
   }

   @Override
   public boolean method10806() {
      LivingEntity var3 = this.field16858.method4232();
      if (var3 != null) {
         if (!var3.isAlive()) {
            return false;
         } else if (!(var3 instanceof PlayerEntity) || !((PlayerEntity)var3).isSpectator() && !((PlayerEntity)var3).isCreative()) {
            if (!this.method10803()) {
               return false;
            } else {
               if (this.field16858.ticksExisted % 20 == 0) {
                  List<CatEntity> var4 = this.field16858
                     .world
                     .getEntitiesInAABBexcluding(CatEntity.class, this.field16858.getBoundingBox().grow(16.0), EntityPredicates.IS_ALIVE);
                  if (!var4.isEmpty()) {
                     for (CatEntity var6 : var4) {
                        var6.method5258();
                     }

                     return false;
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
   }

   @Override
   public void method10807() {
      this.field16858.method4233((LivingEntity)null);
      PhantomEntity.method5352(this.field16858, Class2143.field14028);
   }

   @Override
   public void method10805() {
      LivingEntity var3 = this.field16858.method4232();
      PhantomEntity.method5351(this.field16858, new Vector3d(var3.getPosX(), var3.getPosYHeight(0.5), var3.getPosZ()));
      if (!this.field16858.getBoundingBox().grow(0.2F).method19670(var3.getBoundingBox())) {
         if (this.field16858.collidedHorizontally || this.field16858.hurtTime > 0) {
            PhantomEntity.method5352(this.field16858, Class2143.field14028);
         }
      } else {
         this.field16858.attackEntityAsMob(var3);
         PhantomEntity.method5352(this.field16858, Class2143.field14028);
         if (!this.field16858.isSilent()) {
            this.field16858.world.playEvent(1039, this.field16858.getPosition(), 0);
         }
      }
   }
}
