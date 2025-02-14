package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.server.ServerWorld;

import java.util.List;

public class Class3729 extends Class3676<VillagerEntity> {
   private static String[] field19827;
   private ItemStack field19828;
   private final List<ItemStack> field19829 = Lists.newArrayList();
   private int field19830;
   private int field19831;
   private int field19832;

   public Class3729(int var1, int var2) {
      super(ImmutableMap.of(MemoryModuleType.field39828, Class2217.field14484), var1, var2);
   }

   public boolean method12508(ServerWorld var1, VillagerEntity var2) {
      Brain<VillagerEntity> var5 = var2.getBrain();
      if (!var5.getMemory(MemoryModuleType.field39828).isPresent()) {
         return false;
      } else {
         LivingEntity var6 = var5.<LivingEntity>getMemory(MemoryModuleType.field39828).get();
         return var6.getType() == EntityType.PLAYER && var2.isAlive() && var6.isAlive() && !var2.isChild() && var2.getDistanceSq(var6) <= 17.0;
      }
   }

   public boolean method12499(ServerWorld var1, VillagerEntity var2, long var3) {
      return this.method12508(var1, var2) && this.field19832 > 0 && var2.getBrain().<LivingEntity>getMemory(MemoryModuleType.field39828).isPresent();
   }

   public void startExecuting(ServerWorld var1, VillagerEntity var2, long var3) {
      super.startExecuting(var1, var2, var3);
      this.method12645(var2);
      this.field19830 = 0;
      this.field19831 = 0;
      this.field19832 = 40;
   }

   public void method12504(ServerWorld var1, VillagerEntity var2, long var3) {
      LivingEntity var7 = this.method12645(var2);
      this.method12641(var7, var2);
      if (this.field19829.isEmpty()) {
         var2.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
         this.field19832 = Math.min(this.field19832, 40);
      } else {
         this.method12646(var2);
      }

      this.field19832--;
   }

   public void method12506(ServerWorld var1, VillagerEntity var2, long var3) {
      super.method12506(var1, var2, var3);
      var2.getBrain().method21405(MemoryModuleType.field39828);
      var2.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);
      this.field19828 = null;
   }

   private void method12641(LivingEntity var1, VillagerEntity var2) {
      boolean var5 = false;
      ItemStack var6 = var1.getHeldItemMainhand();
      if (this.field19828 == null || !ItemStack.areItemStacksEqual(this.field19828, var6)) {
         this.field19828 = var6;
         var5 = true;
         this.field19829.clear();
      }

      if (var5 && !this.field19828.isEmpty()) {
         this.method12643(var2);
         if (!this.field19829.isEmpty()) {
            this.field19832 = 900;
            this.method12642(var2);
         }
      }
   }

   private void method12642(VillagerEntity var1) {
      var1.setItemStackToSlot(EquipmentSlotType.MAINHAND, this.field19829.get(0));
   }

   private void method12643(VillagerEntity var1) {
      for (Class9346 var5 : var1.method4742()) {
         if (!var5.method35382() && this.method12644(var5)) {
            this.field19829.add(var5.method35368());
         }
      }
   }

   private boolean method12644(Class9346 var1) {
      return ItemStack.areItemStacksEqual(this.field19828, var1.method35366()) || ItemStack.areItemStacksEqual(this.field19828, var1.method35367());
   }

   private LivingEntity method12645(VillagerEntity var1) {
      Brain<VillagerEntity> var4 = var1.getBrain();
      LivingEntity var5 = var4.getMemory(MemoryModuleType.field39828).get();
      var4.method21406(MemoryModuleType.field39825, new Class7865(var5, true));
      return var5;
   }

   private void method12646(VillagerEntity var1) {
      if (this.field19829.size() >= 2 && ++this.field19830 >= 40) {
         this.field19831++;
         this.field19830 = 0;
         if (this.field19831 > this.field19829.size() - 1) {
            this.field19831 = 0;
         }

         var1.setItemStackToSlot(EquipmentSlotType.MAINHAND, this.field19829.get(this.field19831));
      }
   }
}
