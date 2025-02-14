package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.server.ServerWorld;

public class Class3731<E extends MobEntity & ICrossbowUser, T extends LivingEntity> extends Class3676<E> {
   private static String[] field19839;
   private int field19840;
   private Class2276 field19841 = Class2276.field14826;

   public Class3731() {
      super(ImmutableMap.of(MemoryModuleType.field39825, Class2217.field14486, MemoryModuleType.ATTACK_TARGET, Class2217.field14484), 1200);
   }

   public boolean method12508(ServerWorld var1, E var2) {
      LivingEntity var5 = method12658(var2);
      return var2.method3092(Items.CROSSBOW) && Class6983.method21583(var2, var5) && Class6983.method21580(var2, var5, 0);
   }

   public boolean method12499(ServerWorld var1, E var2, long var3) {
      return var2.getBrain().method21404(MemoryModuleType.ATTACK_TARGET) && this.method12508(var1, (E)var2);
   }

   public void method12504(ServerWorld var1, E var2, long var3) {
      LivingEntity var7 = method12658(var2);
      this.method12657(var2, var7);
      this.method12656((E)var2, var7);
   }

   public void method12506(ServerWorld var1, E var2, long var3) {
      if (var2.isHandActive()) {
         var2.resetActiveHand();
      }

      if (var2.method3092(Items.CROSSBOW)) {
         ((ICrossbowUser)var2).method4535(false);
         CrossbowItem.method11756(var2.getActiveItemStack(), false);
      }
   }

   private void method12656(E var1, LivingEntity var2) {
      if (this.field19841 != Class2276.field14826) {
         if (this.field19841 != Class2276.field14827) {
            if (this.field19841 != Class2276.field14828) {
               if (this.field19841 == Class2276.field14829) {
                  ((Class1022)var1).method4530(var2, 1.0F);
                  ItemStack var5 = var1.getHeldItem(ProjectileHelper.method36389(var1, Items.CROSSBOW));
                  CrossbowItem.method11756(var5, false);
                  this.field19841 = Class2276.field14826;
               }
            } else {
               this.field19840--;
               if (this.field19840 == 0) {
                  this.field19841 = Class2276.field14829;
               }
            }
         } else {
            if (!var1.isHandActive()) {
               this.field19841 = Class2276.field14826;
            }

            int var7 = var1.getItemInUseMaxCount();
            ItemStack var6 = var1.getActiveItemStack();
            if (var7 >= CrossbowItem.method11767(var6)) {
               var1.stopActiveHand();
               this.field19841 = Class2276.field14828;
               this.field19840 = 20 + var1.getRNG().nextInt(20);
               ((ICrossbowUser)var1).method4535(false);
            }
         }
      } else {
         var1.setActiveHand(ProjectileHelper.method36389(var1, Items.CROSSBOW));
         this.field19841 = Class2276.field14827;
         ((ICrossbowUser)var1).method4535(true);
      }
   }

   private void method12657(MobEntity var1, LivingEntity var2) {
      var1.getBrain().method21406(MemoryModuleType.field39825, new Class7865(var2, true));
   }

   private static LivingEntity method12658(LivingEntity var0) {
      return var0.getBrain().<LivingEntity>getMemory(MemoryModuleType.ATTACK_TARGET).get();
   }
}
