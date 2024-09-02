package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Collections;

public interface Class923 {
   void method3636(IRecipe<?> var1);

   @Nullable
   IRecipe<?> method3637();

   default void method3638(PlayerEntity var1) {
      IRecipe var4 = this.method3637();
      if (var4 != null && !var4.method14965()) {
         var1.method2778(Collections.<IRecipe<?>>singleton(var4));
         this.method3636((IRecipe<?>)null);
      }
   }

   default boolean method3639(World var1, ServerPlayerEntity var2, IRecipe<?> var3) {
      if (!var3.method14965() && var1.method6789().method17135(Class5462.field24243) && !var2.method2810().method21360(var3)) {
         return false;
      } else {
         this.method3636(var3);
         return true;
      }
   }
}
