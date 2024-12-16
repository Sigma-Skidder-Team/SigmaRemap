package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvents;

public class Class5867 extends Slot {
   private static String[] field25638;
   public final IWorldPosCallable field25639;
   public final Class5836 field25640;

   public Class5867(Class5836 var1, IInventory var2, int var3, int var4, int var5, IWorldPosCallable var6) {
      super(var2, var3, var4, var5);
      this.field25640 = var1;
      this.field25639 = var6;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      this.field25640.inventorySlots.get(0).decrStackSize(1);
      this.field25640.inventorySlots.get(1).decrStackSize(1);
      var2.getItem().method11725(var2, var1.world, var1);
      this.field25639.method31716((var1x, var2x) -> {
         long var5 = var1x.getGameTime();
         if (Class5836.method18242(this.field25640) != var5) {
            var1x.playSound((PlayerEntity)null, var2x, SoundEvents.field27179, SoundCategory.field14732, 1.0F, 1.0F);
            Class5836.method18243(this.field25640, var5);
         }
      });
      return super.onTake(var1, var2);
   }
}
