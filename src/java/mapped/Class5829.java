package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.world.World;

import java.util.Optional;

public class Class5829 extends Class5828<Class926> {
   private static String[] field25534;
   private final Class926 field25535 = new Class926(this, 3, 3);
   private final Class921 field25536 = new Class921();
   private final IWorldPosCallable field25537;
   private final PlayerEntity field25538;

   public Class5829(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5829(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.field35659, var1);
      this.field25537 = var3;
      this.field25538 = var2.field5444;
      this.addSlot(new Class5856(var2.field5444, this.field25535, this.field25536, 0, 124, 35));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 3; var7++) {
            this.addSlot(new Slot(this.field25535, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.addSlot(new Slot(var2, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.addSlot(new Slot(var2, var9, 8 + var9 * 18, 142));
      }
   }

   public static void method18228(int var0, World var1, PlayerEntity var2, Class926 var3, Class921 var4) {
      if (!var1.isRemote) {
         ServerPlayerEntity var7 = (ServerPlayerEntity)var2;
         ItemStack var8 = ItemStack.EMPTY;
         Optional var9 = var1.getServer().method1407().<Class926, Class4842>method1030(Class7207.field30935, var3, var1);
         if (var9.isPresent()) {
            Class4842 var10 = (Class4842)var9.get();
            if (var4.method3639(var1, var7, var10)) {
               var8 = var10.method14962(var3);
            }
         }

         var4.setInventorySlotContents(0, var8);
         var7.field4855.sendPacket(new SSetSlotPacket(var0, 0, var8));
      }
   }

   @Override
   public void onCraftMatrixChanged(IInventory var1) {
      this.field25537.method31716((var1x, var2) -> method18228(this.field25471, var1x, this.field25538, this.field25535, this.field25536));
   }

   @Override
   public void method18220(Class6207 var1) {
      this.field25535.method3659(var1);
   }

   @Override
   public void method18221() {
      this.field25535.method3625();
      this.field25536.method3625();
   }

   @Override
   public boolean method18222(IRecipe<? super Class926> var1) {
      return var1.method14963(this.field25535, this.field25538.world);
   }

   @Override
   public void onContainerClosed(PlayerEntity var1) {
      super.onContainerClosed(var1);
      this.field25537.method31716((var2, var3) -> this.clearContainer(var1, var2, this.field25535));
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return isWithinUsableDistance(this.field25537, var1, Blocks.CRAFTING_TABLE);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.field25468.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 != 0) {
            if (var2 >= 10 && var2 < 46) {
               if (!this.mergeItemStack(var7, 1, 10, false)) {
                  if (var2 >= 37) {
                     if (!this.mergeItemStack(var7, 10, 37, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.mergeItemStack(var7, 37, 46, false)) {
                     return ItemStack.EMPTY;
                  }
               }
            } else if (!this.mergeItemStack(var7, 10, 46, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            this.field25537.method31716((var2x, var3) -> var7.getItem().method11725(var7, var2x, var1));
            if (!this.mergeItemStack(var7, 10, 46, true)) {
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

         ItemStack var8 = var6.onTake(var1, var7);
         if (var2 == 0) {
            var1.method2882(var8, false);
         }
      }

      return var5;
   }

   @Override
   public boolean canMergeSlot(ItemStack var1, Slot var2) {
      return var2.field25578 != this.field25536 && super.canMergeSlot(var1, var2);
   }

   @Override
   public int method18223() {
      return 0;
   }

   @Override
   public int method18224() {
      return this.field25535.method3671();
   }

   @Override
   public int method18225() {
      return this.field25535.method3670();
   }

   @Override
   public int method18226() {
      return 10;
   }

   @Override
   public RecipeBookCategory method18227() {
      return RecipeBookCategory.field12599;
   }
}
