package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public abstract class Class919 extends AbstractMinecartEntity implements IInventory, Class949 {
   private NonNullList<ItemStack> field5236 = NonNullList.<ItemStack>method68(36, ItemStack.EMPTY);
   private boolean field5237 = true;
   private ResourceLocation field5238;
   private long field5239;

   public Class919(EntityType<?> var1, World var2) {
      super(var1, var2);
   }

   public Class919(EntityType<?> var1, double var2, double var4, double var6, World var8) {
      super(var1, var8, var2, var4, var6);
   }

   @Override
   public void method3586(DamageSource var1) {
      super.method3586(var1);
      if (this.world.getGameRules().getBoolean(GameRules.field24229)) {
         Class7236.method22722(this.world, this, this);
         if (!this.world.isRemote) {
            Entity var4 = var1.getImmediateSource();
            if (var4 != null && var4.getType() == EntityType.PLAYER) {
               Class4388.method13832((PlayerEntity)var4, true);
            }
         }
      }
   }

   @Override
   public boolean isEmpty() {
      for (ItemStack var4 : this.field5236) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      this.method3624((PlayerEntity)null);
      return this.field5236.get(var1);
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      this.method3624((PlayerEntity)null);
      return ItemStackHelper.method26563(this.field5236, var1, var2);
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      this.method3624((PlayerEntity)null);
      ItemStack var4 = this.field5236.get(var1);
      if (!var4.isEmpty()) {
         this.field5236.set(var1, ItemStack.EMPTY);
         return var4;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      this.method3624((PlayerEntity)null);
      this.field5236.set(var1, var2);
      if (!var2.isEmpty() && var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.getSizeInventory()) {
         this.setInventorySlotContents(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void markDirty() {
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return !this.removed ? !(var1.getDistanceSq(this) > 64.0) : false;
   }

   @Nullable
   @Override
   public Entity changeDimension(ServerWorld var1) {
      this.field5237 = false;
      return super.changeDimension(var1);
   }

   @Override
   public void remove() {
      if (!this.world.isRemote && this.field5237) {
         Class7236.method22722(this.world, this, this);
      }

      super.remove();
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.field5238 == null) {
         ItemStackHelper.saveAllItems(var1, this.field5236);
      } else {
         var1.putString("LootTable", this.field5238.toString());
         if (this.field5239 != 0L) {
            var1.putLong("LootTableSeed", this.field5239);
         }
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field5236 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!var1.contains("LootTable", 8)) {
         ItemStackHelper.loadAllItems(var1, this.field5236);
      } else {
         this.field5238 = new ResourceLocation(var1.getString("LootTable"));
         this.field5239 = var1.getLong("LootTableSeed");
      }
   }

   @Override
   public ActionResultType processInitialInteract(PlayerEntity var1, Hand var2) {
      var1.method2766(this);
      if (var1.world.isRemote) {
         return ActionResultType.SUCCESS;
      } else {
         Class4388.method13832(var1, true);
         return ActionResultType.field14819;
      }
   }

   @Override
   public void method3593() {
      float var3 = 0.98F;
      if (this.field5238 == null) {
         int var4 = 15 - Container.calcRedstoneFromInventory(this);
         var3 += (float)var4 * 0.001F;
      }

      this.setMotion(this.getMotion().mul((double)var3, 0.0, (double)var3));
   }

   public void method3624(PlayerEntity var1) {
      if (this.field5238 != null && this.world.getServer() != null) {
         Class7318 var4 = this.world.getServer().method1411().method1058(this.field5238);
         if (var1 instanceof ServerPlayerEntity) {
            CriteriaTriggers.field44504.method15109((ServerPlayerEntity)var1, this.field5238);
         }

         this.field5238 = null;
         Class9464 var5 = new Class9464((ServerWorld)this.world).method36454(Class9525.field44335, this.getPositionVec()).method36451(this.field5239);
         if (var1 != null) {
            var5.method36453(var1.method2978()).method36454(Class9525.field44330, var1);
         }

         var4.method23185(this, var5.method36460(Class8524.field38282));
      }
   }

   @Override
   public void method3625() {
      this.method3624((PlayerEntity)null);
      this.field5236.clear();
   }

   public void method3626(ResourceLocation var1, long var2) {
      this.field5238 = var1;
      this.field5239 = var2;
   }

   @Nullable
   @Override
   public Container method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      if (this.field5238 != null && var3.isSpectator()) {
         return null;
      } else {
         this.method3624(var2.field5444);
         return this.method3628(var1, var2);
      }
   }

   public abstract Container method3628(int var1, PlayerInventory var2);
}
