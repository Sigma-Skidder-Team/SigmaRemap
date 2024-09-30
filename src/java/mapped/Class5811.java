package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.world.World;

import java.util.List;

public class Class5811 extends Container {
   private static String[] field25455;
   private final IWorldPosCallable field25456;
   private final IntReferenceHolder field25457 = IntReferenceHolder.method15238();
   private final World field25458;
   private List<Class4845> field25459 = Lists.newArrayList();
   private ItemStack field25460 = ItemStack.EMPTY;
   private long field25461;
   public final Slot field25462;
   public final Slot field25463;
   private Runnable field25464 = () -> {
   };
   public final IInventory field25465 = new Class977(this, 1);
   private final Class921 field25466 = new Class921();

   public Class5811(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5811(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.STONECUTTER, var1);
      this.field25456 = var3;
      this.field25458 = var2.field5444.world;
      this.field25462 = this.addSlot(new Slot(this.field25465, 0, 20, 33));
      this.field25463 = this.addSlot(new Class5850(this, this.field25466, 1, 143, 33, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.addSlot(new Slot(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.addSlot(new Slot(var2, var8, 8 + var8 * 18, 142));
      }

      this.trackInt(this.field25457);
   }

   public int method18099() {
      return this.field25457.get();
   }

   public List<Class4845> method18100() {
      return this.field25459;
   }

   public int method18101() {
      return this.field25459.size();
   }

   public boolean method18102() {
      return this.field25462.getHasStack() && !this.field25459.isEmpty();
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return isWithinUsableDistance(this.field25456, var1, Blocks.STONECUTTER);
   }

   @Override
   public boolean enchantItem(PlayerEntity var1, int var2) {
      if (this.method18105(var2)) {
         this.field25457.method15235(var2);
         this.method18108();
      }

      return true;
   }

   private boolean method18105(int var1) {
      return var1 >= 0 && var1 < this.field25459.size();
   }

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      ItemStack var4 = this.field25462.getStack();
      if (var4.getItem() != this.field25460.getItem()) {
         this.field25460 = var4.copy();
         this.method18107(var1, var4);
      }
   }

   private void method18107(IInventory var1, ItemStack var2) {
      this.field25459.clear();
      this.field25457.method15235(-1);
      this.field25463.putStack(ItemStack.EMPTY);
      if (!var2.isEmpty()) {
         this.field25459 = this.field25458.method6816().<IInventory, Class4845>method1032(Class7207.field30940, var1, this.field25458);
      }
   }

   private void method18108() {
      if (!this.field25459.isEmpty() && this.method18105(this.field25457.get())) {
         Class4845 var3 = this.field25459.get(this.field25457.get());
         this.field25466.method3636(var3);
         this.field25463.putStack(var3.method14962(this.field25465));
      } else {
         this.field25463.putStack(ItemStack.EMPTY);
      }

      this.detectAndSendChanges();
   }

   @Override
   public ContainerType<?> getType() {
      return ContainerType.STONECUTTER;
   }

   public void method18110(Runnable var1) {
      this.field25464 = var1;
   }

   @Override
   public boolean canMergeSlot(ItemStack var1, Slot var2) {
      return var2.field25578 != this.field25466 && super.canMergeSlot(var1, var2);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         Item var8 = var7.getItem();
         var5 = var7.copy();
         if (var2 != 1) {
            if (var2 != 0) {
               if (!this.field25458.method6816().<IInventory, Class4845>method1030(Class7207.field30940, new Class927(var7), this.field25458).isPresent()) {
                  if (var2 >= 2 && var2 < 29) {
                     if (!this.mergeItemStack(var7, 29, 38, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= 29 && var2 < 38 && !this.mergeItemStack(var7, 2, 29, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.mergeItemStack(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.mergeItemStack(var7, 2, 38, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            var8.method11725(var7, var1.world, var1);
            if (!this.mergeItemStack(var7, 2, 38, true)) {
               return ItemStack.EMPTY;
            }

            var6.onSlotChange(var7, var5);
         }

         if (var7.isEmpty()) {
            var6.putStack(ItemStack.EMPTY);
         }

         var6.onSlotChanged();
         if (var7.getCount() == var5.getCount()) {
            return ItemStack.EMPTY;
         }

         var6.onTake(var1, var7);
         this.detectAndSendChanges();
      }

      return var5;
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25466.removeStackFromSlot(1);
      this.field25456.method31716((var2, var3) -> this.clearContainer(var1, var1.world, this.field25465));
   }

   // $VF: synthetic method
   public static Runnable method18116(Class5811 var0) {
      return var0.field25464;
   }

   // $VF: synthetic method
   public static Class921 method18117(Class5811 var0) {
      return var0.field25466;
   }

   // $VF: synthetic method
   public static void method18118(Class5811 var0) {
      var0.method18108();
   }

   // $VF: synthetic method
   public static long method18119(Class5811 var0) {
      return var0.field25461;
   }

   // $VF: synthetic method
   public static long method18120(Class5811 var0, long var1) {
      return var0.field25461 = var1;
   }
}
