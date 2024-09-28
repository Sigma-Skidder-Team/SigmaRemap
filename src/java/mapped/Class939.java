package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class939 extends Class932 {
   public ResourceLocation field5302;
   public long field5303;

   public Class939(TileEntityType<?> var1) {
      super(var1);
   }

   public static void method3740(IBlockReader var0, Random var1, BlockPos var2, ResourceLocation var3) {
      TileEntity var6 = var0.getTileEntity(var2);
      if (var6 instanceof Class939) {
         ((Class939)var6).method3744(var3, var1.nextLong());
      }
   }

   public boolean checkLootAndRead(CompoundNBT var1) {
      if (!var1.contains("LootTable", 8)) {
         return false;
      } else {
         this.field5302 = new ResourceLocation(var1.getString("LootTable"));
         this.field5303 = var1.getLong("LootTableSeed");
         return true;
      }
   }

   public boolean checkLootAndWrite(CompoundNBT var1) {
      if (this.field5302 != null) {
         var1.method109("LootTable", this.field5302.toString());
         if (this.field5303 != 0L) {
            var1.method103("LootTableSeed", this.field5303);
         }

         return true;
      } else {
         return false;
      }
   }

   public void method3743(PlayerEntity var1) {
      if (this.field5302 != null && this.world.getServer() != null) {
         Class7318 var4 = this.world.getServer().method1411().method1058(this.field5302);
         if (var1 instanceof ServerPlayerEntity) {
            CriteriaTriggers.field44504.method15109((ServerPlayerEntity)var1, this.field5302);
         }

         this.field5302 = null;
         Class9464 var5 = new Class9464((ServerWorld)this.world)
            .method36454(Class9525.field44335, Vector3d.method11328(this.pos))
            .method36451(this.field5303);
         if (var1 != null) {
            var5.method36453(var1.method2978()).method36454(Class9525.field44330, var1);
         }

         var4.method23185(this, var5.method36460(Class8524.field38282));
      }
   }

   public void method3744(ResourceLocation var1, long var2) {
      this.field5302 = var1;
      this.field5303 = var2;
   }

   @Override
   public boolean isEmpty() {
      this.method3743((PlayerEntity)null);
      return this.getItems().stream().allMatch(ItemStack::isEmpty);
   }

   @Override
   public ItemStack getStackInSlot(int var1) {
      this.method3743((PlayerEntity)null);
      return this.getItems().get(var1);
   }

   @Override
   public ItemStack decrStackSize(int var1, int var2) {
      this.method3743((PlayerEntity)null);
      ItemStack var5 = ItemStackHelper.method26563(this.getItems(), var1, var2);
      if (!var5.isEmpty()) {
         this.markDirty();
      }

      return var5;
   }

   @Override
   public ItemStack removeStackFromSlot(int var1) {
      this.method3743((PlayerEntity)null);
      return ItemStackHelper.method26564(this.getItems(), var1);
   }

   @Override
   public void setInventorySlotContents(int var1, ItemStack var2) {
      this.method3743((PlayerEntity)null);
      this.getItems().set(var1, var2);
      if (var2.getCount() > this.getInventoryStackLimit()) {
         var2.setCount(this.getInventoryStackLimit());
      }

      this.markDirty();
   }

   @Override
   public boolean isUsableByPlayer(PlayerEntity var1) {
      return this.world.getTileEntity(this.pos) == this
         ? !(
            var1.getDistanceNearest((double)this.pos.getX() + 0.5, (double)this.pos.getY() + 0.5, (double)this.pos.getZ() + 0.5)
               > 64.0
         )
         : false;
   }

   @Override
   public void method3625() {
      this.getItems().clear();
   }

   public abstract NonNullList<ItemStack> getItems();

   public abstract void setItems(NonNullList<ItemStack> var1);

   @Override
   public boolean method3696(PlayerEntity var1) {
      return super.method3696(var1) && (this.field5302 == null || !var1.isSpectator());
   }

   @Nullable
   @Override
   public Container method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      if (!this.method3696(var3)) {
         return null;
      } else {
         this.method3743(var2.field5444);
         return this.createMenu(var1, var2);
      }
   }
}
