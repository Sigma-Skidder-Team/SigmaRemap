package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public abstract class Class898 extends Class901 implements Class889 {
   private static final DataParameter<ItemStack> field5138 = EntityDataManager.<ItemStack>createKey(Class898.class, DataSerializers.field33396);

   public Class898(EntityType<? extends Class898> var1, World var2) {
      super(var1, var2);
   }

   public Class898(EntityType<? extends Class898> var1, double var2, double var4, double var6, double var8, double var10, double var12, World var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
   }

   public Class898(EntityType<? extends Class898> var1, LivingEntity var2, double var3, double var5, double var7, World var9) {
      super(var1, var2, var3, var5, var7, var9);
   }

   public void method3526(ItemStack var1) {
      if (var1.getItem() != Items.field38046 || var1.method32141()) {
         this.getDataManager().method35446(field5138, Util.<ItemStack>make(var1.copy(), var0 -> var0.method32180(1)));
      }
   }

   public ItemStack method3527() {
      return this.getDataManager().<ItemStack>method35445(field5138);
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.method3527();
      return !var3.isEmpty() ? var3 : new ItemStack(Items.field38046);
   }

   @Override
   public void registerData() {
      this.getDataManager().register(field5138, ItemStack.EMPTY);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      ItemStack var4 = this.method3527();
      if (!var4.isEmpty()) {
         var1.put("Item", var4.method32112(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      ItemStack var4 = ItemStack.method32104(var1.getCompound("Item"));
      this.method3526(var4);
   }
}
