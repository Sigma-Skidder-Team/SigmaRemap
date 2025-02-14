package mapped;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipe;
import net.minecraft.item.crafting.IRecipeType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class Class131 extends Class128 {
   private static final Logger field448 = LogManager.getLogger();

   public Class131(ILootCondition[] var1) {
      super(var1);
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.FURNACE_SMELT;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      if (!var1.isEmpty()) {
         Optional var5 = var2.method26090().getRecipeManager().<IInventory, FurnaceRecipe>method1030(IRecipeType.SMELTING, new Class927(var1), var2.method26090());
         if (var5.isPresent()) {
            ItemStack var6 = ((FurnaceRecipe)var5.get()).getRecipeOutput();
            if (!var6.isEmpty()) {
               ItemStack var7 = var6.copy();
               var7.setCount(var1.getCount());
               return var7;
            }
         }

         field448.warn("Couldn't smelt {} because there is no smelting recipe", var1);
         return var1;
      } else {
         return var1;
      }
   }

   public static Class5876<?> method383() {
      return method372(Class131::new);
   }
}
