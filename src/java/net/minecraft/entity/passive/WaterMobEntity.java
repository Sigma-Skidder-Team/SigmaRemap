package net.minecraft.entity.passive;

import mapped.Class1046;
import mapped.Class1662;
import mapped.Class2163;
import mapped.CreatureAttribute;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public abstract class WaterMobEntity extends Class1046 {
   public WaterMobEntity(EntityType<? extends WaterMobEntity> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14191, 0.0F);
   }

   @Override
   public boolean canBreatheUnderwater() {
      return true;
   }

   @Override
   public CreatureAttribute getCreatureAttribute() {
      return CreatureAttribute.field33509;
   }

   @Override
   public boolean method4266(Class1662 var1) {
      return var1.checkNoEntityCollision(this);
   }

   @Override
   public int method4236() {
      return 120;
   }

   @Override
   public int getExperiencePoints(PlayerEntity var1) {
      return 1 + this.world.rand.nextInt(3);
   }

   public void method4775(int var1) {
      if (this.isAlive() && !this.method3255()) {
         this.setAir(var1 - 1);
         if (this.getAir() == -20) {
            this.setAir(0);
            this.attackEntityFrom(DamageSource.field38999, 2.0F);
         }
      } else {
         this.setAir(300);
      }
   }

   @Override
   public void baseTick() {
      int var3 = this.getAir();
      super.baseTick();
      this.method4775(var3);
   }

   @Override
   public boolean method2952() {
      return false;
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return false;
   }
}
