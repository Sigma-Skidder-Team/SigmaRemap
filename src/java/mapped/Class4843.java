package mapped;

public interface Class4843<C extends Class920> {
   boolean method14963(C var1, World var2);

   ItemStack method14962(C var1);

   boolean method14960(int var1, int var2);

   ItemStack method14966();

   default Class25<ItemStack> method14968(C var1) {
      Class25 var4 = Class25.<ItemStack>method68(var1.method3629(), ItemStack.EMPTY);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class3257 var6 = var1.method3618(var5).method32107();
         if (var6.method11723()) {
            var4.set(var5, new ItemStack(var6.method11722()));
         }
      }

      return var4;
   }

   default Class25<Class120> method14969() {
      return Class25.<Class120>method67();
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
