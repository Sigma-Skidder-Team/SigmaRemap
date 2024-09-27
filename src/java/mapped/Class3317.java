package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Class3317<T extends Entity & Class1071> extends Item {
   private static String[] field18825;
   private final EntityType<T> field18826;
   private final int field18827;

   public Class3317(Properties var1, EntityType<T> var2, int var3) {
      super(var1);
      this.field18826 = var2;
      this.field18827 = var3;
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.getHeldItem(var3);
      if (!var1.isRemote) {
         Entity var7 = var2.getRidingEntity();
         if (var2.isPassenger() && var7 instanceof Class1071 && var7.getType() == this.field18826) {
            Class1071 var8 = (Class1071)var7;
            if (var8.method4982()) {
               var6.damageItem(this.field18827, var2, var1x -> var1x.sendBreakAnimation(var3));
               if (!var6.isEmpty()) {
                  return Class6794.<ItemStack>method20696(var6);
               }

               ItemStack var9 = new ItemStack(Items.field37906);
               var9.method32148(var6.method32142());
               return Class6794.<ItemStack>method20696(var9);
            }
         }

         var2.addStat(Stats.field40098.method172(this));
         return Class6794.<ItemStack>method20698(var6);
      } else {
         return Class6794.<ItemStack>method20698(var6);
      }
   }
}
