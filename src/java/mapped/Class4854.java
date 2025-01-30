package mapped;

import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4854 implements ICraftingRecipe {
   private static String[] field22647;
   private final ResourceLocation field22648;
   private final String field22649;
   private final ItemStack field22650;
   private final NonNullList<Ingredient> field22651;

   public Class4854(ResourceLocation var1, String var2, ItemStack var3, NonNullList<Ingredient> var4) {
      this.field22648 = var1;
      this.field22649 = var2;
      this.field22650 = var3;
      this.field22651 = var4;
   }

   @Override
   public ResourceLocation getId() {
      return this.field22648;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28471;
   }

   @Override
   public String method14970() {
      return this.field22649;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return this.field22650;
   }

   @Override
   public NonNullList<Ingredient> method14969() {
      return this.field22651;
   }

   public boolean matches(Class926 var1, World var2) {
      Class6207 var5 = new Class6207();
      int var6 = 0;

      for (int var7 = 0; var7 < var1.getSizeInventory(); var7++) {
         ItemStack var8 = var1.getStackInSlot(var7);
         if (!var8.isEmpty()) {
            var6++;
            var5.method19118(var8, 1);
         }
      }

      return var6 == this.field22651.size() && var5.method19123(this, (IntList)null);
   }

   public ItemStack method14962(Class926 var1) {
      return this.field22650.copy();
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= this.field22651.size();
   }

   // $VF: synthetic method
   public static String method14998(Class4854 var0) {
      return var0.field22649;
   }

   // $VF: synthetic method
   public static NonNullList<Ingredient> method14999(Class4854 var0) {
      return var0.field22651;
   }

   // $VF: synthetic method
   public static ItemStack method15000(Class4854 var0) {
      return var0.field22650;
   }
}
