package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public abstract class Class4844 implements IRecipe<IInventory> {
   public final Class120 field22618;
   public final ItemStack field22619;
   private final Class7207<?> field22620;
   private final Class6504<?> field22621;
   public final ResourceLocation field22622;
   public final String field22623;

   public Class4844(Class7207<?> var1, Class6504<?> var2, ResourceLocation var3, String var4, Class120 var5, ItemStack var6) {
      this.field22620 = var1;
      this.field22621 = var2;
      this.field22622 = var3;
      this.field22623 = var4;
      this.field22618 = var5;
      this.field22619 = var6;
   }

   @Override
   public Class7207<?> method14967() {
      return this.field22620;
   }

   @Override
   public Class6504<?> method14961() {
      return this.field22621;
   }

   @Override
   public ResourceLocation getId() {
      return this.field22622;
   }

   @Override
   public String method14970() {
      return this.field22623;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return this.field22619;
   }

   @Override
   public NonNullList<Class120> method14969() {
      NonNullList var3 = NonNullList.create();
      var3.add(this.field22618);
      return var3;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return true;
   }

   @Override
   public ItemStack method14962(IInventory var1) {
      return this.field22619.copy();
   }
}
