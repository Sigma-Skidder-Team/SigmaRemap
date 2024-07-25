package remapped;

import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface class_6250 {
   int method_28539();

   void method_28532(int var1);

   @Nullable
   UUID method_28535();

   void method_28531(UUID var1);

   void method_28529();

   default void method_28528(CompoundNBT var1) {
      var1.putInt("AngerTime", this.method_28539());
      if (this.method_28535() != null) {
         var1.method_25964("AngryAt", this.method_28535());
      }
   }

   default void method_28533(class_6331 var1, CompoundNBT var2) {
      this.method_28532(var2.method_25947("AngerTime"));
      if (var2.method_25954("AngryAt")) {
         UUID var5 = var2.method_25926("AngryAt");
         this.method_28531(var5);
         Entity var6 = var1.method_28925(var5);
         if (var6 != null) {
            if (var6 instanceof MobEntity) {
               this.method_26511((MobEntity)var6);
            }

            if (var6.getType() == EntityType.field_34300) {
               this.method_26580((PlayerEntity)var6);
            }
         }
      } else {
         this.method_28531((UUID)null);
      }
   }

   default void method_28530(class_6331 var1, boolean var2) {
      LivingEntity var5 = this.method_17809();
      UUID var6 = this.method_28535();
      if ((var5 == null || var5.method_26450()) && var6 != null && var1.method_28925(var6) instanceof MobEntity) {
         this.method_28538();
      } else {
         if (var5 != null && !Objects.equals(var6, var5.method_37328())) {
            this.method_28531(var5.method_37328());
            this.method_28529();
         }

         if (this.method_28539() > 0 && (var5 == null || var5.getType() != EntityType.field_34300 || !var2)) {
            this.method_28532(this.method_28539() - 1);
            if (this.method_28539() == 0) {
               this.method_28538();
            }
         }
      }
   }

   default boolean method_28534(LivingEntity var1) {
      if (!class_3572.field_17480.test(var1)) {
         return false;
      } else {
         return var1.getType() == EntityType.field_34300 && this.method_28527(var1.world) ? true : var1.method_37328().equals(this.method_28535());
      }
   }

   default boolean method_28527(World var1) {
      return var1.getGameRules().getBoolean(GameRules.field_1039) && this.method_28537() && this.method_28535() == null;
   }

   default boolean method_28537() {
      return this.method_28539() > 0;
   }

   default void method_28526(PlayerEntity var1) {
      if (var1.world.getGameRules().getBoolean(GameRules.field_1042) && var1.method_37328().equals(this.method_28535())) {
         this.method_28538();
      }
   }

   default void method_28536() {
      this.method_28538();
      this.method_28529();
   }

   default void method_28538() {
      this.method_26511((LivingEntity)null);
      this.method_28531((UUID)null);
      this.method_26860((LivingEntity)null);
      this.method_28532(0);
   }

   void method_26511(LivingEntity var1);

   void method_26580(PlayerEntity var1);

   void method_26860(LivingEntity var1);

   @Nullable
   LivingEntity method_17809();
}
