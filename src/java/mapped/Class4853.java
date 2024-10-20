package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;

public class Class4853 extends Class4852 {
   public Class4853(ResourceLocation var1) {
      super(
         var1,
         "",
         3,
         3,
         NonNullList.<Class120>method69(
            Class120.field427,
            Class120.method339(Items.field37899),
            Class120.method339(Items.field37899),
            Class120.method339(Items.field37899),
            Class120.method339(Items.field37899),
            Class120.method339(Items.field37955),
            Class120.method339(Items.field37899),
            Class120.method339(Items.field37899),
            Class120.method339(Items.field37899),
            Class120.method339(Items.field37899)
         ),
         new ItemStack(Items.field38056)
      );
   }

   @Override
   public boolean matches(Class926 var1, World var2) {
      if (!super.matches(var1, var2)) {
         return false;
      } else {
         ItemStack var5 = ItemStack.EMPTY;

         for (int var6 = 0; var6 < var1.getSizeInventory() && var5.isEmpty(); var6++) {
            ItemStack var7 = var1.getStackInSlot(var6);
            if (var7.getItem() == Items.field37955) {
               var5 = var7;
            }
         }

         if (!var5.isEmpty()) {
            MapData var8 = Class3316.method11861(var5, var2);
            if (var8 != null) {
               return !this.method14997(var8) ? var8.scale < 4 : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   private boolean method14997(MapData var1) {
      if (var1.field32327 != null) {
         for (Class7982 var5 : var1.field32327.values()) {
            if (var5.method27126() == MapDecorationType.MANSION || var5.method27126() == MapDecorationType.MONUMENT) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = ItemStack.EMPTY;

      for (int var5 = 0; var5 < var1.getSizeInventory() && var4.isEmpty(); var5++) {
         ItemStack var6 = var1.getStackInSlot(var5);
         if (var6.getItem() == Items.field37955) {
            var4 = var6;
         }
      }

      var4 = var4.copy();
      var4.setCount(1);
      var4.getOrCreateTag().putInt("map_scale_direction", 1);
      return var4;
   }

   @Override
   public boolean method14965() {
      return true;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28475;
   }
}
