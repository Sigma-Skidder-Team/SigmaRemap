package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Class5815 extends Container {
   private final IInventory field25483 = new Class921();
   private final IInventory field25484 = new Class982(this, 2);
   private final IWorldPosCallable field25485;

   public Class5815(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5815(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.field35662, var1);
      this.field25485 = var3;
      this.addSlot(new Class5838(this, this.field25484, 0, 49, 19));
      this.addSlot(new Class5847(this, this.field25484, 1, 49, 40));
      this.addSlot(new Class5863(this, this.field25483, 2, 129, 34, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.addSlot(new Slot(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.addSlot(new Slot(var2, var8, 8 + var8 * 18, 142));
      }
   }

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      super.onCraftMatrixChanged(var1);
      if (var1 == this.field25484) {
         this.method18166();
      }
   }

   private void method18166() {
      ItemStack var3 = this.field25484.getStackInSlot(0);
      ItemStack var4 = this.field25484.getStackInSlot(1);
      boolean var5 = !var3.isEmpty() || !var4.isEmpty();
      boolean var6 = !var3.isEmpty() && !var4.isEmpty();
      if (!var5) {
         this.field25483.setInventorySlotContents(0, ItemStack.EMPTY);
      } else {
         boolean var7 = !var3.isEmpty() && var3.getItem() != Items.field38070 && !var3.method32163()
            || !var4.isEmpty() && var4.getItem() != Items.field38070 && !var4.method32163();
         if (var3.getCount() > 1 || var4.getCount() > 1 || !var6 && var7) {
            this.field25483.setInventorySlotContents(0, ItemStack.EMPTY);
            this.detectAndSendChanges();
            return;
         }

         byte var8 = 1;
         int var13;
         ItemStack var14;
         if (!var6) {
            boolean var9 = !var3.isEmpty();
            var13 = !var9 ? var4.method32117() : var3.method32117();
            var14 = !var9 ? var4 : var3;
         } else {
            if (var3.getItem() != var4.getItem()) {
               this.field25483.setInventorySlotContents(0, ItemStack.EMPTY);
               this.detectAndSendChanges();
               return;
            }

            Item var15 = var3.getItem();
            int var10 = var15.method11711() - var3.method32117();
            int var11 = var15.method11711() - var4.method32117();
            int var12 = var10 + var11 + var15.method11711() * 5 / 100;
            var13 = Math.max(var15.method11711() - var12, 0);
            var14 = this.method18167(var3, var4);
            if (!var14.method32115()) {
               if (!ItemStack.method32128(var3, var4)) {
                  this.field25483.setInventorySlotContents(0, ItemStack.EMPTY);
                  this.detectAndSendChanges();
                  return;
               }

               var8 = 2;
            }
         }

         this.field25483.setInventorySlotContents(0, this.method18168(var14, var13, var8));
      }

      this.detectAndSendChanges();
   }

   private ItemStack method18167(ItemStack var1, ItemStack var2) {
      ItemStack var5 = var1.copy();
      Map<Class6069, Integer> var6 = EnchantmentHelper.method26312(var2);

      for (Entry<Class6069, Integer> var8 : var6.entrySet()) {
         Class6069 var9 = var8.getKey();
         if (!var9.method18825() || EnchantmentHelper.method26311(var9, var5) == 0) {
            var5.method32162(var9, var8.getValue());
         }
      }

      return var5;
   }

   private ItemStack method18168(ItemStack var1, int var2, int var3) {
      ItemStack var6 = var1.copy();
      var6.method32146("Enchantments");
      var6.method32146("StoredEnchantments");
      if (var2 <= 0) {
         var6.method32146("Damage");
      } else {
         var6.method32118(var2);
      }

      var6.method32180(var3);
      Map var7 = EnchantmentHelper.method26312(var1)
         .entrySet()
         .stream()
         .filter(var0 -> var0.getKey().method18825())
         .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      EnchantmentHelper.method26314(var7, var6);
      var6.method32170(0);
      if (var6.getItem() == Items.field38070 && var7.size() == 0) {
         var6 = new ItemStack(Items.field37900);
         if (var1.method32152()) {
            var6.method32150(var1.method32149());
         }
      }

      for (int var8 = 0; var8 < var7.size(); var8++) {
         var6.method32170(Class5824.method18196(var6.method32169()));
      }

      return var6;
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25485.method31716((var2, var3) -> this.clearContainer(var1, var2, this.field25484));
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return isWithinUsableDistance(this.field25485, var1, Blocks.field37060);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.field25468.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         ItemStack var8 = this.field25484.getStackInSlot(0);
         ItemStack var9 = this.field25484.getStackInSlot(1);
         if (var2 != 2) {
            if (var2 != 0 && var2 != 1) {
               if (!var8.isEmpty() && !var9.isEmpty()) {
                  if (var2 >= 3 && var2 < 30) {
                     if (!this.mergeItemStack(var7, 30, 39, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= 30 && var2 < 39 && !this.mergeItemStack(var7, 3, 30, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.mergeItemStack(var7, 0, 2, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.mergeItemStack(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.onSlotChange(var7, var5);
         }

         if (!var7.isEmpty()) {
            var6.onSlotChanged();
         } else {
            var6.putStack(ItemStack.EMPTY);
         }

         if (var7.getCount() == var5.getCount()) {
            return ItemStack.EMPTY;
         }

         var6.onTake(var1, var7);
      }

      return var5;
   }

   // $VF: synthetic method
   public static IInventory method18171(Class5815 var0) {
      return var0.field25484;
   }
}
