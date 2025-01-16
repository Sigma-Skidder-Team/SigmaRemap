package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TraderLlamaEntity extends LlamaEntity {
   private int field5876 = 47999;

   public TraderLlamaEntity(EntityType<? extends TraderLlamaEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public boolean method4884() {
      return true;
   }

   @Override
   public LlamaEntity method4908() {
      return EntityType.TRADER_LLAMA.create(this.world);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("DespawnDelay", this.field5876);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("DespawnDelay", 99)) {
         this.field5876 = var1.getInt("DespawnDelay");
      }
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.addGoal(1, new Class2747(this, 2.0));
      this.field5601.addGoal(1, new Class2701(this, this));
   }

   @Override
   public void method4920(PlayerEntity var1) {
      Entity var4 = this.method4297();
      if (!(var4 instanceof WanderingTraderEntity)) {
         super.method4920(var1);
      }
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.isRemote) {
         this.method4921();
      }
   }

   private void method4921() {
      if (this.method4922()) {
         this.field5876 = !this.method4923() ? this.field5876 - 1 : ((WanderingTraderEntity)this.method4297()).method4756() - 1;
         if (this.field5876 <= 0) {
            this.method4294(true, false);
            this.remove();
         }
      }
   }

   private boolean method4922() {
      return !this.method4932() && !this.method4924() && !this.method3413();
   }

   private boolean method4923() {
      return this.method4297() instanceof WanderingTraderEntity;
   }

   private boolean method4924() {
      return this.method4296() && !this.method4923();
   }

   @Nullable
   @Override
   public Class5093 method4276(ServerWorldAccess var1, Class9755 var2, SpawnReason var3, Class5093 var4, CompoundNBT var5) {
      if (var3 == SpawnReason.field14398) {
         this.method4770(0);
      }

      if (var4 == null) {
         var4 = new Class5097(false);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
