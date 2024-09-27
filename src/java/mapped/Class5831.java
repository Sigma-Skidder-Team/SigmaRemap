package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.world.World;

public abstract class Class5831 extends Class5828<IInventory> {
   private final IInventory field25551;
   private final Class8202 field25552;
   public final World field25553;
   private final Class7207<? extends Class4847> field25554;
   private final RecipeBookCategory field25555;

   public Class5831(ContainerType<?> var1, Class7207<? extends Class4847> var2, RecipeBookCategory var3, int var4, PlayerInventory var5) {
      this(var1, var2, var3, var4, var5, new Class927(3), new Class8206(4));
   }

   public Class5831(ContainerType<?> var1, Class7207<? extends Class4847> var2, RecipeBookCategory var3, int var4, PlayerInventory var5, IInventory var6, Class8202 var7) {
      super(var1, var4);
      this.field25554 = var2;
      this.field25555 = var3;
      assertInventorySize(var6, 3);
      assertIntArraySize(var7, 4);
      this.field25551 = var6;
      this.field25552 = var7;
      this.field25553 = var5.field5444.world;
      this.addSlot(new Slot(var6, 0, 56, 17));
      this.addSlot(new Class5858(this, var6, 1, 56, 53));
      this.addSlot(new Class5853(var5.field5444, var6, 2, 116, 35));

      for (int var10 = 0; var10 < 3; var10++) {
         for (int var11 = 0; var11 < 9; var11++) {
            this.addSlot(new Slot(var5, var11 + var10 * 9 + 9, 8 + var11 * 18, 84 + var10 * 18));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.addSlot(new Slot(var5, var12, 8 + var12 * 18, 142));
      }

      this.trackIntArray(var7);
   }

   @Override
   public void method18220(Class6207 var1) {
      if (this.field25551 instanceof Class925) {
         ((Class925)this.field25551).method3659(var1);
      }
   }

   @Override
   public void method18221() {
      this.field25551.method3625();
   }

   @Override
   public void method18219(boolean var1, IRecipe<?> var2, ServerPlayerEntity var3) {
      new Class1261(this).method5868(var3, var2, var1);
   }

   @Override
   public boolean method18222(IRecipe<? super IInventory> var1) {
      return var1.method14963(this.field25551, this.field25553);
   }

   @Override
   public int method18223() {
      return 2;
   }

   @Override
   public int method18224() {
      return 1;
   }

   @Override
   public int method18225() {
      return 1;
   }

   @Override
   public int method18226() {
      return 3;
   }

   @Override
   public boolean canInteractWith(PlayerEntity var1) {
      return this.field25551.isUsableByPlayer(var1);
   }

   @Override
   public ItemStack transferStackInSlot(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Slot var6 = this.inventorySlots.get(var2);
      if (var6 != null && var6.getHasStack()) {
         ItemStack var7 = var6.getStack();
         var5 = var7.copy();
         if (var2 != 2) {
            if (var2 != 1 && var2 != 0) {
               if (!this.method18234(var7)) {
                  if (!this.method18235(var7)) {
                     if (var2 >= 3 && var2 < 30) {
                        if (!this.mergeItemStack(var7, 30, 39, false)) {
                           return ItemStack.EMPTY;
                        }
                     } else if (var2 >= 30 && var2 < 39 && !this.mergeItemStack(var7, 3, 30, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.mergeItemStack(var7, 1, 2, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.mergeItemStack(var7, 0, 1, false)) {
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

   public boolean method18234(ItemStack var1) {
      return this.field25553.method6816().method1030(this.field25554, new Class927(var1), this.field25553).isPresent();
   }

   public boolean method18235(ItemStack var1) {
      return Class924.method3652(var1);
   }

   public int method18236() {
      int var3 = this.field25552.method28505(2);
      int var4 = this.field25552.method28505(3);
      return var4 != 0 && var3 != 0 ? var3 * 24 / var4 : 0;
   }

   public int method18237() {
      int var3 = this.field25552.method28505(1);
      if (var3 == 0) {
         var3 = 200;
      }

      return this.field25552.method28505(0) * 13 / var3;
   }

   public boolean method18238() {
      return this.field25552.method28505(0) > 0;
   }

   @Override
   public RecipeBookCategory method18227() {
      return this.field25555;
   }
}
