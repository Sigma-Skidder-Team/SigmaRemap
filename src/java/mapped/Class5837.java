package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.IntReferenceHolder;

public class Class5837 extends Container {
   private final IWorldPosCallable field25564;
   private final IntReferenceHolder field25565 = IntReferenceHolder.method15238();
   private Runnable field25566 = () -> {
   };
   private final Slot field25567;
   private final Slot field25568;
   private final Slot field25569;
   private final Slot field25570;
   private long field25571;
   private final IInventory field25572 = new Class978(this, 3);
   private final IInventory field25573 = new Class979(this, 1);

   public Class5837(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5837(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.LOOM, var1);
      this.field25564 = var3;
      this.field25567 = this.addSlot(new Class5844(this, this.field25572, 0, 13, 26));
      this.field25568 = this.addSlot(new Class5851(this, this.field25572, 1, 33, 26));
      this.field25569 = this.addSlot(new Class5849(this, this.field25572, 2, 23, 45));
      this.field25570 = this.addSlot(new Class5866(this, this.field25573, 0, 143, 58, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.addSlot(new Slot(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.addSlot(new Slot(var2, var8, 8 + var8 * 18, 142));
      }

      this.trackInt(this.field25565);
   }

   public int method18244() {
      return this.field25565.get();
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return isWithinUsableDistance(this.field25564, var1, Blocks.LOOM);
   }

   @Override
   public boolean enchantItem(PlayerEntity var1, int var2) {
      if (var2 > 0 && var2 <= Class2154.field14126) {
         this.field25565.method15235(var2);
         this.method18246();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      ItemStack var4 = this.field25567.getStack();
      ItemStack var5 = this.field25568.getStack();
      ItemStack var6 = this.field25569.getStack();
      ItemStack var7 = this.field25570.getStack();
      if (var7.isEmpty()
         || !var4.isEmpty()
            && !var5.isEmpty()
            && this.field25565.get() > 0
            && (this.field25565.get() < Class2154.field14124 - Class2154.field14125 || !var6.isEmpty())) {
         if (!var6.isEmpty() && var6.getItem() instanceof Class3286) {
            CompoundNBT var8 = var4.method32144("BlockEntityTag");
            boolean var9 = var8.contains("Patterns", 9) && !var4.isEmpty() && var8.getList("Patterns", 10).size() >= 6;
            if (!var9) {
               this.field25565.method15235(((Class3286)var6.getItem()).method11821().ordinal());
            } else {
               this.field25565.method15235(0);
            }
         }
      } else {
         this.field25570.putStack(ItemStack.EMPTY);
         this.field25565.method15235(0);
      }

      this.method18246();
      this.detectAndSendChanges();
   }

   public void method18245(Runnable var1) {
      this.field25566 = var1;
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 != this.field25570.slotNumber) {
            if (var2 != this.field25568.slotNumber && var2 != this.field25567.slotNumber && var2 != this.field25569.slotNumber) {
               if (var7.getItem() instanceof Class3301) {
                  if (!this.mergeItemStack(var7, this.field25567.slotNumber, this.field25567.slotNumber + 1, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var7.getItem() instanceof Class3321) {
                  if (!this.mergeItemStack(var7, this.field25568.slotNumber, this.field25568.slotNumber + 1, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var7.getItem() instanceof Class3286) {
                  if (!this.mergeItemStack(var7, this.field25569.slotNumber, this.field25569.slotNumber + 1, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var2 >= 4 && var2 < 31) {
                  if (!this.mergeItemStack(var7, 31, 40, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var2 >= 31 && var2 < 40 && !this.mergeItemStack(var7, 4, 31, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 4, 40, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.mergeItemStack(var7, 4, 40, true)) {
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

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25564.method31716((var2, var3) -> this.clearContainer(var1, var1.world, this.field25572));
   }

   private void method18246() {
      if (this.field25565.get() > 0) {
         ItemStack var3 = this.field25567.getStack();
         ItemStack var4 = this.field25568.getStack();
         ItemStack var5 = ItemStack.EMPTY;
         if (!var3.isEmpty() && !var4.isEmpty()) {
            var5 = var3.copy();
            var5.setCount(1);
            Class2154 var6 = Class2154.values()[this.field25565.get()];
            DyeColor var7 = ((Class3321)var4.getItem()).method11876();
            CompoundNBT var8 = var5.method32144("BlockEntityTag");
            ListNBT var9;
            if (!var8.contains("Patterns", 9)) {
               var9 = new ListNBT();
               var8.put("Patterns", var9);
            } else {
               var9 = var8.getList("Patterns", 10);
            }

            CompoundNBT var10 = new CompoundNBT();
            var10.putString("Pattern", var6.method8871());
            var10.putInt("Color", var7.method309());
            var9.add(var10);
         }

         if (!ItemStack.areItemStacksEqual(var5, this.field25570.getStack())) {
            this.field25570.putStack(var5);
         }
      }
   }

   public Slot method18247() {
      return this.field25567;
   }

   public Slot method18248() {
      return this.field25568;
   }

   public Slot method18249() {
      return this.field25569;
   }

   public Slot method18250() {
      return this.field25570;
   }

   // $VF: synthetic method
   public static Runnable method18253(Class5837 var0) {
      return var0.field25566;
   }

   // $VF: synthetic method
   public static Slot method18254(Class5837 var0) {
      return var0.field25567;
   }

   // $VF: synthetic method
   public static Slot method18255(Class5837 var0) {
      return var0.field25568;
   }

   // $VF: synthetic method
   public static IntReferenceHolder method18256(Class5837 var0) {
      return var0.field25565;
   }

   // $VF: synthetic method
   public static long method18257(Class5837 var0) {
      return var0.field25571;
   }

   // $VF: synthetic method
   public static long method18258(Class5837 var0, long var1) {
      return var0.field25571 = var1;
   }
}
