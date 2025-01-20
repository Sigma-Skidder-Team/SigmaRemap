package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public abstract class Class1045 extends CreatureEntity {
   private static final DataParameter<Boolean> field5800 = EntityDataManager.<Boolean>createKey(Class1045.class, DataSerializers.field33398);
   public int field5801;
   public int field5802;
   public int field5803;

   public Class1045(EntityType<? extends Class1045> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new Class5097(true);
      }

      Class5097 var8 = (Class5097)var4;
      if (var8.method15582() && var8.method15580() > 0 && this.rand.nextFloat() <= var8.method15583()) {
         this.method4770(-24000);
      }

      var8.method15581();
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   @Nullable
   public abstract Class1045 method4389(ServerWorld var1, Class1045 var2);

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5800, false);
   }

   public boolean method4700() {
      return false;
   }

   public int method4767() {
      if (!this.world.isRemote) {
         return this.field5801;
      } else {
         return !this.dataManager.<Boolean>method35445(field5800) ? 1 : -1;
      }
   }

   public void method4768(int var1, boolean var2) {
      int var5 = this.method4767();
      var5 += var1 * 20;
      if (var5 > 0) {
         var5 = 0;
      }

      int var6 = var5 - var5;
      this.method4770(var5);
      if (var2) {
         this.field5802 += var6;
         if (this.field5803 == 0) {
            this.field5803 = 40;
         }
      }

      if (this.method4767() == 0) {
         this.method4770(this.field5802);
      }
   }

   public void method4769(int var1) {
      this.method4768(var1, false);
   }

   public void method4770(int var1) {
      int var4 = this.field5801;
      this.field5801 = var1;
      if (var4 < 0 && var1 >= 0 || var4 >= 0 && var1 < 0) {
         this.dataManager.set(field5800, var1 < 0);
         this.method4679();
      }
   }

   @Override
   public void writeAdditional(CompoundNBT compound) {
      super.writeAdditional(compound);
      compound.putInt("Age", this.method4767());
      compound.putInt("ForcedAge", this.field5802);
   }

   @Override
   public void readAdditional(CompoundNBT compound) {
      super.readAdditional(compound);
      this.method4770(compound.getInt("Age"));
      this.field5802 = compound.getInt("ForcedAge");
   }

   @Override
   public void notifyDataManagerChange(DataParameter<?> var1) {
      if (field5800.equals(var1)) {
         this.recalculateSize();
      }

      super.notifyDataManagerChange(var1);
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.isRemote) {
         if (this.isAlive()) {
            int var3 = this.method4767();
            if (var3 >= 0) {
               if (var3 > 0) {
                  this.method4770(--var3);
               }
            } else {
               this.method4770(++var3);
            }
         }
      } else if (this.field5803 > 0) {
         if (this.field5803 % 4 == 0) {
            this.world.addParticle(ParticleTypes.field34078, this.getPosXRandom(1.0), this.getPosYRandom() + 0.5, this.getPosZRandom(1.0), 0.0, 0.0, 0.0);
         }

         this.field5803--;
      }
   }

   public void method4679() {
   }

   @Override
   public boolean isChild() {
      return this.method4767() < 0;
   }

   @Override
   public void method4308(boolean var1) {
      this.method4770(!var1 ? 0 : -24000);
   }
}
