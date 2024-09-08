package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Class4841 extends Class4837 {
   public Class4841(ResourceLocation var1) {
      super(var1);
   }

   public boolean method14963(Class926 var1, World var2) {
      ItemStack var5 = ItemStack.EMPTY;
      ItemStack var6 = ItemStack.EMPTY;

      for (int var7 = 0; var7 < var1.method3629(); var7++) {
         ItemStack var8 = var1.method3618(var7);
         if (!var8.isEmpty()) {
            if (!(var8.getItem() instanceof Class3301)) {
               if (var8.getItem() != Items.field38119) {
                  return false;
               }

               if (!var5.isEmpty()) {
                  return false;
               }

               if (var8.method32145("BlockEntityTag") != null) {
                  return false;
               }

               var5 = var8;
            } else {
               if (!var6.isEmpty()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var5.isEmpty() && !var6.isEmpty();
   }

   public ItemStack method14962(Class926 var1) {
      ItemStack var4 = ItemStack.EMPTY;
      ItemStack var5 = ItemStack.EMPTY;

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         ItemStack var7 = var1.method3618(var6);
         if (!var7.isEmpty()) {
            if (!(var7.getItem() instanceof Class3301)) {
               if (var7.getItem() == Items.field38119) {
                  var5 = var7.copy();
               }
            } else {
               var4 = var7;
            }
         }
      }

      if (!var5.isEmpty()) {
         CompoundNBT var8 = var4.method32145("BlockEntityTag");
         CompoundNBT var9 = var8 != null ? var8.method79() : new CompoundNBT();
         var9.method102("Base", ((Class3301)var4.getItem()).method11849().method309());
         var5.setTagInfo("BlockEntityTag", var9);
         return var5;
      } else {
         return var5;
      }
   }

   @Override
   public boolean method14960(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public Class6504<?> method14961() {
      return Class6504.field28481;
   }
}
