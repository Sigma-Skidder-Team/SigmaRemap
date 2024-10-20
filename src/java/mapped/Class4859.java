package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4859 extends Class4837 {
   private static final Class120 field22655 = Class120.method339(Items.field37899);
   private static final Class120 field22656 = Class120.method339(Items.field37840);
   private static final Class120 field22657 = Class120.method339(Items.field38069);

   public Class4859(ResourceLocation var1) {
      super(var1);
   }

   public boolean matches(Class926 var1, World var2) {
      boolean var5 = false;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.getSizeInventory(); var7++) {
         ItemStack var8 = var1.getStackInSlot(var7);
         if (!var8.isEmpty()) {
            if (!field22655.test(var8)) {
               if (!field22656.test(var8)) {
                  if (!field22657.test(var8)) {
                     return false;
                  }
               } else if (++var6 > 3) {
                  return false;
               }
            } else {
               if (var5) {
                  return false;
               }

               var5 = true;
            }
         }
      }

      return var5 && var6 >= 1;
   }

   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = new ItemStack(Items.field38068, 3);
      CompoundNBT var5 = var4.method32144("Fireworks");
      ListNBT var6 = new ListNBT();
      int var7 = 0;

      for (int var8 = 0; var8 < var1.getSizeInventory(); var8++) {
         ItemStack var9 = var1.getStackInSlot(var8);
         if (!var9.isEmpty()) {
            if (!field22656.test(var9)) {
               if (field22657.test(var9)) {
                  CompoundNBT var10 = var9.method32145("Explosion");
                  if (var10 != null) {
                     var6.add(var10);
                  }
               }
            } else {
               var7++;
            }
         }
      }

      var5.putByte("Flight", (byte)var7);
      if (!var6.isEmpty()) {
         var5.put("Explosions", var6);
      }

      return var4;
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public ItemStack getRecipeOutput() {
      return new ItemStack(Items.field38068);
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28476;
   }
}
