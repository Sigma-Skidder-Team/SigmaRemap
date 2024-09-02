package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;

public abstract class Class1013 extends Class1018 {
   public static final DataParameter<Byte> field5668 = EntityDataManager.<Byte>createKey(Class1013.class, DataSerializers.field33390);
   public static final DataParameter<Optional<UUID>> field5669 = EntityDataManager.<Optional<UUID>>createKey(Class1013.class, DataSerializers.field33404);
   private boolean field5670;

   public Class1013(EntityType<? extends Class1013> var1, World var2) {
      super(var1, var2);
      this.method4394();
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5668, (byte)0);
      this.dataManager.register(field5669, Optional.<UUID>empty());
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      if (this.method4397() != null) {
         var1.method104("Owner", this.method4397());
      }

      var1.putBoolean("Sitting", this.field5670);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      UUID var4;
      if (var1.method106("Owner")) {
         var4 = var1.method105("Owner");
      } else {
         String var5 = var1.getString("Owner");
         var4 = Class9061.method33732(this.method3396(), var5);
      }

      if (var4 != null) {
         try {
            this.method4398(var4);
            this.method4379(true);
         } catch (Throwable var6) {
            this.method4379(false);
         }
      }

      this.field5670 = var1.getBoolean("Sitting");
      this.method4396(this.field5670);
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return !this.method4296();
   }

   public void method4392(boolean var1) {
      Class7435 var4 = ParticleTypes.field34080;
      if (!var1) {
         var4 = ParticleTypes.field34092;
      }

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.rand.nextGaussian() * 0.02;
         double var8 = this.rand.nextGaussian() * 0.02;
         double var10 = this.rand.nextGaussian() * 0.02;
         this.world.method6746(var4, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), var6, var8, var10);
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 7) {
         if (var1 != 6) {
            super.method2866(var1);
         } else {
            this.method4392(false);
         }
      } else {
         this.method4392(true);
      }
   }

   public boolean method4393() {
      return (this.dataManager.<Byte>method35445(field5668) & 4) != 0;
   }

   public void method4379(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5668);
      if (!var1) {
         this.dataManager.method35446(field5668, (byte)(var4 & -5));
      } else {
         this.dataManager.method35446(field5668, (byte)(var4 | 4));
      }

      this.method4394();
   }

   public void method4394() {
   }

   public boolean method4395() {
      return (this.dataManager.<Byte>method35445(field5668) & 1) != 0;
   }

   public void method4396(boolean var1) {
      byte var4 = this.dataManager.<Byte>method35445(field5668);
      if (!var1) {
         this.dataManager.method35446(field5668, (byte)(var4 & -2));
      } else {
         this.dataManager.method35446(field5668, (byte)(var4 | 1));
      }
   }

   @Nullable
   public UUID method4397() {
      return this.dataManager.<Optional<UUID>>method35445(field5669).orElse((UUID)null);
   }

   public void method4398(UUID var1) {
      this.dataManager.method35446(field5669, Optional.<UUID>ofNullable(var1));
   }

   public void method4399(PlayerEntity var1) {
      this.method4379(true);
      this.method4398(var1.getUniqueID());
      if (var1 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44488.method15115((ServerPlayerEntity)var1, this);
      }
   }

   @Nullable
   public LivingEntity method4400() {
      try {
         UUID var3 = this.method4397();
         return var3 == null ? null : this.world.method7196(var3);
      } catch (IllegalArgumentException var4) {
         return null;
      }
   }

   @Override
   public boolean method3026(LivingEntity var1) {
      return !this.method4401(var1) ? super.method3026(var1) : false;
   }

   public boolean method4401(LivingEntity var1) {
      return var1 == this.method4400();
   }

   public boolean method4388(LivingEntity var1, LivingEntity var2) {
      return true;
   }

   @Override
   public Team getTeam() {
      if (this.method4393()) {
         LivingEntity var3 = this.method4400();
         if (var3 != null) {
            return var3.getTeam();
         }
      }

      return super.getTeam();
   }

   @Override
   public boolean method3345(Entity var1) {
      if (this.method4393()) {
         LivingEntity var4 = this.method4400();
         if (var1 == var4) {
            return true;
         }

         if (var4 != null) {
            return var4.method3345(var1);
         }
      }

      return super.method3345(var1);
   }

   @Override
   public void method2737(Class8654 var1) {
      if (!this.world.isRemote && this.world.method6789().method17135(Class5462.field24234) && this.method4400() instanceof ServerPlayerEntity) {
         this.method4400().sendMessage(this.method3073().method27600(), Util.DUMMY_UUID);
      }

      super.method2737(var1);
   }

   public boolean method4402() {
      return this.field5670;
   }

   public void method4403(boolean var1) {
      this.field5670 = var1;
   }
}
