package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.server.ServerWorld;

import java.util.Set;
import java.util.stream.Collectors;

public class Class3754 extends Class3676<VillagerEntity> {
   private static String[] field19909;
   private Set<Item> field19910 = ImmutableSet.of();

   public Class3754() {
      super(ImmutableMap.of(MemoryModuleType.field39828, Class2217.field14484, MemoryModuleType.field39819, Class2217.field14484));
   }

   public boolean method12508(ServerWorld var1, VillagerEntity var2) {
      return Class6983.method21571(var2.getBrain(), MemoryModuleType.field39828, EntityType.VILLAGER);
   }

   public boolean method12499(ServerWorld var1, VillagerEntity var2, long var3) {
      return this.method12508(var1, var2);
   }

   public void startExecuting(ServerWorld var1, VillagerEntity var2, long var3) {
      VillagerEntity var7 = (VillagerEntity)var2.getBrain().<LivingEntity>getMemory(MemoryModuleType.field39828).get();
      Class6983.method21569(var2, var7, 0.5F);
      this.field19910 = method12721(var2, var7);
   }

   public void method12504(ServerWorld var1, VillagerEntity var2, long var3) {
      VillagerEntity var7 = (VillagerEntity)var2.getBrain().<LivingEntity>getMemory(MemoryModuleType.field39828).get();
      if (!(var2.getDistanceSq(var7) > 5.0)) {
         Class6983.method21569(var2, var7, 0.5F);
         var2.method4714(var1, var7, var3);
         if (var2.method4709() && (var2.method4674().method26571() == VillagerProfession.field36016 || var7.method4710())) {
            method12722(var2, VillagerEntity.field5777.keySet(), var7);
         }

         if (var7.method4674().method26571() == VillagerProfession.field36016
            && var2.method4752().count(Items.field37842) > Items.field37842.getMaxStackSize() / 2) {
            method12722(var2, ImmutableSet.of(Items.field37842), var7);
         }

         if (!this.field19910.isEmpty() && var2.method4752().hasAny(this.field19910)) {
            method12722(var2, this.field19910, var7);
         }
      }
   }

   public void method12506(ServerWorld var1, VillagerEntity var2, long var3) {
      var2.getBrain().method21405(MemoryModuleType.field39828);
   }

   private static Set<Item> method12721(VillagerEntity var0, VillagerEntity var1) {
      ImmutableSet<Item> var4 = var1.method4674().method26571().method29458();
      ImmutableSet<Item> var5 = var0.method4674().method26571().method29458();
      return var4.stream().filter(var1x -> !var5.contains(var1x)).collect(Collectors.toSet());
   }

   private static void method12722(VillagerEntity var0, Set<Item> var1, LivingEntity var2) {
      Class927 var5 = var0.method4752();
      ItemStack var6 = ItemStack.EMPTY;

      for (int var7 = 0; var7 < var5.getSizeInventory(); var7++) {
         ItemStack var8 = var5.getStackInSlot(var7);
         if (!var8.isEmpty()) {
            Item var9 = var8.getItem();
            if (var1.contains(var9)) {
               int var10;
               if (var8.getCount() <= var8.getMaxStackSize() / 2) {
                  if (var8.getCount() <= 24) {
                     continue;
                  }

                  var10 = var8.getCount() - 24;
               } else {
                  var10 = var8.getCount() / 2;
               }

               var8.shrink(var10);
               var6 = new ItemStack(var9, var10);
               break;
            }
         }
      }

      if (!var6.isEmpty()) {
         Class6983.method21578(var0, var6, var2.getPositionVec());
      }
   }
}
