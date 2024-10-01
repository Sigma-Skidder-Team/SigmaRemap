package mapped;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.stats.Stats;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.registry.Registry;

import java.util.List;
import java.util.Random;

public class Class5822 extends Container {
   private static String[] field25504;
   private final IInventory field25505 = new Class983(this, 2);
   private final IWorldPosCallable field25506;
   private final Random field25507 = new Random();
   private final IntReferenceHolder field25508 = IntReferenceHolder.method15238();
   public final int[] field25509 = new int[3];
   public final int[] field25510 = new int[]{-1, -1, -1};
   public final int[] field25511 = new int[]{-1, -1, -1};

   public Class5822(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5822(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.ENCHANTMENT, var1);
      this.field25506 = var3;
      this.addSlot(new Class5842(this, this.field25505, 0, 15, 47));
      this.addSlot(new Class5865(this, this.field25505, 1, 35, 47));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.addSlot(new Slot(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.addSlot(new Slot(var2, var8, 8 + var8 * 18, 142));
      }

      this.trackInt(IntReferenceHolder.method15237(this.field25509, 0));
      this.trackInt(IntReferenceHolder.method15237(this.field25509, 1));
      this.trackInt(IntReferenceHolder.method15237(this.field25509, 2));
      this.trackInt(this.field25508).method15235(var2.field5444.method2929());
      this.trackInt(IntReferenceHolder.method15237(this.field25510, 0));
      this.trackInt(IntReferenceHolder.method15237(this.field25510, 1));
      this.trackInt(IntReferenceHolder.method15237(this.field25510, 2));
      this.trackInt(IntReferenceHolder.method15237(this.field25511, 0));
      this.trackInt(IntReferenceHolder.method15237(this.field25511, 1));
      this.trackInt(IntReferenceHolder.method15237(this.field25511, 2));
   }

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      if (var1 == this.field25505) {
         ItemStack var4 = var1.getStackInSlot(0);
         if (!var4.isEmpty() && var4.method32161()) {
            this.field25506.method31716((var2, var3) -> {
               int var6 = 0;

               for (int var7 = -1; var7 <= 1; var7++) {
                  for (int var8 = -1; var8 <= 1; var8++) {
                     if ((var7 != 0 || var8 != 0) && var2.method7007(var3.add(var8, 0, var7)) && var2.method7007(var3.add(var8, 1, var7))) {
                        if (var2.getBlockState(var3.add(var8 * 2, 0, var7 * 2)).isIn(Blocks.field36525)) {
                           var6++;
                        }

                        if (var2.getBlockState(var3.add(var8 * 2, 1, var7 * 2)).isIn(Blocks.field36525)) {
                           var6++;
                        }

                        if (var8 != 0 && var7 != 0) {
                           if (var2.getBlockState(var3.add(var8 * 2, 0, var7)).isIn(Blocks.field36525)) {
                              var6++;
                           }

                           if (var2.getBlockState(var3.add(var8 * 2, 1, var7)).isIn(Blocks.field36525)) {
                              var6++;
                           }

                           if (var2.getBlockState(var3.add(var8, 0, var7 * 2)).isIn(Blocks.field36525)) {
                              var6++;
                           }

                           if (var2.getBlockState(var3.add(var8, 1, var7 * 2)).isIn(Blocks.field36525)) {
                              var6++;
                           }
                        }
                     }
                  }
               }

               this.field25507.setSeed((long)this.field25508.get());

               for (int var10 = 0; var10 < 3; var10++) {
                  this.field25509[var10] = EnchantmentHelper.method26341(this.field25507, var10, var6, var4);
                  this.field25510[var10] = -1;
                  this.field25511[var10] = -1;
                  if (this.field25509[var10] < var10 + 1) {
                     this.field25509[var10] = 0;
                  }
               }

               for (int var11 = 0; var11 < 3; var11++) {
                  if (this.field25509[var11] > 0) {
                     List var12 = this.method18183(var4, var11, this.field25509[var11]);
                     if (var12 != null && !var12.isEmpty()) {
                        Class6694 var9 = (Class6694)var12.get(this.field25507.nextInt(var12.size()));
                        this.field25510[var11] = Registry.ENCHANTMENT.getId(var9.field29316);
                        this.field25511[var11] = var9.field29317;
                     }
                  }
               }

               this.detectAndSendChanges();
            });
         } else {
            for (int var5 = 0; var5 < 3; var5++) {
               this.field25509[var5] = 0;
               this.field25510[var5] = -1;
               this.field25511[var5] = -1;
            }
         }
      }
   }

   @Override
   public boolean enchantItem(PlayerEntity var1, int var2) {
      ItemStack var5 = this.field25505.getStackInSlot(0);
      ItemStack var6 = this.field25505.getStackInSlot(1);
      int var7 = var2 + 1;
      if ((var6.isEmpty() || var6.getCount() < var7) && !var1.abilities.isCreativeMode) {
         return false;
      } else if (this.field25509[var2] > 0
         && !var5.isEmpty()
         && (var1.field4920 >= var7 && var1.field4920 >= this.field25509[var2] || var1.abilities.isCreativeMode)) {
         this.field25506.method31716((var6x, var7x) -> {
            ItemStack var10 = var5;
            List var11 = this.method18183(var5, var2, this.field25509[var2]);
            if (!var11.isEmpty()) {
               var1.method2728(var5, var7);
               boolean var12 = var5.getItem() == Items.field37900;
               if (var12) {
                  var10 = new ItemStack(Items.field38070);
                  CompoundNBT var13 = var5.method32142();
                  if (var13 != null) {
                     var10.method32148(var13.method79());
                  }

                  this.field25505.setInventorySlotContents(0, var10);
               }

               for (int var15 = 0; var15 < var11.size(); var15++) {
                  Class6694 var14 = (Class6694)var11.get(var15);
                  if (!var12) {
                     var10.method32162(var14.field29316, var14.field29317);
                  } else {
                     Class3290.method11831(var10, var14);
                  }
               }

               if (!var1.abilities.isCreativeMode) {
                  var6.shrink(var7);
                  if (var6.isEmpty()) {
                     this.field25505.setInventorySlotContents(1, ItemStack.EMPTY);
                  }
               }

               var1.method2911(Stats.field40157);
               if (var1 instanceof ServerPlayerEntity) {
                  CriteriaTriggers.field44473.method15177((ServerPlayerEntity)var1, var10, var7);
               }

               this.field25505.markDirty();
               this.field25508.method15235(var1.method2929());
               this.onCraftMatrixChanged(this.field25505);
               var6x.method6742((PlayerEntity)null, var7x, SoundEvents.field26533, Class2266.field14732, 1.0F, var6x.rand.nextFloat() * 0.1F + 0.9F);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   private List<Class6694> method18183(ItemStack var1, int var2, int var3) {
      this.field25507.setSeed((long)(this.field25508.get() + var2));
      List var6 = EnchantmentHelper.method26343(this.field25507, var1, var3, false);
      if (var1.getItem() == Items.field37900 && var6.size() > 1) {
         var6.remove(this.field25507.nextInt(var6.size()));
      }

      return var6;
   }

   public int method18184() {
      ItemStack var3 = this.field25505.getStackInSlot(1);
      return !var3.isEmpty() ? var3.getCount() : 0;
   }

   public int method18185() {
      return this.field25508.get();
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25506.method31716((var2, var3) -> this.clearContainer(var1, var1.world, this.field25505));
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return isWithinUsableDistance(this.field25506, var1, Blocks.ENCHANTING_TABLE);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 != 0) {
            if (var2 != 1) {
               if (var7.getItem() != Items.field37917) {
                  if (this.inventorySlots.get(0).getHasStack() || !this.inventorySlots.get(0).isItemValid(var7)) {
                     return ItemStack.EMPTY;
                  }

                  ItemStack var8 = var7.copy();
                  var8.setCount(1);
                  var7.shrink(1);
                  this.inventorySlots.get(0).putStack(var8);
               } else if (!this.mergeItemStack(var7, 1, 2, true)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 2, 38, true)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.mergeItemStack(var7, 2, 38, true)) {
            return ItemStack.EMPTY;
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
}
