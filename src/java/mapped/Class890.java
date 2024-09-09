package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public abstract class Class890 extends Class893 implements Class889 {
   private static final DataParameter<ItemStack> field5126 = EntityDataManager.<ItemStack>createKey(Class890.class, DataSerializers.field33396);

   public Class890(EntityType<? extends Class890> var1, World var2) {
      super(var1, var2);
   }

   public Class890(EntityType<? extends Class890> var1, double var2, double var4, double var6, World var8) {
      super(var1, var2, var4, var6, var8);
   }

   public Class890(EntityType<? extends Class890> var1, LivingEntity var2, World var3) {
      super(var1, var2, var3);
   }

   public void method3511(ItemStack var1) {
      if (var1.getItem() != this.method3512() || var1.method32141()) {
         this.getDataManager().method35446(field5126, Util.<ItemStack>make(var1.copy(), var0 -> var0.method32180(1)));
      }
   }

   public abstract Item method3512();

   public ItemStack method3513() {
      return this.getDataManager().<ItemStack>method35445(field5126);
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.method3513();
      return !var3.isEmpty() ? var3 : new ItemStack(this.method3512());
   }

   @Override
   public void registerData() {
      this.getDataManager().register(field5126, ItemStack.EMPTY);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      ItemStack var4 = this.method3513();
      if (!var4.isEmpty()) {
         var1.put("Item", var4.method32112(new CompoundNBT()));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      ItemStack var4 = ItemStack.method32104(var1.getCompound("Item"));
      this.method3511(var4);
   }
}
