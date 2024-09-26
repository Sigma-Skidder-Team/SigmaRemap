package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Class5843 extends Slot {
   private static String[] field25587;
   public final EquipmentSlotType field25588;
   public final PlayerContainer field25589;

   public Class5843(PlayerContainer var1, IInventory var2, int var3, int var4, int var5, EquipmentSlotType var6) {
      super(var2, var3, var4, var5);
      this.field25589 = var1;
      this.field25588 = var6;
   }

   @Override
   public int getSlotStackLimit() {
      return 1;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return this.field25588 == MobEntity.method4271(var1);
   }

   @Override
   public boolean canTakeStack(PlayerEntity var1) {
      ItemStack var4 = this.getStack();
      return !var4.isEmpty() && !var1.isCreative() && EnchantmentHelper.method26334(var4) ? false : super.canTakeStack(var1);
   }

   @Override
   public Pair<ResourceLocation, ResourceLocation> method18271() {
      return Pair.of(PlayerContainer.field25539, PlayerContainer.method18233()[this.field25588.method8773()]);
   }
}
