package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvents;

public class Class5866 extends Slot {
   private static String[] field25635;
   public final IWorldPosCallable field25636;
   public final Class5837 field25637;

   public Class5866(Class5837 var1, IInventory var2, int var3, int var4, int var5, IWorldPosCallable var6) {
      super(var2, var3, var4, var5);
      this.field25637 = var1;
      this.field25636 = var6;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      Class5837.method18254(this.field25637).decrStackSize(1);
      Class5837.method18255(this.field25637).decrStackSize(1);
      if (!Class5837.method18254(this.field25637).getHasStack() || !Class5837.method18255(this.field25637).getHasStack()) {
         Class5837.method18256(this.field25637).method15235(0);
      }

      this.field25636.method31716((var1x, var2x) -> {
         long var5 = var1x.getGameTime();
         if (Class5837.method18257(this.field25637) != var5) {
            var1x.playSound((PlayerEntity)null, var2x, SoundEvents.field27178, SoundCategory.field14732, 1.0F, 1.0F);
            Class5837.method18258(this.field25637, var5);
         }
      });
      return super.onTake(var1, var2);
   }
}
