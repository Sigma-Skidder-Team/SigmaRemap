package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4836 extends Class4837 {
   private static String[] field22613;

   public Class4836(ResourceLocation var1) {
      super(var1);
   }

   public boolean matches(Class926 var1, World var2) {
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;

      for (int var9 = 0; var9 < var1.getSizeInventory(); var9++) {
         ItemStack var10 = var1.getStackInSlot(var9);
         if (!var10.isEmpty()) {
            if (var10.getItem() == Blocks.BROWN_MUSHROOM.asItem() && !var7) {
               var7 = true;
            } else if (var10.getItem() == Blocks.RED_MUSHROOM.asItem() && !var6) {
               var6 = true;
            } else if (var10.getItem().method11743(ItemTags.field26103) && !var5) {
               var5 = true;
            } else {
               if (var10.getItem() != Items.field37836 || var8) {
                  return false;
               }

               var8 = true;
            }
         }
      }

      return var5 && var7 && var6 && var8;
   }

   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = ItemStack.EMPTY;

      for (int var5 = 0; var5 < var1.getSizeInventory(); var5++) {
         ItemStack var6 = var1.getStackInSlot(var5);
         if (!var6.isEmpty() && var6.getItem().method11743(ItemTags.field26103)) {
            var4 = var6;
            break;
         }
      }

      ItemStack var8 = new ItemStack(Items.field38149, 1);
      if (var4.getItem() instanceof BlockItem && ((BlockItem)var4.getItem()).method11845() instanceof Class3490) {
         Class3490 var9 = (Class3490)((BlockItem)var4.getItem()).method11845();
         Effect var7 = var9.method12186();
         Class3284.method11816(var8, var7, var9.method12187());
      }

      return var8;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28483;
   }
}
