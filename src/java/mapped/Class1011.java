package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.UUID;

public interface Class1011 {
   int method4348();

   void method4347(int var1);

   @Nullable
   UUID method4350();

   void method4349(UUID var1);

   void method4346();

   default void method4364(CompoundNBT var1) {
      var1.method102("AngerTime", this.method4348());
      if (this.method4350() != null) {
         var1.method104("AngryAt", this.method4350());
      }
   }

   default void method4365(ServerWorld var1, CompoundNBT var2) {
      this.method4347(var2.method122("AngerTime"));
      if (var2.method106("AngryAt")) {
         UUID var5 = var2.method105("AngryAt");
         this.method4349(var5);
         Entity var6 = var1.method6942(var5);
         if (var6 != null) {
            if (var6 instanceof Class1006) {
               this.method3017((Class1006)var6);
            }

            if (var6.getType() == EntityType.PLAYER) {
               this.method3016((PlayerEntity)var6);
            }
         }
      } else {
         this.method4349((UUID)null);
      }
   }

   default void method4366(ServerWorld var1, boolean var2) {
      Class880 var5 = this.method4232();
      UUID var6 = this.method4350();
      if ((var5 == null || var5.getShouldBeDead()) && var6 != null && var1.method6942(var6) instanceof Class1006) {
         this.method4372();
      } else {
         if (var5 != null && !Objects.equals(var6, var5.getUniqueID())) {
            this.method4349(var5.getUniqueID());
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

   default boolean method4367(Class880 var1) {
      if (!Class8088.field34762.test(var1)) {
         return false;
      } else {
         return var1.getType() == EntityType.PLAYER && this.method4368(var1.world) ? true : var1.getUniqueID().equals(this.method4350());
      }
   }

   default boolean method4368(World var1) {
      return var1.method6789().method17135(Class5462.field24255) && this.method4369() && this.method4350() == null;
   }

   default boolean method4369() {
      return this.method4348() > 0;
   }

   default void method4370(PlayerEntity var1) {
      if (var1.world.method6789().method17135(Class5462.field24254) && var1.getUniqueID().equals(this.method4350())) {
         this.method4372();
      }
   }

   default void method4371() {
      this.method4372();
      this.method4346();
   }

   default void method4372() {
      this.method3017((Class880)null);
      this.method4349((UUID)null);
      this.method4233((Class880)null);
      this.method4347(0);
   }

   void method3017(Class880 var1);

   void method3016(PlayerEntity var1);

   void method4233(Class880 var1);

   @Nullable
   Class880 method4232();
}
