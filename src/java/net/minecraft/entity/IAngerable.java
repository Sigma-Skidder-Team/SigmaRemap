package net.minecraft.entity;

import mapped.MobEntity;
import mapped.Class5462;
import mapped.Class8088;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.UUID;


public interface IAngerable {
   int method4348();

   void method4347(int var1);

   @Nullable
   UUID method4350();

   void setAngerTarget(UUID var1);

   void method4346();

   default void method4364(CompoundNBT var1) {
      var1.putInt("AngerTime", this.method4348());
      if (this.method4350() != null) {
         var1.method104("AngryAt", this.method4350());
      }
   }

   default void method4365(ServerWorld var1, CompoundNBT var2) {
      this.method4347(var2.getInt("AngerTime"));
      if (var2.method106("AngryAt")) {
         UUID var5 = var2.method105("AngryAt");
         this.setAngerTarget(var5);
         Entity var6 = var1.getEntityByUuid(var5);
         if (var6 != null) {
            if (var6 instanceof MobEntity) {
               this.setRevengeTarget((MobEntity)var6);
            }

            if (var6.getType() == EntityType.PLAYER) {
               this.method3016((PlayerEntity)var6);
            }
         }
      } else {
         this.setAngerTarget((UUID)null);
      }
   }

   default void method4366(ServerWorld var1, boolean var2) {
      LivingEntity var5 = this.method4232();
      UUID var6 = this.method4350();
      if ((var5 == null || var5.getShouldBeDead()) && var6 != null && var1.getEntityByUuid(var6) instanceof MobEntity) {
         this.method4372();
      } else {
         if (var5 != null && !Objects.equals(var6, var5.getUniqueID())) {
            this.setAngerTarget(var5.getUniqueID());
            this.method4346();
         }

         if (this.method4348() > 0 && (var5 == null || var5.getType() != EntityType.PLAYER || !var2)) {
            this.method4347(this.method4348() - 1);
            if (this.method4348() == 0) {
               this.method4372();
            }
         }
      }
   }

   default boolean method4367(LivingEntity var1) {
      if (!Class8088.field34762.test(var1)) {
         return false;
      } else {
         return var1.getType() == EntityType.PLAYER && this.method4368(var1.world) ? true : var1.getUniqueID().equals(this.method4350());
      }
   }

   default boolean method4368(World var1) {
      return var1.getGameRules().getBoolean(Class5462.field24255) && this.method4369() && this.method4350() == null;
   }

   default boolean method4369() {
      return this.method4348() > 0;
   }

   default void method4370(PlayerEntity var1) {
      if (var1.world.getGameRules().getBoolean(Class5462.field24254) && var1.getUniqueID().equals(this.method4350())) {
         this.method4372();
      }
   }

   default void method4371() {
      this.method4372();
      this.method4346();
   }

   default void method4372() {
      this.setRevengeTarget((LivingEntity)null);
      this.setAngerTarget((UUID)null);
      this.method4233((LivingEntity)null);
      this.method4347(0);
   }

   void setRevengeTarget(LivingEntity var1);

   void method3016(PlayerEntity var1);

   void method4233(LivingEntity var1);

   @Nullable
   LivingEntity method4232();
}
