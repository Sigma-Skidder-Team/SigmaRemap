package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;
import java.util.Set;

public abstract class Container {
   private final NonNullList<ItemStack> field25467 = NonNullList.<ItemStack>create();
   public final List<Slot> field25468 = Lists.newArrayList();
   private final List<Class4923> field25469 = Lists.newArrayList();
   private final ContainerType<?> field25470;
   public final int field25471;
   private short field25472;
   private int field25473 = -1;
   private int field25474;
   private final Set<Slot> field25475 = Sets.newHashSet();
   private final List<Class876> field25476 = Lists.newArrayList();
   private final Set<PlayerEntity> field25477 = Sets.newHashSet();

   public Container(ContainerType<?> var1, int var2) {
      this.field25470 = var1;
      this.field25471 = var2;
   }

   public static boolean isWithinUsableDistance(IWorldPosCallable var0, PlayerEntity var1, Block var2) {
      return var0.<Boolean>method31715(
         (var2x, var3) -> var2x.getBlockState(var3).isIn(var2)
               ? var1.getDistanceNearest((double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5) <= 64.0
               : false,
         true
      );
   }

   public ContainerType<?> getType() {
      if (this.field25470 != null) {
         return this.field25470;
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
      int var4 = var0.method28507();
      if (var4 < var1) {
         throw new IllegalArgumentException("Container data count " + var4 + " is smaller than expected " + var1);
      }
   }

   public Slot addSlot(Slot var1) {
      var1.field25579 = this.field25468.size();
      this.field25468.add(var1);
      this.field25467.add(ItemStack.EMPTY);
      return var1;
   }

   public Class4923 trackInt(Class4923 var1) {
      this.field25469.add(var1);
      return var1;
   }

   public void trackIntArray(Class8202 var1) {
      for (int var4 = 0; var4 < var1.method28507(); var4++) {
         this.trackInt(Class4923.method15236(var1, var4));
      }
   }

   public void addListener(Class876 var1) {
      if (!this.field25476.contains(var1)) {
         this.field25476.add(var1);
         var1.method2718(this, this.getInventory());
         this.detectAndSendChanges();
      }
   }

   public void removeListener(Class876 var1) {
      this.field25476.remove(var1);
   }

   public NonNullList<ItemStack> getInventory() {
      NonNullList var3 = NonNullList.create();

      for (int var4 = 0; var4 < this.field25468.size(); var4++) {
         var3.add(this.field25468.get(var4).getStack());
      }

      return var3;
   }

   public void detectAndSendChanges() {
      for (int var3 = 0; var3 < this.field25468.size(); var3++) {
         ItemStack var4 = this.field25468.get(var3).getStack();
         ItemStack var5 = this.field25467.get(var3);
         if (!ItemStack.method32128(var5, var4)) {
            ItemStack var6 = var4.copy();
            this.field25467.set(var3, var6);

            for (Class876 var8 : this.field25476) {
               var8.method2720(this, var3, var6);
            }
         }
      }

      for (int var9 = 0; var9 < this.field25469.size(); var9++) {
         Class4923 var10 = this.field25469.get(var9);
         if (var10.method15239()) {
            for (Class876 var12 : this.field25476) {
               var12.method2719(this, var9, var10.method15234());
            }
         }
      }
   }

   public boolean enchantItem(PlayerEntity var1, int var2) {
      return false;
   }

   public Slot getSlot(int var1) {
      return this.field25468.get(var1);
   }

   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      Slot var5 = this.field25468.get(var2);
      return var5 == null ? ItemStack.EMPTY : var5.getStack();
   }

   public ItemStack slotClick(int var1, int var2, ClickType var3, PlayerEntity var4) {
      try {
         return this.func_241440_b_(var1, var2, var3, var4);
      } catch (Exception var10) {
         CrashReport var8 = CrashReport.makeCrashReport(var10, "Container click");
         CrashReportCategory var9 = var8.makeCategory("Click info");
         var9.addDetail("Menu Type", () -> this.field25470 == null ? "<no type>" : Registry.field16084.getKey(this.field25470).toString());
         var9.addDetail("Menu Class", () -> this.getClass().getCanonicalName());
         var9.addDetail("Slot Count", this.field25468.size());
         var9.addDetail("Slot", var1);
         var9.addDetail("Button", var2);
         var9.addDetail("Type", var3);
         throw new ReportedException(var8);
      }
   }

   private ItemStack func_241440_b_(int var1, int var2, ClickType var3, PlayerEntity var4) {
      ItemStack var7 = ItemStack.EMPTY;
      PlayerInventory var8 = var4.inventory;
      if (var3 != ClickType.field14699) {
         if (this.field25474 != 0) {
            this.resetDrag();
         } else if ((var3 == ClickType.PICKUP || var3 == ClickType.field14695) && (var2 == 0 || var2 == 1)) {
            if (var1 != -999) {
               if (var3 != ClickType.field14695) {
                  if (var1 < 0) {
                     return ItemStack.EMPTY;
                  }

                  Slot var24 = this.field25468.get(var1);
                  if (var24 != null) {
                     ItemStack var31 = var24.getStack();
                     ItemStack var36 = var8.method4057();
                     if (!var31.isEmpty()) {
                        var7 = var31.copy();
                     }

                     if (!var31.isEmpty()) {
                        if (var24.canTakeStack(var4)) {
                           if (!var36.isEmpty()) {
                              if (!var24.isItemValid(var36)) {
                                 if (var36.method32113() > 1 && areItemsAndTagsEqual(var31, var36) && !var31.isEmpty()) {
                                    int var40 = var31.getCount();
                                    if (var40 + var36.getCount() <= var36.method32113()) {
                                       var36.method32181(var40);
                                       var31 = var24.decrStackSize(var40);
                                       if (var31.isEmpty()) {
                                          var24.putStack(ItemStack.EMPTY);
                                       }

                                       var24.onTake(var4, var8.method4057());
                                    }
                                 }
                              } else if (!areItemsAndTagsEqual(var31, var36)) {
                                 if (var36.getCount() <= var24.getItemStackLimit(var36)) {
                                    var24.putStack(var36);
                                    var8.method4056(var31);
                                 }
                              } else {
                                 int var41 = var2 != 0 ? 1 : var36.getCount();
                                 if (var41 > var24.getItemStackLimit(var36) - var31.getCount()) {
                                    var41 = var24.getItemStackLimit(var36) - var31.getCount();
                                 }

                                 if (var41 > var36.method32113() - var31.getCount()) {
                                    var41 = var36.method32113() - var31.getCount();
                                 }

                                 var36.method32182(var41);
                                 var31.method32181(var41);
                              }
                           } else if (!var31.isEmpty()) {
                              int var42 = var2 != 0 ? (var31.getCount() + 1) / 2 : var31.getCount();
                              var8.method4056(var24.decrStackSize(var42));
                              if (var31.isEmpty()) {
                                 var24.putStack(ItemStack.EMPTY);
                              }

                              var24.onTake(var4, var8.method4057());
                           } else {
                              var24.putStack(ItemStack.EMPTY);
                              var8.method4056(ItemStack.EMPTY);
                           }
                        }
                     } else if (!var36.isEmpty() && var24.isItemValid(var36)) {
                        int var43 = var2 != 0 ? 1 : var36.getCount();
                        if (var43 > var24.getItemStackLimit(var36)) {
                           var43 = var24.getItemStackLimit(var36);
                        }

                        var24.putStack(var36.method32106(var43));
                     }

                     var24.onSlotChanged();
                  }
               } else {
                  if (var1 < 0) {
                     return ItemStack.EMPTY;
                  }

                  Slot var23 = this.field25468.get(var1);
                  if (var23 == null || !var23.canTakeStack(var4)) {
                     return ItemStack.EMPTY;
                  }

                  for (ItemStack var30 = this.transferStackInSlot(var4, var1);
                       !var30.isEmpty() && ItemStack.method32130(var23.getStack(), var30);
                       var30 = this.transferStackInSlot(var4, var1)
                  ) {
                     var7 = var30.copy();
                  }
               }
            } else if (!var8.method4057().isEmpty()) {
               if (var2 == 0) {
                  var4.method2882(var8.method4057(), true);
                  var8.method4056(ItemStack.EMPTY);
               }

               if (var2 == 1) {
                  var4.method2882(var8.method4057().method32106(1), true);
               }
            }
         } else if (var3 != ClickType.field14696) {
            if (var3 == ClickType.field14697 && var4.abilities.isCreativeMode && var8.method4057().isEmpty() && var1 >= 0) {
               Slot var21 = this.field25468.get(var1);
               if (var21 != null && var21.getHasStack()) {
                  ItemStack var28 = var21.getStack().copy();
                  var28.method32180(var28.method32113());
                  var8.method4056(var28);
               }
            } else if (var3 == ClickType.field14698 && var8.method4057().isEmpty() && var1 >= 0) {
               Slot var20 = this.field25468.get(var1);
               if (var20 != null && var20.getHasStack() && var20.canTakeStack(var4)) {
                  ItemStack var27 = var20.decrStackSize(var2 != 0 ? var20.getStack().getCount() : 1);
                  var20.onTake(var4, var27);
                  var4.method2882(var27, true);
               }
            } else if (var3 == ClickType.field14700 && var1 >= 0) {
               Slot var19 = this.field25468.get(var1);
               ItemStack var26 = var8.method4057();
               if (!var26.isEmpty() && (var19 == null || !var19.getHasStack() || !var19.canTakeStack(var4))) {
                  int var34 = var2 != 0 ? this.field25468.size() - 1 : 0;
                  int var37 = var2 != 0 ? -1 : 1;

                  for (int var44 = 0; var44 < 2; var44++) {
                     for (int var45 = var34; var45 >= 0 && var45 < this.field25468.size() && var26.getCount() < var26.method32113(); var45 += var37) {
                        Slot var46 = this.field25468.get(var45);
                        if (var46.getHasStack() && canAddItemToSlot(var46, var26, true) && var46.canTakeStack(var4) && this.canMergeSlot(var26, var46)) {
                           ItemStack var47 = var46.getStack();
                           if (var44 != 0 || var47.getCount() != var47.method32113()) {
                              int var48 = Math.min(var26.method32113() - var26.getCount(), var47.getCount());
                              ItemStack var18 = var46.decrStackSize(var48);
                              var26.method32181(var48);
                              if (var18.isEmpty()) {
                                 var46.putStack(ItemStack.EMPTY);
                              }

                              var46.onTake(var4, var18);
                           }
                        }
                     }
                  }
               }

               this.detectAndSendChanges();
            }
         } else {
            Slot var22 = this.field25468.get(var1);
            ItemStack var29 = var8.getStackInSlot(var2);
            ItemStack var35 = var22.getStack();
            if (!var29.isEmpty() || !var35.isEmpty()) {
               if (!var29.isEmpty()) {
                  if (!var35.isEmpty()) {
                     if (var22.canTakeStack(var4) && var22.isItemValid(var29)) {
                        int var38 = var22.getItemStackLimit(var29);
                        if (var29.getCount() <= var38) {
                           var22.putStack(var29);
                           var8.setInventorySlotContents(var2, var35);
                           var22.onTake(var4, var35);
                        } else {
                           var22.putStack(var29.method32106(var38));
                           var22.onTake(var4, var35);
                           if (!var8.method4045(var35)) {
                              var4.method2882(var35, true);
                           }
                        }
                     }
                  } else if (var22.isItemValid(var29)) {
                     int var39 = var22.getItemStackLimit(var29);
                     if (var29.getCount() <= var39) {
                        var22.putStack(var29);
                        var8.setInventorySlotContents(var2, ItemStack.EMPTY);
                     } else {
                        var22.putStack(var29.method32106(var39));
                     }
                  }
               } else if (var22.canTakeStack(var4)) {
                  var8.setInventorySlotContents(var2, var35);
                  var22.onSwapCraft(var35.getCount());
                  var22.putStack(ItemStack.EMPTY);
                  var22.onTake(var4, var35);
               }
            }
         }
      } else {
         int var9 = this.field25474;
         this.field25474 = getDragEvent(var2);
         if ((var9 != 1 || this.field25474 != 2) && var9 != this.field25474) {
            this.resetDrag();
         } else if (!var8.method4057().isEmpty()) {
            if (this.field25474 != 0) {
               if (this.field25474 != 1) {
                  if (this.field25474 != 2) {
                     this.resetDrag();
                  } else {
                     if (!this.field25475.isEmpty()) {
                        ItemStack var10 = var8.method4057().copy();
                        int var11 = var8.method4057().getCount();

                        for (Slot var13 : this.field25475) {
                           ItemStack var14 = var8.method4057();
                           if (var13 != null
                              && canAddItemToSlot(var13, var14, true)
                              && var13.isItemValid(var14)
                              && (this.field25473 == 2 || var14.getCount() >= this.field25475.size())
                              && this.canDragIntoSlot(var13)) {
                              ItemStack var15 = var10.copy();
                              int var16 = !var13.getHasStack() ? 0 : var13.getStack().getCount();
                              computeStackSize(this.field25475, this.field25473, var15, var16);
                              int var17 = Math.min(var15.method32113(), var13.getItemStackLimit(var15));
                              if (var15.getCount() > var17) {
                                 var15.method32180(var17);
                              }

                              var11 -= var15.getCount() - var16;
                              var13.putStack(var15);
                           }
                        }

                        var10.method32180(var11);
                        var8.method4056(var10);
                     }

                     this.resetDrag();
                  }
               } else {
                  Slot var25 = this.field25468.get(var1);
                  ItemStack var33 = var8.method4057();
                  if (var25 != null
                     && canAddItemToSlot(var25, var33, true)
                     && var25.isItemValid(var33)
                     && (this.field25473 == 2 || var33.getCount() > this.field25475.size())
                     && this.canDragIntoSlot(var25)) {
                     this.field25475.add(var25);
                  }
               }
            } else {
               this.field25473 = extractDragMode(var2);
               if (!isValidDragMode(this.field25473, var4)) {
                  this.resetDrag();
               } else {
                  this.field25474 = 1;
                  this.field25475.clear();
               }
            }
         } else {
            this.resetDrag();
         }
      }

      return var7;
   }

   public static boolean areItemsAndTagsEqual(ItemStack var0, ItemStack var1) {
      return var0.getItem() == var1.getItem() && ItemStack.method32127(var0, var1);
   }

   public boolean canMergeSlot(ItemStack var1, Slot var2) {
      return true;
   }

   public void onContainerClosed(PlayerEntity var1) {
      PlayerInventory var4 = var1.inventory;
      if (!var4.method4057().isEmpty()) {
         var1.method2882(var4.method4057(), false);
         var4.method4056(ItemStack.EMPTY);
      }
   }

   public void clearContainer(PlayerEntity var1, World var2, IInventory var3) {
      if (!var1.isAlive() || var1 instanceof ServerPlayerEntity && ((ServerPlayerEntity)var1).method2783()) {
         for (int var7 = 0; var7 < var3.getSizeInventory(); var7++) {
            var1.method2882(var3.removeStackFromSlot(var7), false);
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
      this.field25469.get(var1).method15235(var2);
   }

   public short getNextTransactionID(PlayerInventory var1) {
      this.field25472++;
      return this.field25472;
   }

   public boolean getCanCraft(PlayerEntity var1) {
      return !this.field25477.contains(var1);
   }

   public void setCanCraft(PlayerEntity var1, boolean var2) {
      if (!var2) {
         this.field25477.add(var1);
      } else {
         this.field25477.remove(var1);
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
            Slot var9 = this.field25468.get(var8);
            ItemStack var10 = var9.getStack();
            if (!var10.isEmpty() && areItemsAndTagsEqual(var1, var10)) {
               int var11 = var10.getCount() + var1.getCount();
               if (var11 > var1.method32113()) {
                  if (var10.getCount() < var1.method32113()) {
                     var1.method32182(var1.method32113() - var10.getCount());
                     var10.method32180(var1.method32113());
                     var9.onSlotChanged();
                     var7 = true;
                  }
               } else {
                  var1.method32180(0);
                  var10.method32180(var11);
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
            Slot var13 = this.field25468.get(var8);
            ItemStack var14 = var13.getStack();
            if (var14.isEmpty() && var13.isItemValid(var1)) {
               if (var1.getCount() <= var13.getSlotStackLimit()) {
                  var13.putStack(var1.method32106(var1.getCount()));
               } else {
                  var13.putStack(var1.method32106(var13.getSlotStackLimit()));
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
      this.field25474 = 0;
      this.field25475.clear();
   }

   public static boolean canAddItemToSlot(Slot var0, ItemStack var1, boolean var2) {
      boolean var5 = var0 == null || !var0.getHasStack();
      return !var5 && var1.method32132(var0.getStack()) && ItemStack.method32127(var0.getStack(), var1)
         ? var0.getStack().getCount() + (!var2 ? var1.getCount() : 0) <= var1.method32113()
         : var5;
   }

   public static void computeStackSize(Set<Slot> var0, int var1, ItemStack var2, int var3) {
      switch (var1) {
         case 0:
            var2.method32180(MathHelper.method37767((float)var2.getCount() / (float)var0.size()));
            break;
         case 1:
            var2.method32180(1);
            break;
         case 2:
            var2.method32180(var2.getItem().method11710());
      }

      var2.method32181(var3);
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
               var4 += (float)var6.getCount() / (float)Math.min(var0.getInventoryStackLimit(), var6.method32113());
               var3++;
            }
         }

         var4 /= (float)var0.getSizeInventory();
         return MathHelper.method37767(var4 * 14.0F) + (var3 <= 0 ? 0 : 1);
      } else {
         return 0;
      }
   }
}
