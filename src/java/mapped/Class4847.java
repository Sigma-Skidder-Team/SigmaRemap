package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public abstract class Class4847 implements IRecipe<IInventory> {
   public final IRecipeType<?> field22630;
   public final ResourceLocation field22631;
   public final String field22632;
   public final Class120 field22633;
   public final ItemStack field22634;
   public final float field22635;
   public final int field22636;

   public Class4847(IRecipeType<?> var1, ResourceLocation var2, String var3, Class120 var4, ItemStack var5, float var6, int var7) {
      this.field22630 = var1;
      this.field22631 = var2;
      this.field22632 = var3;
      this.field22633 = var4;
      this.field22634 = var5;
      this.field22635 = var6;
      this.field22636 = var7;
   }

   @Override
   public boolean matches(IInventory var1, World var2) {
      return this.field22633.test(var1.getStackInSlot(0));
   }

   @Override
   public ItemStack method14962(IInventory var1) {
      return this.field22634.copy();
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return true;
   }

   @Override
   public NonNullList<Class120> method14969() {
      NonNullList var3 = NonNullList.create();
      var3.add(this.field22633);
      return var3;
   }

   public float method14976() {
      return this.field22635;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return this.field22634;
   }

   @Override
   public String method14970() {
      return this.field22632;
   }

   public int method14977() {
      return this.field22636;
   }

   @Override
   public ResourceLocation getId() {
      return this.field22631;
   }

   @Override
   public IRecipeType<?> getType() {
      return this.field22630;
   }
}
