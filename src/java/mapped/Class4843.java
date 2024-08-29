package mapped;

public interface Class4843<C extends Class920> {
   boolean method14963(C var1, World var2);

   ItemStack method14962(C var1);

   boolean method14960(int var1, int var2);

   ItemStack getRecipeOutput();

   default NonNullList<ItemStack> method14968(C var1) {
      NonNullList var4 = NonNullList.<ItemStack>method68(var1.method3629(), ItemStack.EMPTY);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Item var6 = var1.method3618(var5).getItem();
         if (var6.method11723()) {
            var4.set(var5, new ItemStack(var6.method11722()));
         }
      }

      return var4;
   }

   default NonNullList<Class120> method14969() {
      return NonNullList.<Class120>create();
   }

   default boolean method14965() {
      return false;
   }

   default String method14970() {
      return "";
   }

   default ItemStack method14971() {
      return new ItemStack(Blocks.CRAFTING_TABLE);
   }

   ResourceLocation method14964();

   Class6504<?> method14961();

   Class7207<?> method14967();
}
