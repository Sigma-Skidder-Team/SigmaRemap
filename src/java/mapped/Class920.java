package mapped;

import net.minecraft.entity.player.PlayerEntity;

import java.util.Set;

public interface Class920 extends Class946 {
   int method3629();

   boolean method3617();

   ItemStack method3618(int var1);

   ItemStack method3619(int var1, int var2);

   ItemStack method3620(int var1);

   void method3621(int var1, ItemStack var2);

   default int method3630() {
      return 64;
   }

   void method3622();

   boolean method3623(PlayerEntity var1);

   default void method3631(PlayerEntity var1) {
   }

   default void method3632(PlayerEntity var1) {
   }

   default boolean method3633(int var1, ItemStack var2) {
      return true;
   }

   default int method3634(Item var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < this.method3629(); var5++) {
         ItemStack var6 = this.method3618(var5);
         if (var6.getItem().equals(var1)) {
            var4 += var6.getCount();
         }
      }

      return var4;
   }

   default boolean method3635(Set<Item> var1) {
      for (int var4 = 0; var4 < this.method3629(); var4++) {
         ItemStack var5 = this.method3618(var4);
         if (var1.contains(var5.getItem()) && var5.getCount() > 0) {
            return true;
         }
      }

      return false;
   }
}
