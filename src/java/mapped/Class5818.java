package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;

public class Class5818 extends Container {
   private static String[] field25490;
   private final IInventory field25491;
   private final Class8202 field25492;

   public Class5818(int var1) {
      this(var1, new Class927(1), new Class8206(1));
   }

   public Class5818(int var1, IInventory var2, Class8202 var3) {
      super(ContainerType.field35664, var1);
      assertInventorySize(var2, 1);
      assertIntArraySize(var3, 1);
      this.field25491 = var2;
      this.field25492 = var3;
      this.addSlot(new Class5862(this, var2, 0, 0, 0));
      this.trackIntArray(var3);
   }

   @Override
   public boolean enchantItem(PlayerEntity var1, int var2) {
      if (var2 >= 100) {
         int var8 = var2 - 100;
         this.updateProgressBar(0, var8);
         return true;
      } else {
         switch (var2) {
            case 1:
               int var5 = this.field25492.method28505(0);
               this.updateProgressBar(0, var5 - 1);
               return true;
            case 2:
               int var6 = this.field25492.method28505(0);
               this.updateProgressBar(0, var6 + 1);
               return true;
            case 3:
               if (!var1.method2935()) {
                  return false;
               }

               ItemStack var7 = this.field25491.removeStackFromSlot(0);
               this.field25491.markDirty();
               if (!var1.inventory.method4045(var7)) {
                  var1.dropItem(var7, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void updateProgressBar(int var1, int var2) {
      super.updateProgressBar(var1, var2);
      this.detectAndSendChanges();
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25491.isUsableByPlayer(var1);
   }

   public ItemStack method18172() {
      return this.field25491.getStackInSlot(0);
   }

   public int method18173() {
      return this.field25492.method28505(0);
   }
}
