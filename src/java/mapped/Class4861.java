package mapped;

import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.BannerTileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4861 extends Class4837 {
   private static String[] field22663;

   public Class4861(ResourceLocation var1) {
      super(var1);
   }

   public boolean matches(Class926 var1, World var2) {
      DyeColor var5 = null;
      ItemStack var6 = null;
      ItemStack var7 = null;

      for (int var8 = 0; var8 < var1.getSizeInventory(); var8++) {
         ItemStack var9 = var1.getStackInSlot(var8);
         Item var10 = var9.getItem();
         if (var10 instanceof Class3301) {
            Class3301 var11 = (Class3301)var10;
            if (var5 != null) {
               if (var5 != var11.method11849()) {
                  return false;
               }
            } else {
               var5 = var11.method11849();
            }

            int var12 = BannerTileEntity.method3889(var9);
            if (var12 > 6) {
               return false;
            }

            if (var12 <= 0) {
               if (var7 != null) {
                  return false;
               }

               var7 = var9;
            } else {
               if (var6 != null) {
                  return false;
               }

               var6 = var9;
            }
         }
      }

      return var6 != null && var7 != null;
   }

   public ItemStack method14962(Class926 var1) {
      for (int var4 = 0; var4 < var1.getSizeInventory(); var4++) {
         ItemStack var5 = var1.getStackInSlot(var4);
         if (!var5.isEmpty()) {
            int var6 = BannerTileEntity.method3889(var5);
            if (var6 > 0 && var6 <= 6) {
               ItemStack var7 = var5.copy();
               var7.setCount(1);
               return var7;
            }
         }
      }

      return ItemStack.EMPTY;
   }

   public NonNullList<ItemStack> method14968(Class926 var1) {
      NonNullList var4 = NonNullList.<ItemStack>method68(var1.getSizeInventory(), ItemStack.EMPTY);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         ItemStack var6 = var1.getStackInSlot(var5);
         if (!var6.isEmpty()) {
            if (!var6.getItem().method11723()) {
               if (var6.method32141() && BannerTileEntity.method3889(var6) > 0) {
                  ItemStack var7 = var6.copy();
                  var7.setCount(1);
                  var4.set(var5, var7);
               }
            } else {
               var4.set(var5, new ItemStack(var6.getItem().method11722()));
            }
         }
      }

      return var4;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28480;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }
}
