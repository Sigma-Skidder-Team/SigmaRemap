package net.minecraft.entity.passive;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

public abstract class ShoulderRidingEntity extends TameableEntity {
   private int field5671;

   public ShoulderRidingEntity(EntityType<? extends ShoulderRidingEntity> var1, World var2) {
      super(var1, var2);
   }

   public boolean method4404(ServerPlayerEntity var1) {
      CompoundNBT var4 = new CompoundNBT();
      var4.method109("id", this.getEntityString());
      this.writeWithoutTypeId(var4);
      if (!var1.method2948(var4)) {
         return false;
      } else {
         this.remove();
         return true;
      }
   }

   @Override
   public void tick() {
      this.field5671++;
      super.tick();
   }

   public boolean method4405() {
      return this.field5671 > 100;
   }
}
