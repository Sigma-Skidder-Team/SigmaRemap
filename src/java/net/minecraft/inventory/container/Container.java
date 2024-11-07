package net.minecraft.inventory.container;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;

public abstract class Container {
   private final NonNullList<ItemStack> inventoryItemStacks = NonNullList.create();
   public final List<Slot> inventorySlots = Lists.newArrayList();
   private final List<IntReferenceHolder> trackedIntReferences = Lists.newArrayList();
   @Nullable
   private final ContainerType<?> containerType;
   public final int windowId;
   private short transactionID;
   private int dragMode = -1;
   private int dragEvent;
   private final Set<Slot> dragSlots = Sets.newHashSet();
   private final List<IContainerListener> listeners = Lists.newArrayList();
   private final Set<PlayerEntity> playerList = Sets.newHashSet();

   public Container(@Nullable ContainerType<?> var1, int var2) {
      this.containerType = var1;
      this.windowId = var2;
   }

   public static boolean isWithinUsableDistance(IWorldPosCallable var0, PlayerEntity var1, Block var2) {
      return var0.<Boolean>applyOrElse(
         (var2x, var3) -> var2x.getBlockState(var3).isIn(var2)
               ? var1.getDistanceSq((double)var3.getX() + 0.5D, (double)var3.getY() + 0.5D, (double)var3.getZ() + 0.5D) <= 64.0D
               : false,
         true
      );
   }

   public ContainerType<?> getType() {
      if (this.containerType != null) {
         return this.containerType;
      } else {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      }
   }

   public static void assertInventorySize(IInventory var0, int var1) {
      int var4 = var0.getSizeInventory();
      if (var4 < var1) {
         throw new IllegalArgumentException("Container size " + var4 + " is smaller than expected " + var1);
      }
   }

   public static void assertIntArraySize(Class8202 var0, int var1) {
      int var4 = var0.size();
      if (var4 < var1) {
         throw new IllegalArgumentException("Container data count " + var4 + " is smaller than expected " + var1);
      }
   }

   public Slot addSlot(Slot var1) {
      var1.slotNumber = this.inventorySlots.size();
      this.inventorySlots.add(var1);
      this.inventoryItemStacks.add(ItemStack.EMPTY);
      return var1;
   }

   public IntReferenceHolder trackInt(IntReferenceHolder var1) {
      this.trackedIntReferences.add(var1);
      return var1;
   }

   public void trackIntArray(Class8202 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.trackInt(IntReferenceHolder.create(var1, var4));
      }
   }

   public void addListener(IContainerListener var1) {
      if (!this.listeners.contains(var1)) {
         this.listeners.add(var1);
         var1.sendAllContents(this, this.getInventory());
         this.detectAndSendChanges();
      }
   }

   public void removeListener(IContainerListener var1) {
      this.listeners.remove(var1);
   }

   public NonNullList<ItemStack> getInventory() {
      NonNullList<ItemStack> nonnulllist = NonNullList.create();

      for (Slot inventorySlot : this.inventorySlots) {
         nonnulllist.add(inventorySlot.getStack());
      }

      return nonnulllist;
   }

   public void detectAndSendChanges() {
      for (int i = 0; i < this.inventorySlots.size(); i++) {
         ItemStack itemstack = this.inventorySlots.get(i).getStack();
         ItemStack itemstack1 = this.inventoryItemStacks.get(i);
         if (!ItemStack.areItemStacksEqual(itemstack1, itemstack)) {
            ItemStack itemstack2 = itemstack.copy();
            this.inventoryItemStacks.set(i, itemstack2);

            for (IContainerListener icontainerlistener : this.listeners) {
               icontainerlistener.sendSlotContents(this, i, itemstack2);
            }
         }
      }

      for (int j = 0; j < this.trackedIntReferences.size(); j++) {
         IntReferenceHolder intreferenceholder = this.trackedIntReferences.get(j);
         if (intreferenceholder.isDirty()) {
            for (IContainerListener icontainerlistener1 : this.listeners) {
               icontainerlistener1.sendWindowProperty(this, j, intreferenceholder.get());
            }
         }
      }
   }

   public boolean enchantItem(PlayerEntity var1, int var2) {
      return false;
   }

   public Slot getSlot(int var1) {
      return this.inventorySlots.get(var1);
   }

   public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
      Slot slot = this.inventorySlots.get(index);
      return slot != null ? slot.getStack() : ItemStack.EMPTY;
   }

   public ItemStack slotClick(int slotId, int dragType, ClickType clickTypeIn, PlayerEntity player) {
      try {
         return this.handleItemClick(slotId, dragType, clickTypeIn, player);
      }
      catch (Exception exception)
      {
         CrashReport crashreport = CrashReport.makeCrashReport(exception, "Container click");
         CrashReportCategory crashreportcategory = crashreport.makeCategory("Click info");
         crashreportcategory.addDetail("Menu Type", () ->
         {
            return this.containerType != null ? Registry.MENU.getKey(this.containerType).toString() : "<no type>";
         });
         crashreportcategory.addDetail("Menu Class", () ->
         {
            return this.getClass().getCanonicalName();
         });
         crashreportcategory.addDetail("Slot Count", this.inventorySlots.size());
         crashreportcategory.addDetail("Slot", slotId);
         crashreportcategory.addDetail("Button", dragType);
         crashreportcategory.addDetail("Type", clickTypeIn);
         throw new ReportedException(crashreport);
      }
   }

   private ItemStack handleItemClick(int slotIndex, int mouseButton, ClickType clickType, PlayerEntity player) {
      ItemStack itemstack = ItemStack.EMPTY;
      PlayerInventory playerinventory = player.inventory;

      if (clickType != ClickType.QUICK_CRAFT) {
         if (this.dragEvent != 0) {
            this.resetDrag();
         } else if ((clickType == ClickType.PICKUP || clickType == ClickType.QUICK_MOVE) && (mouseButton == 0 || mouseButton == 1)) {
            if (slotIndex != -999) {
               if (clickType != ClickType.QUICK_MOVE) {
                  if (slotIndex < 0) {
                     return ItemStack.EMPTY;
                  }

                  Slot clickedSlot = this.inventorySlots.get(slotIndex);
                  if (clickedSlot != null) {
                     ItemStack clickedStack = clickedSlot.getStack();
                     ItemStack heldStack = playerinventory.getItemStack();
                     if (!clickedStack.isEmpty()) {
                        itemstack = clickedStack.copy();
                     }

                     if (!clickedStack.isEmpty()) {
                        if (clickedSlot.canTakeStack(player)) {
                           if (!heldStack.isEmpty()) {
                              if (!clickedSlot.isItemValid(heldStack)) {
                                 if (heldStack.getMaxStackSize() > 1 && areItemsAndTagsEqual(clickedStack, heldStack) && !clickedStack.isEmpty()) {
                                    int availableStackSize = clickedStack.getCount();
                                    if (availableStackSize + heldStack.getCount() <= heldStack.getMaxStackSize()) {
                                       heldStack.grow(availableStackSize);
                                       clickedStack = clickedSlot.decrStackSize(availableStackSize);
                                       if (clickedStack.isEmpty()) {
                                          clickedSlot.putStack(ItemStack.EMPTY);
                                       }

                                       clickedSlot.onTake(player, playerinventory.getItemStack());
                                    }
                                 }
                              } else if (!areItemsAndTagsEqual(clickedStack, heldStack)) {
                                 if (heldStack.getCount() <= clickedSlot.getItemStackLimit(heldStack)) {
                                    clickedSlot.putStack(heldStack);
                                    playerinventory.setItemStack(clickedStack);
                                 }
                              } else {
                                 int transferCount = mouseButton != 0 ? 1 : heldStack.getCount();
                                 if (transferCount > clickedSlot.getItemStackLimit(heldStack) - clickedStack.getCount()) {
                                    transferCount = clickedSlot.getItemStackLimit(heldStack) - clickedStack.getCount();
                                 }

                                 if (transferCount > heldStack.getMaxStackSize() - clickedStack.getCount()) {
                                    transferCount = heldStack.getMaxStackSize() - clickedStack.getCount();
                                 }

                                 heldStack.shrink(transferCount);
                                 clickedStack.grow(transferCount);
                              }
                           } else if (!clickedStack.isEmpty()) {
                              int halfStack = mouseButton != 0 ? (clickedStack.getCount() + 1) / 2 : clickedStack.getCount();
                              playerinventory.setItemStack(clickedSlot.decrStackSize(halfStack));
                              if (clickedStack.isEmpty()) {
                                 clickedSlot.putStack(ItemStack.EMPTY);
                              }

                              clickedSlot.onTake(player, playerinventory.getItemStack());
                           } else {
                              clickedSlot.putStack(ItemStack.EMPTY);
                              playerinventory.setItemStack(ItemStack.EMPTY);
                           }
                        }
                     } else if (!heldStack.isEmpty() && clickedSlot.isItemValid(heldStack)) {
                        int stackLimit = mouseButton != 0 ? 1 : heldStack.getCount();
                        if (stackLimit > clickedSlot.getItemStackLimit(heldStack)) {
                           stackLimit = clickedSlot.getItemStackLimit(heldStack);
                        }

                        clickedSlot.putStack(heldStack.split(stackLimit));
                     }

                     clickedSlot.onSlotChanged();
                  }
               } else {
                  if (slotIndex < 0) {
                     return ItemStack.EMPTY;
                  }

                  Slot slot = this.inventorySlots.get(slotIndex);
                  if (slot == null || !slot.canTakeStack(player)) {
                     return ItemStack.EMPTY;
                  }

                  for (ItemStack transferredStack = this.transferStackInSlot(player, slotIndex);
                       !transferredStack.isEmpty() && ItemStack.areItemStacksEqual(slot.getStack(), transferredStack);
                       transferredStack = this.transferStackInSlot(player, slotIndex)
                  ) {
                     itemstack = transferredStack.copy();
                  }
               }
            } else if (!playerinventory.getItemStack().isEmpty()) {
               if (mouseButton == 0) {
                  player.dropItem(playerinventory.getItemStack(), true);
                  playerinventory.setItemStack(ItemStack.EMPTY);
               }

               if (mouseButton == 1) {
                  player.dropItem(playerinventory.getItemStack().split(1), true);
               }
            }
         } else if (clickType != ClickType.SWAP) {
            if (clickType == ClickType.CLONE && player.abilities.isCreativeMode && playerinventory.getItemStack().isEmpty() && slotIndex >= 0) {
               Slot slot = this.inventorySlots.get(slotIndex);
               if (slot != null && slot.getHasStack()) {
                  ItemStack copiedStack = slot.getStack().copy();
                  copiedStack.setCount(copiedStack.getMaxStackSize());
                  playerinventory.setItemStack(copiedStack);
               }
            } else if (clickType == ClickType.THROW && playerinventory.getItemStack().isEmpty() && slotIndex >= 0) {
               Slot slot = this.inventorySlots.get(slotIndex);
               if (slot != null && slot.getHasStack() && slot.canTakeStack(player)) {
                  ItemStack thrownStack = slot.decrStackSize(mouseButton != 0 ? slot.getStack().getCount() : 1);
                  slot.onTake(player, thrownStack);
                  player.dropItem(thrownStack, true);
               }
            } else if (clickType == ClickType.QUICK_MOVE_ALL && slotIndex >= 0) {
               Slot slot = this.inventorySlots.get(slotIndex);
               ItemStack heldStack = playerinventory.getItemStack();

               if (!heldStack.isEmpty() && (slot == null || !slot.getHasStack() || !slot.canTakeStack(player))) {
                  int startIndex = mouseButton != 0 ? this.inventorySlots.size() - 1 : 0;
                  int step = mouseButton != 0 ? -1 : 1;

                  for (int i = 0; i < 2; i++) {
                     for (int j = startIndex; j >= 0 && j < this.inventorySlots.size() && heldStack.getCount() < heldStack.getMaxStackSize(); j += step) {
                        Slot currentSlot = this.inventorySlots.get(j);
                        if (currentSlot.getHasStack() && canAddItemToSlot(currentSlot, heldStack, true) && currentSlot.canTakeStack(player) && this.canMergeSlot(heldStack, currentSlot)) {
                           ItemStack stackInSlot = currentSlot.getStack();
                           if (i != 0 || stackInSlot.getCount() != stackInSlot.getMaxStackSize()) {
                              int mergeCount = Math.min(heldStack.getMaxStackSize() - heldStack.getCount(), stackInSlot.getCount());
                              ItemStack removedStack = currentSlot.decrStackSize(mergeCount);
                              heldStack.grow(mergeCount);
                              if (removedStack.isEmpty()) {
                                 currentSlot.putStack(ItemStack.EMPTY);
                              }

                              currentSlot.onTake(player, removedStack);
                           }
                        }
                     }
                  }
               }

               this.detectAndSendChanges();
            }
         } else {
            Slot slot = this.inventorySlots.get(slotIndex);
            ItemStack stackInHotbar = playerinventory.getStackInSlot(mouseButton);
            ItemStack stackInSlot = slot.getStack();

            if (!stackInHotbar.isEmpty() || !stackInSlot.isEmpty()) {
               if (!stackInHotbar.isEmpty()) {
                  if (!stackInSlot.isEmpty()) {
                     if (slot.canTakeStack(player) && slot.isItemValid(stackInHotbar)) {
                        int slotLimit = slot.getItemStackLimit(stackInHotbar);

                        if (stackInHotbar.getCount() <= slotLimit) {
                           slot.putStack(stackInHotbar);
                           playerinventory.setInventorySlotContents(mouseButton, stackInSlot);
                           slot.onTake(player, stackInSlot);
                        } else {
                           slot.putStack(stackInHotbar.split(slotLimit));
                           slot.onTake(player, stackInSlot);
                           if (!playerinventory.method4045(stackInSlot)) {
                              player.dropItem(stackInSlot, true);
                           }
                        }

                     }
                  } else if (slot.isItemValid(stackInHotbar)) {
                     int slotLimit = slot.getItemStackLimit(stackInHotbar);

                     if (stackInHotbar.getCount() <= slotLimit) {
                        slot.putStack(stackInHotbar);
                        playerinventory.setInventorySlotContents(mouseButton, ItemStack.EMPTY);
                     } else {
                        slot.putStack(stackInHotbar.split(slotLimit));
                     }
                  }
               } else if (slot.canTakeStack(player)) {
                  playerinventory.setInventorySlotContents(mouseButton, stackInSlot);
                  slot.onSwapCraft(stackInSlot.getCount());
                  slot.putStack(ItemStack.EMPTY);
                  slot.onTake(player, stackInSlot);
               }
            }
         }
      } else {
         int previousDragState = this.dragEvent;
         this.dragEvent = getDragEvent(mouseButton);

         if ((previousDragState != 1 || this.dragEvent != 2) && previousDragState != this.dragEvent) {
            this.resetDrag();
         } else if (!playerinventory.getItemStack().isEmpty()) {
            if (this.dragEvent != 0) {
               if (this.dragEvent != 1) {
                  if (this.dragEvent != 2) {
                     this.resetDrag();
                  } else {
                     if (!this.dragSlots.isEmpty()) {
                        ItemStack draggedStack = playerinventory.getItemStack().copy();
                        int stackSize = playerinventory.getItemStack().getCount();

                        for (Slot slot : this.dragSlots) {
                           ItemStack stackInSlot = playerinventory.getItemStack();
                           if (slot != null
                              && canAddItemToSlot(slot, stackInSlot, true)
                              && slot.isItemValid(stackInSlot)
                              && (this.dragMode == 2 || stackInSlot.getCount() >= this.dragSlots.size())
                              && this.canDragIntoSlot(slot)) {
                              ItemStack modifiedStack = draggedStack.copy();
                              int currentStackSize = !slot.getHasStack() ? 0 : slot.getStack().getCount();
                              computeStackSize(this.dragSlots, this.dragMode, modifiedStack, currentStackSize);
                              int maxStackSize = Math.min(modifiedStack.getMaxStackSize(), slot.getItemStackLimit(modifiedStack));
                              if (modifiedStack.getCount() > maxStackSize) {
                                 modifiedStack.setCount(maxStackSize);
                              }

                              stackSize -= modifiedStack.getCount() - currentStackSize;
                              slot.putStack(modifiedStack);
                           }
                        }

                        draggedStack.setCount(stackSize);
                        playerinventory.setItemStack(draggedStack);
                     }

                     this.resetDrag();
                  }
               } else {
                  Slot draggedSlot = this.inventorySlots.get(slotIndex);
                  ItemStack draggedItemStack = playerinventory.getItemStack();
                  if (draggedSlot != null
                     && canAddItemToSlot(draggedSlot, draggedItemStack, true)
                     && draggedSlot.isItemValid(draggedItemStack)
                     && (this.dragMode == 2 || draggedItemStack.getCount() > this.dragSlots.size())
                     && this.canDragIntoSlot(draggedSlot)) {
                     this.dragSlots.add(draggedSlot);
                  }
               }
            } else {
               this.dragMode = extractDragMode(mouseButton);
               if (!isValidDragMode(this.dragMode, player)) {
                  this.resetDrag();
               } else {
                  this.dragEvent = 1;
                  this.dragSlots.clear();
               }
            }
         } else {
            this.resetDrag();
         }
      }

      return itemstack;
   }

   public static boolean areItemsAndTagsEqual(ItemStack var0, ItemStack var1) {
      return var0.getItem() == var1.getItem() && ItemStack.method32127(var0, var1);
   }

   public boolean canMergeSlot(ItemStack var1, Slot var2) {
      return true;
   }

   public void onContainerClosed(PlayerEntity var1) {
      PlayerInventory var4 = var1.inventory;
      if (!var4.getItemStack().isEmpty()) {
         var1.dropItem(var4.getItemStack(), false);
         var4.setItemStack(ItemStack.EMPTY);
      }
   }

   public void clearContainer(PlayerEntity var1, World var2, IInventory var3) {
      if (!var1.isAlive() || var1 instanceof ServerPlayerEntity && ((ServerPlayerEntity)var1).method2783()) {
         for (int var7 = 0; var7 < var3.getSizeInventory(); var7++) {
            var1.dropItem(var3.removeStackFromSlot(var7), false);
         }
      } else {
         for (int var6 = 0; var6 < var3.getSizeInventory(); var6++) {
            var1.inventory.method4047(var2, var3.removeStackFromSlot(var6));
         }
      }
   }

   public void onCraftMatrixChanged(IInventory var1) {
      this.detectAndSendChanges();
   }

   public void putStackInSlot(int var1, ItemStack var2) {
      this.getSlot(var1).putStack(var2);
   }

   public void setAll(List<ItemStack> var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.getSlot(var4).putStack((ItemStack)var1.get(var4));
      }
   }

   public void updateProgressBar(int var1, int var2) {
      this.trackedIntReferences.get(var1).method15235(var2);
   }

   public short getNextTransactionID(PlayerInventory var1) {
      this.transactionID++;
      return this.transactionID;
   }

   public boolean getCanCraft(PlayerEntity var1) {
      return !this.playerList.contains(var1);
   }

   public void setCanCraft(PlayerEntity var1, boolean var2) {
      if (!var2) {
         this.playerList.add(var1);
      } else {
         this.playerList.remove(var1);
      }
   }

   public abstract boolean canInteractWith(PlayerEntity var1);

   public boolean mergeItemStack(ItemStack var1, int var2, int var3, boolean var4) {
      boolean var7 = false;
      int var8 = var2;
      if (var4) {
         var8 = var3 - 1;
      }

      if (var1.method32114()) {
         while (!var1.isEmpty() && (!var4 ? var8 < var3 : var8 >= var2)) {
            Slot var9 = this.inventorySlots.get(var8);
            ItemStack var10 = var9.getStack();
            if (!var10.isEmpty() && areItemsAndTagsEqual(var1, var10)) {
               int var11 = var10.getCount() + var1.getCount();
               if (var11 > var1.getMaxStackSize()) {
                  if (var10.getCount() < var1.getMaxStackSize()) {
                     var1.shrink(var1.getMaxStackSize() - var10.getCount());
                     var10.setCount(var1.getMaxStackSize());
                     var9.onSlotChanged();
                     var7 = true;
                  }
               } else {
                  var1.setCount(0);
                  var10.setCount(var11);
                  var9.onSlotChanged();
                  var7 = true;
               }
            }

            if (!var4) {
               var8++;
            } else {
               var8--;
            }
         }
      }

      if (!var1.isEmpty()) {
         if (!var4) {
            var8 = var2;
         } else {
            var8 = var3 - 1;
         }

         while (!var4 ? var8 < var3 : var8 >= var2) {
            Slot var13 = this.inventorySlots.get(var8);
            ItemStack var14 = var13.getStack();
            if (var14.isEmpty() && var13.isItemValid(var1)) {
               if (var1.getCount() <= var13.getSlotStackLimit()) {
                  var13.putStack(var1.split(var1.getCount()));
               } else {
                  var13.putStack(var1.split(var13.getSlotStackLimit()));
               }

               var13.onSlotChanged();
               var7 = true;
               break;
            }

            if (!var4) {
               var8++;
            } else {
               var8--;
            }
         }
      }

      return var7;
   }

   public static int extractDragMode(int var0) {
      return var0 >> 2 & 3;
   }

   public static int getDragEvent(int var0) {
      return var0 & 3;
   }

   public static int getQuickcraftMask(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public static boolean isValidDragMode(int var0, PlayerEntity var1) {
      if (var0 != 0) {
         return var0 == 1 ? true : var0 == 2 && var1.abilities.isCreativeMode;
      } else {
         return true;
      }
   }

   public void resetDrag() {
      this.dragEvent = 0;
      this.dragSlots.clear();
   }

   public static boolean canAddItemToSlot(Slot var0, ItemStack var1, boolean var2) {
      boolean var5 = var0 == null || !var0.getHasStack();
      return !var5 && var1.method32132(var0.getStack()) && ItemStack.method32127(var0.getStack(), var1)
         ? var0.getStack().getCount() + (!var2 ? var1.getCount() : 0) <= var1.getMaxStackSize()
         : var5;
   }

   public static void computeStackSize(Set<Slot> var0, int var1, ItemStack var2, int var3) {
      switch (var1) {
         case 0:
            var2.setCount(MathHelper.floor((float)var2.getCount() / (float)var0.size()));
            break;
         case 1:
            var2.setCount(1);
            break;
         case 2:
            var2.setCount(var2.getItem().getMaxStackSize());
      }

      var2.grow(var3);
   }

   public boolean canDragIntoSlot(Slot var1) {
      return true;
   }

   public static int calcRedstone(TileEntity var0) {
      return !(var0 instanceof IInventory) ? 0 : calcRedstoneFromInventory((IInventory)var0);
   }

   public static int calcRedstoneFromInventory(IInventory var0) {
      if (var0 != null) {
         int var3 = 0;
         float var4 = 0.0F;

         for (int var5 = 0; var5 < var0.getSizeInventory(); var5++) {
            ItemStack var6 = var0.getStackInSlot(var5);
            if (!var6.isEmpty()) {
               var4 += (float)var6.getCount() / (float)Math.min(var0.getInventoryStackLimit(), var6.getMaxStackSize());
               var3++;
            }
         }

         var4 /= (float)var0.getSizeInventory();
         return MathHelper.floor(var4 * 14.0F) + (var3 <= 0 ? 0 : 1);
      } else {
         return 0;
      }
   }
}
